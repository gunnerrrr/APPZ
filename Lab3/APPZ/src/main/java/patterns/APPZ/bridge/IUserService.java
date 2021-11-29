package patterns.APPZ.bridge;

import patterns.APPZ.entities.User;

import java.util.List;

public interface IUserService {
    public void CreateUser(User user);

    public void UpdateUser(Integer idUser, User updatedUser);

    public void DeleteUser(Integer idUser);

    public List<User> getUsers();

    public User getUserById(Integer idUser);

    public void makeAttempt (Integer idUser,Integer idTask);
}
