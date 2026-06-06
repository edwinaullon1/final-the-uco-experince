package co.edu.co.the_uco_experience.datos.entidad;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class EventoEntidad {

    private UUID id;
    private String codigoPublico;
    private String nombre;
    private String descripcion;
    private LocalDate fechaEvento;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private LocalDate fechaInicioInscripcion;
    private LocalDate fechaFinInscripcion;
    private int cuposMaximos;
    private int cuposDisponibles;
    private double valorInscripcion;
    private String modalidad;
    private String ubicacion;
    private String estado;

    public EventoEntidad() {
        setId(UUID.fromString("00000000-0000-0000-0000-000000000000"));
        setCodigoPublico("");
        setNombre("");
        setDescripcion("");
        setFechaEvento(LocalDate.now());
        setHoraInicio(LocalTime.MIN);
        setHoraFin(LocalTime.MIN);
        setFechaInicioInscripcion(LocalDate.now());
        setFechaFinInscripcion(LocalDate.now());
        setCuposMaximos(0);
        setCuposDisponibles(0);
        setValorInscripcion(0);
        setModalidad("");
        setUbicacion("");
        setEstado("");
    }

    public EventoEntidad(final UUID id) {
        setId(id);
        setCodigoPublico("");
        setNombre("");
        setDescripcion("");
        setFechaEvento(LocalDate.now());
        setHoraInicio(LocalTime.MIN);
        setHoraFin(LocalTime.MIN);
        setFechaInicioInscripcion(LocalDate.now());
        setFechaFinInscripcion(LocalDate.now());
        setCuposMaximos(0);
        setCuposDisponibles(0);
        setValorInscripcion(0);
        setModalidad("");
        setUbicacion("");
        setEstado("");
    }

    public EventoEntidad(final UUID id, final String codigoPublico, final String nombre, final String descripcion,
            final LocalDate fechaEvento, final LocalTime horaInicio, final LocalTime horaFin,
            final LocalDate fechaInicioInscripcion, final LocalDate fechaFinInscripcion, final int cuposMaximos,
            final int cuposDisponibles, final double valorInscripcion, final String modalidad,
            final String ubicacion, final String estado) {
        setId(id);
        setCodigoPublico(codigoPublico);
        setNombre(nombre);
        setDescripcion(descripcion);
        setFechaEvento(fechaEvento);
        setHoraInicio(horaInicio);
        setHoraFin(horaFin);
        setFechaInicioInscripcion(fechaInicioInscripcion);
        setFechaFinInscripcion(fechaFinInscripcion);
        setCuposMaximos(cuposMaximos);
        setCuposDisponibles(cuposDisponibles);
        setValorInscripcion(valorInscripcion);
        setModalidad(modalidad);
        setUbicacion(ubicacion);
        setEstado(estado);
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id == null ? UUID.fromString("00000000-0000-0000-0000-000000000000") : id;
    }

    public String getCodigoPublico() {
        return codigoPublico;
    }

    public void setCodigoPublico(final String codigoPublico) {
        this.codigoPublico = codigoPublico == null ? "" : codigoPublico.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre == null ? "" : nombre.trim();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(final String descripcion) {
        this.descripcion = descripcion == null ? "" : descripcion.trim();
    }

    public LocalDate getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(final LocalDate fechaEvento) {
        this.fechaEvento = fechaEvento == null ? LocalDate.now() : fechaEvento;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(final LocalTime horaInicio) {
        this.horaInicio = horaInicio == null ? LocalTime.MIN : horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(final LocalTime horaFin) {
        this.horaFin = horaFin == null ? LocalTime.MIN : horaFin;
    }

    public LocalDate getFechaInicioInscripcion() {
        return fechaInicioInscripcion;
    }

    public void setFechaInicioInscripcion(final LocalDate fechaInicioInscripcion) {
        this.fechaInicioInscripcion = fechaInicioInscripcion == null ? LocalDate.now() : fechaInicioInscripcion;
    }

    public LocalDate getFechaFinInscripcion() {
        return fechaFinInscripcion;
    }

    public void setFechaFinInscripcion(final LocalDate fechaFinInscripcion) {
        this.fechaFinInscripcion = fechaFinInscripcion == null ? LocalDate.now() : fechaFinInscripcion;
    }

    public int getCuposMaximos() {
        return cuposMaximos;
    }

    public void setCuposMaximos(final int cuposMaximos) {
        this.cuposMaximos = cuposMaximos;
    }

    public int getCuposDisponibles() {
        return cuposDisponibles;
    }

    public void setCuposDisponibles(final int cuposDisponibles) {
        this.cuposDisponibles = cuposDisponibles;
    }

    public double getValorInscripcion() {
        return valorInscripcion;
    }

    public void setValorInscripcion(final double valorInscripcion) {
        this.valorInscripcion = valorInscripcion;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(final String modalidad) {
        this.modalidad = modalidad == null ? "" : modalidad.trim();
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(final String ubicacion) {
        this.ubicacion = ubicacion == null ? "" : ubicacion.trim();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(final String estado) {
        this.estado = estado == null ? "" : estado.trim();
    }
}
