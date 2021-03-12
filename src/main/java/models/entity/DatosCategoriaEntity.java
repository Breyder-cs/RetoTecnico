package models.entity;

import models.DatosCategoria;

public class DatosCategoriaEntity {
    private static DatosCategoria datosCategoria;

    public static DatosCategoria getDatosCategoria() { return datosCategoria; }

    public static void setDatosCategoria(DatosCategoria datosCategoria) { DatosCategoriaEntity.datosCategoria = datosCategoria; }
}
