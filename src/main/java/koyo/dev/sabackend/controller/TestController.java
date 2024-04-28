package koyo.dev.sabackend.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "test")
public class TestController {

    @GetMapping(path = "string")
   public String getString(){
       return " Hello from Sa backend by koyoDev";
    }

    @GetMapping(path = "avis")
    public String GetAvis(HttpServletRequest request){
        return request.getQueryString() ;
    }
}
