package com.smart.respository;

import com.smart.entity.UserChangeInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslPredicate;

public interface UserChangeInfoRespository extends JpaSpecificationExecutor<UserChangeInfoEntity>, QuerydslPredicateExecutor<UserChangeInfoEntity>,JpaRepository<UserChangeInfoEntity,String> {

}
