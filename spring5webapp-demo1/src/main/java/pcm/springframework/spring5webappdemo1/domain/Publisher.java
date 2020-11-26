/*
 * Created by PabloCM on 26/11/2020 10:18 pm with IntelliJ IDEA
 * Project spring5webapp-demo1
 */

package pcm.springframework.spring5webappdemo1.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String adressLine1;
    private String city;
    private String state;
    private int zip;
    @OneToMany
    @JoinColumn(name = "publisher_id")
    private Set<Book> books = new HashSet<>();

    public Publisher() {

    }
    public Publisher(String name, String adressLine1, String city, String state, int zip) {
        this.name = name;
        this.adressLine1 = adressLine1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    //Getters
    public String getName() {
        return name;
    }
    public Long getId() {
        return id;
    }
    public String getAdressLine1() {
        return adressLine1;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public int getZip() {
        return zip;
    }
    public Set<Book> getBooks() {
        return books;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setAdressLine1(String adressLine1) {
        this.adressLine1 = adressLine1;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return id.equals(publisher.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adressLine1='" + adressLine1 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}
