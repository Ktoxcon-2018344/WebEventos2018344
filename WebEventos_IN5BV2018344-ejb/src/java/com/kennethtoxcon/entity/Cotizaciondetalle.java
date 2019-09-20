/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kennethtoxcon.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "cotizaciondetalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cotizaciondetalle.findAll", query = "SELECT c FROM Cotizaciondetalle c")
    , @NamedQuery(name = "Cotizaciondetalle.findByIdcotizaciondetalle", query = "SELECT c FROM Cotizaciondetalle c WHERE c.idcotizaciondetalle = :idcotizaciondetalle")
    , @NamedQuery(name = "Cotizaciondetalle.findByPrecantidad", query = "SELECT c FROM Cotizaciondetalle c WHERE c.precantidad = :precantidad")})
public class Cotizaciondetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcotizaciondetalle")
    private Integer idcotizaciondetalle;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precantidad")
    private Double precantidad;
    @JoinColumn(name = "idcotizacion", referencedColumnName = "idcotizacion")
    @ManyToOne(optional = false)
    private Cotizaciones idcotizacion;
    @JoinColumn(name = "idproducto", referencedColumnName = "idproducto")
    @ManyToOne(optional = false)
    private Productos idproducto;

    public Cotizaciondetalle() {
    }

    public Cotizaciondetalle(Integer idcotizaciondetalle) {
        this.idcotizaciondetalle = idcotizaciondetalle;
    }

    public Integer getIdcotizaciondetalle() {
        return idcotizaciondetalle;
    }

    public void setIdcotizaciondetalle(Integer idcotizaciondetalle) {
        this.idcotizaciondetalle = idcotizaciondetalle;
    }

    public Double getPrecantidad() {
        return precantidad;
    }

    public void setPrecantidad(Double precantidad) {
        this.precantidad = precantidad;
    }

    public Cotizaciones getIdcotizacion() {
        return idcotizacion;
    }

    public void setIdcotizacion(Cotizaciones idcotizacion) {
        this.idcotizacion = idcotizacion;
    }

    public Productos getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Productos idproducto) {
        this.idproducto = idproducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcotizaciondetalle != null ? idcotizaciondetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotizaciondetalle)) {
            return false;
        }
        Cotizaciondetalle other = (Cotizaciondetalle) object;
        if ((this.idcotizaciondetalle == null && other.idcotizaciondetalle != null) || (this.idcotizaciondetalle != null && !this.idcotizaciondetalle.equals(other.idcotizaciondetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kennethtoxcon.entity.Cotizaciondetalle[ idcotizaciondetalle=" + idcotizaciondetalle + " ]";
    }
    
}
