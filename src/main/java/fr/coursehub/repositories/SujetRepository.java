package fr.coursehub.repositories;

import fr.coursehub.model.Sujet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface SujetRepository extends JpaRepository<Sujet, Long>{
   /* public Set<Sujet> getSujetsFormationID(){

    }*/

    @Query("select s from Sujets s where s.formation.id= ?1 ")
    public Set<Sujet> getSujetsFormationID( Long formationID);
}
