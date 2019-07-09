package com.smart.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRoleEntity is a Querydsl query type for RoleEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRoleEntity extends EntityPathBase<RoleEntity> {

    private static final long serialVersionUID = -593220430L;

    public static final QRoleEntity roleEntity = new QRoleEntity("roleEntity");

    public final NumberPath<Integer> admin = createNumber("admin", Integer.class);

    public final NumberPath<Integer> business = createNumber("business", Integer.class);

    public final StringPath id = createString("id");

    public final NumberPath<Integer> normalUser = createNumber("normalUser", Integer.class);

    public final StringPath userId = createString("userId");

    public QRoleEntity(String variable) {
        super(RoleEntity.class, forVariable(variable));
    }

    public QRoleEntity(Path<? extends RoleEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRoleEntity(PathMetadata metadata) {
        super(RoleEntity.class, metadata);
    }

}

