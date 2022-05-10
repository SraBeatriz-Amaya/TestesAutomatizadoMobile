/*package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

public class SwitchSettingsSteps {
	
	TelaInicialPage telaInicial = new TelaInicialPage(driver); 
	
	@Dado("que eu aciono o get started")
	public void queEuAcionoOGetStarted() throws InterruptedException {
	    telaInicial.acionarBotaoGetStarted();
	}
	
	@Quando("eu acionar o menu")
	public void euAcionarOMenu() {
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    telaInicial.acionarBotaoMenu();
	}

	@Quando("eu acionar a aba settings")
	public void euAcionarAAbaSettings() {
    telaInicial.clicarSettings();
	}

	@Quando("eu tocar no switch")
	public void euTocarNoSwitch() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		telaInicial.acionarBotaoswitchAddNewItems();
	}

	@Entao("o switch fica desabilitado")
	public void oSwitchFicaDesabilitado() {
    assertEquals("false", driver.findElement(By.id("com.google.android.keep:id/settings_add_new_items_to_bottom")).getAttribute("checked"));
	}
}*/
