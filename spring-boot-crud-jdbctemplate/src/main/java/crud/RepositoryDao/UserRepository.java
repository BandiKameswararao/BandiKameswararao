package crud.RepositoryDao;

import com.Crud.Entity.User;

import java.util.List;

public interface UserRepository<User> {
    User saveUser(User user);
    
    User updateUser(User user);
    
    User getById(int id);
    
    String deleteById(int id);
    
    List<User> allUsers();
}



}
