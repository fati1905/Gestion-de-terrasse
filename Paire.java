public class Paire{
    MoralPerson moralPerson;
    PhysicalPerson physicalPerson;

    public Paire(MoralPerson m, PhysicalPerson p){
        this.moralPerson = m;
        this.physicalPerson = p;
    }

    public void setMoralPerson(MoralPerson moralPerson) {
        this.moralPerson = moralPerson;
    }

    public void setPhysicalPerson(PhysicalPerson physicalPerson) {
        this.physicalPerson = physicalPerson;
    }

    public MoralPerson getMoralPerson() {
        return moralPerson;
    }

    public PhysicalPerson getPhysicalPerson() {
        return physicalPerson;
    }
}
