package Formulaire.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "professionnel")
@Data
@NoArgsConstructor
public class Professionnel {
    
    @Id
    private Long idUtilisateur; // Prendra automatiquement l'ID de l'utilisateur

    // @OneToOne
    // @MapsId // Indique que la clé primaire est la même que celle de la relation
    // @JoinColumn(name = "id_utilisateur", nullable = false)
    // @JsonBackReference
    // private Utilisateur utilisateur;
    
    @NonNull
    @Column(nullable = false)
    private String nomFonction;

    @NonNull
    @Column(nullable = false)
    private String structure;

    @NonNull
    @Column(nullable = false)
    private String participationExpe;

    // @OneToMany(mappedBy = "professionnel", cascade = CascadeType.ALL)
    // @JsonIgnore
    // private List<NonProfessionnel> contactsNonPro = new ArrayList<>();

}