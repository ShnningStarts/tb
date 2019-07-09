package com.smart.respository.Dao;

import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.DatePath;
import com.querydsl.jpa.hibernate.HibernateQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.smart.DTO.UserLogginDto;
import com.smart.entity.*;
import com.smart.respository.UserBaseResponsitory;
import org.hibernate.criterion.Projection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserRepository {

    QUserBaseEntity qUserBaseEntity=QUserBaseEntity.userBaseEntity;
    QRoleEntity qRole=QRoleEntity.roleEntity;
    @Autowired
            private EntityManager entityManager;
    JPAQueryFactory queryFactory=new JPAQueryFactory(entityManager);

@Bean
   public  UserBaseEntity findUserById(String id){
   return  queryFactory.selectFrom(qUserBaseEntity).where(qUserBaseEntity.id.eq(id)).fetchOne();
    }
    public List<UserBaseEntity> findUserByUserName(String name){
        return queryFactory.selectFrom(qUserBaseEntity).where(qUserBaseEntity.userName.eq(name)).fetch();

    }
    public  UserBaseEntity findUserByTelephone(String  Telephone){
        return queryFactory.selectFrom(qUserBaseEntity).where(qUserBaseEntity.numberPhone.eq(Telephone)).fetchOne();
    }
    public  Long  writeId(String id){
        return  queryFactory.update(qUserBaseEntity).set(qUserBaseEntity.id, id).where(qUserBaseEntity.id.eq(id)).execute();
    }
    public    Long  writeName(String name,String id){
        return  queryFactory.update(qUserBaseEntity).set(qUserBaseEntity.name, name).where(qUserBaseEntity.id.eq(id)).execute();
    }
    public    Long  writeUsername(String userName,String id){
        return  queryFactory.update(qUserBaseEntity).set(qUserBaseEntity.userName, userName).where(qUserBaseEntity.id.eq(id)).execute();
    }
    public   Long  writePassword(String password,String id){
        return  queryFactory.update(qUserBaseEntity).set(qUserBaseEntity.password, password).where(qUserBaseEntity.id.eq(id)).execute();
    }
    public   Long  writeEmail(String email,String id){
        return  queryFactory.update(qUserBaseEntity).set(qUserBaseEntity.email, email).where(qUserBaseEntity.id.eq(id)).execute();
    }
    public   Long  writeSex(String sex,String id){
        return  queryFactory.update(qUserBaseEntity).set(qUserBaseEntity.sex, sex).where(qUserBaseEntity.id.eq(id)).execute();
    }
    public   Long  writeNumberPhone(String  numberPhone,String id){
        return  queryFactory.update(qUserBaseEntity).set(qUserBaseEntity.numberPhone, numberPhone).where(qUserBaseEntity.id.eq(id)).execute();
    }
    public  Long  writeBrithday(DatePath brithday,String id){
        return  queryFactory.update(qUserBaseEntity).set(qUserBaseEntity.brithday,brithday ).where(qUserBaseEntity.id.eq(id)).execute();
    }
    public  Long  writeCreateDay(DatePath createDay,String id){
        return  queryFactory.update(qUserBaseEntity).set(qUserBaseEntity.createTime, createDay).where(qUserBaseEntity.id.eq(id)).execute();
    }
    public    boolean exist(String id){
    if (findUserById(id)!=null){
        return false;
    }
    else
        return  true;
    }









}
