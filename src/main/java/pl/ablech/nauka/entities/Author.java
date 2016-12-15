package pl.ablech.nauka.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arek on 15.12.2016.
 */

@Entity
@Table
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_author")
    private int id;


    private String name;

    private String surname;

    @ManyToMany
    @JoinTable(name="book_author",
            joinColumns = {@JoinColumn(name = "id_author")},
            inverseJoinColumns = {@JoinColumn(name = "id_book")})
    private List<Book> books;

    public Author() {
        this.books = new ArrayList<>();
    }

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
}
