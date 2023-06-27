Feature: Resolução de Equações do Segundo Grau
  como um usuário
  Eu quero resolver equações do segundo grau
  Para encontrar as soluções reais

  Scenario: Solução com duas raízes reais distintas
    Given a quadratic equation with coefficients a = 1.0, b = -3.0, and c = -4.0
    When I solve the quadratic equation
    Then the solution should be 4.0 and -1.0