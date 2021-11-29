package patterns.APPZ.bridge;

import patterns.APPZ.bridge.UserService;
import patterns.APPZ.entities.User;

public class UserController {
    private  UserService userService;
    public void Post (User user) {
        userService.CreateUser(user);
    }
    public void Get (Integer userId) {
        userService.getUserById(userId);
    }
    public void Put (Integer userId, User newInfo) {
        userService.UpdateUser(userId,newInfo);
    }
    public void Delete (Integer userid) {
        userService.DeleteUser(userid);
    }
}
