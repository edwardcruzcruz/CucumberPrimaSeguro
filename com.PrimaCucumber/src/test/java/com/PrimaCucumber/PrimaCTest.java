package com.PrimaCucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.And;
//import static org.junit.Assert.*;


class valorPrima {
	static Prima tester = new Prima();
    static float laprimaes(int edad,int puntos) {
        return tester.prima(edad, puntos);
    }
}
public class PrimaCTest {
	private int edad;
	private int puntos;
	private float resultado;
	
  @Given("Edward tiene {int} años")
  public void edward_tiene_años(int edad) {
	  this.edad = edad;
  }
  @And("tiene {int} puntos en su licencia")
  public void tiene_puntos_en_su_licencia(int puntos){
	  this.puntos=puntos;
  }
  @When("consulta el valor del seguro de Prima")
  public void consulta_el_valor_del_seguro_de_Prima(){
	  resultado=valorPrima.laprimaes(edad, puntos);
  }

  @Then("obtine el valor de {float}")
  public void obtine_el_valor_de(float expected){
	  assertEquals(expected, resultado, 1);
  }

}
