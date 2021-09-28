/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fusalmo.www.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "recursos")
@NamedQueries({
    @NamedQuery(name = "RecursosEntity.findAll", query = "SELECT r FROM RecursosEntity r")
    , @NamedQuery(name = "RecursosEntity.findById", query = "SELECT r FROM RecursosEntity r WHERE r.id = :id")
    , @NamedQuery(name = "RecursosEntity.findByNombre", query = "SELECT r FROM RecursosEntity r WHERE r.nombre = :nombre")
    , @NamedQuery(name = "RecursosEntity.findByMarca", query = "SELECT r FROM RecursosEntity r WHERE r.marca = :marca")
    , @NamedQuery(name = "RecursosEntity.findByModelo", query = "SELECT r FROM RecursosEntity r WHERE r.modelo = :modelo")
    , @NamedQuery(name = "RecursosEntity.findByNumSerie", query = "SELECT r FROM RecursosEntity r WHERE r.numSerie = :numSerie")
    , @NamedQuery(name = "RecursosEntity.findByDireccionIP", query = "SELECT r FROM RecursosEntity r WHERE r.direccionIP = :direccionIP")
    , @NamedQuery(name = "RecursosEntity.findByDireccionMAC", query = "SELECT r FROM RecursosEntity r WHERE r.direccionMAC = :direccionMAC")
    , @NamedQuery(name = "RecursosEntity.findByCargador", query = "SELECT r FROM RecursosEntity r WHERE r.cargador = :cargador")
    , @NamedQuery(name = "RecursosEntity.findByCodActivo", query = "SELECT r FROM RecursosEntity r WHERE r.codActivo = :codActivo")})
