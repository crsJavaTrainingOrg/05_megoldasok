import java.util.ArrayList;

public class Konyvlista{
    ArrayList<Konyv> konyvek;
    public Konyvlista(){
        konyvek = new ArrayList<Konyv>();
    }

    public int nemetNyelvuZsebkonyvek(){
        int nemetkonyvekszama = 0;
        for(Konyv k : konyvek){
            if(k.getZsebkonyv() == true && k.getNyelv().equals("német")){
                nemetkonyvekszama++;
            }
        }
        return nemetkonyvekszama;
    }

    public boolean addKonyv(Konyv konyv){
        for(Konyv k : konyvek){
            if(k.getIsbn().equals(konyv.getIsbn())){
                return false;
            }
        }

        konyv.setAr();
        konyv.setOldalankentiAr();
        return true;
    }

    public ArrayList<Konyv> dragaZsebkonyvek(){
        ArrayList<Konyv> dragaZsebkonyvek = new ArrayList<Konyv>();

        for(Konyv k : konyvek){
            if(k.getAr() > 20 && k.getZsebkonyv() == true){
                dragaZsebkonyvek.add(k);
            }
        }

        return dragaZsebkonyvek;
    }

}

        
        
    
