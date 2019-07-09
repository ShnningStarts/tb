package com.smart.respository;

import com.smart.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface RoleRespository extends JpaRepository<RoleEntity,String> , QuerydslPredicateExecutor<RoleEntity>, JpaSpecificationExecutor<RoleEntity> {
}
