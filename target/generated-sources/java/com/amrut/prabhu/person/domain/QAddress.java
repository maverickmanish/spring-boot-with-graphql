package com.amrut.prabhu.person.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAddress is a Querydsl query type for Address
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAddress extends EntityPathBase<Address> {

    private static final long serialVersionUID = 1344472283L;

    public static final QAddress address = new QAddress("address");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> personId = createNumber("personId", Integer.class);

    public final StringPath street = createString("street");

    public final EnumPath<AddressType> type = createEnum("type", AddressType.class);

    public QAddress(String variable) {
        super(Address.class, forVariable(variable));
    }

    public QAddress(Path<? extends Address> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAddress(PathMetadata metadata) {
        super(Address.class, metadata);
    }

}

