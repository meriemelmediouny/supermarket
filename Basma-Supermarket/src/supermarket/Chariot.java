package supermarket;

import java.util.HashMap;

public class Chariot extends Achat{

    private HashMap<Article, Integer> aChats = new HashMap<Article, Integer>();

    public Chariot() {
        super();
    }

    public HashMap<Article, Integer> getAChats() {
        return aChats;
    }

    public void setAchats(HashMap<Article, Integer> achats) {
        this.aChats = achats;
    }

    
;
    public void remplir(Article achats,int qte) {
        
        
             this.aChats.put(achats,qte);
              
             
           
    }
    
}
