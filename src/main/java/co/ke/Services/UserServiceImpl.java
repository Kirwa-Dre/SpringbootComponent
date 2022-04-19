/**
 * 
 */
package co.ke.Services;

import java.util.List;

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
		 boolean exists;
		return (userRepository.existsByAdmissionNo(admissionNo));

	}

//	@Override
//	public Users findByadmissionNo(String admissionNo) {
//		return userRepository.findByAdmissionNo(admissionNo);
//	}

	@Override
	public Users findByEmail(String email) {
		return userRepository.findUserByEmail(email);
	}

//	@Override
//	public Users updateUser(UserModel userModel) {
//
//		return null;
//	}
//
//	@Override
//	public Users deleteUser(Long userId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//

//
//	@Override
//	public List<Users> getAllUser() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Long findByUserId(Long userId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	

}
