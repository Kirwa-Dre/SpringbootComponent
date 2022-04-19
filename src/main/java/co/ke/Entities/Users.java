/**
 * 
 */
package co.ke.Entities;

import java.io.Serializable;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kirwa
 *
 */
@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId")
	private Long userId;
	
	@Column(name = "admissionNo")
	private String admissionNo;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;

	public Users(String admissionNo, String name, String email, String password) {
		super();
		this.admissionNo = admissionNo;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	
	
	
	

}
