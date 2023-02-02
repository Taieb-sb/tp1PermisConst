package javaTp1Sb;

public abstract class Personne {

    protected String nom;
    protected String prenom;

    public Personne(String prenom, String nom){

        this.nom = this.validate(nom, 50);
        this.prenom = this.validate(prenom, 30);
    }

    // Vérifie la taille et renvoie une chaîne tronquée
    // si la taille est supérieure à taille
    public String validate (String chaine, Integer taille){
        if(chaine.length()>taille)
        {
            chaine = chaine.substring(0, taille);
        }
        //System.out.println(chaine);
        return chaine;
    }

    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public abstract String toString();
}
