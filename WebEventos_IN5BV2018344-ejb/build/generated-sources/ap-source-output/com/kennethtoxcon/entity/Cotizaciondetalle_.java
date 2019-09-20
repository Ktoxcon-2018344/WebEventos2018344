package com.kennethtoxcon.entity;

import com.kennethtoxcon.entity.Cotizaciones;
import com.kennethtoxcon.entity.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T14:49:04")
@StaticMetamodel(Cotizaciondetalle.class)
public class Cotizaciondetalle_ { 

    public static volatile SingularAttribute<Cotizaciondetalle, Integer> idcotizaciondetalle;
    public static volatile SingularAttribute<Cotizaciondetalle, Cotizaciones> idcotizacion;
    public static volatile SingularAttribute<Cotizaciondetalle, Double> precantidad;
    public static volatile SingularAttribute<Cotizaciondetalle, Productos> idproducto;

}