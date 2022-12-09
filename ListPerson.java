import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ListPerson {
    protected PhysicalPerson physicalPerson;
    protected MoralPerson moralPerson;
    public AtomicInteger idP = new AtomicInteger(0);
    public Paire pair;
    protected HashMap<Integer, Paire> listPerson;

    public Person addPerson(){
        System.out.println("Are you a physical person or a corporation ? (Answer with : p or c)");
        Person person = null;
        Scanner input = new Scanner(System.in);

        while(true){
            String answer = input.nextLine();
            if(answer.equals("p")){
                physicalPerson = new PhysicalPerson();
                person = (Person) physicalPerson;
                pair = new Paire(null, physicalPerson);
                break;
            }
            if (answer.equals("c")){
                moralPerson = new MoralPerson();
                person = (Person)moralPerson;
                pair = new Paire(moralPerson, null);
                break;
            }

            System.out.println("Your answer should either be 'p' for physical Person or 'c' for corporation!");
        }

        listPerson.put(idP.getAndIncrement(), pair);
        return person;
    }


}
