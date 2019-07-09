package com.smart.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserBaseEntity is a Querydsl query type for UserBaseEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserBaseEntity extends EntityPathBase<UserBaseEntity> {

    private static final long serialVersionUID = 695796856L;

    public static final QUserBaseEntity userBaseEntity = new QUserBaseEntity("userBaseEntity");

    public final StringPath brithday = createString("brithday");

    public final StringPath createTime = createString("createTime");

    public final StringPath email = createString("email");

    public final StringPath id = createString("id");

    public final StringPath identVard = createString("identVard");

    public final StringPath name = createString("name");

    public final BooleanPath new$ = createBoolean("new");

    public final StringPath numberPhone = createString("numberPhone");

    public final StringPath password = createString("password");

    public final StringPath salt = createString("salt");

    public final StringPath sex = createString("sex");

    public final StringPath userName = createString("userName");

    public QUserBaseEntity(String variable) {
        super(UserBaseEntity.class, forVariable(variable));
    }

    public QUserBaseEntity(Path<? extends UserBaseEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserBaseEntity(PathMetadata metadata) {
        super(UserBaseEntity.class, metadata);
    }

}

