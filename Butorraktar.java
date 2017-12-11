import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Butorraktar{

    ArrayList<Butordarab> butorok;
    private int darabszam;
    private double minimumAr;
    private double maximumAr;
    private double butordarabar;
    private int szazalek;

    public Butorraktar(int darabszam, double minimmumAr, double maximumAr){
        this.darabszam = darabszam;
        this.minimumAr = minimumAr;
        this.maximumAr = maximumAr;
        butorok = new ArrayList<Butordarab>();
        int i = 1;

        while(butorok.size()<darabszam){
            Butordarab butordarab = new Butordarab(100000+i,ThreadLocalRandom.current().nextDouble(minimumAr,maximumAr),ThreadLocalRandom.current().nextInt(10,30));
            butorok.add(butordarab);
            i++;
            
        }
    }

    public ArrayList<Butordarab> olcsoButorok(double olcso){
        ArrayList<Butordarab> olcsoButorok = new ArrayList<Butordarab>();
        for(Butordarab b : butorok){
            if(b.getarSzazalekUtan() <= olcso){
                olcsoButorok.add(b);
            }
        }

        return olcsoButorok;
    }

    public double getAtlagAr(){
        double sum = 0;
        for(Butordarab b : butorok){
            sum = sum + b.getAr();
        }

        return sum / butorok.size();
    }
}

        
    
