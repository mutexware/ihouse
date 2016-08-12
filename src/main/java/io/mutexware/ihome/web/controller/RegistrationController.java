package io.mutexware.ihome.web.controller;

import io.mutexware.ihome.service.RegistrationService;
import io.mutexware.ihome.web.json.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by tymur on 7/21/16.
 */
@Controller
@RequestMapping("/registration")
public class RegistrationController {


    private final RegistrationService registrationService;

    @Autowired
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String registrationPage(Model model) {
        return "registration";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String register(Model model) {
        throw new NotImplementedException();
    }

    @RequestMapping(value = "/userExists")
    public @ResponseBody Response checkIfUserExists(@RequestParam(value="email", required=true) String email) {
        throw new NotImplementedException();
    }

}
