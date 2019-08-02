package adam.http.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method=RequestMethod.GET, value = "/users")
    public List<User> getAllUsers(){
        return userService.getUserList();
    }

    @RequestMapping(method=RequestMethod.GET, value = "/users/{uuid}")
    public User getUser(@PathVariable int uuid){
        return userService.getUser(uuid);
    }

    @RequestMapping(method=RequestMethod.POST, value = "/users")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping(method=RequestMethod.PUT, value = "/users/{uuid}")
    public void updateUser(@RequestBody User user, @PathVariable int uuid){
        userService.updateUser(uuid, user);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/users/{uuid}")
    public void deleteUser(@PathVariable int uuid){
        userService.deleteUser(uuid);
    }
}