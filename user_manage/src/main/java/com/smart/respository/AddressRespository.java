package com.smart.respository;

import com.smart.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface AddressRespository extends JpaSpecificationExecutor<AddressEntity>,JpaRepository<AddressEntity,String> , QuerydslPredicateExecutor<AddressEntity> {

}
