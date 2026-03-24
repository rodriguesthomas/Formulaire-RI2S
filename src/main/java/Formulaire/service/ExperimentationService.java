package Formulaire.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Formulaire.entity.Experimentation;
import Formulaire.repository.ExperimentationRepository;

@Service
public class ExperimentationService {

    @Autowired
    private ExperimentationRepository experimentationRepository;

    public Experimentation creerExperimentation(Experimentation expe) {
        // Tu peux ajouter des vérifications ici (ex: date de fin après date de début)
        return experimentationRepository.save(expe);
    }

    public List<Experimentation> listerToutesLesExpes() {
        return experimentationRepository.findAll();
    }
}
