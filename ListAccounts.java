import java.util.HashMap;
import java.util.Scanner;

public class ListAccounts {
    Account account;
    String id; //We will identify an account with an Email
    HashMap <String, Account> listAccount = new HashMap<>();

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    //This method is mainly for the sake of facilitate correcting our program by the professors
    Account createAccount(String email, String password){ //Creates account and adds it to the HashMap
        System.out.println("\n\n*******Create Account*****");
        try{
            account = new Account(email, password);
            listAccount.put(email, account);
            System.out.println("Account has been created, welcome aboard");
        }catch (Exception ex){
            System.out.println("Your account could not be created : "+ex.getMessage());
            return null;
        }
        return account;
    }

    public Account createAccount(){ //Creates account and adds it to the HashMap
        System.out.println("\n\n******* Create Account *****");
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter your email address : ");
        String email = input.nextLine();
        System.out.print("\nEnter your password : ");
        String password = input.nextLine();

        //todo: If account does already exist we don't recreate it
        try{
            account = new Account(email, password);
            listAccount.put(email, account );
            System.out.println("\nAccount has been created, welcome aboard");
        }catch (Exception ex){
            System.out.println("\nYour account could not be created : "+ex.getMessage());
            return null;
        }
        return account;
    }

    public String login(){//Returns The id of th user in (email)
        System.out.println("\n\n*******Login*****");
        Scanner input = new Scanner(System.in);

        while (true){

            System.out.print("\nEnter your email address : ");
            String e = input.nextLine();
            System.out.print("\nEnter your password : ");
            String p = input.nextLine();

            if(listAccount.get(e) == null){
                System.out.println("\nThis account doesn't exist");
            }else{
                if(listAccount.get(e).getPassword().equals(p)){
                    //log into the account
                    // TODO: Add name of the person and their role when logged in
                    System.out.println("Login successful");
                    return e;
                }else{
                    System.out.println("Your password is wrong! Try again.");
                }
            }
        }
    }

    //Todo : Verify if the user knows their last password before changing it (If there is enough time)
    public void updatePass(String id){

        System.out.println("\n\n**** Update password ****");
        System.out.println("Type your new password : ");
        Scanner input = new Scanner(System.in);
        String newPass = input.nextLine();

        try {
            listAccount.get(id).setPassword(newPass);
            System.out.println("New password is saved");
        }catch (Exception e){
            System.out.println("Your password could not change :"+e.getMessage());
        }
    }
    //Todo: Don't change the email if it exists already
    public String updateEmail(String id){//Asks the user to type in their last email before changing it

        System.out.println("\n\n*******Update Email*******");
        Scanner input = new Scanner(System.in);

        while (true){ //Verifies the credentials of the user

            System.out.print("Enter your current email address : ");
            String e = input.nextLine();
            System.out.print("Enter your password : ");
            String p = input.nextLine();

            if(listAccount.get(id).getEmail().equals(e)){

                if(listAccount.get(id).getPassword().equals(p)){
                    break;
                }
            }
            System.out.println("Your credentials are wrong, please try again!");
        }

        System.out.print("Enter your new email address : ");
        String newEmail = input.nextLine();

        try {
            listAccount.get(id).setEmail(newEmail);
            listAccount.put(newEmail, this.account); //puts the password in the Hashmap with the new email address
            listAccount.remove(id);

            System.out.println("Email has been updated");

        }catch (Exception ex){
            System.out.println("An error occurred : "+ex.getMessage());
            return id; //In case there was an error we return the last email
        }

        return newEmail;
    }

    public static void main(String[] args) {
        ListAccounts accounts = new ListAccounts();
        char[] idAccount = new char[1024];

        //Creating accounts
        accounts.createAccount("fatima@gmail.com", "fatima");
        accounts.createAccount("barry@gmail.com", "barry");
        accounts.createAccount("lapujade@gmail.com", "lapujade");

        System.out.println("***tests***\n\n\n");
        //Test the real create account
        accounts.createAccount();

        //Log into the account
        try {
            idAccount = accounts.login().toCharArray();
        }catch (Exception ex){
            System.out.println("Error whiling logging was with supported characters : " +ex.getMessage() );
        }

        //Update email
        try {
            idAccount = accounts.updateEmail(String.valueOf(idAccount)).toCharArray();
        }catch (Exception ex){
            System.out.println("Error whiling updating the email : " +ex.getMessage() );
        }

        //Change password
        accounts.updatePass(String.valueOf(idAccount));
    }
}