/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kennethtoxcon.sessionbeans;

import com.kennethtoxcon.entity.Cotizaciones;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface CotizacionesFacadeLocal {

    void create(Cotizaciones cotizaciones);

    void edit(Cotizaciones cotizaciones);

    void remove(Cotizaciones cotizaciones);

    Cotizaciones find(Object id);

    List<Cotizaciones> findAll();

    List<Cotizaciones> findRange(int[] range);

    int count();
    
}
