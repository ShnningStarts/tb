package com.smart.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QGoodsEntity is a Querydsl query type for GoodsEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGoodsEntity extends EntityPathBase<GoodsEntity> {

    private static final long serialVersionUID = -502130368L;

    public static final QGoodsEntity goodsEntity = new QGoodsEntity("goodsEntity");

    public final StringPath goodsCategoryId = createString("goodsCategoryId");

    public final StringPath goodsDescription = createString("goodsDescription");

    public final StringPath goodsDetail = createString("goodsDetail");

    public final StringPath goodsEvaluationId = createString("goodsEvaluationId");

    public final StringPath goodsImagesUrl = createString("goodsImagesUrl");

    public final StringPath goodsName = createString("goodsName");

    public final StringPath goodsTypeId = createString("goodsTypeId");

    public final StringPath id = createString("id");

    public QGoodsEntity(String variable) {
        super(GoodsEntity.class, forVariable(variable));
    }

    public QGoodsEntity(Path<? extends GoodsEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGoodsEntity(PathMetadata metadata) {
        super(GoodsEntity.class, metadata);
    }

}

