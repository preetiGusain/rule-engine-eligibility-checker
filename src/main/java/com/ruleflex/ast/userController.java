package com.ruleflex.ast;

import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This class handles the HTTP requests related to user input.
// It displays the user form and processes form submissions, including validation.

@RestController
public class userController {
    @RequestMapping(value = "/user-form", method = RequestMethod.GET)
    public UserAttributes showForm(){
        return new UserAttributes();
    }

    @RequestMapping(value = "/submit-form", method = RequestMethod.POST)
    public String submitForm(@Valid UserAttributes userAttributes, BindingResult result, Model model){
        if(result.hasErrors()){
            return "userForm"; //Form will pop-up again if there are errors
        }
        model.addAttribute("message", "Form submitted sucessfully!");
        return "result"; // If validation is successful, return result page
    }
}
