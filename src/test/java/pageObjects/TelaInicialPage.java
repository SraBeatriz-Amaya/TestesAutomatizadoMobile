package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TelaInicialPage {
	
	public TelaInicialPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.google.android.keep:id/skip_welcome")
	private MobileElement botaoGetStarted;
	
	public void acionarBotaoGetStarted() throws InterruptedException {
		Thread.sleep(2000); 
		botaoGetStarted.click();
		Thread.sleep(20000); 
		
	} 
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ExcluirTeste']")
	private MobileElement notaCriada;
	
	
	@AndroidFindBy(accessibility= "More options")
	private MobileElement botaoMaisOpcoes;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Delete']")
	private MobileElement botaoDelete;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Scrool Teste']")
	private MobileElement scrollText;
	
	
	public void acionarBotaoMaisOpcoes() {
		botaoMaisOpcoes.click();
	}
	
	public void acionarBotaoDeletar() {
		botaoDelete.click();
	}
	
	public void clicarLongo() throws Exception {
		Actions acao = new Actions(driver);
		acao.clickAndHold(notaCriada).perform();
		Thread.sleep(2000);
	}
	public void ScrollText() throws InterruptedException {
		scrollText.click();
		Thread.sleep(2000); //EsperaExplicita
	}
	public void arrastarNotaDireita() throws InterruptedException {
		Thread.sleep(20000); 
		swipeDireita();
	}
	
}

	
	
	//tag[@atributo='valor'] xpathweb
	//android.widget.EditText[@text='Title'] xpathmobile*/

/*MapeamentoCriarNota
@AndroidFindBy(id = "com.google.android.keep:id/new_note_button")
private MobileElement botaoNewNote;

public void acionarBotaoNewANote() throws InterruptedException {
	Thread.sleep(10000); 
	botaoNewNote.click();
} 

@AndroidFindBy(id = "com.google.android.keep:id/editable_title")
private MobileElement campoTitle;

@AndroidFindBy(id = "com.google.android.keep:id/edit_note_text")
private MobileElement campoNote;

@AndroidFindBy(accessibility = "Open navigation drawer")
private MobileElement botaoVoltar;

public void informarCampoTitle(String title) {
	campoTitle.sendKeys(title);
}

public void informarCampoNote(String note){
	campoNote.sendKeys(note);
}
public void acionarBotaoVoltar() {
	botaoVoltar.click();
}*/
 	
	
	/*
	Mapeamento do Switch
	@AndroidFindBy(accessibility = "Open navigation drawer")
    private MobileElement botaoMenu;
	
	@AndroidFindBy(xpath = "//android.widget.ListView//android.widget.LinearLayout")
    private List<MobileElement> menus;
	
	@AndroidFindBy(id = "com.google.android.keep:id/settings_add_new_items_to_bottom")
	private MobileElement switchAddNewItems;
	
	public void acionarBotaoMenu() {
		botaoMenu.click();
	}

	public void clicarSettings() {
		menus.get(6).click();
	
	}
	public void acionarBotaoswitchAddNewItems() {
		switchAddNewItems.click();
	
	}*/
	
	/*Mapeamento EditarNota
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Nota1']")
	private MobileElement notaCriada;
	
	@AndroidFindBy(id = "com.google.android.keep:id/editable_title")
	private MobileElement campoTitle;
	
	@AndroidFindBy(id = "com.google.android.keep:id/edit_note_text")
	private MobileElement campoNote;
	
	public void informarCampoTitle(String title) {
		campoTitle.clear();
		campoTitle.sendKeys(title);
	}
	
	public void informarCampoNote(String note) {
		campoNote.sendKeys(note);
	}
	public void clicarNotaCriada() {
		notaCriada.click();
	}*/
	
