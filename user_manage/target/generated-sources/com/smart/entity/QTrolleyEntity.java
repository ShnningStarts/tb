package com.smart.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTrolleyEntity is a Querydsl query type for TrolleyEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTrolleyEntity extends EntityPathBase<TrolleyEntity> {

    private static final long serialVersionUID = 1614166095L;

    public static final QTrolleyEntity trolleyEntity = new QTrolleyEntity("trolleyEntity");

    public final StringPath goodsDescription = createString("goodsDescription");

    public final StringPath goodsId = createString("goodsId");

    public final StringPath goodsName = createString("goodsName");

    public final StringPath id = createString("id");

    public final StringPath mapId = createString("mapId");

    public final StringPath mapName = createString("mapName");

    public final StringPath userId = createString("userId");

    public QTrolleyEntity(String variable) {
        super(TrolleyEntity.class, forVariable(variable));
    }

    public QTrolleyEntity(Path<? extends TrolleyEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTrolleyEntity(PathMetadata metadata) {
        super(TrolleyEntity.class, metadata);
    }

}

