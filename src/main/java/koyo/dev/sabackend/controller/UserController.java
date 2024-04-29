package koyo.dev.sabackend.controller;

import koyo.dev.sabackend.entites.User;
import koyo.dev.sabackend.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping(path = "user")
public class UserController {

    private UserService userService ;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public String CreateUser(@RequestBody User user){
       return this.userService.CreateUser(user);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<User> Search(){
        return this.userService.search();
    }
}
