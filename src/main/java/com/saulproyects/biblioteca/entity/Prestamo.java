package com.saulproyects.biblioteca.entity;

import java.time.LocalDate;

public class Prestamo {
    private Long id;
    private Usuario usuario;
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private boolean devuelto;
}
