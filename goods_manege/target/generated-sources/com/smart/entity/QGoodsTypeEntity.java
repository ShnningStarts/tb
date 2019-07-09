package com.smart.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QGoodsTypeEntity is a Querydsl query type for GoodsTypeEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGoodsTypeEntity extends EntityPathBase<GoodsTypeEntity> {

    private static final long serialVersionUID = -664024422L;

    public static final QGoodsTypeEntity goodsTypeEntity = new QGoodsTypeEntity("goodsTypeEntity");

    public final StringPath categoryId = createString("categoryId");

    public final StringPath color = createString("color");

    public final StringPath goodsId = createString("goodsId");

    public final StringPath id = createString("id");

    public final StringPath smallImageUrl = createString("smallImageUrl");

    public QGoodsTypeEntity(String variable) {
        super(GoodsTypeEntity.class, forVariable(variable));
    }

    public QGoodsTypeEntity(Path<? extends GoodsTypeEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGoodsTypeEntity(PathMetadata metadata) {
        super(GoodsTypeEntity.class, metadata);
    }

}

