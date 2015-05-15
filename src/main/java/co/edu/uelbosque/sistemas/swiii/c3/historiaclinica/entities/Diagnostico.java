/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.joda.time.Duration;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/**
 *
 * @author Alejandro
 */
@Entity
@ManagedBean
@SessionScoped
public class Diagnostico implements Serializable {

    public Diagnostico(Long id, Long idPaciente, String sintomas, String signos, TiposdeDiagnosticos tiposdeDiagnosticos, String declaracion, String prescripcion, String recomendaciones) {
        this.id = id;
        this.idPaciente = idPaciente;
        this.sintomas = sintomas;
        this.signos = signos;
        this.tiposdeDiagnosticos = tiposdeDiagnosticos;
        this.declaracion = declaracion;
        this.prescripcion = prescripcion;
        this.recomendaciones = recomendaciones;
    }

    @Id
    @GenericGenerator(name = "generadorIdPaciente", strategy = "increment")
    @GeneratedValue(generator = "generadorIdPaciente")
    private Long id;
    private Long idPaciente;
    private String sintomas;
    private String signos;
    TiposdeDiagnosticos tiposdeDiagnosticos;
    private String declaracion;
    private String prescripcion;
    private String recomendaciones;

    public String getPrescripcion() {
        return prescripcion;
    }

    public void setPrescripcion(String prescripcion) {
        this.prescripcion = prescripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getSignos() {
        return signos;
    }

    public void setSignos(String signos) {
        this.signos = signos;
    }

    public TiposdeDiagnosticos getTiposdeDiagnosticos() {
        return tiposdeDiagnosticos;
    }

    public void setTiposdeDiagnosticos(TiposdeDiagnosticos tiposdeDiagnosticos) {
        this.tiposdeDiagnosticos = tiposdeDiagnosticos;
    }

    public String getDeclaracion() {
        return declaracion;
    }

    public void setDeclaracion(String declaracion) {
        this.declaracion = declaracion;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    @Override
    public String toString() {
        return "Diagnostico{" + "id=" + id + ", idPaciente=" + idPaciente + ", sintomas=" + sintomas + ", signos=" + signos + ", tiposdeDiagnosticos=" + tiposdeDiagnosticos + ", declaracion=" + declaracion + ", recomendaciones=" + recomendaciones + '}';
    }
    
    
}
