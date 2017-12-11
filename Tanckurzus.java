import java.util.ArrayList;

public class Tanckurzus{

    private int parokszama;
    ArrayList<Szemely> resztvevok;
    private int parokMaxSzama;

    public Tanckurzus(int parokMaxSzama){
        resztvevok = new ArrayList<Szemely>();
        this.parokMaxSzama = parokMaxSzama;
        parokszama = 0;

    }

    public boolean addPar(Szemely szemely1,Szemely szemely2){

        if(parokszama<=parokMaxSzama && szemely1.noE() != szemely2.noE()){
            if(szemely1.ferfiE()){
                resztvevok.add(szemely1);
                resztvevok.add(szemely2);
            }
            else {
                resztvevok.add(szemely2);
                resztvevok.add(szemely1);
            }

            parokszama++;
            return true;
        }

        return false;
    }

    public double getAtlageletkor(boolean nem){
        int sum = 0;
        int azonosnemuekszama = 0;

        for(Szemely sz : resztvevok){
            if(sz.noE() == nem){
                sum = sum + sz.getKor();
                azonosnemuekszama++;
            }
        }
        return sum / azonosnemuekszama;
    }

    public Szemely getPartner(String nev){
        for(int i = 0; i<resztvevok.size();i++){
            if(resztvevok.get(i).getNev().equals(nev)){
                if(resztvevok.get(i).ferfiE()){
                    return resztvevok.get(i+1);
                }
                else{
                    return resztvevok.get(i-1);
                }
            }
        }
        return null;
    }


}
