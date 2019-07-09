package Respository;

import com.smart.entity.GoodsEvaluationsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface GoodsEvaluationRepository extends JpaRepository<GoodsEvaluationsEntity,String>, QuerydslPredicateExecutor<GoodsEvaluationsEntity>, JpaSpecificationExecutor<GoodsEvaluationsEntity> {



}
