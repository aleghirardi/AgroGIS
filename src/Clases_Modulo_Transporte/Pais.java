/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_Modulo_Transporte;

import javax.persistence.*;

@Entity
@Table(name="Pais")

public class Pais {

@Id @GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY)
private long idPais;

    private String nombrePais;

    /**
     * @return the nombrePais
     */
    public String getNombrePais() {
        return nombrePais;
    }

    /**
     * @param nombrePais the nombrePais to set
     */
    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
     public String toString(){
        return getNombrePais();
    }
}
