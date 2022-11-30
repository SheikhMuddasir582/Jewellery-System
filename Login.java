package javaapplication39;
public class Login extends Account{
    String email;
    Login(){
        super();
        email= "none";
    }
    Login(int no, String email){
        super(no);
        this.email= email;
    }
    void loginAccount(){
        System.out.println("id no"+ accountno);
        System.out.println("email"+ email);
        System.out.println("login suucess");
    }
    
}
