package supermarket;

public class Main {

    public static void main(String[] args) {
        
        Article choufleur = new Article("Chou-fleur", 3.50, false);
        Article roman = new Article("Zahir ", 100, true);
        Article fromage = new Article("La vache qui rit" , 5.80, false);
        Article cdrom = new Article("Java en trois jours", 48.50, false);
        Article boisson = new Article("Petit-lait", 5.00, true);
        Article petitspois = new Article("Pois surgeles", 4.00, false);
        Article poisson = new Article("Sardines", 10.50, false);
        Article biscuits = new Article("Cookies", 13.20, false);
        Article poires = new Article("Poires", 14.80, false);
        Article cafe = new Article("NESCAF� ", 76.90, true);
        Article pain = new Article("Pain complet", 3.00, false);
        
        Chariot chariot1 = new Chariot();
        Chariot chariot2 = new Chariot();
        Chariot chariot3 = new Chariot();

        Caisse caisse1 = new Caisse(1, 0.0);
        Caisse caisse2 = new Caisse(2, 0.0);
        
        chariot1.remplir(choufleur, 2);
        chariot1.remplir(cdrom, 1);
        chariot1.remplir(biscuits, 4);
        chariot1.remplir(boisson, 6);
        chariot1.remplir(poisson, 2);
        // remplissage du 2eme Chariot
        chariot2.remplir(roman, 1);
        chariot2.remplir(fromage, 1);
        chariot2.remplir(petitspois, 2);
        chariot2.remplir(poires, 2);
        
        // remplissage du 3eme Chariot
        chariot3.remplir(cafe, 2);
        chariot3.remplir(pain, 1);
        chariot3.remplir(fromage, 2);
        // Les clients passent � la caisse
        caisse1.scanner(chariot1);
        caisse1.scanner(chariot2);
        caisse2.scanner(chariot3);
        caisse1.MontantTotal();
        caisse2.MontantTotal();
        
        






    }

}

