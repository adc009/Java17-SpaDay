package org.launchcode.controllers;

import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class UserController {
    @RequestMapping(value = "user", method = {RequestMethod.POST})
    public String displayAddUserForm() {
        return "@RequestMapping(\"user\")";
    }

public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
// add form submission handling code here
    if (user.getPassword().equals(verify)) {

        }
    return "";
    }

}
