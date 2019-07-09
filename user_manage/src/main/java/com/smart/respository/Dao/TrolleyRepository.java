package com.smart.respository.Dao;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.smart.entity.QTrolleyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
@Repository
public class TrolleyRepository {
    @Autowired
    EntityManager entityManager;
    QTrolleyEntity qTrolleyEntity=QTrolleyEntity.trolleyEntity;
    JPAQueryFactory queryFactory=new JPAQueryFactory(entityManager);



}
