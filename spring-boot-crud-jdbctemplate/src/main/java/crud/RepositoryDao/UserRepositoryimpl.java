package crud.RepositoryDao;

import com.crud.entity.User

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserRepositoryimpl implements UserRepository {

	
	private static final String INSERT_USER_QUERY="INSERT INTO USER(id,fname,lname,email) values(?,?,?,?)";
	private static final String UPDATE_USER_BY_ID_QUERY="UPDATE USER SET fname=? WHERE ID=?";
	private static final String GET_USER_BY_ID_QUERY="SELECT * FROM USER WHERE ID=?";
	private static final String DELETE_USER_BY_ID="DELETE FROM USER WHERE ID=?";
	private static final String GET_USERS_QUERY="SELECT * FROM USER";
	@Autowired
	private JdbcTemplate jdbcTemplate;
private String DELETE_USER_BY_id;
	
	@Override
	public User saveUser(User user) {
		jdbcTemplate.Update(INSERT_USER_QUERY,user.getId(),getFname(),user.getLname(),user.getEmail());
		return User;
	}
    @Override
	public User UpdateUser(User user) {
		jdbcTemplate.update(UPDATE_USER_BY_ID_QUERY,user.getFname(),user.getId());	
		return user;
	}

	@Override
	public User getById(int id) {
		return jdbcTemplate.queryForObject(GET_USER_BY_ID_QUERY,(rs, rowNum) -> {
		
		String columnLabel;
return new User(rs.getInt( columnLabel: "id"),rs.getString( columnLabel: "fname")rs,getString( columnLabel: "lname")rs.getString( columnLabel: "email"));
	    },id);
    }
	@Override
	public String deleteById(int id) {
		jdbcTemplate.update(DELETE_USER_BY_id);
		return "User got deleted with id"+id;
	}

	@Override
	public List<User>llUsers() {
	return jdbcTemplate.query(GET_USERS_QUERY,(rs,rowNum) -> {
	    return new Userrs.getInt( columnLabel: "id"),rs.getString( columnLabel: "fname")rs,getString( columnLabel: "lname")rs.getString( columnLabel: "email"));
	});
  }
}
