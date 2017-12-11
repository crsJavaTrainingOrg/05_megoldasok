import java.util.concurrent.ThreadLocalRandom;

public class Butordarab{

    private int fajtaID;
    private double ar;
    private int szazalek;
    private double arszazalekutan;
    public Butordarab(int fajtaID, double ar, int szazalek){
        this.fajtaID = fajtaID;
        this.ar = ar;
        this.szazalek = szazalek;
    }

    public int getFajtaId(){
        return fajtaID;
    }

    public double getAr(){
        return ar;
    }

    public void setAr(double ar){
        this.ar = ar;
    }

    public double getarSzazalekUtan(){
        arszazalekutan = ar - (ar * szazalek) / 100;
        return arszazalekutan;
    }

}
 