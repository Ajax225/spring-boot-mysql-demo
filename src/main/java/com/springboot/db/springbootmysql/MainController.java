package com.springboot.db.springbootmysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/demo")
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/add")
    public @ResponseBody String addNewUser(@RequestParam int id, @RequestParam String name, @RequestParam double salary, @RequestParam String teamName){
        User n = new User();
        n.setId(id);
        n.setName(name);
        n.setSalary(salary);
        n.setTeamName(teamName);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

}
