package models.entity;

import models.DatosUsuario;

public class DatosUsuarioEntity {
    private static DatosUsuario datosUsuario;

    public static DatosUsuario getDatosUsuario() { return datosUsuario; }

    public static void setDatosUsuario(DatosUsuario datosUsuario) {
        DatosUsuarioEntity.datosUsuario = datosUsuario;
    }
}
