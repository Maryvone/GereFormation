package com.maryvone.gereformation.model;

import java.util.ArrayList;

public class Stagiaire {

    private int id,codePostal;
    private String nom,prenom,adresse,ville,mail,telephone;
    private ArrayList<Formation> formations;


    public Stagiaire(int codePostal, String nom, String prenom, String adresse, String ville, String mail, String telephone, ArrayList<Formation> formations) {
        this.codePostal = codePostal;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        this.mail = mail;
        this.telephone = telephone;
        this.formations = formations;
        this.id=-1;
    }

    public Stagiaire(int id,  String nom, String prenom, ArrayList<Formation> formations, String adresse,int codePostal, String ville, String mail, String telephone ) {
        this.id = id;
        this.codePostal = codePostal;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        this.mail = mail;
        this.telephone = telephone;
        this.formations = formations;
    }

    public Stagiaire(int id,  String nom, String prenom, String adresse,int codePostal, String ville, String mail, String telephone) {
        this.id = id;
        this.codePostal = codePostal;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        this.mail = mail;
        this.telephone = telephone;
        this.formations= new ArrayList();


    }

    public Stagiaire(int codePostal, String nom, String prenom, String adresse, String ville, String mail, String telephone) {
        this.codePostal = codePostal;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        this.mail = mail;
        this.telephone = telephone;
        this.id=-1;
        this.formations=new ArrayList<>();
    }

    public Stagiaire(String name, String prenoms, String adresses, int codep, String city, String email, String telephone) {
        this.codePostal = codep;
        this.nom = name;
        this.prenom = prenoms;
        this.adresse = adresses;
        this.ville = city;
        this.mail = email;
        this.telephone = telephone;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public ArrayList<Formation> getFormations() {
        return formations;
    }

    public void setFormations(ArrayList<Formation> formations) {
        this.formations = formations;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Stagiaire other = (Stagiaire) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}
