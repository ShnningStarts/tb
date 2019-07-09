package com.smart.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QGoodsEvaluationsEntity is a Querydsl query type for GoodsEvaluationsEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGoodsEvaluationsEntity extends EntityPathBase<GoodsEvaluationsEntity> {

    private static final long serialVersionUID = -694826499L;

    public static final QGoodsEvaluationsEntity goodsEvaluationsEntity = new QGoodsEvaluationsEntity("goodsEvaluationsEntity");

    public final StringPath id = createString("id");

    public final StringPath userDescription = createString("userDescription");

    public final SimplePath<Object> userGrade = createSimple("userGrade", Object.class);

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public final StringPath userImageUrl = createString("userImageUrl");

    public final StringPath userName = createString("userName");

    public final StringPath userVideoUrl = createString("userVideoUrl");

    public QGoodsEvaluationsEntity(String variable) {
        super(GoodsEvaluationsEntity.class, forVariable(variable));
    }

    public QGoodsEvaluationsEntity(Path<? extends GoodsEvaluationsEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGoodsEvaluationsEntity(PathMetadata metadata) {
        super(GoodsEvaluationsEntity.class, metadata);
    }

}

