package io.mutexware.ihome.web.controller;

import io.mutexware.ihome.service.persistence.UserRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import io.mutexware.ihome.model.CustomUserDetails;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class GreetingController {

    private UserRolesRepository userRolesRepository;
    @Autowired
    public GreetingController(UserRolesRepository userRolesRepository) {
        this.userRolesRepository = userRolesRepository;
    }

    @RequestMapping("/greeting")
    public String greeting(@AuthenticationPrincipal CustomUserDetails user, @RequestParam(value="name", required=false, defaultValue="World") String name, Model model, HttpServletRequest request,
                           HttpServletResponse response) {
        model.addAttribute("name", name);
        return "greeting";

    }

}
