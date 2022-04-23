/**
 * 
 */
package co.ke.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

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
	@SequenceGenerator(
			name = "idSequence",
			sequenceName = "idSequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "idSequence"
	)
	@Column(name = "userId",updatable = false,nullable = false)
	private Long userId;
	
	@Column(name = "admissionNo", unique = true,updatable = false,nullable = false,columnDefinition = "TEXT")
	private String admissionNo;
	
	@Column(name = "name",nullable = false)
	private String name;
	
	@Column(name = "email",unique = true,updatable = false)
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
