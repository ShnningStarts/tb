package com.smart.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserLogginInfoEntity is a Querydsl query type for UserLogginInfoEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserLogginInfoEntity extends EntityPathBase<UserLogginInfoEntity> {

    private static final long serialVersionUID = 2123650493L;

    public static final QUserLogginInfoEntity userLogginInfoEntity = new QUserLogginInfoEntity("userLogginInfoEntity");

    public final StringPath id = createString("id");

    public final DateTimePath<java.sql.Timestamp> logginInTime = createDateTime("logginInTime", java.sql.Timestamp.class);

    public final StringPath logginIp = createString("logginIp");

    public final DateTimePath<java.sql.Timestamp> logginOutTime = createDateTime("logginOutTime", java.sql.Timestamp.class);

    public final StringPath userId = createString("userId");

    public QUserLogginInfoEntity(String variable) {
        super(UserLogginInfoEntity.class, forVariable(variable));
    }

    public QUserLogginInfoEntity(Path<? extends UserLogginInfoEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserLogginInfoEntity(PathMetadata metadata) {
        super(UserLogginInfoEntity.class, metadata);
    }

}

