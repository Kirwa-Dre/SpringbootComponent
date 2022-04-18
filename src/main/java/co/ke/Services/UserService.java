/**
 * 
 */
package co.ke.Services;

import java.util.List;

import co.ke.Entities.Users;
import co.ke.Model.UserModel;

/**
 * @author kirwa
 *
 */
public interface UserService {

	Users saveUser(UserModel userModel);
	Users findByadmissionNo(String admissionNo);
	Users findByEmail(String email);

//	Users updateUser(UserModel userModel);
//	Users deleteUser(Long userId);
//	List<Users> getAllUser();
//	Long findByUserId(Long userId);
}
