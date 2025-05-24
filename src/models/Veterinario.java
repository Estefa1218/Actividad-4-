
package models;

import java.util.Objects;

public class Veterinario extends BaseModel {

    private String especialidad;

    public Veterinario(int id, String nombre, String email, String telefono, String especialidad) {
        super(id, nombre, email, telefono); 
        
 
        Objects.requireNonNull(especialidad, "La especialidad no puede ser nula.");
        if (especialidad.trim().isEmpty()) {
            throw new IllegalArgumentException("La especialidad no puede estar vacía.");
        }
        
        this.especialidad = especialidad;
    }

    public Veterinario(String nombre, String email, String telefono, String especialidad) {
        super(nombre, email, telefono); // Llama al otro constructor del padre
        
        Objects.requireNonNull(especialidad, "La especialidad no puede ser nula.");
        if (especialidad.trim().isEmpty()) {
            throw new IllegalArgumentException("La especialidad no puede estar vacía.");
        }

        this.especialidad = especialidad;
    }


    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

  
    @Override
    public String toString() {
      
        return "Veterinario{" +
               super.toString() + 
               ", especialidad='" + especialidad + '\'' +
               '}';
    }
}