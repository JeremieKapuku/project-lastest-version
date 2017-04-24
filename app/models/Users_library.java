package models;

import com.avaje.ebean.Model;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.*;

/**
 * Created by ifeanyi on 10/04/17.
 */

    // Product Entity managed by the ORM
    @Entity
    public class Users_library extends Model {

        @Id 
        private Long id;

        @ManyToOne
        private Long user_product_id;

        @ManyToOne
        private String  user_email;

        private Date date_transaction;

        private Date expiring_date;

        private String extendable = "true";

        private String returned = "false";

        private int tempo;

        private int tempo2;

        private int tempo3;



    public Users_library(long id, Long user_product_id, String user_email, Date date_transaction, Date expiring_date, String extendable) {
        this.id = id;
        this.user_product_id = user_product_id;
        this.user_email = user_email;
        this.date_transaction = date_transaction;
        this.expiring_date = expiring_date;
        this.extendable = extendable;
    }

    public Users_library(long id, Long user_product_id, String user_email, Date date_transaction, Date expiring_date, int tempo, int tempo2, int tempo3) {
        this.id = id;
        this.user_product_id = user_product_id;
        this.user_email = user_email;
        this.date_transaction = date_transaction;
        this.expiring_date = expiring_date;
        this.tempo = tempo;
        this.tempo2 = tempo2;
        this.tempo3 = tempo3;
    }

    //Generic query helper for entity Computer with id Long
    public static Finder<Long,Users_library> find = new Finder<Long,Users_library>(Users_library.class);


    // Filter product name
    public static List<Users_library> findAll() {
        return Users_library.find.all();
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_product_id() {
        return user_product_id;
    }

    public void setUser_product_id(Long user_product_id) {
        this.user_product_id = user_product_id;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public Date getDate_transaction() {
        return date_transaction;
    }

    public void setDate_transaction(Date date_transaction) {
        this.date_transaction = date_transaction;
    }

    public Date getExpiring_date() {
        return expiring_date;
    }

    public void setExpiring_date(Date expiring_date) {
        this.expiring_date = expiring_date;
    }

    public String getextendable() {
        return extendable;
    }

    public void setextendable(String extendable) {
        this.extendable = extendable;
    }

    public int getTempo()
    {
        return tempo;
    }

    public void setTempo(int tempo){
        this.tempo = tempo;
    }

    public int getTempo2()
    {
        return tempo2;
    }

    public void setTempo2(int tempo2){
        this.tempo2 = tempo2;
    }

    public int getTempo3()
    {
        return tempo3;
    }

    public void setTempo3(int tempo3){
        this.tempo3 = tempo3;
    }

    public String getReturned()
    {
        return returned;
    }

    public void setReturned(String returned)
    {
        this.returned = returned;
    }
}



