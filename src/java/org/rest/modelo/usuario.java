
package org.rest.modelo;

public class usuario {
  //variables donde se va almacenar la informacion
    private int id;
    private String nombre;
    private String correoElectronico;
    private String contraseña;
    private String fechaNacimiento;
    private int edad;

    public usuario() {
    }
  //constructor parametrizado 
    public usuario(int id, String nombre, String correoElectronico, String contraseña, String fechaNacimiento, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

   public String getContraseña(){
   return contraseña;
   }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
