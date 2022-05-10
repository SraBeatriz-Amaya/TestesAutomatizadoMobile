package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

public class ExcluirNotaSteps {

	TelaInicialPage telaInicial = new TelaInicialPage(driver);
	
	/*@Dado("que eu aciono o get started")
	public void queEuAcionoOGetStarted() throws InterruptedException {
	    telaInicial.acionarBotaoGetStarted();
	}
	
	@Quando("eu tocar e segura a nota")
	public void euTocarESeguraANota() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		telaInicial.clicarLongo();
	}

	@Quando("eu tocar nas opcoes")
	public void euTocarNasOpcoes() {
	    telaInicial.acionarBotaoMaisOpcoes();
	}

	@Quando("eu tocar em deletar")
	public void euTocarEmDeletar() {
	    telaInicial.acionarBotaoDeletar();
	}

	@Entao("o sistema adiciona a nota na lixeira")
	public void oSistemaAdicionaANotaNaLixeira() {
	    assertEquals("Note moved to trash", driver.findElement(By.id("com.google.android.keep:id/snackbar_text")).getText()); 
	}
	
	//Scroll Test - Rolar pra baixo
	@Quando("^eu clicar na nota scroll teste$")
	public void euClicarNaNotaScrollTeste() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Scrool Teste\").instance(0))"));
		telaInicial.ScrollText();
	}*/
	
	@Quando("^eu arrastar a nota para a direita$")
	public void euArrastarANotaParaADireita() throws Throwable {
		telaInicial.arrastarNotaDireita();
	}

	
}
