package adam.http.springboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService{
    private List<User> userList = new ArrayList<>(Arrays.asList(
        new User(001, "adam", "adam@work.com"),
        new User(002, "bill", "bill@work.com"),
        new User(003, "ted", "ted@work.com")
    ));

    public List<User> getUserList() {
        return userList;
    }

    public User getUser(int uuid){
        return userList.stream().filter(user -> user.getUuid() == uuid).findFirst().get();
    }

    public void addUser(User user){
        userList.add(user);
    }

    public void updateUser(int uuid, User user){
        for(int i = 0; i < userList.size(); i++){
            User u = userList.get(i);
            if(u.getUuid() == uuid){
                userList.set(i, user);
                return;
            }
        }
    }

    public void deleteUser(int uuid){
        userList.removeIf(u -> u.getUuid() == uuid);
    }
}