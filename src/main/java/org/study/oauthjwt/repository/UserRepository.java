package org.study.oauthjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.study.oauthjwt.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
