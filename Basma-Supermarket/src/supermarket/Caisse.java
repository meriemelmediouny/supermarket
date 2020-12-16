package supermarket;

public class Caisse extends Chariot{
    
    private int NuCaisse;
    private double MontTotal;

    public Caisse(int NuCaisse,double MontTotal) {
        super();
        this.NuCaisse=NuCaisse;
        this.MontTotal=MontTotal;
        
    }

    public int getNuCaisse() {
        return NuCaisse;
    }

    public void setNuCaisse(int nuCaisse) {
        NuCaisse = nuCaisse;
    }

    public double getMontTotal() {
        return MontTotal;
    }

    public void setMontTotal(double montTotal) {
        MontTotal = montTotal;
    }
    
    public void MontantTotal(){
        System.out.println("le numero de la caisse est "+NuCaisse+" et Montant Total  "+MontTotal+" DH");
        
    }
    
    public void scanner(Chariot chariot) {
        this.MontTotal = 0;
        System.out.println("------------------------------------");
        for (Article article : chariot.getAChats().keySet()) {
            this.MontTotal += (chariot.getAChats().get(article)*article.getPrix());
            System.out.println(article.getNom() + " : " + article.getPrix() + " x " + chariot.getAChats().get(article)+ " = " +
                    chariot.getAChats().get(article)*article.getPrix()+"DH");
        }
        System.out.println("Total à payer :"+this.MontTotal+" DH");
        System.out.println("------------------------------------");
        
    }
    
    

    
    
    

}
