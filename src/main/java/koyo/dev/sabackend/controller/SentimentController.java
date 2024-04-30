package koyo.dev.sabackend.controller;

import koyo.dev.sabackend.entites.Sentiment;
import koyo.dev.sabackend.services.SentimentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "sentiment" , produces = APPLICATION_JSON_VALUE)
public class SentimentController {

       private SentimentService sentimentService ;

    public SentimentController(SentimentService sentimentService) {
        this.sentimentService = sentimentService;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE )
    public void creer(@RequestBody Sentiment sentiment){
    this.sentimentService.creer(sentiment);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public @ResponseBody List<Sentiment> search(){
        return this.sentimentService.search() ;
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping(path = "{id}")
    public void supprimer (@PathVariable int id ){
        this.sentimentService.supprimer(id) ;
    }

}
