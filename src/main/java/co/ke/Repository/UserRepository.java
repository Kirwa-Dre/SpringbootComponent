/**
 * 
 */
package co.ke.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.ke.Entities.Users;

import java.util.List;

/**
 * @author kirwa
 *
 */
public interface UserRepository extends JpaRepository<Users, Long>{
    Users findByAdmissionNo(String admissionNo);
    Users findUserByEmail(String email);
    Users existsByEmail(String email);
    boolean existsByAdmissionNo(String admissionNo);

}
