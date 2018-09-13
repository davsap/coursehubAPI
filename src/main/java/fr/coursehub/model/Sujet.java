package fr.coursehub.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Sujets")
@Table(name = "Sujets")
public class Sujet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sujet")
    private Long id;

    @Column(name = "titre")
    private String titre;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_formation")
    private Formation formation;

    @OneToMany(mappedBy = "sujet", cascade = CascadeType.ALL)
    private Set<Cours> courses;

    public Sujet() {
        courses = new HashSet<>();
    }

    public Sujet(Long id, String titre) {
        this.id = id;
        this.titre = titre;
        courses = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    @Override
    public String toString() {
        return "Sujet [id=" + id + ", titre=" + titre + ", formation=" + formation + "]";
    }

    public void addCours(Cours cours) {
        this.courses.add(cours);
    }


}
