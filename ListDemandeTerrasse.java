import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ListDemandeTerrasse {
    Calendar c = Calendar.getInstance();
    AtomicInteger idD;
    DemandeTerrasse demande;
    HashMap<Integer,DemandeTerrasse> listDemandeTerrasse = new HashMap<>();

    public AtomicInteger getIdD() {
        return idD;
    }

    public DemandeTerrasse getDemande() {
        return demande;
    }

    public void setIdD(AtomicInteger idD) {
        this.idD = idD;
    }

    public void setDemande(DemandeTerrasse demande) {
        this.demande = demande;
    }

    public DemandeTerrasse createDemande(){
        System.out.println("****** Créer une demande ******");
        try{
            demande = new DemandeTerrasse();
            listDemandeTerrasse.put(idD.incrementAndGet(), this.demande);
            return demande;
        }catch (Exception ex){
            System.out.println("Votre demande n'a pas pu être entregistrée :"+ex.getMessage());
            return null;
        }
    }

    public void deleteDemande(DemandeTerrasse d){
        for (var entry: listDemandeTerrasse.entrySet()) {
            if(d == entry.getValue()){
                try {
                    listDemandeTerrasse.remove(entry.getKey());
                }catch (Exception exe){
                    System.out.println("La demande n'a pas pu être supprimée :"+exe.getMessage());
                }
            }
        }
    }

    public void deleteAnciensDemande(){
        for (var entry: listDemandeTerrasse.entrySet()) {
            if(entry.getValue().getDate().get(Calendar.YEAR) == c.get(Calendar.YEAR)){
                try {
                    listDemandeTerrasse.remove(entry.getKey());
                }catch (Exception ex){
                    System.out.println("La demande "+entry.getKey()+"n'a pas pu être supprimée :"+ex.getMessage());
                }
            }
        }
    }

}
