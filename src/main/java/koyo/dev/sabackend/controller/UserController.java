package koyo.dev.sabackend.controller;

import koyo.dev.sabackend.entites.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping(path = "user")
public class UserController {

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void CreateUser(@RequestBody User user){
    }
}
