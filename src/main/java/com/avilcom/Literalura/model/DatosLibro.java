package com.avilcom.Literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record DatosLibro(

        @JsonAlias("count") Integer total,
        @JsonAlias("next") String linkSiguiente,
        @JsonAlias("previous") String linkAnterior,
        @JsonAlias("results")List<DatosResultadosLibro> resultadosLibro
        ) {
}
