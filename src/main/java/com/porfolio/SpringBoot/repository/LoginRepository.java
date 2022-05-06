
package com.porfolio.SpringBoot.repository;

import com.porfolio.SpringBoot.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository <User, Long>{
    List<User> findByEmailAndIsEnabledTrue(String email);
}
