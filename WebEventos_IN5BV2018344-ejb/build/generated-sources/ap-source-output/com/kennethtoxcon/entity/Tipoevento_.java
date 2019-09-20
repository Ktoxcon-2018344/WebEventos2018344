package com.kennethtoxcon.entity;

import com.kennethtoxcon.entity.Reservaciones;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T14:49:04")
@StaticMetamodel(Tipoevento.class)
public class Tipoevento_ { 

    public static volatile SingularAttribute<Tipoevento, String> descripcion;
    public static volatile CollectionAttribute<Tipoevento, Reservaciones> reservacionesCollection;
    public static volatile SingularAttribute<Tipoevento, Integer> idtipoevento;

}