package com.ibm.portalserver.repository;

import com.ibm.portalserver.domain.UserJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserJpaReposiory extends JpaRepository<UserJpa,String> {
  public   List<UserJpa> findByuserName(String name);

}
