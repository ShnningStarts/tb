package Respository;

import com.smart.entity.GoodsTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface GoodsTypeRepository extends JpaRepository<GoodsTypeEntity,String>, JpaSpecificationExecutor<GoodsTypeRepository>, QuerydslPredicateExecutor<GoodsTypeEntity> {
}
