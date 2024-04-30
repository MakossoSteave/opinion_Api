package koyo.dev.sabackend.services;

import koyo.dev.sabackend.entites.Sentiment;
import koyo.dev.sabackend.entites.User;
import koyo.dev.sabackend.enums.TypeSentiment;
import koyo.dev.sabackend.repository.SentimentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class SentimentService {

     private  SentimentRepository sentimentRepository ;
     private  UserService userService ;

    public SentimentService(SentimentRepository sentimentRepository, UserService userService) {
        this.sentimentRepository = sentimentRepository;
        this.userService = userService;
    }

    public void creer (Sentiment sentiment){

        User user = this.userService.creatOrRead(sentiment.getUser());
        sentiment.setUser(user);
        if(sentiment.getText().contains("pas")){
            sentiment.setType(TypeSentiment.NEGATIF);
        }else{
            sentiment.setType(TypeSentiment.POSITIF);
        }
     this.sentimentRepository.save(sentiment);
    }

    public List<Sentiment> search(){
        List <Sentiment> data =this.sentimentRepository.findAll();
     return  data ;
    }

    public void supprimer(int id) {

        this.sentimentRepository.deleteById(id);
    }
}
