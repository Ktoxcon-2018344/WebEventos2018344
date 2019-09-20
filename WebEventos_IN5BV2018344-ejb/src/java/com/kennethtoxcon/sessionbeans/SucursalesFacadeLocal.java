/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kennethtoxcon.sessionbeans;

import com.kennethtoxcon.entity.Sucursales;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface SucursalesFacadeLocal {

    void create(Sucursales sucursales);

    void edit(Sucursales sucursales);

    void remove(Sucursales sucursales);

    Sucursales find(Object id);

    List<Sucursales> findAll();

    List<Sucursales> findRange(int[] range);

    int count();
    
}
