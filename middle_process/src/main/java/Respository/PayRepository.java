package Respository;

import com.smart.entity.PayEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface PayRepository extends JpaRepository<PayEntity,String>, JpaSpecificationExecutor<PayEntity>, QuerydslPredicateExecutor<PayEntity> {
}
