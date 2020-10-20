package com.cine.app.geovanny.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cine.app.geovanny.model.Roles;

@Repository
public interface IRepositoryRoles extends JpaRepository<Roles, String>{

}
