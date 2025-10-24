package ma.emsi.sadik.springdatarest_tp.model;

import jakarta.persistence.*;
import lombok.*;
import ma.emsi.sadik.springdatarest_tp.enums.Genre;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "students")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name="nom_etudiant", nullable=false)
    String nom;
    @Column(name="prenom_etudiant")
    String prenom;
    @Enumerated(EnumType.STRING)
    Genre genre;

    @ManyToOne
    private Centre centre;
}
