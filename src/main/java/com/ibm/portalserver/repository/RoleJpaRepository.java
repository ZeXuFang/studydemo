package com.ibm.portalserver.repository;

import com.ibm.portalserver.domain.RoleJpa;
import com.ibm.portalserver.domain.UserJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleJpaRepository extends JpaRepository<RoleJpa,String>{
    List<RoleJpa> findByroleName(String name);
}
