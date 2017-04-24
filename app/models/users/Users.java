package models.users;

import java.util.*;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;


@Entity
public class Users extends Model {

    @Id
    private String email;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String address;

    @Constraints.Required
    private String number;

    @Constraints.Required
    private String password;

    @Constraints.Required
    private int points;
    
    private String userLoan;

    public Users(){

    }

    public Users(String email, String name, String address, String number, String password, int points){
        this.email = email;
        this.name = name;
        this.address = address;
        this.number = number;
        this.password = password;
        this.points = points;
    }

    public Users(String email, String name, String address, String number, String password, int points, String userLoan){
        this.email = email;
        this.name = name;
        this.address = address;
        this.number = number;
        this.password = password;
        this.points = points;
        this.userLoan = userLoan;
    }

    public static Finder<String,Users> find = new Finder<String,Users>(Users.class);

    public static List<Users> findAll(){
        return Users.find.all();
    }

    public static  Users authenticate(String email,String password){
        return find.where().eq("email",email).eq("password",password).findUnique();
    }

    public static Users getUserById(String id){
        if(id == null){
            return null;
        }
        return find.byId(id);
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;

    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getNumber(){
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
    
    public int getPoints(){
        return points;
    }

    public void setPoints(int amount){
        if(amount > 100){

            points = 100;
        }else {
             points = amount;
        }
    }

    public void givePoints(int amount)
    {
        points += amount;
    }

    public String getuserLoan(){
        return userLoan;
    }

    public void setuserLoan(String userLoan){
        this.userLoan = userLoan;
    }

}