
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marlon
 */
public class Factory<E> {
    public Set<E> makeFactory(String tipoImplemntacion){
        Set<E> implementacion =null;
        if (tipoImplemntacion.equals("HashSet")){
            implementacion= new HashSet<E>();
            
        }
        if(tipoImplemntacion.equals("TreeSet")){
            implementacion = new TreeSet<E>();
           
        }
        if(tipoImplemntacion.equals("LinkedHashSet")){
            implementacion = new LinkedHashSet<E>();
        }
        return implementacion;
    }
}
