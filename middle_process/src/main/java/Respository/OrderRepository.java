package Respository;

import com.smart.entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface OrderRepository extends JpaRepository<OrdersEntity,String> , JpaSpecificationExecutor<OrdersEntity>, QuerydslPredicateExecutor<OrdersEntity> {
}
