# language: es
Característica: Como administrador de PHPTRAVELES deseo iniciar sesión en el aplicativo

  @LoginExitoso
  Escenario: Iniciar sesion exitoso
    Dado que el usuario se encuentre en la pagina de PHPTRAVELS
    Cuando ingrese sus credenciales
      | correo               | contrasenia |
      | admin@phptravels.com | demoadmin   |
    Entonces visualiza el texto de DASHBOARD