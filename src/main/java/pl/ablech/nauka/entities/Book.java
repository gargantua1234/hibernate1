package pl.ablech.nauka.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arek on 15.12.2016.
 */

@Entity
@Table
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")
    private int id;

    private String name;

    @ManyToMany
    @JoinTable(name="book_author",
                joinColumns = {@JoinColumn(name = "id_book")},
                inverseJoinColumns = {@JoinColumn(name = "id_author")})
    private List<Author> authors;

    public Book() {
        this.authors = new ArrayList<>();
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

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
