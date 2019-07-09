package Respository;

import com.smart.entity.ExpressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ExpressRepository extends JpaRepository<ExpressEntity,String>, QuerydslPredicateExecutor<ExpressEntity>, JpaSpecificationExecutor<ExpressEntity> {
}
