# language: es
Característica: Como administrador de PHPTRAVELES deseo agregar una categoria

  @AgregarCategoria
  Escenario: Agregar categoria de manera exitosa
    Dado que el usuario se encuentre en la pagina de PHPTRAVELS
    Cuando ingrese sus credenciales
      | correo               | contrasenia |
      | admin@phptravels.com | demoadmin   |
    Y agrega la categoria con la siguiente informacion
      | nombre | nombreEnVietnamita | nombreEnRuso              | nombreEnArabe | nombreEnFarsi | nombreEnTurco | nombreEnFrances | nombreEnEspañol | nombreEnAleman |
      | Art    | Nghệ thuật         | Изобразительное искусство | فن            | هنر           | Sanat         | Art             | Arte            | Kunst          |
    Entonces puede visualizar el nombre de la categoria Art