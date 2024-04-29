package koyo.dev.sabackend.services;


import ch.qos.logback.core.net.server.Client;
import koyo.dev.sabackend.entites.User;
import koyo.dev.sabackend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository ;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String CreateUser(User user){
      User userbdd =  this.userRepository.findByEmail(user.getEmail());
      if(userbdd == null){
          this.userRepository.save(user);
          return  "l'utilisateur a bien été sauvegardé";
      }else{
          return  "l'adresse email utilisé existe déja ";
      }

    }

    public List<User> search(){
         return  this.userRepository.findAll();
    }
}
