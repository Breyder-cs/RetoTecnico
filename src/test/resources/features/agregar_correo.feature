# language: es
Característica: Como administrador de PHPTRAVELES deseo agregar un correo

  @AgregarCorreo
  Escenario: Agregar correo de manera exitosa
    Dado que el usuario se encuentre en la pagina de PHPTRAVELS
    Cuando ingrese sus credenciales
      | correo               | contrasenia |
      | admin@phptravels.com | demoadmin   |
    Y agrega la categoria con la siguiente informacion
      | nombre | nombreEnVietnamita | nombreEnRuso              | nombreEnArabe | nombreEnFarsi | nombreEnTurco | nombreEnFrances | nombreEnEspañol | nombreEnAleman |
      | Art    | Nghệ thuật         | Изобразительное искусство | فن            | هنر           | Sanat         | Art             | Arte            | Kunst          |
    Y agerga un correo con la siguiente informacion
      | titulo        | parrafo        | palabraClave    | descripcion             |
      | Correo prueba | Automatización | Prueba choucair | Prueba tecnica choucair |
    Entonces se visualiza el nombre del correo Correo prueba