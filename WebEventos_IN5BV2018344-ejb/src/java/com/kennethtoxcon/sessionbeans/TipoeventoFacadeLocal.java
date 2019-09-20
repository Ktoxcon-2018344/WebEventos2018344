/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kennethtoxcon.sessionbeans;

import com.kennethtoxcon.entity.Tipoevento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface TipoeventoFacadeLocal {

    void create(Tipoevento tipoevento);

    void edit(Tipoevento tipoevento);

    void remove(Tipoevento tipoevento);

    Tipoevento find(Object id);

    List<Tipoevento> findAll();

    List<Tipoevento> findRange(int[] range);

    int count();
    
}
