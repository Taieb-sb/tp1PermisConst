package javaTp1Sb;

public class Adresse {
    private String rue;
    private String ville;
    private String cP;

    public Adresse(String rue, String ville, String cP){
        this.rue = validate(rue, 100);
        this.ville = validate(ville, 20);
        this.cP = validate(cP, 5);
    }
    private String validate(String chaine, Integer taille){
        chaine = chaine.substring(0, Math.min(chaine.length(),taille));
        return chaine;
    }
}
