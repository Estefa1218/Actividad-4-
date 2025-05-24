package models;

import java.util.Objects;


public class Cliente extends BaseModel {

    private String direccion;

    public Cliente(int id, String nombre, String email, String telefono, String direccion) {
        super(id, nombre, email, telefono); 
  
        Objects.requireNonNull(direccion, "La dirección no puede ser nula.");
        if (direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("La dirección no puede estar vacía.");
        }
        
        this.direccion = direccion;
    }

    public Cliente(String nombre, String email, String telefono, String direccion) {
        super(nombre, email, telefono); 

        Objects.requireNonNull(direccion, "La dirección no puede ser nula.");
        if (direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("La dirección no puede estar vacía.");
        }

        this.direccion = direccion;
    }

 

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Override
    public String toString() {
     
        return "Cliente{" +
               super.toString() + 
               ", direccion='" + direccion + '\'' +
               '}';
    }
}