public class RecursosEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private String id;
    @Basic(optional = false)
    private String nombre;
    @Basic(optional = false)
    private String marca;
    @Basic(optional = false)
    private String modelo;
    @Basic(optional = false)
    private String numSerie;
    private String direccionIP;
    private String direccionMAC;
    @Basic(optional = false)
    private boolean cargador;
    @Basic(optional = false)
    private String codActivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRecurso")
    private List<RemocionMemoEntity> remocionMemoEntityList;
    @OneToMany(mappedBy = "id16Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList;
    @OneToMany(mappedBy = "id10Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id1Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList2;
    @OneToMany(mappedBy = "id8Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList3;
    @OneToMany(mappedBy = "id5Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList4;
    @OneToMany(mappedBy = "id9Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList5;
    @OneToMany(mappedBy = "id6Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList6;
    @OneToMany(mappedBy = "id11Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList7;
    @OneToMany(mappedBy = "id12Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList8;
    @OneToMany(mappedBy = "id13Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList9;
    @OneToMany(mappedBy = "id14Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList10;
    @OneToMany(mappedBy = "id15Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList11;
    @OneToMany(mappedBy = "id17Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList12;
    @OneToMany(mappedBy = "id4Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList13;
    @OneToMany(mappedBy = "id18Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList14;
    @OneToMany(mappedBy = "id19Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList15;
    @OneToMany(mappedBy = "id20Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList16;
    @OneToMany(mappedBy = "id2Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList17;
    @OneToMany(mappedBy = "id3Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList18;
    @OneToMany(mappedBy = "id7Recurso")
    private List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList19;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRecurso")
    private List<AsignacionMemoEntity> asignacionMemoEntityList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRecurso")
    private List<MantenimientosEntity> mantenimientosEntityList;
    @OneToMany(mappedBy = "id12Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList;
    @OneToMany(mappedBy = "id10Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList1;
    @OneToMany(mappedBy = "id11Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList2;
    @OneToMany(mappedBy = "id13Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList3;
    @OneToMany(mappedBy = "id14Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList4;
    @OneToMany(mappedBy = "id15Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList5;
    @OneToMany(mappedBy = "id4Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList6;
    @OneToMany(mappedBy = "id3Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList7;
    @OneToMany(mappedBy = "id8Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList8;
    @OneToMany(mappedBy = "id20Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList9;
    @OneToMany(mappedBy = "id7Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList10;
    @OneToMany(mappedBy = "id16Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList11;
    @OneToMany(mappedBy = "id2Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList12;
    @OneToMany(mappedBy = "id6Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList13;
    @OneToMany(mappedBy = "id17Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList14;
    @OneToMany(mappedBy = "id18Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList15;
    @OneToMany(mappedBy = "id19Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList16;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id1Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList17;
    @OneToMany(mappedBy = "id9Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList18;
    @OneToMany(mappedBy = "id5Recurso")
    private List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList19;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRecurso")
    private List<EmpleadoEntity> empleadoEntityList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seleccionRecurso")
    private List<TokensEntity> tokensEntityList;
    @JoinColumn(name = "IdAreaAsignada", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private AreaEntity idAreaAsignada;
    @JoinColumn(name = "IdTipoRecurso", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private TipoRecursoEntity idTipoRecurso;

    public RecursosEntity() {
    }

    public RecursosEntity(String id) {
        this.id = id;
    }

    public RecursosEntity(String id, String nombre, String marca, String modelo, String numSerie, boolean cargador, String codActivo) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.cargador = cargador;
        this.codActivo = codActivo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    public String getDireccionMAC() {
        return direccionMAC;
    }

    public void setDireccionMAC(String direccionMAC) {
        this.direccionMAC = direccionMAC;
    }

    public boolean getCargador() {
        return cargador;
    }

    public void setCargador(boolean cargador) {
        this.cargador = cargador;
    }

    public String getCodActivo() {
        return codActivo;
    }

    public void setCodActivo(String codActivo) {
        this.codActivo = codActivo;
    }

    public List<RemocionMemoEntity> getRemocionMemoEntityList() {
        return remocionMemoEntityList;
    }

    public void setRemocionMemoEntityList(List<RemocionMemoEntity> remocionMemoEntityList) {
        this.remocionMemoEntityList = remocionMemoEntityList;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList() {
        return prestamoInternoMemoEntityList;
    }

    public void setPrestamoInternoMemoEntityList(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList) {
        this.prestamoInternoMemoEntityList = prestamoInternoMemoEntityList;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList1() {
        return prestamoInternoMemoEntityList1;
    }

    public void setPrestamoInternoMemoEntityList1(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList1) {
        this.prestamoInternoMemoEntityList1 = prestamoInternoMemoEntityList1;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList2() {
        return prestamoInternoMemoEntityList2;
    }

    public void setPrestamoInternoMemoEntityList2(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList2) {
        this.prestamoInternoMemoEntityList2 = prestamoInternoMemoEntityList2;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList3() {
        return prestamoInternoMemoEntityList3;
    }

    public void setPrestamoInternoMemoEntityList3(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList3) {
        this.prestamoInternoMemoEntityList3 = prestamoInternoMemoEntityList3;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList4() {
        return prestamoInternoMemoEntityList4;
    }

    public void setPrestamoInternoMemoEntityList4(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList4) {
        this.prestamoInternoMemoEntityList4 = prestamoInternoMemoEntityList4;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList5() {
        return prestamoInternoMemoEntityList5;
    }

    public void setPrestamoInternoMemoEntityList5(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList5) {
        this.prestamoInternoMemoEntityList5 = prestamoInternoMemoEntityList5;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList6() {
        return prestamoInternoMemoEntityList6;
    }

    public void setPrestamoInternoMemoEntityList6(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList6) {
        this.prestamoInternoMemoEntityList6 = prestamoInternoMemoEntityList6;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList7() {
        return prestamoInternoMemoEntityList7;
    }

    public void setPrestamoInternoMemoEntityList7(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList7) {
        this.prestamoInternoMemoEntityList7 = prestamoInternoMemoEntityList7;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList8() {
        return prestamoInternoMemoEntityList8;
    }

    public void setPrestamoInternoMemoEntityList8(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList8) {
        this.prestamoInternoMemoEntityList8 = prestamoInternoMemoEntityList8;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList9() {
        return prestamoInternoMemoEntityList9;
    }

    public void setPrestamoInternoMemoEntityList9(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList9) {
        this.prestamoInternoMemoEntityList9 = prestamoInternoMemoEntityList9;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList10() {
        return prestamoInternoMemoEntityList10;
    }

    public void setPrestamoInternoMemoEntityList10(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList10) {
        this.prestamoInternoMemoEntityList10 = prestamoInternoMemoEntityList10;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList11() {
        return prestamoInternoMemoEntityList11;
    }

    public void setPrestamoInternoMemoEntityList11(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList11) {
        this.prestamoInternoMemoEntityList11 = prestamoInternoMemoEntityList11;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList12() {
        return prestamoInternoMemoEntityList12;
    }

    public void setPrestamoInternoMemoEntityList12(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList12) {
        this.prestamoInternoMemoEntityList12 = prestamoInternoMemoEntityList12;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList13() {
        return prestamoInternoMemoEntityList13;
    }

    public void setPrestamoInternoMemoEntityList13(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList13) {
        this.prestamoInternoMemoEntityList13 = prestamoInternoMemoEntityList13;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList14() {
        return prestamoInternoMemoEntityList14;
    }

    public void setPrestamoInternoMemoEntityList14(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList14) {
        this.prestamoInternoMemoEntityList14 = prestamoInternoMemoEntityList14;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList15() {
        return prestamoInternoMemoEntityList15;
    }

    public void setPrestamoInternoMemoEntityList15(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList15) {
        this.prestamoInternoMemoEntityList15 = prestamoInternoMemoEntityList15;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList16() {
        return prestamoInternoMemoEntityList16;
    }

    public void setPrestamoInternoMemoEntityList16(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList16) {
        this.prestamoInternoMemoEntityList16 = prestamoInternoMemoEntityList16;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList17() {
        return prestamoInternoMemoEntityList17;
    }

    public void setPrestamoInternoMemoEntityList17(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList17) {
        this.prestamoInternoMemoEntityList17 = prestamoInternoMemoEntityList17;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList18() {
        return prestamoInternoMemoEntityList18;
    }

    public void setPrestamoInternoMemoEntityList18(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList18) {
        this.prestamoInternoMemoEntityList18 = prestamoInternoMemoEntityList18;
    }

    public List<PrestamoInternoMemoEntity> getPrestamoInternoMemoEntityList19() {
        return prestamoInternoMemoEntityList19;
    }

    public void setPrestamoInternoMemoEntityList19(List<PrestamoInternoMemoEntity> prestamoInternoMemoEntityList19) {
        this.prestamoInternoMemoEntityList19 = prestamoInternoMemoEntityList19;
    }

    public List<AsignacionMemoEntity> getAsignacionMemoEntityList() {
        return asignacionMemoEntityList;
    }

    public void setAsignacionMemoEntityList(List<AsignacionMemoEntity> asignacionMemoEntityList) {
        this.asignacionMemoEntityList = asignacionMemoEntityList;
    }

    public List<MantenimientosEntity> getMantenimientosEntityList() {
        return mantenimientosEntityList;
    }

    public void setMantenimientosEntityList(List<MantenimientosEntity> mantenimientosEntityList) {
        this.mantenimientosEntityList = mantenimientosEntityList;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList() {
        return prestamoExternoMemoEntityList;
    }

    public void setPrestamoExternoMemoEntityList(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList) {
        this.prestamoExternoMemoEntityList = prestamoExternoMemoEntityList;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList1() {
        return prestamoExternoMemoEntityList1;
    }

    public void setPrestamoExternoMemoEntityList1(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList1) {
        this.prestamoExternoMemoEntityList1 = prestamoExternoMemoEntityList1;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList2() {
        return prestamoExternoMemoEntityList2;
    }

    public void setPrestamoExternoMemoEntityList2(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList2) {
        this.prestamoExternoMemoEntityList2 = prestamoExternoMemoEntityList2;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList3() {
        return prestamoExternoMemoEntityList3;
    }

    public void setPrestamoExternoMemoEntityList3(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList3) {
        this.prestamoExternoMemoEntityList3 = prestamoExternoMemoEntityList3;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList4() {
        return prestamoExternoMemoEntityList4;
    }

    public void setPrestamoExternoMemoEntityList4(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList4) {
        this.prestamoExternoMemoEntityList4 = prestamoExternoMemoEntityList4;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList5() {
        return prestamoExternoMemoEntityList5;
    }

    public void setPrestamoExternoMemoEntityList5(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList5) {
        this.prestamoExternoMemoEntityList5 = prestamoExternoMemoEntityList5;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList6() {
        return prestamoExternoMemoEntityList6;
    }

    public void setPrestamoExternoMemoEntityList6(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList6) {
        this.prestamoExternoMemoEntityList6 = prestamoExternoMemoEntityList6;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList7() {
        return prestamoExternoMemoEntityList7;
    }

    public void setPrestamoExternoMemoEntityList7(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList7) {
        this.prestamoExternoMemoEntityList7 = prestamoExternoMemoEntityList7;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList8() {
        return prestamoExternoMemoEntityList8;
    }

    public void setPrestamoExternoMemoEntityList8(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList8) {
        this.prestamoExternoMemoEntityList8 = prestamoExternoMemoEntityList8;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList9() {
        return prestamoExternoMemoEntityList9;
    }

    public void setPrestamoExternoMemoEntityList9(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList9) {
        this.prestamoExternoMemoEntityList9 = prestamoExternoMemoEntityList9;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList10() {
        return prestamoExternoMemoEntityList10;
    }

    public void setPrestamoExternoMemoEntityList10(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList10) {
        this.prestamoExternoMemoEntityList10 = prestamoExternoMemoEntityList10;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList11() {
        return prestamoExternoMemoEntityList11;
    }

    public void setPrestamoExternoMemoEntityList11(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList11) {
        this.prestamoExternoMemoEntityList11 = prestamoExternoMemoEntityList11;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList12() {
        return prestamoExternoMemoEntityList12;
    }

    public void setPrestamoExternoMemoEntityList12(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList12) {
        this.prestamoExternoMemoEntityList12 = prestamoExternoMemoEntityList12;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList13() {
        return prestamoExternoMemoEntityList13;
    }

    public void setPrestamoExternoMemoEntityList13(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList13) {
        this.prestamoExternoMemoEntityList13 = prestamoExternoMemoEntityList13;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList14() {
        return prestamoExternoMemoEntityList14;
    }

    public void setPrestamoExternoMemoEntityList14(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList14) {
        this.prestamoExternoMemoEntityList14 = prestamoExternoMemoEntityList14;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList15() {
        return prestamoExternoMemoEntityList15;
    }

    public void setPrestamoExternoMemoEntityList15(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList15) {
        this.prestamoExternoMemoEntityList15 = prestamoExternoMemoEntityList15;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList16() {
        return prestamoExternoMemoEntityList16;
    }

    public void setPrestamoExternoMemoEntityList16(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList16) {
        this.prestamoExternoMemoEntityList16 = prestamoExternoMemoEntityList16;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList17() {
        return prestamoExternoMemoEntityList17;
    }

    public void setPrestamoExternoMemoEntityList17(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList17) {
        this.prestamoExternoMemoEntityList17 = prestamoExternoMemoEntityList17;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList18() {
        return prestamoExternoMemoEntityList18;
    }

    public void setPrestamoExternoMemoEntityList18(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList18) {
        this.prestamoExternoMemoEntityList18 = prestamoExternoMemoEntityList18;
    }

    public List<PrestamoExternoMemoEntity> getPrestamoExternoMemoEntityList19() {
        return prestamoExternoMemoEntityList19;
    }

    public void setPrestamoExternoMemoEntityList19(List<PrestamoExternoMemoEntity> prestamoExternoMemoEntityList19) {
        this.prestamoExternoMemoEntityList19 = prestamoExternoMemoEntityList19;
    }

    public List<EmpleadoEntity> getEmpleadoEntityList() {
        return empleadoEntityList;
    }

    public void setEmpleadoEntityList(List<EmpleadoEntity> empleadoEntityList) {
        this.empleadoEntityList = empleadoEntityList;
    }

    public List<TokensEntity> getTokensEntityList() {
        return tokensEntityList;
    }

    public void setTokensEntityList(List<TokensEntity> tokensEntityList) {
        this.tokensEntityList = tokensEntityList;
    }

    public AreaEntity getIdAreaAsignada() {
        return idAreaAsignada;
    }

    public void setIdAreaAsignada(AreaEntity idAreaAsignada) {
        this.idAreaAsignada = idAreaAsignada;
    }

    public TipoRecursoEntity getIdTipoRecurso() {
        return idTipoRecurso;
    }

    public void setIdTipoRecurso(TipoRecursoEntity idTipoRecurso) {
        this.idTipoRecurso = idTipoRecurso;
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
        if (!(object instanceof RecursosEntity)) {
            return false;
        }
        RecursosEntity other = (RecursosEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.fusalmo.www.entities.RecursosEntity[ id=" + id + " ]";
    }
    
}
