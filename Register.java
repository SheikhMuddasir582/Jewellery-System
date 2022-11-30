package javaapplication39;
public class Register extends Account {
    String email;
    Register(){
        super();// super must be use first at top
        email= "none";
    }
    Register(int no,String email){
        super(no);
        this.email= email;
    }
    void RegisterAccount(){
        System.out.println("Register suucess");
    }
}
