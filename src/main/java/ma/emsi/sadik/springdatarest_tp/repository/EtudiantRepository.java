package ma.emsi.sadik.springdatarest_tp.repository;

import ma.emsi.sadik.springdatarest_tp.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="eleves")
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
