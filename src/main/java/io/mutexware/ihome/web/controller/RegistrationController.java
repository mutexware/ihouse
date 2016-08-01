package io.mutexware.ihome.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tymur on 7/21/16.
 */
@Controller
public class RegistrationController {

    @RequestMapping("/registration")
    public String login(Model model) {
        return "registration";
    }

}
