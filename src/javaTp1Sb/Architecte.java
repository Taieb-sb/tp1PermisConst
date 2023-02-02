package javaTp1Sb;

class Architecte extends Personne{
    private String conseilRegional;
    private Adresse adresse;
    private String telephone;
    private boolean inscriptionOrdre;

    public Architecte(String nom, String prenom, String civilite, String mail, String conseilRegional, boolean inscriptionOrdre, Adresse adresse, String telephone) {
        super(nom, prenom);

        this.conseilRegional = conseilRegional;
        this.inscriptionOrdre = inscriptionOrdre;
        this.adresse = adresse;

        if(telephoneValide(telephone)){
            this.telephone=telephone;
        }else {
            this.telephone="";
        }
        Maj_conseilRegional();
    }

    private boolean telephoneValide(String telephone){
        if (telephone== null || telephone.length()!=10) {
            return false;
        }
        for(int i = 0; i<10; i++){
            if(!Character.isDigit(telephone.charAt(i))){
                return false;
            }
        }
        this.telephone = "";
        return true;
    }
    public void Maj_conseilRegional() {
        if(inscriptionOrdre){
            conseilRegional = conseilRegional +"inscrit";
        }else {
            conseilRegional=conseilRegional+"non inscrit";
        }
        System.out.println(nom+ "/ "+ prenom+" / "+conseilRegional+" / "+telephone+" / "+inscriptionOrdre+" / ");
    }

    public String getConseilRegional(){
        return conseilRegional;
    }
    public void setConseilRegional(String conseilRegional) {
        this.conseilRegional = conseilRegional;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    // renvoie une chaine contenant le nom, le prenom, le conseil regional et
    // le numero de telephone de l'architecte ainsi que la mention "inscrit"
    // s'il est inscrit au conseil de l'ordre ou "non inscrit" dans le cas contraire
    public String toString () {
        String chaine = "";
        chaine = chaine + this.conseilRegional + " ";
        chaine = chaine + this.telephone+"";
        chaine = chaine + this.adresse+"";
        if(this.inscriptionOrdre){
            chaine=chaine+" inscrit ";
        }else {
            chaine=chaine+" non inscrit ";
        }
        return chaine;
    }
}
