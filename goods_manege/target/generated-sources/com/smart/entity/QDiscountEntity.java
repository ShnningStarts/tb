package com.smart.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDiscountEntity is a Querydsl query type for DiscountEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDiscountEntity extends EntityPathBase<DiscountEntity> {

    private static final long serialVersionUID = 592058557L;

    public static final QDiscountEntity discountEntity = new QDiscountEntity("discountEntity");

    public final StringPath goodsId = createString("goodsId");

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final NumberPath<java.math.BigDecimal> reduceMoney = createNumber("reduceMoney", java.math.BigDecimal.class);

    public QDiscountEntity(String variable) {
        super(DiscountEntity.class, forVariable(variable));
    }

    public QDiscountEntity(Path<? extends DiscountEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDiscountEntity(PathMetadata metadata) {
        super(DiscountEntity.class, metadata);
    }

}

