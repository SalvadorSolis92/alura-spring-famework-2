package com.aluracursos.screenmatch.model;

public enum Categoria {
    ACCION("Action"),
    ROMANCE("Romance"),
    COMEDIA("Comedy"),
    DRAMA("Drama"),
    CRIMEN("Crime");

    private String categoriaOmdb;

    Categoria (String categorioaOmbd){
        this.categoriaOmdb = categorioaOmbd;
    }

    public static Categoria fromString(String text){
        for(Categoria categoria: Categoria.values()){
            if (categoria.categoriaOmdb.equals(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("Ninguna categoria encontrada " + text);
    }
}
