package patterns.APPZ.proxy;

import patterns.APPZ.entities.Task;
import patterns.APPZ.entities.TaskResult;
import patterns.APPZ.entities.User;

import java.util.List;
//PROXY
public class CachedDbContext implements IDbContext{

    private static IDbContext dbContext;
    @Override
    public List<User> getUserList() {
        if(dbContext==null) {
            dbContext= new DbContext();
        }
        return dbContext.getUserList();
    }

    @Override
    public List<Task> getTaskList() {
        if(dbContext==null) {
            dbContext= new DbContext();
        }
        return dbContext.getTaskList();    }

    @Override
    public List<TaskResult> getTaskResultList() {
        if(dbContext==null) {
            dbContext= new DbContext();
        }
        return dbContext.getTaskResultList();
    }

}
