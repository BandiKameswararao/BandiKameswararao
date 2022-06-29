package crud.controller;

import com.crud.dao.UserRepository
import com.crud.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
    crud.RepositoryDao.UserRepository<User> userRepository;
	
    @PostMapping("/User")
    public user addUser(@RequestBody User user) {

        return userRepository.saveUser(User);

    }
    
    @PutMapping("/User")
    public user UpdateUser(@RequestBody User user) {

        return userRepository.UpdateUser(User);

    }   
    
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id")int id){  
    	return userRepository.getById(id);
    }
    
    @GetMapping("/users")
    public List<User> getUsers(){  
    	return userRepository.allUsers(); 
    }	
    	
    @DeleteMapping("/User/id}")
   public String deleteUser(@PathVariable("id")int id) {
       return userRepository.deleteById(id);
    }
   
}