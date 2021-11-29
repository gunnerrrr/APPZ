package patterns.APPZ.bridge;

import patterns.APPZ.entities.User;
import patterns.APPZ.proxy.DbContext;

import java.util.List;

public class UserService implements IUserService {
    public DbContext dbContext;

    @Override
    public void CreateUser(User user) {
        dbContext.userList.add(user);
    }

    @Override
    public void UpdateUser(Integer idUser, User updatedUser) {
        this.DeleteUser(idUser);
        updatedUser.setUserId(idUser);
        dbContext.userList.add(updatedUser);
    }

    @Override
    public void DeleteUser(Integer idUser) {
        dbContext.userList.remove(this.getUserById(idUser));
    }

    @Override
    public List<User> getUsers() {
        return dbContext.userList;
    }

    @Override
    public User getUserById(Integer idUser) {
        return dbContext.userList.stream()
                .filter(user-> user.getUserId().equals(idUser))
                .findFirst().get();
    }

    public void makeAttempt (Integer idUser,Integer idTask) {

    }

}
