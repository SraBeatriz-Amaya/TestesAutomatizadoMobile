/*package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class CriarNotaSteps {
	
	TelaInicialPage telaInicial = new TelaInicialPage(driver);
	
	@Dado("que eu aciono o get started")
	public void queEuAcionoOGetStarted() throws InterruptedException {
	    telaInicial.acionarBotaoGetStarted();
	}
	
	@Quando("^eu acionar o new a note$")
	public void euAcionarONewANote() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		telaInicial.acionarBotaoNewANote();
	
	}
	
	@Quando("eu informar no campo title {string}")
	public void euInformarNoCampoTitle(String title) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		telaInicial.informarCampoTitle(title);
	}

	@Quando("eu informar no campo note {string}")
	public void euInformarNoCampoNote(String note) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    telaInicial.informarCampoNote(note);
	}

	@Quando("eu acionar o botao voltar")
	public void euAcionarOBotaoVoltar() {
	    telaInicial.acionarBotaoVoltar();
	}

	@Então("o aplicativo cadastra a nota com o titulo {string}")
	public void oAplicativoCadastraANotaComOTitulo(String title) {
	    assertEquals(title, driver.findElement(By.id("com.google.android.keep:id/index_note_title")).getText());
	}
}
*/