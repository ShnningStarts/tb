package com.smart.respository;

import com.querydsl.core.types.Predicate;
import com.smart.entity.UserBaseEntity;
import org.hamcrest.Condition;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.Optional;


public interface UserBaseResponsitory extends JpaSpecificationExecutor<UserBaseEntity>,JpaRepository<UserBaseEntity,String>, QuerydslPredicateExecutor<UserBaseEntity> {



}

