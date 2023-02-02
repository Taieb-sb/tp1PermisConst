package javaTp1Sb;

import java.util.*;

class Deposant extends Personne{

    private String civil;
    private String mail;
    private Adresse adresse;

    public Deposant(String nom, String prenom, String civil, String mail, Adresse adresse){
        super(nom, prenom);

        this.civil = validate(civil, 10);
        this.mail = validate (mail, 100);
        this.adresse=adresse;
    }

    public String getCivil(){
        return civil;
    }
    public String setCivil(String civil) {
        this.civil = civil;
        return civil;
    }

    public String getMail(){
        return mail;
    }
    public String setMail(String mail) {
        this.mail = mail;
        return mail;
    }

    public Adresse getAdresse(){
        return adresse;
    }
    public Adresse setAdresse(){
        this.adresse = adresse;
        return adresse;
    }

    public String toString() {

        return "Deposant civilite : " +civil+ "mail : "+mail+"adresse : "+adresse+"nom : "+nom+"prenom : "+prenom+"";
    }
}
