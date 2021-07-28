@BusinessMeeting
Feature: Unidades de negocio Y reuniones


  Scenario Outline: Nueva unidad de negocio y creacion de reuniones
    Given El usuario ingresa a la pagina y realiza el login a la pagina <Usuario> <password>
    When Se valida el ingreso correcto a la plataforma
    Then realizar la creacion de nueva unidad de negocio
    And realizar la creacion de nueva reunion



    Examples:
    | Usuario | password |
    | admin  | serenity |
