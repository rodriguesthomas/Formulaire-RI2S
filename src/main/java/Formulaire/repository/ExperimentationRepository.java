package Formulaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Formulaire.entity.Experimentation;

@Repository
public interface ExperimentationRepository extends JpaRepository<Experimentation, Long> {
    // Les méthodes de base (save, find, delete) sont incluses par défaut
}