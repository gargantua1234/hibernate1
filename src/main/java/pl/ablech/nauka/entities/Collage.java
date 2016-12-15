package pl.ablech.nauka.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Arek on 15.12.2016.
 */

@Entity
@Table
public class Collage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_collage")
    private int idCollage;

    @Column(name = "name")
    private String name;

    @OneToMany(targetEntity = Student.class, mappedBy = "collage",
                cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Student> students;

    public int getIdCollage() {
        return idCollage;
    }

    public void setIdCollage(int idCollage) {
        this.idCollage = idCollage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
