/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores_Clases;

import Hibernate.GestorHibernate;
import Clases_Modulo_Transporte.Localidad;
import Clases_Modulo_Transporte.Pais;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Charito
 */
public class gestorPais extends GestorHibernate {
    
    public DefaultComboBoxModel getComboModelPais(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        Iterator iterador= this.listarClase(Pais.class).iterator();
        while(iterador.hasNext()){
            Pais c= (Pais) iterador.next();
            modelo.addElement(c);
        }
        return modelo;
    }
}
