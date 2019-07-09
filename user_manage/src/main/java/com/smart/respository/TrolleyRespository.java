package com.smart.respository;

import com.smart.entity.TrolleyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.support.QuerydslJpaPredicateExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface TrolleyRespository extends JpaRepository<TrolleyEntity,String>, QuerydslPredicateExecutor<TrolleyEntity>,JpaSpecificationExecutor<TrolleyEntity>{


}
