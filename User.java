package javaapplication39;
public class User {
    int userid;
    Admin admin;
    User(){
        userid= 0;
    }
    User(int id, Admin a){
        userid= id;
        admin= a;
    }
    void manageSales(){
        System.out.println("manage Sales");
        admin.addJewellery();
        admin.deleteJewellery();
    }
    void managePayments(){
        System.out.println("mange Payments");
    }
}
