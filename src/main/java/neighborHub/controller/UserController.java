package neighborHub.controller;

import neighborHub.model.dto.UserDto;
import neighborHub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    @GetMapping("/viewAll")
    public ResponseEntity<List<UserDto>> viewListAllUsers(){
        try {
            List<UserDto> allUserList = userService.viewListAllUser();
            if(allUserList != null){
                return new ResponseEntity<>(allUserList, HttpStatus.OK);
            }else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/UpdateUser")
    public ResponseEntity<UserDto> editInfoStudent(@PathVariable long id, @RequestBody UserDto userDto){
        UserDto editUser = userService.updateUser(userDto);
        if(editUser != null){
            return new ResponseEntity<>(editUser,HttpStatus.ACCEPTED);
        }else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/DeleteUser/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        boolean deletionResult = userService.deleteUser(id);

        if (deletionResult) {
            return new ResponseEntity<>("User deleted successfully.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Unable to delete User. Please check the UserId.", HttpStatus.BAD_REQUEST);
        }
    }
}
