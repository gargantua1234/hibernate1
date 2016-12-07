package pl.ablech.nauka.entities;

import javax.persistence.*;

/**
 * Created by Arek on 07.12.2016.
 */

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "deans_group")
    private String deansGroup;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDeansGroup() {
        return deansGroup;
    }

    public void setDeansGroup(String deansGroup) {
        this.deansGroup = deansGroup;
    }
}
