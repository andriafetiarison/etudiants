package controller;

import dao.GenericDao;
import modele.Etudiant;

public class EtudiantController {
    private GenericDao<Etudiant> etudiantDAO;

    public EtudiantController(GenericDao<Etudiant> etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        etudiantDAO.inserer(etudiant);
    }
    
    public void modifierEtudiant(Etudiant etudiant){
        etudiantDAO.modifier(etudiant);
    }
    
    public void supprimerEtudiant(int id){
        etudiantDAO.supprimer(id);
    }
}
