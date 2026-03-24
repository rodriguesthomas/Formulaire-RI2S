package Formulaire.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "non_professionnel")
@Data
@NoArgsConstructor
public class NonProfessionnel {
    
    @Id
    private Long idUtilisateur;

    @OneToOne
    @MapsId 
    @JoinColumn(name = "id_utilisateur", nullable = false)
    private Utilisateur utilisateur;

    @Enumerated(EnumType.STRING) 
    @Column(nullable = false)
    private MomentJournee momentJournee;

    @NonNull
    @Column(nullable = false)
    private String participationExpe;

    @ManyToOne
    @JoinColumn(name = "professionnel_id")
    private Professionnel professionnel;
}