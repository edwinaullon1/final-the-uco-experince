package co.edu.co.the_uco_experience.negocio.fachada.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.uco.the_uco_experience.dto.EventoDTO;
import co.edu.uco.the_uco_experience.negocio.EventoNegocio;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventoFachada {

    @Autowired
    private EventoNegocio negocio;

    public List<EventoDTO> consultarEventos() {
        return negocio.consultarEventos().stream().map(entidad -> {
            EventoDTO dto = new EventoDTO();
            dto.setId(entidad.getId());
            dto.setCodigoPublico(entidad.getCodigoPublico());
            dto.setNombre(entidad.getNombre());
            dto.setDescripcion(entidad.getDescripcion());
            dto.setEstado(entidad.getEstado());
            return dto;
        }).collect(Collectors.toList());
    }
}
