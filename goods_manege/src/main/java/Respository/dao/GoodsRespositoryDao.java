package Respository.dao;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.smart.entity.GoodsEntity;
import com.smart.entity.QGoodsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

public class GoodsRespositoryDao {
    @Autowired
   public JPAQueryFactory jpaQueryFactory;

    @Autowired
    public JPAQueryFactory jpaQueryFactory(EntityManager entityManager){
        return new JPAQueryFactory(entityManager);
    }
    @Transactional
    @Cacheable(cacheNames = "goods")
    public GoodsEntity create(GoodsEntity entity){
        QGoodsEntity qGoodsEntity=QGoodsEntity.goodsEntity;

       jpaQueryFactory.update(qGoodsEntity).set(qGoodsEntity.id, entity.getId()).set(qGoodsEntity.goodsCategoryId,entity.getGoodsCategoryId()).
               set(qGoodsEntity.goodsDescription, entity.getGoodsDescription()).set(qGoodsEntity.goodsTypeId, entity.getGoodsTypeId())
               .set(qGoodsEntity.goodsImagesUrl, entity.getGoodsImagesUrl()).set(qGoodsEntity.goodsName, entity.getGoodsName()).execute();
       return entity;

    }


}
