package com.avilcom.Literalura.main;

import com.avilcom.Literalura.repository.LibroRepository;
import com.avilcom.Literalura.service.ConsumoApi;
import java.util.Scanner;

public class Main {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    private final String URL_BASE = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=1e4eb9ac";
    private LibroRepository repositorio;

    public void muestraElMenu() {
        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    1 - Buscar series 
                    2 - Buscar episodios
                    3 - Mostrar series buscadas
                    4 - Buscar series por título
                    5 - Top 5 mejores series
                    6 - Buscar series por categoría
                    7 - Filtrar series por cantidad de temporadas y evaluación
                    8 - Buscar episodios
                    9 - Top 5 episodios por serie
                    
                    0 - Salir
                    """;
            System.out.println(menu);
        }
    }
}
