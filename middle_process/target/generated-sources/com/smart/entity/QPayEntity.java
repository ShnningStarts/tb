package com.smart.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPayEntity is a Querydsl query type for PayEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPayEntity extends EntityPathBase<PayEntity> {

    private static final long serialVersionUID = 385473234L;

    public static final QPayEntity payEntity = new QPayEntity("payEntity");

    public final StringPath businessId = createString("businessId");

    public final StringPath id = createString("id");

    public final StringPath orderId = createString("orderId");

    public final NumberPath<java.math.BigDecimal> payMoney = createNumber("payMoney", java.math.BigDecimal.class);

    public final DateTimePath<java.sql.Timestamp> payStartTime = createDateTime("payStartTime", java.sql.Timestamp.class);

    public final StringPath userId = createString("userId");

    public QPayEntity(String variable) {
        super(PayEntity.class, forVariable(variable));
    }

    public QPayEntity(Path<? extends PayEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPayEntity(PathMetadata metadata) {
        super(PayEntity.class, metadata);
    }

}

