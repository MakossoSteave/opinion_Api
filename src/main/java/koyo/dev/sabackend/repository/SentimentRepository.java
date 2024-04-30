package koyo.dev.sabackend.repository;

import koyo.dev.sabackend.entites.Sentiment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SentimentRepository extends JpaRepository<Sentiment, Integer> {

}
