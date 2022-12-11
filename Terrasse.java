import java.util.Date;
public class Terrasse {
    private int surface;
    private Date date;
    private int code;
    protected Etablissement etablissement;

    public Terrasse(int surface, Date date, int code, Etablissement e) {
        this.surface = surface;
        this.date = date;
        this.code = code;
        this.etablissement = e;
    }

    public int getSurface() {
        return surface;
    }

    public Date getDate() {
        return date;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
