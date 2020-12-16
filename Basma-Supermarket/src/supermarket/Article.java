package supermarket;

public class Article {

    private String nom;
    private double prix;
    private boolean solde;
    private int quatite;
    
    public Article() {
        
    }
    
    public Article(String n,double prix,boolean solde) {
        this.nom=n;
        this.prix=prix;
        this.solde=solde;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isSolde() {
        return solde;
    }

    public void setSolde(boolean solde) {
        this.solde = solde;
    }
    
    public int getQuatite() {
        return quatite;
    }

    public void setQuatite(int quatite) {
        this.quatite = quatite;
    }
    
    
    public void affiche() {
        
        if(solde==true) {
            System.out.println(nom+": "+prix+" *"+quatite+" ="+prix*quatite+" MAD (en solde)");
        }
        else {
            System.out.println(nom+": "+prix+" *"+quatite+" ="+prix*quatite+" MAD (non solde)");
            
        }
    }


}