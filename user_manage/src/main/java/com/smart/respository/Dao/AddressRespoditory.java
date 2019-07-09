package com.smart.respository.Dao;

import com.querydsl.core.QueryFactory;
import com.querydsl.jpa.ScrollableResultsIterator;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.smart.entity.AddressEntity;
import com.smart.entity.QAddressEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import javax.persistence.EntityManager;
import javax.xml.crypto.Data;
import java.sql.Timestamp;
public class AddressRespoditory {
    QAddressEntity qAddressEntity=QAddressEntity.addressEntity;
    @Autowired
    EntityManager entityManager;
    @Autowired
    JPAQueryFactory queryFactory=new JPAQueryFactory(entityManager);

 public AddressEntity findAddressByUserId(String id){
     return queryFactory.selectFrom(qAddressEntity).where(qAddressEntity.userId.eq(id)).fetchOne();
 }
    public Long writeAddressId(String id){
     return queryFactory.update(qAddressEntity).set(qAddressEntity.id, id).execute();

 }

    public Long writeAddress(String id){
        return queryFactory.update(qAddressEntity).set(qAddressEntity.id, id).execute();

    }
    public  Long writeAddressMyPhone(String phone){
     return queryFactory.update(qAddressEntity).set(qAddressEntity.myPhone, phone).execute();
   }
    public  Long writeAddressDetailAdd(String detail){
        return queryFactory.update(qAddressEntity).set(qAddressEntity.detailAdd, detail).execute();

    }
    public Long writeAddressArea(String area){
        return queryFactory.update(qAddressEntity).set(qAddressEntity.area, area).execute();

    }
    public  Long writeAddressProvice(String privice){
        return queryFactory.update(qAddressEntity).set(qAddressEntity.provice, privice).execute();

    }
    public  Long writeAddressCountry(String country){
        return queryFactory.update(qAddressEntity).set(qAddressEntity.coutry, country).execute();

    }
    public Long writeAddressCity(String city){
        return queryFactory.update(qAddressEntity).set(qAddressEntity.city, city).execute();

    }
    public Long writeAddressCreateTime(Timestamp create){
     return queryFactory.update(qAddressEntity).set(qAddressEntity.createTime, create).execute();
}
    public  Long writeAddressDeleteTime(Timestamp delete){
        return queryFactory.update(qAddressEntity).set(qAddressEntity.deleteTime, delete).execute();
    }






}
