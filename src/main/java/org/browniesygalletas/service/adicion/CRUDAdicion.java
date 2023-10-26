package org.browniesygalletas.service.adicion;

import org.browniesygalletas.modelo.Adiciones;

import java.util.List;

public interface CRUDAdicion {
    //Este es la interface CRUD de los servicios relacionados a las adiciones
    void crearAdicion(Adiciones adicion);

    void eliminarAdicion(Adiciones adicion);

    List<Adiciones> listarAdiciones();

    void modificarAdiciones(Adiciones adicion);

    Adiciones obtenerAdicionPorId (Integer id);
}
