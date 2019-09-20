/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kennethtoxcon.sessionbeans;

import com.kennethtoxcon.entity.Cotizaciones;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author programacion
 */
@Stateless
public class CotizacionesFacade extends AbstractFacade<Cotizaciones> implements CotizacionesFacadeLocal {

    @PersistenceContext(unitName = "WebEventos_IN5BV2018344_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CotizacionesFacade() {
        super(Cotizaciones.class);
    }
    
}
