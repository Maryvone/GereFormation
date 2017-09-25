public class ECF {

    private int id, note;
    private String nom;
    private Stagiaire idStagiaire;
    private Module idModule;

    public ECF(int note, String nom, Stagiaire idStagiaire, Module idModule) {
        this.note = note;
        this.nom = nom;
        this.idStagiaire = idStagiaire;
        this.idModule = idModule;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Stagiaire getIdStagiaire() {
        return idStagiaire;
    }

    public void setIdStagiaire(Stagiaire idStagiaire) {
        this.idStagiaire = idStagiaire;
    }

    public Module getIdModule() {
        return idModule;
    }

    public void setIdModule(Module idModule) {
        this.idModule = idModule;
    }

    public int getId() {
        return id;
    }
}
