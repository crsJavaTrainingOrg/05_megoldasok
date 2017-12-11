public class Szemely{
    
    private String nev;
    private int kor;
    private boolean noE;
    

    
    public Szemely(String nev, int kor, boolean noE){
        
        this.nev = nev;
        this.kor = kor;
        this.noE = noE;
    }
    
    public String getNev(){
        return nev;
    }
    
    public int getKor(){
        return kor;
    }
    
    public boolean noE(){
        return noE;
    }
    
    public boolean ferfiE(){
        return !noE;
    }
    
    
}
    
