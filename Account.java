import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    protected String email;
    private String password;//Change if possible
    private final ArrayList<Role> roles = new ArrayList<Role>();

    public Account(String e, String p, Role r){
        email = e;
        password = p;
        roles.add(r);
    }

    public ArrayList<Role> getRoles() {
        return roles;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void addRole(){
        Role role = new Role();
        this.roles.add(role);
    }

    private void deleteRole(){//exécutée par l'administrateur
        System.out.println(roles);
        System.out.println("Quel rôle voulez vous supprimé :");
        Role r = new Role();

        while (!roles.contains(r)){
            System.out.println("Ce rôle n'existe pas!");
            r = new Role();
        }
        System.out.println("Attention, vous allez supprimer le rôle "+ r);

        try {
            roles.remove(r);
        }catch (Exception ex){
            System.out.println("On n'a pas pu supprimer ce rôle!"+ex.getMessage());
        }
    }
}