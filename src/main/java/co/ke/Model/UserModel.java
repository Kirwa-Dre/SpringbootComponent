/**
 * 
 */
package co.ke.Model;

import java.io.Serializable;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author kirwa
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel implements Serializable{

	
	private Long userId;
	
	
	@NotNull
	private String admissionNo;
	
	
	@NotNull
	private String email;
	
	
	@NotNull
	private String name;
	
	
	@NotNull
	private String password;


	public UserModel(String admissionNo, String email, String name, String password) {
		super();
		this.admissionNo = admissionNo;
		this.email = email;
		this.name = name;
		this.password = password;
	}
	
	

}
