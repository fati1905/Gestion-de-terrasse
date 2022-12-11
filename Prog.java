import java.util.Scanner;

public class Prog {

    public static void main(String[] args) {
        ListAccounts accounts = new ListAccounts();
        char[] idAccount = new char[1024];

        Scanner sc = new Scanner(System.in);

        //Creating accounts
        accounts.createAccount("fatima@gmail.com", "fatima");
        accounts.createAccount("barry@gmail.com", "barry");
        accounts.createAccount("lapujade@gmail.com", "lapujade");

        System.out.println("***tests***\n\n\n");
        //Test the real create account
        accounts.createAccount();
        System.out.println("\n\n ***************pour vous aider **************");
        accounts.displayAccounts();

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

        //Exploitant
        System.out.println("Créer un compte pour l'exploitant pour tester ses fonctionnalitées");
        accounts.createAccount();

        System.out.println("\n\n ***************pour vous aider **************");
        accounts.displayAccounts();

        //Log into the account
        try {
            idAccount = accounts.login().toCharArray();
        }catch (Exception ex){
            System.out.println("Error whiling logging was with supported characters : " +ex.getMessage() );
        }

        //le compte de l'utilisateur
        Account comptecCourant = accounts.getAccount();
        ListDemandeTerrasse listDemandeTerrasse = new ListDemandeTerrasse();
        Etablissement monetablissement = new Etablissement();
        DemandeTerrasse demandeTerrasse = listDemandeTerrasse.createDemande(comptecCourant);

    }
}
