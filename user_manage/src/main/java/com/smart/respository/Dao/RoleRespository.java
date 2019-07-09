package com.smart.respository.Dao;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.smart.entity.QRoleEntity;
import com.smart.entity.QUserBaseEntity;
import com.smart.entity.RoleEntity;

import javax.persistence.EntityManager;

public class RoleRespository {
    EntityManager entityManager;
QRoleEntity qRoleEntity=QRoleEntity.roleEntity;
JPAQueryFactory jpaQueryFactory=new JPAQueryFactory(entityManager);
QUserBaseEntity qUserBaseEntity=QUserBaseEntity.userBaseEntity;
 public  RoleEntity findRoleByUserId(String id){
     return jpaQueryFactory.select(qRoleEntity).where(qRoleEntity.userId.eq(id)).fetchOne();
 }

}
