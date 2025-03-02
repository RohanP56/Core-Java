public class AccessModifier {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.username = "Punjab National Bank";

        //While we want to set a password it will throws an error because the password is private
        //myAccount.password = "hdc@hghj";
        myAccount.setPassword("hdc@hghj");
    }
    
}
class BankAccount{
    public String username;  //User name will be access to all, so we take it into public
    private String password; // this password only can be access in this class

    //But here we can creat password
    public void setPassword(String pwd){
        password = pwd;
    }

}

//Though password ia private so we can,t access the password we only can change the password