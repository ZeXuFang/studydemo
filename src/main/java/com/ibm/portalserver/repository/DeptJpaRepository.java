package com.ibm.portalserver.repository;

import com.ibm.portalserver.domain.DeptJpa;
import com.ibm.portalserver.domain.UserJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptJpaRepository extends JpaRepository<DeptJpa,String> {
        List<DeptJpa> findBydeptName(String name);
        }

