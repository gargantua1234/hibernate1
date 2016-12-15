package pl.ablech.nauka.entities;

import javax.persistence.*;

/**
 * Created by Arek on 15.12.2016.
 */

@Entity
@Table(name = "Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_address")
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "postal_code")
    private String postalCode;


    private String country;

    ///this snipet for bidirectional association
    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    private Person person;

    //-----------------------------
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
