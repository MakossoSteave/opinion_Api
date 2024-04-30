package koyo.dev.sabackend.entites;

import jakarta.persistence.*;
import koyo.dev.sabackend.enums.TypeSentiment;

import static jakarta.persistence.CascadeType.MERGE;
import static jakarta.persistence.CascadeType.PERSIST;

@Entity
@Table(name = "sentiment")
public class Sentiment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id ;
    private  String text ;
    private TypeSentiment type;
    @ManyToOne(cascade = {PERSIST, MERGE})
    @JoinColumn(name = "client_id")
    private User user;

    public Sentiment() {
    }

    public Sentiment( int id, String text, TypeSentiment type, User user) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TypeSentiment getType() {
        return type;
    }

    public void setType(TypeSentiment type) {
        this.type = type;
    }
}
