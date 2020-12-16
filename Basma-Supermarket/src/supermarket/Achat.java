package supermarket;

public class Achat extends Article {
    
    private Article ArticlAchats;
    private int quatiteAchat;
    
    public Achat() {
        super();
    }
    

    public Achat(String n, double prix, boolean solde,Article ArticlAchats,int quantite) {
        super(n, prix, solde);
        this.ArticlAchats=ArticlAchats;
        this.quatiteAchat=quantite;
    }


    public Article getArticlAchats() {
        return ArticlAchats;
    }


    public void setArticlAchats(Article articlAchats) {
        ArticlAchats = articlAchats;
    }


    public int getQuatiteAchat() {
        return quatiteAchat;
    }


    public void setQuatiteAchat(int quatiteAchat) {
        this.quatiteAchat = quatiteAchat;
    }
    

}
