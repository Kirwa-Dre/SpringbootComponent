package co.ke.Controller;


import co.ke.Entities.Users;
import co.ke.Model.UserModel;
import co.ke.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<?> createUser(@RequestBody UserModel userModel){
        Users newUser = new Users();
        if (userModel.getAdmissionNo()=="" || userModel.getAdmissionNo()==null){
            return ResponseEntity.ok("Please enter your admission number");
        }else if (userModel.getEmail()==null || userModel.getEmail()==""){
            return ResponseEntity.ok("Please enter school corporate email");
        }else if (userModel.getPassword()==null || userModel.getPassword()==""){
            return ResponseEntity.ok("Please enter your password");
        }else if(userModel.getName()==null || userModel.getName()==""){
            return ResponseEntity.ok("Please enter your names");
        }else {
            newUser=userService.saveUser(userModel);
        }

        return ResponseEntity.ok(newUser);
    }

//    @GetMapping("/login")
//    public ResponseEntity login(@RequestBody UserModel userModel){
//
//    }


}
