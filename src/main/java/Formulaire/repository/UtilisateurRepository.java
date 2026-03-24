package Formulaire.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Formulaire.entity.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    /**
     * Recherche un utilisateur par son identité exacte.
     * Cette méthode génère automatiquement la requête SQL :
     * SELECT * FROM utilisateur WHERE nom = ? AND prenom = ? AND date_naissance = ?
     */
    Optional<Utilisateur> findByNomAndPrenomAndDateNaissance(
        String nom, 
        String prenom, 
        Date dateNaissance
    );
}