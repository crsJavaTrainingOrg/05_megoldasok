import java.util.concurrent.ThreadLocalRandom;

public class Konyv{

    private String szerzo;
    private String cim;
    private String isbn;
    private int oldalakszama;
    private boolean zsebkonyv;
    private String nyelv;
    private int ar;
    private double oldalankentiAr;

    public Konyv(String szerzo, String cim, String isbn, int oldalakszama, boolean zsebkonyv,String nyelv){
        this.szerzo = szerzo;
        this.cim = cim;
        this.isbn = isbn;
        this.oldalakszama = oldalakszama;
        this.zsebkonyv = zsebkonyv;
        this. nyelv = nyelv;
    }

    public String getSzerzo(){
        return szerzo;
    }

    public String getCim(){
        return cim;
    }

    public String getIsbn(){
        return isbn;
    }

    public int getOldalakszama(){
        return oldalakszama;
    }

    public boolean getZsebkonyv(){
        return zsebkonyv;
    }

    public String getNyelv(){
        return nyelv;
    }

    public double getOldalankentiAr(){
        return oldalankentiAr;
    }

    public int getAr(){
        return ar;
    }

    public void setAr(){
        ar = ThreadLocalRandom.current().nextInt(10,30);
    }

    public void setOldalankentiAr(){
        double olalankentiAr = this.oldalakszama * 0.02;
    }

}