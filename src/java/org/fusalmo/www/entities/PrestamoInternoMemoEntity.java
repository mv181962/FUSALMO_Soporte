/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fusalmo.www.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Soporte
 */
@Entity
@Table(name = "prestamointernomemo")
@NamedQueries({
    @NamedQuery(name = "PrestamoInternoMemoEntity.findAll", query = "SELECT p FROM PrestamoInternoMemoEntity p")
    , @NamedQuery(name = "PrestamoInternoMemoEntity.findById", query = "SELECT p FROM PrestamoInternoMemoEntity p WHERE p.id = :id")
    , @NamedQuery(name = "PrestamoInternoMemoEntity.findByInicioPrestamo", query = "SELECT p FROM PrestamoInternoMemoEntity p WHERE p.inicioPrestamo = :inicioPrestamo")
    , @NamedQuery(name = "PrestamoInternoMemoEntity.findByFinPrestamo", query = "SELECT p FROM PrestamoInternoMemoEntity p WHERE p.finPrestamo = :finPrestamo")
    , @NamedQuery(name = "PrestamoInternoMemoEntity.findByCantidadRecursos", query = "SELECT p FROM PrestamoInternoMemoEntity p WHERE p.cantidadRecursos = :cantidadRecursos")})
public class PrestamoInternoMemoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private String id;
    @Basic(optional = false)
    @Temporal(TemporalType.DATE)
    private Date inicioPrestamo;
    @Basic(optional = false)
    @Temporal(TemporalType.DATE)
    private Date finPrestamo;
    @Basic(optional = false)
    private int cantidadRecursos;
    @JoinColumn(name = "Id16Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id16Recurso;
    @JoinColumn(name = "Id10Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id10Recurso;
    @JoinColumn(name = "Id1Recurso", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private RecursosEntity id1Recurso;
    @JoinColumn(name = "Id8Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id8Recurso;
    @JoinColumn(name = "Id5Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id5Recurso;
    @JoinColumn(name = "Id9Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id9Recurso;
    @JoinColumn(name = "Id6Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id6Recurso;
    @JoinColumn(name = "Id11Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id11Recurso;
    @JoinColumn(name = "Id12Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id12Recurso;
    @JoinColumn(name = "Id13Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id13Recurso;
    @JoinColumn(name = "Id14Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id14Recurso;
    @JoinColumn(name = "Id15Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id15Recurso;
    @JoinColumn(name = "Id17Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id17Recurso;
    @JoinColumn(name = "Id4Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id4Recurso;
    @JoinColumn(name = "Id18Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id18Recurso;
    @JoinColumn(name = "Id19Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id19Recurso;
    @JoinColumn(name = "Id20Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id20Recurso;
    @JoinColumn(name = "Id2Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id2Recurso;
    @JoinColumn(name = "Id3Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id3Recurso;
    @JoinColumn(name = "Id7Recurso", referencedColumnName = "Id")
    @ManyToOne
    private RecursosEntity id7Recurso;
    @OneToMany(mappedBy = "idPrestamoInternoMemo")
    private List<MemosEntity> memosEntityList;

    public PrestamoInternoMemoEntity() {
    }

    public PrestamoInternoMemoEntity(String id) {
        this.id = id;
    }

    public PrestamoInternoMemoEntity(String id, Date inicioPrestamo, Date finPrestamo, int cantidadRecursos) {
        this.id = id;
        this.inicioPrestamo = inicioPrestamo;
        this.finPrestamo = finPrestamo;
        this.cantidadRecursos = cantidadRecursos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getInicioPrestamo() {
        return inicioPrestamo;
    }

    public void setInicioPrestamo(Date inicioPrestamo) {
        this.inicioPrestamo = inicioPrestamo;
    }

    public Date getFinPrestamo() {
        return finPrestamo;
    }

    public void setFinPrestamo(Date finPrestamo) {
        this.finPrestamo = finPrestamo;
    }

    public int getCantidadRecursos() {
        return cantidadRecursos;
    }

    public void setCantidadRecursos(int cantidadRecursos) {
        this.cantidadRecursos = cantidadRecursos;
    }

    public RecursosEntity getId16Recurso() {
        return id16Recurso;
    }

    public void setId16Recurso(RecursosEntity id16Recurso) {
        this.id16Recurso = id16Recurso;
    }

    public RecursosEntity getId10Recurso() {
        return id10Recurso;
    }

    public void setId10Recurso(RecursosEntity id10Recurso) {
        this.id10Recurso = id10Recurso;
    }

    public RecursosEntity getId1Recurso() {
        return id1Recurso;
    }

    public void setId1Recurso(RecursosEntity id1Recurso) {
        this.id1Recurso = id1Recurso;
    }

    public RecursosEntity getId8Recurso() {
        return id8Recurso;
    }

    public void setId8Recurso(RecursosEntity id8Recurso) {
        this.id8Recurso = id8Recurso;
    }

    public RecursosEntity getId5Recurso() {
        return id5Recurso;
    }

    public void setId5Recurso(RecursosEntity id5Recurso) {
        this.id5Recurso = id5Recurso;
    }

    public RecursosEntity getId9Recurso() {
        return id9Recurso;
    }

    public void setId9Recurso(RecursosEntity id9Recurso) {
        this.id9Recurso = id9Recurso;
    }

    public RecursosEntity getId6Recurso() {
        return id6Recurso;
    }

    public void setId6Recurso(RecursosEntity id6Recurso) {
        this.id6Recurso = id6Recurso;
    }

    public RecursosEntity getId11Recurso() {
        return id11Recurso;
    }

    public void setId11Recurso(RecursosEntity id11Recurso) {
        this.id11Recurso = id11Recurso;
    }

    public RecursosEntity getId12Recurso() {
        return id12Recurso;
    }

    public void setId12Recurso(RecursosEntity id12Recurso) {
        this.id12Recurso = id12Recurso;
    }

    public RecursosEntity getId13Recurso() {
        return id13Recurso;
    }

    public void setId13Recurso(RecursosEntity id13Recurso) {
        this.id13Recurso = id13Recurso;
    }

    public RecursosEntity getId14Recurso() {
        return id14Recurso;
    }

    public void setId14Recurso(RecursosEntity id14Recurso) {
        this.id14Recurso = id14Recurso;
    }

    public RecursosEntity getId15Recurso() {
        return id15Recurso;
    }

    public void setId15Recurso(RecursosEntity id15Recurso) {
        this.id15Recurso = id15Recurso;
    }

    public RecursosEntity getId17Recurso() {
        return id17Recurso;
    }

    public void setId17Recurso(RecursosEntity id17Recurso) {
        this.id17Recurso = id17Recurso;
    }

    public RecursosEntity getId4Recurso() {
        return id4Recurso;
    }

    public void setId4Recurso(RecursosEntity id4Recurso) {
        this.id4Recurso = id4Recurso;
    }

    public RecursosEntity getId18Recurso() {
        return id18Recurso;
    }

    public void setId18Recurso(RecursosEntity id18Recurso) {
        this.id18Recurso = id18Recurso;
    }

    public RecursosEntity getId19Recurso() {
        return id19Recurso;
    }

    public void setId19Recurso(RecursosEntity id19Recurso) {
        this.id19Recurso = id19Recurso;
    }

    public RecursosEntity getId20Recurso() {
        return id20Recurso;
    }

    public void setId20Recurso(RecursosEntity id20Recurso) {
        this.id20Recurso = id20Recurso;
    }

    public RecursosEntity getId2Recurso() {
        return id2Recurso;
    }

    public void setId2Recurso(RecursosEntity id2Recurso) {
        this.id2Recurso = id2Recurso;
    }

    public RecursosEntity getId3Recurso() {
        return id3Recurso;
    }

    public void setId3Recurso(RecursosEntity id3Recurso) {
        this.id3Recurso = id3Recurso;
    }

    public RecursosEntity getId7Recurso() {
        return id7Recurso;
    }

    public void setId7Recurso(RecursosEntity id7Recurso) {
        this.id7Recurso = id7Recurso;
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
        if (!(object instanceof PrestamoInternoMemoEntity)) {
            return false;
        }
        PrestamoInternoMemoEntity other = (PrestamoInternoMemoEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.fusalmo.www.entities.PrestamoInternoMemoEntity[ id=" + id + " ]";
    }
    
}
