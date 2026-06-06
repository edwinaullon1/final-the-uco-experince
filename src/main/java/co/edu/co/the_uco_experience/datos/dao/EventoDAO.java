package co.edu.co.the_uco_experience.datos.dao;

import java.util.List;
import java.util.UUID;

import co.edu.uco.the_uco_experience.datos.entidad.EventoEntidad;

public interface EventoDAO {

    void crear(EventoEntidad entidad);

    void actualizar(UUID id, EventoEntidad entidad);

    void eliminar(UUID id);

    EventoEntidad consultarPorId(UUID id);

    List<EventoEntidad> consultar(EventoEntidad filtro);
}