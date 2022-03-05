package testes;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos ();
	Elementos el = new Elementos();
	
	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String appUrl) {
	     metodos.abrirNavegador(appUrl, "acessando o site.");
	}

	@When("pesquisar o nome da escola")
	public void pesquisar_o_nome_da_escola() {
	     metodos.escrever("E2E treinamentos", el.getPesquisar());
	     metodos.submit(el.getPesquisar());
	}

	@Then("valido as informacoes")
	public void valido_as_informacoes() {
		
		metodos.fecharNavegador("Encerrando o teste");
	    
	}
}
