package javaapplication39;
public class Customer {
    int id;
    Customer(){
        id= 0;
    }
    Customer(int id){
        this.id= id;
    }
    void address(){
        System.out.println("Customer address");
        System.out.println("Customer id: "+id);
    }
}
