package com.smart.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAddressEntity is a Querydsl query type for AddressEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAddressEntity extends EntityPathBase<AddressEntity> {

    private static final long serialVersionUID = -139021922L;

    public static final QAddressEntity addressEntity = new QAddressEntity("addressEntity");

    public final StringPath area = createString("area");

    public final StringPath city = createString("city");

    public final StringPath coutry = createString("coutry");

    public final DateTimePath<java.sql.Timestamp> createTime = createDateTime("createTime", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> deleteTime = createDateTime("deleteTime", java.sql.Timestamp.class);

    public final StringPath detailAdd = createString("detailAdd");

    public final StringPath id = createString("id");

    public final StringPath myPhone = createString("myPhone");

    public final StringPath provice = createString("provice");

    public final StringPath userId = createString("userId");

    public QAddressEntity(String variable) {
        super(AddressEntity.class, forVariable(variable));
    }

    public QAddressEntity(Path<? extends AddressEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAddressEntity(PathMetadata metadata) {
        super(AddressEntity.class, metadata);
    }

}

