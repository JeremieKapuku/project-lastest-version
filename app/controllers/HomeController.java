package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.inject.Inject;
import javax.persistence.PersistenceException;

import controllers.security.*;

import views.html.*;

// Import models
import models.*;
import models.users.*;
import models.users.Users;

public class HomeController extends Controller {

    // Declare a private FormFactory instance

    private FormFactory formFactory;
    Random rand = new Random();
    int one = rand.nextInt(10);
    int two = rand.nextInt(10);
    int three = rand.nextInt(10);
    int four = rand.nextInt(10);
    int five = rand.nextInt(10);
    //  Inject an instance of FormFactory it into the controller via its constructor
    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }

    public Users getUserFromSession(){
        return Users.getUserById(session().get("email"));
    }

    public Result index() {

        return ok(index.render(getUserFromSession()));
    }

    public Result about() {

        return ok(about.render(getUserFromSession()));
    }

    public Result signup() {
        Form<Users> addUsersForm = formFactory.form(Users.class);

        return ok(signup.render(addUsersForm));
    }

    //#####################Products###############################################
     public Result products(Long cat) {

        // Get list of all categories in ascending order



            List<Category> categoriesList = Category.findAll();
            List<Product> productsList = new ArrayList<Product>();

            if (cat == 0) {
                // Get list of all categories in ascending order
                productsList = Product.findAll();
            } else {
                // Get products for selected category
                // Find category first then extract products for that cat.
                productsList = Category.find.ref(cat).getProducts();
            }

            return ok(products.render(productsList, categoriesList, getUserFromSession()));

    }


    public Result rent(Long cat) {

        // Get list of all categories in ascending order

        if(getUserFromSession() != null) {


            List<Category> categoriesList = Category.findAll();
            List<Product> productsList = new ArrayList<Product>();

            if (cat == 0) {
                // Get list of all categories in ascending order
                productsList = Product.findAll();
            } else {
                // Get products for selected category
                // Find category first then extract products for that cat.
                productsList = Category.find.ref(cat).getProducts();
            }

            return ok(rent.render(productsList, categoriesList, getUserFromSession()));
        }
        else{
            return redirect(controllers.routes.HomeController.index());

        }
    }

    //##################### End OF Products###############################################













    //#####################  USER PROFILE EDITS ###############################################

    public Result profile(Long cat){
        List<Users> usersList = Users.findAll();
        List<Product> productsList = new ArrayList<Product>();
        List<Users_library> UserTransactionList = new ArrayList<>();

        if(cat == 0){
            usersList = Users.findAll();
            UserTransactionList = Users_library.findAll();
        }

        return ok(profile.render(usersList,productsList,UserTransactionList,getUserFromSession()));
    }


    public Result profileUpdate() {

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Users> addUsersForm = formFactory.form(Users.class);

        // Render the Add Product View, passing the form object
        return ok(profileUpdate.render(addUsersForm, getUserFromSession()));
    }


    public Result transactionUpdate(){
        Form<Users_library>UsersLibraryForm =formFactory.form(Users_library.class);

        return ok(transactionUpdate.render(UsersLibraryForm,getUserFromSession()));
    }


    public Result returnUpdate(){
        Form<Users_library>UsersLibraryForm =formFactory.form(Users_library.class);

        return ok(returnUpdate.render(UsersLibraryForm,getUserFromSession()));
    }


    //#####################  END USER PROFILE EDITS ###############################################










    //#####################  USER loan/reserve links ###############################################

    public Result reserve() {

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Product> addReserveForm = formFactory.form(Product.class);

        // Render the Add Product View, passing the form object
        return ok(reserve.render(addReserveForm, getUserFromSession()));
    }

    public Result threeday() {

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Product> addThreeDayForm = formFactory.form(Product.class);

        // Render the Add Product View, passing the form object
        return ok(threeday.render(addThreeDayForm, getUserFromSession()));
    }

    public Result fiveday() {

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Product> addFiveDayForm = formFactory.form(Product.class);

        // Render the Add Product View, passing the form object
        return ok(fiveday.render(addFiveDayForm, getUserFromSession()));
    }

    public Result sevenday() {

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Product> addSevenDayForm = formFactory.form(Product.class);

        // Render the Add Product View, passing the form object
        return ok(sevenday.render(addSevenDayForm, getUserFromSession()));
    }

    //################### End of links ##############################










    //################### user loan/reserve Functionality ######################

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addReserveSubmit(String email) {

        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();
        Users un = Users.find.byId(email);  
        // Extract the product from the form object
        Product p = newProductForm.get();
        String checker = p.getReserved();
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;

        if (p.getId() == null) {
            // Save to the database via Ebean (remember Product extends Model)
            p.save();
        }
        // Product already exists so update
        else if (p.getId() != null) {


       if(p.getStock() == 0 ){
             p.setAvailable("unavailable");
             p.update();
           if(p.getReserved().equals("")){
              one = rand.nextInt(10);
              two = rand.nextInt(10);
              three = rand.nextInt(10);
              four = rand.nextInt(10);
              five = rand.nextInt(10);
             flash("success", "Item: " + p.getName() + " has been reserved " + "Reserve Reference:" + one +"-"+ two+"-"+three+"-"+four+"-"+five);
             p.setReserved(email);
             p.update();
             return redirect(controllers.routes.HomeController.rent(0));
           }else if(p.getReserved().equals(un.getEmail())){
            flash("success", "You have already reserved this item ");
            return redirect(controllers.routes.HomeController.rent(0));
           }else{
               flash("success", "Item has been reserved by another user");
            return redirect(controllers.routes.HomeController.rent(0));
           }
            // if the user enters the reserve key
            // reserve the item
         } else if(p.getStock() > 0) {
             p.update();
            flash("success", "Item: " + p.getName() + " has not been reserved still in stock");
            return redirect(controllers.routes.HomeController.rent(0));
            }
     }
         return redirect(controllers.routes.HomeController.rent(0));
}


    @Security.Authenticated(Secured.class)
    @Transactional
    public Result ThreeDayLoan(String email) {
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();
        Users un = Users.find.byId(email);

        Product ps1 = newProductForm.get();

        Date TransactionDate = new Date();

        Date ExpireDate = new Date();
        ExpireDate.setDate(TransactionDate.getDate()+3);

        // Save to the database via Ebean (remember Product extends Model)

         Users_library usl;
         usl = new Users_library(0,ps1.getId(),getUserFromSession().getEmail(),TransactionDate,ExpireDate,3,0,0);
         usl.save();
    int one = 0;
    int two = 0;
    int three = 0;
    int four = 0;
    int five = 0;

        // Extract the product from the form object
        Product p = newProductForm.get();
        if (p.getId() == null) {


            // Save to the database via Ebean (remember Product extends Model)

            p.save();
        }
        // Product already exists so update
        else if(p.getId() != null){
              if(p.getStock() > 0)
            {
               
                int checker = un.getPoints() - 30;

                if(un.getPoints() == 0 || un.getPoints() < 30)
                {
                flash("success",p.getName() + " not loaned insufficient points");
                 return redirect(controllers.routes.HomeController.rent(0));

                }else
                {
                     one = rand.nextInt(10);
                     two = rand.nextInt(10);
                     three = rand.nextInt(10);
                     four = rand.nextInt(10);
                     five = rand.nextInt(10);
                if(p.getId() >= 1 && p.getId() <= 10){
                 p.setStock( p.getStock() - 1);
                 un.setPoints(un.getPoints() - 30);
                 un.update();
                 p.update();

                 flash("success",p.getName() + " has been loaned. Software in your profile. ");
                 return redirect(controllers.routes.HomeController.rent(0));
                }
                     one = rand.nextInt(10);
                     two = rand.nextInt(10);
                     three = rand.nextInt(10);
                     four = rand.nextInt(10);
                     five = rand.nextInt(10);
                 p.setStock( p.getStock() - 1);
                 un.setPoints(un.getPoints() - 30);
                 un.update();
                 p.update();

                 flash("success",p.getName() + " has been loaned" + "Loan Reference:" + one +"-"+ two+"-"+three+"-"+four+"-"+five);
                 return redirect(controllers.routes.HomeController.rent(0));
                }


            }else if(p.getStock() == 0)
            {
                p.setAvailable("unavailable");
                p.update();
                flash("success","item low in stock");
                return redirect(controllers.routes.HomeController.rent(0));
            }
        }
        return redirect(controllers.routes.HomeController.rent(0));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result FiveDayLoan(String email) {
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();
        Users un = Users.find.byId(email);

        Product ps1 = newProductForm.get();

        Date TransactionDate = new Date();

        Date ExpireDate = new Date();
        ExpireDate.setDate(TransactionDate.getDate()+5);

            // Save to the database via Ebean (remember Product extends Model)

         Users_library usl;
         usl = new Users_library((long) 0,ps1.getId(),getUserFromSession().getEmail(),TransactionDate,ExpireDate,0,5,0);
         usl.save();
    int one = 0;
    int two = 0;
    int three = 0;
    int four = 0;
    int five = 0;
        // Extract the product from the form object
        Product p = newProductForm.get();
        if (p.getId() == null) {


            // Save to the database via Ebean (remember Product extends Model)

            p.save();
        }
        // Product already exists so update
        else if(p.getId() != null){
              if(p.getStock() > 0)
            {

                int checker = un.getPoints() - 50;



                if(un.getPoints() == 0 || un.getPoints() < 50)
                {
                flash("success",p.getName() + " not loaned insufficient points");
                 return redirect(controllers.routes.HomeController.rent(0));

                }else
                {
                     one = rand.nextInt(10);
                     two = rand.nextInt(10);
                     three = rand.nextInt(10);
                     four = rand.nextInt(10);
                     five = rand.nextInt(10);
                 if(p.getId() >= 1 && p.getId() <= 10){
                 p.setStock( p.getStock() - 1);
                 un.setPoints(un.getPoints() - 50);
                 un.update();
                 p.update();

                flash("success",p.getName() + " has been loaned. Software in your profile. ");
                return redirect(controllers.routes.HomeController.rent(0));
                }
                     one = rand.nextInt(10);
                     two = rand.nextInt(10);
                     three = rand.nextInt(10);
                     four = rand.nextInt(10);
                     five = rand.nextInt(10);
                 p.setStock( p.getStock() - 1);
                 un.setPoints(un.getPoints() - 50);
                 un.update();
                 p.update();

                 flash("success",p.getName() + " has been loaned" + "Loan Reference:" + one +"-"+ two+"-"+three+"-"+four+"-"+five);
                 return redirect(controllers.routes.HomeController.rent(0));
                }
            }else if(p.getStock() == 0)
            {
                p.setAvailable("unavailable");
                p.update();
                flash("success","item low in stock");
                return redirect(controllers.routes.HomeController.rent(0));
            }
        }
        return redirect(controllers.routes.HomeController.rent(0));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result SevenDayLoan(String email) {
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();
        Users un = Users.find.byId(email);
        Product ps1 = newProductForm.get();
        Date TransactionDate = new Date();
        Date ExpireDate = new Date();
        ExpireDate.setDate(TransactionDate.getDate()+7);

            // Save to the database via Ebean (remember Product extends Model)

         Users_library usl;
         usl = new Users_library((long) 0,ps1.getId(),getUserFromSession().getEmail(),TransactionDate,ExpireDate,0,0,7);
         usl.save();
    int one = 0;
    int two = 0;
    int three = 0;
    int four = 0;
    int five = 0;

        // Extract the product from the form object
        Product p = newProductForm.get();
        if (p.getId() == null) {


            // Save to the database via Ebean (remember Product extends Model)

            p.save();
        }
        // Product already exists so update
        else if(p.getId() != null){
              if(p.getStock() > 0)
            {
                int checker = un.getPoints() - 100;

                if(un.getPoints() == 0 || un.getPoints() < 100)
                {
                 flash("success",p.getName() + " not loaned insufficient points");
                 return redirect(controllers.routes.HomeController.rent(0));

                }else
                {
                if(p.getId() >= 1 && p.getId() <= 10){
                     one = rand.nextInt(10);
                     two = rand.nextInt(10);
                     three = rand.nextInt(10);
                     four = rand.nextInt(10);
                     five = rand.nextInt(10);
                 p.setStock( p.getStock() - 1);
                 un.setPoints(un.getPoints() - 100);
                 un.update();
                 p.update();

                flash("success",p.getName() + " has been loaned. Software in your profile. ");
                return redirect(controllers.routes.HomeController.rent(0));
                }
                     one = rand.nextInt(10);
                     two = rand.nextInt(10);
                     three = rand.nextInt(10);
                     four = rand.nextInt(10);
                     five = rand.nextInt(10);
                 p.setStock( p.getStock() - 1);
                 un.setPoints(un.getPoints() - 100);
                 un.update();
                 p.update();

                 flash("success",p.getName() + " has been loaned" + "Loan Reference:" + one +"-"+ two+"-"+three+"-"+four+"-"+five);
                 return redirect(controllers.routes.HomeController.rent(0));
                }
            }else if(p.getStock() == 0)
            {
                p.setAvailable("unavailable");
                p.update();
                flash("success","item low in stock");
                return redirect(controllers.routes.HomeController.rent(0));
            }
        }
        return redirect(controllers.routes.HomeController.rent(0));
    }
//##################### END OF  USER loan/reserve FUNCTIONALITY  ###############################################









//################## USER SIGN UP##########################################




    @Transactional
    public Result addUsersSubmit(){

        Form<Users> newUsersForm = formFactory.form(Users.class).bindFromRequest();

        if(newUsersForm.hasErrors()){
            return badRequest(signup.render(newUsersForm));
        }
        
    try{
        Users newUser = newUsersForm.get();
        newUser.setPoints(100);

        newUser.save();

        flash("success","Account " + newUser.getName() + " has been created");
        return redirect(controllers.routes.HomeController.index());

    }catch(PersistenceException e){
        flash("success","Email has already been used.");
        return badRequest(signup.render(newUsersForm));
    }
}

    @Transactional
    public Result addProfileSubmit() {

        // Create a product form object (to hold submitted data)
        // 'Bind' the object to the submitted form (this copies the filled form)
        Form<Users> newUsersForm = formFactory.form(Users.class).bindFromRequest();

        // Check for errors (based on Product class annotations)
        if(newUsersForm.hasErrors()) {
            // Display the form again
            return badRequest(profileUpdate.render(newUsersForm, getUserFromSession()));
        }

        // Extract the product from the form object
        Users p = newUsersForm.get();

        if (p.getEmail().equals(" ")) {
            // Save to the database via Ebean (remember Product extends Model)
            p.save();
        }
        // Product already exists so update
        else {
            p.update();
        }

        // Set a success message in temporary flash
        // for display in return view
        flash("success", "Account: " + p.getName() + " has been updated");

        // Redirect to the admin home
        return redirect(routes.HomeController.profile(0));
    }


    //WORKING ON THIS ATM
    //NEED HELP TO GET THE DISTANCE OF TWO DATES

    @Transactional
    public Result addTransactionSubmit(){
        Form<Users_library>UserLibraryForm =formFactory.form(Users_library.class).bindFromRequest();
        Users_library ul = UserLibraryForm.get();

        ul.setextendable("false");


        int dDate = ul.getDate_transaction().compareTo(ul.getExpiring_date()) ;
        Date dateD1 = new Date();


        if (UserLibraryForm.hasErrors()){
            return badRequest(transactionUpdate.render(UserLibraryForm,getUserFromSession()));
        }

        dateD1.setDate(ul.getExpiring_date().getDate()+6/2);

        ul.setExpiring_date(dateD1);
        ul.update();
        
        flash("success", "Account: " + ul.getUser_email() + " has extended loan date");

        return redirect(routes.HomeController.profile(0));
    }


    @Transactional
    public Result addReturnSubmit(String email) {
        Form<Users_library> UserLibraryForm = formFactory.form(Users_library.class).bindFromRequest();
        Users_library ul = UserLibraryForm.get();
        Users un = Users.find.byId(email);

        ul.update();
        if (ul.getTempo() == 3) {
            if (un.getPoints() >= 100) {
                flash("success", "points already at 100");
                return redirect(routes.HomeController.profile(0));

            } else {
                un.givePoints(30);
                un.update();
                flash("success", "item has been returned 30 points refunded");
                return redirect(routes.HomeController.profile(0));
            }
            //--------------------------------------------------------------

        }

        //--------------------------------------------------------------
        else if (ul.getTempo2() == 5) {
            if (un.getPoints() >= 100) {
                flash("success", "points already at 100");
                return redirect(routes.HomeController.profile(0));

            } else {
                un.givePoints(50);
                un.update();
                flash("success", "item has been returned 50 points refunded");
                return redirect(routes.HomeController.profile(0));
            }
            //--------------------------------------------------------------

        } else if (ul.getTempo3() == 7) {
            if (un.getPoints() >= 100) {
                flash("success", "points already at 100");
                return redirect(routes.HomeController.profile(0));

            } else {
                un.givePoints(100);
                un.update();
                flash("success", "item has been returned 100 points refunded");
                return redirect(routes.HomeController.profile(0));
            }


        }
        return redirect(routes.HomeController.profile(0));
    }
    //################## END OF USER SIGN UP##########################################









    //################## ADMIN  ##########################################

    @Transactional
    public Result updateProfile(String email) {

        Users p;
        Form<Users> userForm;
        try {
            // Find the product by id
            p = Users.find.byId(email);
            int initialPoint = p.getPoints();

                    // Create a form based on the Product class and fill using p
           userForm = formFactory.form(Users.class).fill(p);

            } catch (Exception ex) {
                // Display an error message or page
                return badRequest("error");
        }
        // Render the updateProduct view - pass form as parameter
        return ok(profileUpdate.render(userForm, getUserFromSession()));
    }


    public Result updateTransaction(Long id){
        Users_library ul;
        Form<Users_library> UsersLibraryForm;

        try{

            ul=Users_library.find.byId(id);

            UsersLibraryForm =formFactory.form(Users_library.class).fill(ul);

        } catch (Exception ex) {
            // Display an error message or page
            return badRequest("error");
        }
        return ok(transactionUpdate.render(UsersLibraryForm,getUserFromSession()));
    }

    @Transactional
    public Result updateReturn(Long id){
        Users_library ul;
        Form<Users_library> UsersLibraryForm;
        Product product;

        try{

            ul=Users_library.find.byId(id);
            ul.setReturned("true");
            product = Product.find.byId(ul.getUser_product_id()); //gets correct id i checked!
            System.out.println(product.getName());// it gets the right item
            product.setStock(product.getStock() + 1);//i made a method to increase the stock by one but doesn't work.
            product.update();
            UsersLibraryForm =formFactory.form(Users_library.class).fill(ul);

        } catch (Exception ex) {
            // Display an error message or page
            return badRequest("error");
        }
        return ok(returnUpdate.render(UsersLibraryForm,getUserFromSession()));
    }


    public Result updateThreeDayLoan(Long id) {

        Product p;
        Form<Product> productForm;
        p = Product.find.byId(id);
        Users u;
        u = Users.find.byId(getUserFromSession().getEmail());
        if(p.getStock() == 0){
            flash("success", "Item out of Stock.");
            return redirect(routes.HomeController.rent(0));
        }

        else if(u.getPoints() < 30){
            flash("success", "Insufficient points");
            return redirect(routes.HomeController.rent(0));
        }

        else{
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
            return ok(threeday.render(productForm, getUserFromSession()));
        }

    }

    public Result updateFiveDayLoan(Long id) {

        Product p;
        Form<Product> productForm;
        p = Product.find.byId(id);
        Users u;
        u = Users.find.byId(getUserFromSession().getEmail());
        if(p.getStock() == 0){
            flash("success", "Item out of Stock.");
            return redirect(routes.HomeController.rent(0));
        }

        else if(u.getPoints() < 50){
            flash("success", "Insufficient points");
            return redirect(routes.HomeController.rent(0));
        }

        else{
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
            return ok(fiveday.render(productForm, getUserFromSession()));
        }


    }

    public Result updateSevenDayLoan(Long id) {

        Product p;
        Form<Product> productForm;

        p = Product.find.byId(id);
        Users u;
        u = Users.find.byId(getUserFromSession().getEmail());
        if(p.getStock() == 0){
            flash("success", "Item out of Stock.");
            return redirect(routes.HomeController.rent(0));
        }

        else if(u.getPoints() < 100){
            flash("success", "Insufficient points");
            return redirect(routes.HomeController.rent(0));
        }

        else{
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
            return ok(sevenday.render(productForm, getUserFromSession()));
        }


    }


    public Result updateReserve(Long id) {

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
        return ok(reserve.render(productForm, getUserFromSession()));
    }

    // Delete Product by id
    @Transactional
    public Result deleteProduct(Long id) {

        // find product by id and call delete method
        Product.find.ref(id).delete();
        // Add message to flash session
        flash("success", "Product has been deleted");

        // Redirect to products page
        return redirect(routes.HomeController.products(0));
    }
}
//##################  END OF ADMIN  ##########################################
