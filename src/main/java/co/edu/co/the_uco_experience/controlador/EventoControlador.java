package co.edu.co.the_uco_experience.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.uco.the_uco_experience.dto.EventoDTO;
import co.edu.uco.the_uco_experience.negocio.fachada.EventoFachada;
import java.util.List;

@RestController
@RequestMapping("/api/v1/eventos")
public class EventoControlador {

    @Autowired
    private EventoFachada fachada;

    @GetMapping
    public List<EventoDTO> consultar() {
        return fachada.consultarEventos();
    }
}