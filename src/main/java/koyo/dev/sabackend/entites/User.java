package koyo.dev.sabackend.entites;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id ;
    private String pseudo ;
    @Column(unique = true)
    private String email ;
    private String password ;

    public User() {
    }

    public User(int id, String pseudo, String email, String password) {
        this.id = id;
        this.pseudo = pseudo;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
