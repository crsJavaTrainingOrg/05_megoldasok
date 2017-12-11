import java.util.ArrayList;

public class Bank{

    ArrayList<Bankszamla> bankszamlak;

    public Bank(){
        bankszamlak = new ArrayList<Bankszamla>();
    }

    public boolean addBankszamla (Bankszamla bankszamla){

        for(Bankszamla b : bankszamlak){
            if(b.getBankszamlaszam().equals(bankszamla.getBankszamlaszam())){
                return false;
            }
        }
        bankszamlak.add(bankszamla);
        return true;
    }

    public boolean bankszamlaLezarasa(String bankszamlaszam){
        for(Bankszamla b : bankszamlak){
            if(b.getBankszamlaszam().equals(bankszamlaszam)){
                b.setLevaneZarva(true);
                return true;

            }
        }
        return false;
    }

    public ArrayList<Bankszamla> bankszamlakPluszban(){
        ArrayList<Bankszamla> bankszamlakPluszban = new ArrayList<Bankszamla>();
        for(Bankszamla b : bankszamlak){
            if(b.getlevaneZarva() == false && b.getSzamlaegyenleg() > 0){
                bankszamlakPluszban.add(b);
            }
        }

        return bankszamlakPluszban;
    }

    public Bankszamla legjobbBankszamla(){
        if(bankszamlak.isEmpty()){
            return null;
        }
        Bankszamla maxbankszamla = null;
        for(Bankszamla b : bankszamlak){
            if(!b.getlevaneZarva()){
                if(maxbankszamla == null){
                    maxbankszamla = b;
                }
                else{
                    if(b.getSzamlaegyenleg() > maxbankszamla.getSzamlaegyenleg()){
                        maxbankszamla = b;
                    }
                }
            }
        }
        return maxbankszamla;
    }
            
            

        
    

}

        
        
    
        