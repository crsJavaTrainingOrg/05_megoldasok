public class Bankszamla{

    private String bankszamlaszam;
    private String tulajdonos;
    private double szamlaegyenleg;
    private boolean levaneZarva;

    public Bankszamla(String bankszamlaszam, String tulajdonos, double szamlaegyenleg){
        this.bankszamlaszam = bankszamlaszam;
        this.tulajdonos = tulajdonos;
        this.szamlaegyenleg = szamlaegyenleg;
        levaneZarva = false;
    }

    public String getBankszamlaszam(){
        return bankszamlaszam;
    }

    public String getTulajdonos(){
        return tulajdonos;
    }

    public double getSzamlaegyenleg(){
        return szamlaegyenleg;
    }

    public void setLevaneZarva(boolean levaneZarva){
        this.levaneZarva = levaneZarva;
    }

    public boolean getlevaneZarva(){
        return levaneZarva;
    }

}