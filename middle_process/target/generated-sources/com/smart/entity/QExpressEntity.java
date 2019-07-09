package com.smart.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QExpressEntity is a Querydsl query type for ExpressEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QExpressEntity extends EntityPathBase<ExpressEntity> {

    private static final long serialVersionUID = 1180440602L;

    public static final QExpressEntity expressEntity = new QExpressEntity("expressEntity");

    public final StringPath currentAddress = createString("currentAddress");

    public final DateTimePath<java.sql.Timestamp> finishTime = createDateTime("finishTime", java.sql.Timestamp.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> passedTime = createDateTime("passedTime", java.sql.Timestamp.class);

    public final StringPath reciveAddress = createString("reciveAddress");

    public final StringPath reciveTelephone = createString("reciveTelephone");

    public final StringPath sendAdd = createString("sendAdd");

    public final StringPath sendTelephone = createString("sendTelephone");

    public final SimplePath<Object> state = createSimple("state", Object.class);

    public QExpressEntity(String variable) {
        super(ExpressEntity.class, forVariable(variable));
    }

    public QExpressEntity(Path<? extends ExpressEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QExpressEntity(PathMetadata metadata) {
        super(ExpressEntity.class, metadata);
    }

}

