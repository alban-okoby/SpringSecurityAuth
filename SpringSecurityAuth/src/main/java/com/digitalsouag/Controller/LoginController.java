package com.digitalsouag.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class LoginController {

    @RolesAllowed("USER")
    @RequestMapping("/*")
    public String getUser() {
        return "USER, WELCOME HERE";
    }

    @RolesAllowed({"USER", "ADMIN"})
    @RequestMapping("/admin")
    public String getAdmin() {
        return "ADMIN, WELCOME HERE";
    }
}
