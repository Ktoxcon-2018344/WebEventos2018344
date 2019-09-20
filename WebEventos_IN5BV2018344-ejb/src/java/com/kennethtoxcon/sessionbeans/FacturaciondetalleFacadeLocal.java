/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kennethtoxcon.sessionbeans;

import com.kennethtoxcon.entity.Facturaciondetalle;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface FacturaciondetalleFacadeLocal {

    void create(Facturaciondetalle facturaciondetalle);

    void edit(Facturaciondetalle facturaciondetalle);

    void remove(Facturaciondetalle facturaciondetalle);

    Facturaciondetalle find(Object id);

    List<Facturaciondetalle> findAll();

    List<Facturaciondetalle> findRange(int[] range);

    int count();
    
}
