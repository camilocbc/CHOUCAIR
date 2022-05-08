@Serenity
Feature: Pruebas Automatizacion
  @Caso1
  Scenario Outline: Ingreso Serenity y creo una Reunion
    Given Ingreso al Serenity
    When inicio sesion creo unidad de negocio <usuario> <clave> <nombreUnidad> <unidadPadre>
    And  Creo Reunion <nombreReunion> <tipoReunion> <fechInicio> <horaInicio> <fechaFin> <horaFin>
    Then valido creacion de reunion

    Examples:
      | usuario | clave | nombreUnidad | unidadPadre | nombreReunion | tipoReunion | fechInicio | horaInicio | fechaFin | horaFin |
      | "admin" | "serenity" | "Test"  | "Technology" |  "Chougar111"  |  "Team Weekly"  | "09/05/2022" | "10:00" | "09/05/2022" | "10:30" |
