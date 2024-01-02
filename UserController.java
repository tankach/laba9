/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumdu.edu.ua.webstudent;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import sumdu.edu.ua.webstudent.res.User;
import sumdu.edu.ua.webstudent.security.UserRepository;
/**
 *
 * @author tanka
 */
@Controller
public class UserController {
         
    @Autowired
    private UserRepository userRepository;
    
    @RequestMapping("/registration")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String adminPage() {
        return "registration";
    }
    
    @RequestMapping("/signup")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String registerUser(@ModelAttribute User user, Model m) {
        String message = "";
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        try{
        userRepository.save(user);
        message=user.getUsername()+" is succesfully saved!";
        }
         catch (Exception e) {
        message+=e.getMessage();
        }
        m.addAttribute("message", message);
          return "registration";
    }

     
        
}
