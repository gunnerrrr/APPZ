package patterns.APPZ.bridge;

import patterns.APPZ.entities.User;
import patterns.APPZ.proxy.CachedDbContext;

import java.util.List;

public class UserService implements IUserService {
    public CachedDbContext cachedDbContext;

    @Override
    public void CreateUser(User user) {
        cachedDbContext.getUserList().add(user);
    }

    @Override
    public void UpdateUser(Integer idUser, User updatedUser) {
        this.DeleteUser(idUser);
        updatedUser.setUserId(idUser);
        cachedDbContext.getUserList().add(updatedUser);
    }

    @Override
    public void DeleteUser(Integer idUser) {
        cachedDbContext.getUserList().remove(this.getUserById(idUser));
    }

    @Override
    public List<User> getUsers() {
        return cachedDbContext.getUserList();
    }

    @Override
    public User getUserById(Integer idUser) {
        return cachedDbContext.getUserList().stream()
                .filter(user-> user.getUserId().equals(idUser))
                .findFirst().get();
    }

    public void makeAttempt (Integer idUser,Integer idTask) {

    }

}
