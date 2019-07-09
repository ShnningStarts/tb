package com.smart.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QOrdersEntity is a Querydsl query type for OrdersEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOrdersEntity extends EntityPathBase<OrdersEntity> {

    private static final long serialVersionUID = 1153430945L;

    public static final QOrdersEntity ordersEntity = new QOrdersEntity("ordersEntity");

    public final DateTimePath<java.sql.Timestamp> finishTime = createDateTime("finishTime", java.sql.Timestamp.class);

    public final StringPath goodsId = createString("goodsId");

    public final StringPath goodsName = createString("goodsName");

    public final NumberPath<Integer> goodsNumber = createNumber("goodsNumber", Integer.class);

    public final StringPath id = createString("id");

    public final StringPath mailId = createString("mailId");

    public final StringPath mailName = createString("mailName");

    public final DateTimePath<java.sql.Timestamp> startTime = createDateTime("startTime", java.sql.Timestamp.class);

    public final SimplePath<Object> state = createSimple("state", Object.class);

    public final StringPath userId = createString("userId");

    public final StringPath userName = createString("userName");

    public QOrdersEntity(String variable) {
        super(OrdersEntity.class, forVariable(variable));
    }

    public QOrdersEntity(Path<? extends OrdersEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrdersEntity(PathMetadata metadata) {
        super(OrdersEntity.class, metadata);
    }

}

