/**
 * 
 */
package co.ke.Services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.ke.Entities.Users;
import co.ke.Model.UserModel;
import co.ke.Repository.UserRepository;

/**
 * @author kirwa
 *
 */

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public Users saveUser(UserModel userModel) {
		Users newUser = new Users();
		newUser.setAdmissionNo(userModel.getAdmissionNo());
		newUser.setEmail(userModel.getEmail());
		newUser.setName(userModel.getName());
		newUser.setPassword(userModel.getPassword());
		
		return userRepository.save(newUser);
	}

	@Override
	public boolean existsByAdmissionNo(String admissionNo) {
		return (userRepository.existsByAdmissionNo(admissionNo));
	}

	@Override
	public Users findByEmail(String email) {
		return userRepository.findUserByEmail(email);
	}

	@Override
	public String getPassword(Long id) {
		return userRepository.confirmPassword(id);
	}

	@Override
	public Long getUserId(String admissionNo) {
		return userRepository.findIdByAdmissionNo(admissionNo);
	}

	@Override
	public List<Users> findAll() {
//		List<Users> users = new HashSet<>();
		return userRepository.findAll();
	}


}
