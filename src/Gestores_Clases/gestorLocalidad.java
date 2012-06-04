/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores_Clases;

import Hibernate.GestorHibernate;
import Clases_Modulo_Transporte.Localidad;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author Charito
 */
public class gestorLocalidad extends GestorHibernate {
    
    public DefaultComboBoxModel getComboModelLocalidad(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        Iterator iterador= this.listarClase(Localidad.class).iterator();
        while(iterador.hasNext()){
            Localidad c= (Localidad) iterador.next();
            modelo.addElement(c);
        }
        return modelo;
    }
}
