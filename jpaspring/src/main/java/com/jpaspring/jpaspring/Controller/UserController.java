package com.jpaspring.jpaspring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jpaspring.jpaspring.Model.UserModel;
import com.jpaspring.jpaspring.Repository.UserResponse;

//import jakarta.annotation.PostConstruct;

@Controller
public class UserController {
    
    @Autowired
    private UserResponse userResponse_obj;

    @GetMapping
    public String index()
    {
        return "index";
    }
    @PostMapping("/createuser")
    public String saveUser(UserModel usernew,Model model){
        
        System.out.println("************************");
        System.out.println("Inside Create");
        System.out.println("************************");
         userResponse_obj.save(usernew);
         List<UserModel> users=userResponse_obj.findAll();
         model.addAttribute("userforhtml", users);
         return "Welcome";

    }

}