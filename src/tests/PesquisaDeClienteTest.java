package tests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;

public class PesquisaDeClienteTest {
	
	WebDriver driver;
	
	
	@Dado("^Acessar a p�gina de pesquisa de Cliente$")
	public void acessar_a_p�gina_de_pesquisa_de_Cliente() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\Chrome\\89\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://exerctestes01-001-site1.btempurl.com/Home/Exercicio04");
	}
	    

	@Dado("^Informar o CPF \"([^\"]*)\"$")
	public void informar_o_CPF(String cpf) {
		driver.findElement(By.xpath("//*[@id=\"Cpf\"]")).sendKeys(cpf);
	}
	

	@Quando("^Solicitar a realiza��o da pesquisa$")
	public void solicitar_a_realiza��o_da_pesquisa() {
	   driver.findElement(By.xpath("//*[@id=\"btnPesquisa\"]")).click();
	}

	@Ent�o("^Sistema exibe o nome do cliente \"([^\"]*)\"$")
	public void sistema_exibe_o_nome_do_cliente(String nome) {
	    String resultado = driver.findElement(By.xpath("//*[@id=\"nome\"]")).getText();
	    assertEquals(nome, resultado);
	}

	@Ent�o("^Sistema exibe a data de nascimento do cliente \"([^\"]*)\"$")
	public void sistema_exibe_a_data_de_nascimento_do_cliente(String datanascimento) {
	    String resultado = driver.findElement(By.xpath("//*[@id=\"datanascimento\"]")).getText();
	    assertEquals(datanascimento, resultado);
	    
	}

	@Ent�o("^Sistema exibe o email do cliente \"([^\"]*)\"$")
	public void sistema_exibe_o_email_do_cliente(String email) {
	    String resultado = driver.findElement(By.xpath("//*[@id=\"email\"]")).getText();
	    assertEquals(email, resultado);
	}

}
