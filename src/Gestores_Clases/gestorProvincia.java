/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores_Clases;

import Hibernate.GestorHibernate;
import Clases_Modulo_Transporte.Localidad;
import Clases_Modulo_Transporte.Provincia;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;


/**
 *
 * @author Charito
 */
public class gestorProvincia extends GestorHibernate {
     public DefaultComboBoxModel getComboModelProvincia(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        Iterator iterador= this.listarClase(Provincia.class).iterator();
        while(iterador.hasNext()){
            Provincia c= (Provincia) iterador.next();
            modelo.addElement(c);
        }
        return modelo;
    }
}
