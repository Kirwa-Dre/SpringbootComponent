/**
 * 
 */
package co.ke.Services;

import java.util.List;

import co.ke.Entities.Users;
import co.ke.Model.UserModel;
import org.springframework.http.ResponseEntity;

/**
 * @author kirwa
 *
 */
public interface UserService {

	Users saveUser(UserModel userModel);
//	Users findByadmissionNo(String admissionNo);
	boolean existsByAdmissionNo(String admissionNo);
	Users findByEmail(String email);

    String getPassword(Long id);

	Long getUserId(String admissionNo);

	List<Users>  findAll();

//	Users updateUser(UserModel userModel);
//	Users deleteUser(Long userId);
//	List<Users> getAllUser();
//	Long findByUserId(Long userId);
}
