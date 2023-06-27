package com.exemplo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.*;

public class EquacaoSegundoGrauTest {

    private double a;
    private double b;
    private double c;

    private double[] solucoes;

    @Given("a quadratic equation with coefficients a = {double}, b = {double}, and c = {double}")
    public void setQuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;


   }

   @When("I solve the quadratic equation")
    public void solveQuadraticEquation(){
        solucoes = EquacaoSegundoGrau.resolverEquacaoSegundoGrau(a,b,c);
   }

   @Then("the solution should be {double} and {double}")
    public void verifySolutions(double solucao1,double solucao2){
        assertNotNull(solucoes);
        assertEquals(solucao1,solucoes[0],0.0001);
       assertEquals(solucao2,solucoes[1],0.0001);
   }

}
