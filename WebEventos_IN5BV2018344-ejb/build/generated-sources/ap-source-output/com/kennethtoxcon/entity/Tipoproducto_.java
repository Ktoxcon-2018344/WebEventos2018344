package com.kennethtoxcon.entity;

import com.kennethtoxcon.entity.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T14:49:04")
@StaticMetamodel(Tipoproducto.class)
public class Tipoproducto_ { 

    public static volatile SingularAttribute<Tipoproducto, String> descripcion;
    public static volatile SingularAttribute<Tipoproducto, Integer> idtipoproducto;
    public static volatile CollectionAttribute<Tipoproducto, Productos> productosCollection;

}