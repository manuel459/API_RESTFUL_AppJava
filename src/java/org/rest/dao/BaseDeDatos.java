
package org.rest.dao;


import java.util.ArrayList;
import java.util.List;
import org.rest.modelo.usuario;


public class BaseDeDatos {
    private final static BaseDeDatos baseDeDatos = new BaseDeDatos();
    private final List<usuario> listado = new ArrayList<>();
    
    private BaseDeDatos(){
       usuario usu1= new usuario(1,"manuel","manuel_dragon242@gmail.com","infor","1999-05-17",22);
       usuario usu2= new usuario(2,"fatima","faaty_242@gmail.com","@dsad2","1996-06-18",25);
       usuario usu3= new usuario(3,"rolando","rolando242@gmail.com","infracu21","1998-01-01",28);
       listado.add(usu1);
       listado.add(usu2);
       listado.add(usu3);
    }
    
    public static BaseDeDatos getInstancia(){
    return baseDeDatos ;
    }
    public List<usuario> getListado(){
    return listado;
    }
}
