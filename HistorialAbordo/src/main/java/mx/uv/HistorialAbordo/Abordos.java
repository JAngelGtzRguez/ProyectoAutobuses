package mx.uv.HistorialAbordo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Abordos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private LocalDate Fecha;
    private String NombreAutobus;
    private String Hora;
    private String NombrePasajero;

    public Abordos() {
        
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return Fecha;
    }
    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }
    public String getNombreAutobus() {
        return NombreAutobus;
    }
    public void setNombreAutobus(String nombreAutobus) {
        NombreAutobus = nombreAutobus;
    }
    public String getHora() {
        return Hora;
    }
    public void setHora(String hora) {
        Hora = hora;
    }
    public String getNombrePasajero() {
        return NombrePasajero;
    }
    public void setNombrePasajero(String nombrePasajero) {
        NombrePasajero = nombrePasajero;
    }
    
    

}
