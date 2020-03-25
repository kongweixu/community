package life.majiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserinfoController {

    @GetMapping("/userinfo")
    public String userinfo(){
        return "userinfo";
    }

}
