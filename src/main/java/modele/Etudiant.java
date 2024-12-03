package modele;

public class Etudiant {
    private int matricule;
    private String nom;
    private String prenom;
    private int age;
    private String filiere;
    
    public int getMatricule(){
        return matricule;
    }
    
    public void setMatricule(int matricule){
        this.matricule = matricule;
    }
    
    public String getNom(){
        return nom;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public String getPrenom(){
        return this.prenom;
    }
    
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getFiliere(){
        return this.filiere;
    }
    
    public void setFiliere(String filiere){
        this.filiere = filiere;
    }
    
    //Autres méthodes 
    public String getNomComplet() {
        return nom + " " + prenom;
    }
}
