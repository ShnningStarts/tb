package com.smart.respository;

import com.smart.entity.UserLogginInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface UserLogginInfoRespository extends JpaSpecificationExecutor<UserLogginInfoEntity>, QuerydslPredicateExecutor<UserLogginInfoEntity>,JpaRepository<UserLogginInfoEntity,String> {

}
