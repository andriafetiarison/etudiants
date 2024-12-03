package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modele.Etudiant;

public class EtudiantDaoImpl implements GenericDao<Etudiant> {
    
    @Override
    public void inserer(Etudiant etudiant){
        String sql = "INSERT INTO etudiants (nom, prenom, age, filiere) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConnexionBDD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, etudiant.getNom());
            stmt.setString(2, etudiant.getPrenom());
            stmt.setInt(3, etudiant.getAge());
            stmt.setString(4, etudiant.getFiliere());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erreur :" + e.getMessage());
        }
    }
    
    @Override
    public void modifier(Etudiant etudiant){
        String sql = "UPDATE etudiants SET nom = ?, prenom = ?, age = ?, filiere = ? WHERE id = ?";
        try (Connection conn = ConnexionBDD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, etudiant.getNom());
            stmt.setString(2, etudiant.getPrenom());
            stmt.setInt(3, etudiant.getAge());
            stmt.setString(4, etudiant.getFiliere());
            stmt.setInt(5, etudiant.getMatricule());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erreur :" + e.getMessage());
        }
    }
    
    @Override
    public void supprimer(int id){
        String sql = "DELETE FROM etudiants WHERE id = ?";
        try (Connection conn = ConnexionBDD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erreur :" + e.getMessage());
        }
    }
    
}
