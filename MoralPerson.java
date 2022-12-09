import java.util.Scanner;

public class MoralPerson extends Person {
    String formeJu; //Forme juridique
    String codeSiret; //Code siret de l'entreprise

    public MoralPerson(){
        super();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your legal Status : ");
        String f = sc.nextLine();
        System.out.println("Enter your siret code :");
        String codeSiret = sc.nextLine();

        this.formeJu = f;
        this.codeSiret = codeSiret;
    }

    public String getFormeJu() {
        return formeJu;
    }

    public String getCodeSiret() {
        return codeSiret;
    }

    public void setFormeJu(String formeJu) {
        this.formeJu = formeJu;
    }

    public void setCodeSiret(String codeSiret) {
        this.codeSiret = codeSiret;
    }

    @Override
    public String toString() {
        return "MoralPerson{" +
                "formeJu='" + formeJu + '\'' +
                ", codeSiret='" + codeSiret + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
