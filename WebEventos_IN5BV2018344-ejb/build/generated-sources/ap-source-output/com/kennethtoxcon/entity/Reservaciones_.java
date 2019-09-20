package com.kennethtoxcon.entity;

import com.kennethtoxcon.entity.Clientes;
import com.kennethtoxcon.entity.Cotizaciones;
import com.kennethtoxcon.entity.Sucursales;
import com.kennethtoxcon.entity.Tipoevento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T14:49:04")
@StaticMetamodel(Reservaciones.class)
public class Reservaciones_ { 

    public static volatile CollectionAttribute<Reservaciones, Cotizaciones> cotizacionesCollection;
    public static volatile SingularAttribute<Reservaciones, Date> fechainicial;
    public static volatile SingularAttribute<Reservaciones, Sucursales> idsucursal;
    public static volatile SingularAttribute<Reservaciones, Integer> idreservacion;
    public static volatile SingularAttribute<Reservaciones, Date> fechafinal;
    public static volatile SingularAttribute<Reservaciones, Clientes> idcliente;
    public static volatile SingularAttribute<Reservaciones, Tipoevento> idtipoevento;

}