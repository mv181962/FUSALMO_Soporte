/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fusalmo.www.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Soporte
 */
@Entity
@Table(name = "remocionmemo")
@NamedQueries({
    @NamedQuery(name = "RemocionMemoEntity.findAll", query = "SELECT r FROM RemocionMemoEntity r")
    , @NamedQuery(name = "RemocionMemoEntity.findById", query = "SELECT r FROM RemocionMemoEntity r WHERE r.id = :id")})
public class RemocionMemoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private String id;
    @JoinColumn(name = "IdRecurso", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private RecursosEntity idRecurso;
    @OneToMany(mappedBy = "idRemocionMemo")
    private List<MemosEntity> memosEntityList;

    public RemocionMemoEntity() {
    }

    public RemocionMemoEntity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RecursosEntity getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(RecursosEntity idRecurso) {
        this.idRecurso = idRecurso;
    }

    public List<MemosEntity> getMemosEntityList() {
        return memosEntityList;
    }

    public void setMemosEntityList(List<MemosEntity> memosEntityList) {
        this.memosEntityList = memosEntityList;
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
        if (!(object instanceof RemocionMemoEntity)) {
            return false;
        }
        RemocionMemoEntity other = (RemocionMemoEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.fusalmo.www.entities.RemocionMemoEntity[ id=" + id + " ]";
    }
    
}
