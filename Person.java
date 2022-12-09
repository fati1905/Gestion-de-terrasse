import java.util.Scanner;

public class Person {

    public String nom; //pour une entreprise, c'est une raison sociale
     ListAccounts listAccounts = new ListAccounts();
     private Account myAccount;
    public Person(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Last name or your social reason (for corporations):");
        String nom = sc.nextLine();

        this.nom = nom;
        this.myAccount = listAccounts.createAccount();
    }
    public String getNom() {
        return nom;
    }

    public Account getMyAccount() {
        return myAccount;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMyAccount(Account myAccount) {
        this.myAccount = myAccount;
    }
}