package hellojpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BookStore {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_store_id")
    private Long id;

    private String name;

    private String location;

    @OneToMany(mappedBy = "bookStore")
    private List<Book> books = new ArrayList<>();

    @OneToMany
    private List<Member> members = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
