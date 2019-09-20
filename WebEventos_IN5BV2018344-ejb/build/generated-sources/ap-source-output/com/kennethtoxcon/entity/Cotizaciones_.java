package com.kennethtoxcon.entity;

import com.kennethtoxcon.entity.Cotizaciondetalle;
import com.kennethtoxcon.entity.Reservaciones;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T14:49:04")
@StaticMetamodel(Cotizaciones.class)
public class Cotizaciones_ { 

    public static volatile CollectionAttribute<Cotizaciones, Cotizaciondetalle> cotizaciondetalleCollection;
    public static volatile SingularAttribute<Cotizaciones, Date> fecha;
    public static volatile SingularAttribute<Cotizaciones, String> direccionfacturar;
    public static volatile SingularAttribute<Cotizaciones, Integer> idcotizacion;
    public static volatile SingularAttribute<Cotizaciones, String> nombreafacturar;
    public static volatile SingularAttribute<Cotizaciones, Reservaciones> idreservacion;

}