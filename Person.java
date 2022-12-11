import java.util.ArrayList;
import java.util.Scanner;

public class Person {

    public String nom; //pour une entreprise, c'est une raison sociale
     ListAccounts listAccounts = new ListAccounts();
     private Account myAccount;
     protected ArrayList<Etablissement> etablissements = new ArrayList<>();
    public Person(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Last name or your social reason (for corporations):");

        this.nom = sc.nextLine();
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
    public void ajouterEtab(){
        if(myAccount.getRoles().contains(new Role(roleP.exploitant))){
            this.etablissements.add(new Etablissement());
            System.out.println("Etablissement ajoutée");
        }
    }

    public void displayEtabli(){
        if(myAccount.getRoles().contains(new Role(roleP.exploitant))){
            System.out.println(this.etablissements);
        }
    }
}