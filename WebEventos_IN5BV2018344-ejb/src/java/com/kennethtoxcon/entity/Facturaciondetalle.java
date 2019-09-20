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
@Table(name = "facturaciondetalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturaciondetalle.findAll", query = "SELECT f FROM Facturaciondetalle f")
    , @NamedQuery(name = "Facturaciondetalle.findByIdfacturadetalle", query = "SELECT f FROM Facturaciondetalle f WHERE f.idfacturadetalle = :idfacturadetalle")})
public class Facturaciondetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idfacturadetalle")
    private Integer idfacturadetalle;
    @JoinColumn(name = "numerodocumento", referencedColumnName = "numerodocumento")
    @ManyToOne(optional = false)
    private Facturacion numerodocumento;
    @JoinColumn(name = "idproducto", referencedColumnName = "idproducto")
    @ManyToOne(optional = false)
    private Productos idproducto;

    public Facturaciondetalle() {
    }

    public Facturaciondetalle(Integer idfacturadetalle) {
        this.idfacturadetalle = idfacturadetalle;
    }

    public Integer getIdfacturadetalle() {
        return idfacturadetalle;
    }

    public void setIdfacturadetalle(Integer idfacturadetalle) {
        this.idfacturadetalle = idfacturadetalle;
    }

    public Facturacion getNumerodocumento() {
        return numerodocumento;
    }

    public void setNumerodocumento(Facturacion numerodocumento) {
        this.numerodocumento = numerodocumento;
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
        hash += (idfacturadetalle != null ? idfacturadetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturaciondetalle)) {
            return false;
        }
        Facturaciondetalle other = (Facturaciondetalle) object;
        if ((this.idfacturadetalle == null && other.idfacturadetalle != null) || (this.idfacturadetalle != null && !this.idfacturadetalle.equals(other.idfacturadetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kennethtoxcon.entity.Facturaciondetalle[ idfacturadetalle=" + idfacturadetalle + " ]";
    }
    
}
