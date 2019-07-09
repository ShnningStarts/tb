package com.smart.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserChangeInfoEntity is a Querydsl query type for UserChangeInfoEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserChangeInfoEntity extends EntityPathBase<UserChangeInfoEntity> {

    private static final long serialVersionUID = 174621029L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserChangeInfoEntity userChangeInfoEntity = new QUserChangeInfoEntity("userChangeInfoEntity");

    public final StringPath changeIp = createString("changeIp");

    public final DateTimePath<java.sql.Timestamp> changeTime = createDateTime("changeTime", java.sql.Timestamp.class);

    public final StringPath changeWhat = createString("changeWhat");

    public final StringPath id = createString("id");

    public final StringPath oldValue = createString("oldValue");

    public final QUserBaseEntity userBaseByUserId;

    public QUserChangeInfoEntity(String variable) {
        this(UserChangeInfoEntity.class, forVariable(variable), INITS);
    }

    public QUserChangeInfoEntity(Path<? extends UserChangeInfoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserChangeInfoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserChangeInfoEntity(PathMetadata metadata, PathInits inits) {
        this(UserChangeInfoEntity.class, metadata, inits);
    }

    public QUserChangeInfoEntity(Class<? extends UserChangeInfoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userBaseByUserId = inits.isInitialized("userBaseByUserId") ? new QUserBaseEntity(forProperty("userBaseByUserId")) : null;
    }

}

