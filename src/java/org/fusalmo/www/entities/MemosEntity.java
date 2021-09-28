/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fusalmo.www.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Soporte
 */
@Entity
@Table(name = "memos")
@NamedQueries({
    @NamedQuery(name = "MemosEntity.findAll", query = "SELECT m FROM MemosEntity m")
    , @NamedQuery(name = "MemosEntity.findById", query = "SELECT m FROM MemosEntity m WHERE m.id = :id")
    , @NamedQuery(name = "MemosEntity.findByTipo", query = "SELECT m FROM MemosEntity m WHERE m.tipo = :tipo")})
public class MemosEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private String id;
    @Basic(optional = false)
    @Lob
    private String asunto;
    @Basic(optional = false)
    private String tipo;
    @Lob
    private String pdf;
    @Lob
    private String pDFFirmado;
    @JoinColumn(name = "IdAsignacionMemo", referencedColumnName = "Id")
    @ManyToOne
    private AsignacionMemoEntity idAsignacionMemo;
    @JoinColumn(name = "IdEmpleado", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private EmpleadoEntity idEmpleado;
    @JoinColumn(name = "IdPrestamoExternoMemo", referencedColumnName = "Id")
    @ManyToOne
    private PrestamoExternoMemoEntity idPrestamoExternoMemo;
    @JoinColumn(name = "IdPrestamoInternoMemo", referencedColumnName = "Id")
    @ManyToOne
    private PrestamoInternoMemoEntity idPrestamoInternoMemo;
    @JoinColumn(name = "IdRemocionMemo", referencedColumnName = "Id")
    @ManyToOne
    private RemocionMemoEntity idRemocionMemo;
    @JoinColumn(name = "IdAgenteIT", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private UsuariosITEntity idAgenteIT;

    public MemosEntity() {
    }

    public MemosEntity(String id) {
        this.id = id;
    }

    public MemosEntity(String id, String asunto, String tipo) {
        this.id = id;
        this.asunto = asunto;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public String getPDFFirmado() {
        return pDFFirmado;
    }

    public void setPDFFirmado(String pDFFirmado) {
        this.pDFFirmado = pDFFirmado;
    }

    public AsignacionMemoEntity getIdAsignacionMemo() {
        return idAsignacionMemo;
    }

    public void setIdAsignacionMemo(AsignacionMemoEntity idAsignacionMemo) {
        this.idAsignacionMemo = idAsignacionMemo;
    }

    public EmpleadoEntity getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(EmpleadoEntity idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public PrestamoExternoMemoEntity getIdPrestamoExternoMemo() {
        return idPrestamoExternoMemo;
    }

    public void setIdPrestamoExternoMemo(PrestamoExternoMemoEntity idPrestamoExternoMemo) {
        this.idPrestamoExternoMemo = idPrestamoExternoMemo;
    }

    public PrestamoInternoMemoEntity getIdPrestamoInternoMemo() {
        return idPrestamoInternoMemo;
    }

    public void setIdPrestamoInternoMemo(PrestamoInternoMemoEntity idPrestamoInternoMemo) {
        this.idPrestamoInternoMemo = idPrestamoInternoMemo;
    }

    public RemocionMemoEntity getIdRemocionMemo() {
        return idRemocionMemo;
    }

    public void setIdRemocionMemo(RemocionMemoEntity idRemocionMemo) {
        this.idRemocionMemo = idRemocionMemo;
    }

    public UsuariosITEntity getIdAgenteIT() {
        return idAgenteIT;
    }

    public void setIdAgenteIT(UsuariosITEntity idAgenteIT) {
        this.idAgenteIT = idAgenteIT;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MemosEntity)) {
            return false;
        }
        MemosEntity other = (MemosEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.fusalmo.www.entities.MemosEntity[ id=" + id + " ]";
    }
    
}
