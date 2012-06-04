/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores_Clases;

import Hibernate.GestorHibernate;
import Clases_Modulo_Transporte.Barrio;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author Charito
 */
public class gestorBarrio extends GestorHibernate{
    
      public DefaultComboBoxModel getComboModelBarrio(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        Iterator iterador= this.listarClase(Barrio.class).iterator();
        while(iterador.hasNext()){
            Barrio c= (Barrio) iterador.next();
            modelo.addElement(c);
        }
        return modelo;
    }
}
