package com.patronage.Steps;

import com.patronage.Pages.AutomationpracticePage;
import cucumber.api.PendingException;
import cucumber.api.java.pl.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by przemyslaw.nogaj on 2017-01-27.
 */
public class MyStepdefs {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "http://automationpractice.com/";
    AutomationpracticePage page = PageFactory.initElements(driver, AutomationpracticePage.class);

    public MyStepdefs() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    
    @After
    public void poScenariuszu() {
        driver.close();
    }

    @Mając("^wyświetloną główną stronę sklepu$")
    public void wyświetlonąGłównąStronęSklepu() throws Throwable {
        driver.get(baseUrl);
    }

    @Kiedy("^kliknę w link \"([^\"]*)\"$")
    public void kliknęWLink(String arg0) throws Throwable {
        driver.findElement(By.linkText(arg0)).click();
    }

    @Wtedy("^zostanie wyświetlona strona o tytule \"([^\"]*)\"$")
    public void zostanieWyświetlonaStronaOTytule(String arg0) throws Throwable {
        Assert.assertEquals("Zły tytuł strony", arg0, driver.getTitle());
    }

    @I("^bedzie zawierała pola formularza kontaktu$")
    public void bedzieZawierałaPolaFormularzaKontaktu() throws Throwable {
        Assert.assertTrue("Nie wyswietlono pola Subject Heading", page.getSubjectHeading().isEnabled());
        Assert.assertTrue("Nie wyswietlono pola email address", page.getEmail().isDisplayed());
        Assert.assertTrue("Nie wyswietlono pola order reference", page.getOrderReference().isDisplayed());
        Assert.assertTrue("Nie wyswietlono pola message", page.getMessage().isDisplayed());
        Assert.assertTrue("Nie wyswietlono przycisku submit", page.getSubmit().isDisplayed());
    }

    @I("^z pola subject heading wybiorę opcję \"([^\"]*)\"$")
    public void zPolaSubjectHeadingWybioręOpcję(String arg0) throws Throwable {
        new Select(page.getSubjectHeading()).selectByVisibleText(arg0);
    }

    @Wtedy("^Zostanie wyświetlona podpowiedź: For any question about a product, an order$")
    public void zostanieWyświetlonaPodpowiedźForAnyQuestionAboutAProductAnOrder() throws Throwable {
        Assert.assertTrue("Nie wysświetlono podpowiedzi - customer service", page.getDesc_contact2().isDisplayed());
        Assert.assertEquals("Zły tekst podpowiedzi - customer service", "For any question about a product, an order", page.getDesc_contact2().getText());
    }

    @Wtedy("^Zostanie wyświetlona podpowiedź: If a technical problem occurs on this website$")
    public void zostanieWyświetlonaPodpowiedźIfATechnicalProblemOccursOnThisWebsite() throws Throwable {
        Assert.assertTrue("Nie wysświetlono podpowiedzi - webmaster", page.getDesc_contact1().isDisplayed());
        Assert.assertEquals("Zły tekst podpowiedzi - webmaster", "If a technical problem occurs on this website", page.getDesc_contact1().getText());
    }

    @Oraz("^W polu email wpiszę \"([^\"]*)\"$")
    public void wPoluEmailWpiszę(String arg0) throws Throwable {
        page.getEmail().sendKeys(arg0);
    }

    @Oraz("^W polu message wpiszę \"([^\"]*)\"$")
    public void wPoluMessageWpiszę(String arg0) throws Throwable {
        page.getMessage().sendKeys(arg0);
    }

    @I("^Klikne przycisk submit$")
    public void kliknePrzyciskSubmit() throws Throwable {
        page.getSubmit().click();
    }

    @Wtedy("^Zostanie wyświetlona informacja o błędzie \"([^\"]*)\"$")
    public void zostanieWyświetlonaInformacjaOBłędzie(String arg0) throws Throwable {
        Assert.assertTrue("Nie wyswietlono informacji o bledzie", page.getBlad().isDisplayed());
        Assert.assertEquals("Zły komunikat o błędzie", arg0, page.getBlad().getText());
    }

    @Wtedy("^Zostanie wyświetlona informacja o wysłaniu formularza$")
    public void zostanieWyświetlonaInformacjaOWysłaniuFormularza() throws Throwable {
        Assert.assertTrue("Nie wyswietlono informacji o sukcesie", page.getSukces().isDisplayed());
        Assert.assertEquals("Zły komunikat o sukcesie", "Your message has been successfully sent to our team.", page.getSukces().getText());
    }

    @I("^zostanie wyświetlone pole do wprowadzania loginu$")
    public void zostanieWyświetlonePoleDoWprowadzaniaLoginu() throws Throwable {
        Assert.assertTrue("Nie wyświetlono pola loginu", page.getEmail().isDisplayed());
    }

    @I("^zostanie wyświetlone pole do wprowadzania hasła$")
    public void zostanieWyświetlonePoleDoWprowadzaniaHasła() throws Throwable {
        Assert.assertTrue("Nie wyświetlono pola hasla", page.getPassword().isDisplayed());
    }

    @I("^zostanie wyświetlony przycisk do logowania$")
    public void zostanieWyświetlonyPrzyciskDoLogowania() throws Throwable {
        Assert.assertTrue("Nie wyświetlono przycisku logowania", page.getSignIn().isDisplayed());
    }

    @Kiedy("^jako adres podstrony wpiszę \"([^\"]*)\"$")
    public void jakoAdresPodstronyWpiszę(String arg0) throws Throwable {
        driver.get(baseUrl + arg0);
    }

    @I("^w polu login wpiszę \"([^\"]*)\"$")
    public void wPoluLoginWpiszę(String arg0) throws Throwable {
        page.getEmail().sendKeys(arg0);
    }

    @I("^w polu haslo wpiszę \"([^\"]*)\"$")
    public void wPoluHasloWpiszę(String arg0) throws Throwable {
        page.getPassword().sendKeys(arg0);
    }

    @I("^kliknę w przycisk Sign in$")
    public void kliknęWPrzyciskSignIn() throws Throwable {
        page.getSignIn().click();
    }

    @I("^wybiorę z pola Sort by wartość \"([^\"]*)\"$")
    public void wybioręZPolaSortByWartość(String arg0) throws Throwable {
        new Select(page.getSortBy()).selectByVisibleText(arg0);
    }

    @Wtedy("^produkty bedą posortowane po cenie rosnąco$")
    public void produktyBedąPosortowanePoCenieRosnąco() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Wtedy("^produkty bedą posortowane po cenie malejąco$")
    public void produktyBedąPosortowanePoCenieMalejąco() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
