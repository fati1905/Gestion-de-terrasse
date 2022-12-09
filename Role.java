
enum roleP {
    exploitant,
    agentAd,
    surveillant,
    maintainAd;
}
public class Role {

    private roleP role;

    public Role(roleP role){
        this.role = role;
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

