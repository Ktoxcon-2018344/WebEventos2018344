package com.kennethtoxcon.entity;

import com.kennethtoxcon.entity.Clientes;
import com.kennethtoxcon.entity.Facturaciondetalle;
import com.kennethtoxcon.entity.Sucursales;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T14:49:04")
@StaticMetamodel(Facturacion.class)
public class Facturacion_ { 

    public static volatile SingularAttribute<Facturacion, Date> fechaentrega;
    public static volatile SingularAttribute<Facturacion, Integer> numerodocumento;
    public static volatile SingularAttribute<Facturacion, Sucursales> idsucursal;
    public static volatile SingularAttribute<Facturacion, Date> fechadocumento;
    public static volatile SingularAttribute<Facturacion, Clientes> idcliente;
    public static volatile CollectionAttribute<Facturacion, Facturaciondetalle> facturaciondetalleCollection;

}