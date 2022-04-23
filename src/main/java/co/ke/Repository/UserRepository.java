/**
 * 
 */
package co.ke.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import co.ke.Entities.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author kirwa
 *
 */
public interface UserRepository extends JpaRepository<Users, Long>{


    Users findByAdmissionNo(String admissionNo);
    Users findUserByEmail(String email);

    boolean existsByAdmissionNo(@Param("existsdmnNo") String admissionNo);

    @Query("SELECT user.userId FROM Users user WHERE user.admissionNo=:admnNo")
    Long findIdByAdmissionNo(@Param("admnNo") String admissionNo);

    @Query("SELECT user.password FROM Users user WHERE user.userId=:id")
    String confirmPassword(@Param ("id") Long id);
}
