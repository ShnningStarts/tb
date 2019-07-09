package com.smart.respository.Dao;

import com.querydsl.core.types.Path;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.smart.entity.QUserLogginInfoEntity;
import com.smart.entity.UserLogginInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class WriteLogginInfoRepository {
    @Autowired
    QUserLogginInfoEntity qUserLogginInfoEntity=QUserLogginInfoEntity.userLogginInfoEntity;
    @Autowired
    EntityManager entityManager;
    JPAQueryFactory queryFactory=new JPAQueryFactory(entityManager);
    UserLogginInfoEntity getLogginInfoByUserId(String id){
        return queryFactory.selectFrom(qUserLogginInfoEntity).where(qUserLogginInfoEntity.userId.eq(id)).fetchOne();
    }
    public  Long writeLogginInfo(String id, String userId, String ip, Timestamp logginInTime){
        return queryFactory.update(qUserLogginInfoEntity)
                .set(qUserLogginInfoEntity.id, id)
                .set(qUserLogginInfoEntity.userId, userId)
                .set(qUserLogginInfoEntity.logginInTime, logginInTime).set(qUserLogginInfoEntity.logginInTime, logginInTime)
                .set(qUserLogginInfoEntity.logginIp, ip).execute();

}
}
