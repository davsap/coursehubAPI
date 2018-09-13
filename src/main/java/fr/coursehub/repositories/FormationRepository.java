package fr.coursehub.repositories;

import fr.coursehub.model.Formation;
import fr.coursehub.model.Sujet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Set;

@Repository
public interface FormationRepository extends JpaRepository<Formation, Long> {



}
