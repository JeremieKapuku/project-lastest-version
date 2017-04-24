package controllers;

import controllers.security.AuthAdmin;
import controllers.security.Secured;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import javax.inject.Inject;

import views.html.admin.*;
import models.*;
import models.users.Users;


// Require Login
@Security.Authenticated(Secured.class)
// Authorise user (check if admin)
@With(AuthAdmin.class)
public class AdminController extends Controller {

    // Declare a private FormFactory instance
    private FormFactory formFactory;

    //  Inject an instance of FormFactory it into the controller via its constructor
    @Inject
    public AdminController(FormFactory f) {
        this.formFactory = f;
    }

    // Method returns the logged in user (or null)
    private Users getUserFromSession() {
        return Users.getUserById(session().get("email"));
    }

    public Result service(Long cat) {

        // Get list of all categories in ascending order
        List<Category> categoriesList = Category.findAll();
        List<Product> productsList = new ArrayList<Product>();

        if (cat == 0) {
            // Get list of all categories in ascending order
            productsList = Product.findAll();
        }
        else {
            // Get products for selected category
            // Find category first then extract products for that cat.
            productsList = Category.find.ref(cat).getProducts();
        }

        return ok(service.render(productsList, categoriesList, getUserFromSession()));
    }

    public Result Transaction() {

        // Get list of all categories in ascending order
        List<Users_library> HistoryList = new ArrayList<>();

        HistoryList = Users_library.findAll();

        return ok(Transaction.render(HistoryList, getUserFromSession()));
    }


    public Result products(Long cat) {

        // Get list of all categories in ascending order
        List<Category> categoriesList = Category.findAll();
        List<Product> productsList = new ArrayList<Product>();

        if (cat == 0) {
            // Get list of all categories in ascending order
            productsList = Product.findAll();
        }
        else {
            // Get products for selected category
            // Find category first then extract products for that cat.
            productsList = Category.find.ref(cat).getProducts();
        }

        return ok(products.render(productsList, categoriesList, getUserFromSession()));
    }

    public Result users(Long cat){
        List<Users> usersList = Users.findAll();

        if(cat == 0){
            usersList = Users.findAll();
        }

        return ok(users.render(usersList,getUserFromSession()));
    }
    
    public Result addProduct() {

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Product> addProductForm = formFactory.form(Product.class);

        // Render the Add Product View, passing the form object
        return ok(addProduct.render(addProductForm, getUserFromSession()));
    }

        public Result addUsers() {

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Users> addUsersForm = formFactory.form(Users.class);

        // Render the Add Product View, passing the form object
        return ok(addUsers.render(addUsersForm, getUserFromSession()));
    }



    @Transactional
    public Result addProductSubmit() {

        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();
        
        // Check for errors (based on Product class annotations)
        if(newProductForm.hasErrors()) {
            // Display the form again
            return badRequest(addProduct.render(newProductForm, getUserFromSession()));
        }

        // Extract the product from the form object
        Product p = newProductForm.get();
        String checker = p.getReserved();

        if (p.getId() == null) {
            // Save to the database via Ebean (remember Product extends Model)
            p.save();
        }
        // Product already exists so update
        else {
            p.update();
              p.setAvailable("unavailable");
                p.update();
            if(p.getStock() > 0){
                if(!"".equals(checker)){
                    p.setStock(p.getStock());
        Date TransactionDate = new Date();
        Date ExpireDate = new Date();
        ExpireDate.setDate(TransactionDate.getDate()+3);
        Users_library usl;
        usl = new Users_library(0,p.getId(),p.getReserved(),TransactionDate,ExpireDate,3,0,0);
        usl.save();
        p.setReserved("");
        p.update();
                }
            }
        }


        // Set a success message in temporary flash
        // for display in return view
        flash("success", "Product " + p.getName() + " has been created/ updated");

        // Redirect to the admin home
        return redirect(routes.AdminController.products(0));
    }

        @Transactional
    public Result addUsersSubmit() {

        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Users> newUsersForm = formFactory.form(Users.class).bindFromRequest();

        // Check for errors (based on Product class annotations)
        if(newUsersForm.hasErrors()) {
            // Display the form again
            return badRequest(addUsers.render(newUsersForm, getUserFromSession()));
        }

        // Extract the product from the form object
//            if(newUsersForm.get().getPoints() < 0){
//                newUsersForm.get().setPoints(newUsersForm.get().getPoints()*-1);
//            }

        Users p = newUsersForm.get();

        if (p.getEmail().equals(" ")) {
            // Save to the database via Ebean (remember Product extends Model)

            p.save();
        }
        // User already exists so update
        else {
            p.update();
        }

        // Set a success message in temporary flash
        // for display in return view
        flash("success", "User " + p.getName() + " has been created/ updated");

        // Redirect to the admin home
        return redirect(routes.AdminController.users(0));
    }


    // Update a product by ID
    // called when edit button is pressed
    @Transactional
    public Result updateProduct(Long id) {

        Product p;
        Form<Product> productForm;

        try {
            // Find the product by id
            p = Product.find.byId(id);

            // Create a form based on the Product class and fill using p
            productForm = formFactory.form(Product.class).fill(p);


            } catch (Exception ex) {
                // Display an error message or page
                return badRequest("error");
        }
        // Render the updateProduct view - pass form as parameter
        return ok(addProduct.render(productForm, getUserFromSession()));
    }

    @Transactional
    public Result updateUsers(String email) {

        Users p;
        Form<Users> userForm;

        try {
            // Find the product by id
            p = Users.find.byId(email);

            // Create a form based on the Product class and fill using p
            userForm = formFactory.form(Users.class).fill(p);

            } catch (Exception ex) {
                // Display an error message or page
                return badRequest("error");
        }
        // Render the updateProduct view - pass form as parameter
        return ok(addUsers.render(userForm, getUserFromSession()));
    }


    // Delete Product by id
    @Transactional
    public Result deleteProduct(Long id) {

        // find product by id and call delete method
        Product.find.ref(id).delete();
        // Add message to flash session
        flash("success", "Product has been deleted");

        // Redirect to products page
        return redirect(routes.AdminController.products(0));
    }

    @Transactional
    public Result deleteUsers(String email){

        Users.find.ref(email).delete();

        flash("success","User has been deleted");

        return redirect(routes.AdminController.users(0));
    }

}
