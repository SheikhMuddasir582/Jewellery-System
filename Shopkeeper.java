package javaapplication39;
public class Shopkeeper {
    String name;
    Customer customer;
    Shopkeeper(){
        name= "none";
    }
    Shopkeeper(String n, Customer c){
        name= n;
        customer= c;
    }
    void generateBill(){
        System.out.println("Generate bill");
        customer.address();
    }
    void collectPayment(){
       System.out.println("Collect Payment");
        customer.address(); 
    }
}
