package javaapplication39;
public class Admin implements Jewellery {
    int adminid;
    int jewelleryid;
    String jewelleryname;
    Admin(){
        adminid= 0;
        jewelleryid= 0;
        jewelleryname= "none";
        
    }
    Admin(int aid, int jid, String jname){
        adminid= aid;
        jewelleryid= jid;
        jewelleryname= jname;
        
    }
    void manageApp(){
        System.out.println("mange App");
    }
    void manageUser(){
        System.out.println("mange Users");
    }

    @Override
    public void addJewellery() {
        System.out.println("add Jewellery");;
    }
    @Override
    public void deleteJewellery() {
        System.out.println("delete Jewellery");;
    }
    
}
