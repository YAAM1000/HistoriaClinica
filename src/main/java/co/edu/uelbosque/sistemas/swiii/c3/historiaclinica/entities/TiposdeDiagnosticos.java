/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.entities;

/**
 *
 * @author Alejandro
 */
public enum TiposdeDiagnosticos {
    
DIAGNOSTICO_CLINICO("DIAGNÓSTICO CLÍNICO "),
DIAGNOSTICO_DE_CERTEZA("DIAGNÓSTICO_DE_CERTEZA"),
DIAGNOSTICO_GENIRICO("DIAGNÓSTICO_GENÉRICO"),
DIAGNOSTICO_SINTOMITICO("DIAGNÓSTICO_SINTOMÁTICO"),
DIAGNOSTICO_NOSOLOGICO("DIAGNÓSTICO NOSOLÓGICO");
    
    String tipoDiagnosticos;
    
    private TiposdeDiagnosticos(String tiposDiagnosticos) {    
        this.tipoDiagnosticos=tipoDiagnosticos;
    }
}
