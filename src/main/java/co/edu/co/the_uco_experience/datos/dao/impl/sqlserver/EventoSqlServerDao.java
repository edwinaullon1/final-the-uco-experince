package co.edu.co.the_uco_experience.datos.dao.impl.sqlserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import co.edu.uco.the_uco_experience.datos.dao.EventoDAO;
import co.edu.uco.the_uco_experience.datos.entidad.EventoEntidad;
import java.util.List;
import java.util.UUID;

@Repository
public class EventoSqlServerDao implements EventoDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<EventoEntidad> consultar(EventoEntidad filtro) {
        String sql = "SELECT id, codigo_publico, nombre, descripcion, estado FROM dbo.uco_evento";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            EventoEntidad evento = new EventoEntidad();
            evento.setId(UUID.fromString(rs.getString("id")));
            evento.setCodigoPublico(rs.getString("codigo_publico"));
            evento.setNombre(rs.getString("nombre"));
            evento.setDescripcion(rs.getString("descripcion"));
            evento.setEstado(rs.getString("estado"));
            return evento;
        });
    }

    @Override
    public void crear(EventoEntidad entidad) {}
    @Override
    public void actualizar(UUID id, EventoEntidad entidad) {}
    @Override
    public void eliminar(UUID id) {}
    @Override
    public EventoEntidad consultarPorId(UUID id) { return null; }
}