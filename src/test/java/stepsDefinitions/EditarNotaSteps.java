/*package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class EditarNotaSteps {

	
	TelaInicialPage telaInicial = new TelaInicialPage(driver);
	
	@Dado("que eu aciono o get started")
	public void queEuAcionoOGetStarted() throws InterruptedException {
	    telaInicial.acionarBotaoGetStarted();
	}
	
	@Quando("eu acionar a nota")
	public void euAcionarANota() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    telaInicial.clicarNotaCriada();
	}

	@Quando("eu informar no campo title {string}")
	public void euInformarNoCampoTitle(String title) {
		telaInicial.informarCampoTitle(title);
	}

	@Quando("eu informar no campo note {string}")
	public void euInformarNoCampoNote(String note) {
		telaInicial.informarCampoNote(note);
	}

	
	@Entao("o aplicativo cadastra a nota com o titulo {string}")
	public void oAplicativoCadastraANotaComOTitulo(String string) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("NotaEditada", driver.findElement(By.id("com.google.android.keep:id/editable_title")).getText());
	}
}*/
