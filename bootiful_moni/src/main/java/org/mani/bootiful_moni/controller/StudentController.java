package org.mani.bootiful_moni.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/users")
public class StudentController {

    @GetMapping
    public List<String> getUsers() {
        return List.of("Pekka", "Kalle", "Olle");
    }

    @GetMapping(path = {"{userId}"})
    String getCustomer(@PathVariable("userId") Long id) {
        return "Kakka-" + id;
    }

    @PostMapping
    String createUser(@RequestBody String userData) {
        return "User created with data: " + userData;
    }

    @DeleteMapping(path = {"{userId}"})
    String deleteUser(@PathVariable("userId") Long id) {
        return "User deleted " + id;
    }

    @PutMapping(path = {"{userId}"})
    String updateUser(@PathVariable("userId") Long id) {
        return "User updated " + id;
    }

}
