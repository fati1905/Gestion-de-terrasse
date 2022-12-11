public class Prog {

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
