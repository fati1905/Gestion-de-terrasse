public class Person {

    public String nom; //pour une entreprise, c'est une raison sociale
    private Account myAccount;

    public Person(String nom, Account myAccount){
        this.nom = nom;
        this.myAccount = myAccount;
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