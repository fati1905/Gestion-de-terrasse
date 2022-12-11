import java.util.Scanner;

enum roleP {
    exploitant,
    agentAd,
    surveillant,
    maintainAd;
}
public class Role {

    private roleP role;

    public Role(){
        System.out.println("****Votre Role******");
        Scanner sc = new Scanner(System.in);

        try {
            while(true){

                System.out.println("Choisissez votre role : \n - [e] pour exploitant \n -[a] pour Agent Administratif \n - [s] pour surveillant \n - [M] pour maintenace");
                String r = sc.nextLine();
                if(r.equals("e")){
                    this.role = roleP.exploitant;
                    break;
                }
                if(r.equals("a")){
                    this.role = roleP.agentAd;
                    break;
                }
                if(r.equals("s")){
                    this.role = roleP.surveillant;
                    break;
                }
                if(r.equals("m")){
                    this.role = roleP.maintainAd;
                    break;
                }
                System.out.println("Réessayer!");
            }
        }catch (Exception exe){
            System.out.println("Erreur :"+exe.getMessage() );
        }

    }

    public Role(roleP r){
          this.role = r;
    }

    public roleP getRole() {
        return role;
    }

    public void setRole(roleP role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "" +
                "" + role;
    }
}

