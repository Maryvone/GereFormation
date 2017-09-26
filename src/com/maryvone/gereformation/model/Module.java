package com.maryvone.gereformation.model;

import java.util.ArrayList;

public class Module {

    private int id,duree;
    private String libelle, description;
    private ArrayList<ECF> eCFs;
    private ArrayList<Sequence> sequences;

    public Module(int duree, String libelle, String description, ArrayList<ECF> eCFs, ArrayList<Sequence> sequences) {
        this.duree = duree;
        this.libelle = libelle;
        this.description = description;
        this.eCFs = eCFs;
        this.sequences = sequences;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<ECF> geteCFs() {
        return eCFs;
    }

    public void seteCFs(ArrayList<ECF> eCFs) {
        this.eCFs = eCFs;
    }

    public ArrayList<Sequence> getSequences() {
        return sequences;
    }

    public void setSequences(ArrayList<Sequence> sequences) {
        this.sequences = sequences;
    }

    public int getId() {
        return id;
    }
}
