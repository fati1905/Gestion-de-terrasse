import java.util.HashMap;
import java.util.Scanner;

public class Account {
    protected String email;
    private String password;//Change if possible
    HashMap<String, String> accounts = new HashMap<>();

    public Account(String email, String password){
        this.email = email;
        this.password = password;
        accounts.put(this.email, this.password);
        System.out.println("The account has been created! Welcome aboard.");
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login(String e, String p){
        if(accounts.get(e) == null){
            System.out.println("This account doesn't exist");
            return false;
        }else{
            if(accounts.get(e).equals(p)){
                //log into the account
                // TODO: Add name of the person and their role when logged in
                System.out.println("Login successful");
                return true;
            }else{
                System.out.println("Your password is wrong! Try again.");
            }
        }
        return false;
    }
    //Todo : Verify if the user knows their last password before changing it (If there is enough time)
    public void updatePass(){
        try {
            accounts.put(this.email, this.password);
        }catch (Exception e){
            System.out.println("Exception :"+e.getMessage());
        }
    }

    public void updateEmail(String lastEmail){//Asks the user to type in their last email before changning it
        try {
            accounts.put(this.email, accounts.get(lastEmail)); //puts the password in the Hashmap with the new email address
            accounts.remove(lastEmail);
        }catch (Exception ex){
            System.out.println("An error occurred : "+ex.getMessage());
        }
    }
    public void get(HashMap<String, String> accounts) {
        this.accounts = accounts;
    }

    public static void main(String[] args) {
        ListAccounts listAccounts = new ListAccounts();
        Account f1 = new Account("fatima@gmail.com", "fatima");
        listAccounts.addAccount(f1, "f1");
        Account f2 = new Account("barry@gmail.com", "barry");
        listAccounts.addAccount(f1, "f2");
        Account f3 = new Account("lapujade@gmail.com", "lapujade");
        listAccounts.addAccount(f1, "f3");

        Scanner input = new Scanner(System.in);

        //Test login
        System.out.print("Enter your email address : ");
        String userGmail = input.nextLine();
        System.out.print("Enter your password : ");
        String mdp = input.nextLine();

        while(!f1.login(userGmail, mdp)){
            System.out.print("Enter your email address : ");
            userGmail = input.nextLine(); //DO NOT CHANGE THIS VARIABLE, IT IS USED TO STORE THE CURRENT USER'S EMAIL
            System.out.print("Enter your password : ");
            mdp = input.nextLine();
        }

        //Test updatePass
        System.out.println("\n\n**** Update password ****");
        System.out.println("Your new password : ");
        mdp = input.nextLine();


    }
}
