import java.util.HashMap;

public class ListAccounts {
    HashMap <String, Account> listAccount = new HashMap<>();
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean addAccount(Account account, String name){
        boolean isOk = false;
        try{
            listAccount.put(name, account);
            isOk = true;
        }catch (Exception e){
            System.out.println("Error has been encountered : "+e.getMessage());
            isOk = false;
        }
        return isOk;
    }
}
