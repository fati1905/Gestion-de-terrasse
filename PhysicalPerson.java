import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class PhysicalPerson extends Person{
    public String prenom;
    public String civilite;
    public String profession;

    public PhysicalPerson(){
        super();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First name :");
        String prenom = sc.nextLine();
        System.out.println("Enter your civility :");
        String civilite = sc.nextLine();
        System.out.println("Enter your profession :");
        String profession = sc.nextLine();

        this.prenom = prenom;
        this.civilite = civilite;
        this.profession = profession;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCivilite() {
        return civilite;
    }

    public String getProfession() {
        return profession;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "PhysicalPerson{" +
                "prenom='" + prenom + '\'' +
                ", civilite='" + civilite + '\'' +
                ", profession='" + profession + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
