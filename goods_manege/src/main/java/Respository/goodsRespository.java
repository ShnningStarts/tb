package Respository;

import com.smart.entity.GoodsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface goodsRespository extends JpaRepository<GoodsEntity,String>, QuerydslPredicateExecutor<GoodsEntity>, JpaSpecificationExecutor<GoodsEntity> {

}
