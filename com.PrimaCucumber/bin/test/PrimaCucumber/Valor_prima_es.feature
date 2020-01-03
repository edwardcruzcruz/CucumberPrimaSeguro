Feature: Prima Seguro
  Quiero usar esta aplicación para obtener el valor de seguro que debo para para mi carro segun mi edad y 
  puntos de conducción.

  Scenario Outline: El cliente Edward consulta el valor a pagar por su seguro durante 2 edades diferentes
    Given Edward tiene <edad> años
    And tiene <puntos> puntos en su licencia
    When consulta el valor del seguro de Prima
    Then obtine el valor de <resultado> 

    Examples: 
      |edad | puntos | resultado |
      | 18	| 30 	 	 | 1350.0		 |
      | 25	| 30 	 	 | 850.0 		 |
