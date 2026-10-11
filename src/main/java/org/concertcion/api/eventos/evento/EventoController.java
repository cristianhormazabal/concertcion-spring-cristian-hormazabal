
package org.concertcion.api.eventos.evento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class EventoController {

    @Autowired
    private EventoRepository eventoRepository;

    @PostMapping(
        value = "/api/evento",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Object handleInsertEventoRequest(
            @RequestBody Evento evento) {

        return eventoRepository.save(evento);
    }

    @GetMapping(
        value = "/api/eventos",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Evento> handleGetEventosRequest() {

        return eventoRepository.findAll();
    }
}

