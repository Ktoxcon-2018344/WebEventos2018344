package com.kennethtoxcon.entity;

import com.kennethtoxcon.entity.Areas;
import com.kennethtoxcon.entity.Facturacion;
import com.kennethtoxcon.entity.Reservaciones;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T14:49:04")
@StaticMetamodel(Sucursales.class)
public class Sucursales_ { 

    public static volatile SingularAttribute<Sucursales, Areas> idarea;
    public static volatile CollectionAttribute<Sucursales, Reservaciones> reservacionesCollection;
    public static volatile SingularAttribute<Sucursales, String> direccion;
    public static volatile CollectionAttribute<Sucursales, Facturacion> facturacionCollection;
    public static volatile SingularAttribute<Sucursales, Integer> idsucursal;
    public static volatile SingularAttribute<Sucursales, String> telefono;
    public static volatile SingularAttribute<Sucursales, String> nombre;

}