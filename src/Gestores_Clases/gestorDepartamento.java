/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores_Clases;

import Hibernate.GestorHibernate;
import Clases_Modulo_Transporte.Departamento;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Charito
 */
public class gestorDepartamento extends GestorHibernate{
    
    public DefaultComboBoxModel getComboModelDepartamento(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        Iterator iterador= this.listarClase(Departamento.class).iterator();
        while(iterador.hasNext()){
            Departamento c= (Departamento) iterador.next();
            modelo.addElement(c);
        }
        return modelo;
    }
}
