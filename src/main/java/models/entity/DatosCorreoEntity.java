package models.entity;

import models.DatosCorreo;

public class DatosCorreoEntity {

    private static DatosCorreo datosCorreo;

    public static DatosCorreo getDatosCorreo() { return datosCorreo; }

    public static void setDatosCorreo(DatosCorreo datosCorreo) { DatosCorreoEntity.datosCorreo = datosCorreo; }
}
