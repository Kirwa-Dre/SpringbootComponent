package co.ke.Controller;


import co.ke.Entities.Users;
import co.ke.Model.UserModel;
import co.ke.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<?> createUser(@RequestBody UserModel userModel) {
        Users user = new Users();
        if(userService.existsByAdmissionNo(userModel.getAdmissionNo())) {
            return ResponseEntity.ok("User already exists");
        } else {
//            Users newUser = new Users();
            if (userModel.getAdmissionNo().equals("") || userModel.getAdmissionNo() == null) {
                return ResponseEntity.ok("Please enter your admission number");
            } else if (userModel.getEmail() == null || userModel.getEmail().equals("")){
                return ResponseEntity.ok("Please enter school corporate email");
            } else if (userModel.getPassword() == null || userModel.getPassword().equals("")) {
                return ResponseEntity.ok("Please enter your password");
            } else if (userModel.getName() == null || userModel.getName().equals("")) {
                return ResponseEntity.ok("Please enter your names");
            } else {
//                newUser = userService.saveUser(userModel);
                return ResponseEntity.ok(userService.saveUser(userModel));
            }

//            return ResponseEntity.ok(newUser);
        }
    }


    //Kienyeji mbaya
    @GetMapping("/login")
    public ResponseEntity<?> logIn(@RequestParam("admissionNo") String admissionNo,
                                   @RequestParam("password") String password) {
        if (!userService.existsByAdmissionNo(admissionNo)) {
            return ResponseEntity.ok("User does not exist");
        }
        else {
            String confirmPass = userService.getPassword(userService.getUserId(admissionNo));
            if (confirmPass.equals(password)){
                return ResponseEntity.ok("Successfully logged in.");
            }
            else {
                return ResponseEntity.ok("Password is incorrect.");
            }

        }


    }

    @GetMapping("/findAllUsers")
    public ResponseEntity<?> findAllUsers(){

        return ResponseEntity.ok(userService.findAll());

    }

}
