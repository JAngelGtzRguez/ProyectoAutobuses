package mx.uv.HistorialAbordo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



@RestController
public class AbordosController {
    @Autowired
    private AbordosRepository iabordos;

    //CREAR ABORDOS
    @RequestMapping(value = "/GuardarAbordo/{nombreAutobus}/{nombrePasajero}", method = RequestMethod.POST)
    public String GuardarAbordo(@PathVariable("nombreAutobus") String nombreA, @PathVariable("nombrePasajero") String nombreP)
    {
            if(nombreA != null && nombreP != null){
                LocalDate todaysDate = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                LocalTime time = LocalTime.now();
                String hora = time.format(formatter);

                Abordos abordo = new Abordos();
                abordo.setNombreAutobus(nombreA);  
                abordo.setFecha(todaysDate);
                abordo.setHora(hora);
                abordo.setNombrePasajero(nombreP);
                iabordos.save(abordo);
                return "Usario agregado";
            }else{
                return "Ha ocurrido un problema, no se pudo agregar el usuario ";
            }        
    }

    //ACCEDER AL HISTORIAL DE ABORDOS
    @RequestMapping(value = "/ObtenerHistorial", method = RequestMethod.GET)
    public Iterable<Abordos> obtenerHistorial() {
        return iabordos.findAll();
    }

}
