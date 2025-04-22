Feature: Recuperación de contraseña

  Scenario: Usuario utiliza la función de recuperación de contraseña
    Given El usuario está en la página de inicio de sesión
    When Selecciona la opción 'Olvidé mi contraseña'
    Then Se muestra la pantalla de recuperación de contraseña
    When Ingresa su correo electrónico registrado
    Then Se envía un correo de recuperación de contraseña