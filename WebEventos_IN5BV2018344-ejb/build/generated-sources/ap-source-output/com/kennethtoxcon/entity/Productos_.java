package com.kennethtoxcon.entity;

import com.kennethtoxcon.entity.Cotizaciondetalle;
import com.kennethtoxcon.entity.Facturaciondetalle;
import com.kennethtoxcon.entity.Tipoproducto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T14:49:04")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> descripcion;
    public static volatile CollectionAttribute<Productos, Cotizaciondetalle> cotizaciondetalleCollection;
    public static volatile SingularAttribute<Productos, Tipoproducto> idtipoproducto;
    public static volatile SingularAttribute<Productos, Double> precioventa;
    public static volatile SingularAttribute<Productos, Integer> idproducto;
    public static volatile CollectionAttribute<Productos, Facturaciondetalle> facturaciondetalleCollection;

}