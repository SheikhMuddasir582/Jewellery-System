package javaapplication39;
public class JavaApplication39 {
    public static void main(String[] args) {
        // TODO code application logic here
        Customer c= new Customer(2);
        c.address();
        Shopkeeper s= new Shopkeeper("harry", c);
        s.generateBill();
        s.collectPayment();
        Login l= new Login(2, "abc@abc");
        l.loginAccount();
        Register r = new Register(1, "abc@abc");
        r.RegisterAccount();
        Admin a;
        a =new Admin(4, 5, "braceletts");
        User u= new User(2, a);
        u.managePayments();
        u.manageSales();
    }
}
