public class Account {
    protected String email;
    private String password;//Change if possible

    public Account(String e, String p){
        email = e;
        password = p;
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
}
