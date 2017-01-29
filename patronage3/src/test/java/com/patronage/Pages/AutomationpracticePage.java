package com.patronage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by przemyslaw.nogaj on 2017-01-29.
 */
public class AutomationpracticePage {
    @FindBy(how = How.CSS, using = "#id_contact")
    private WebElement subjectHeading;

    @FindBy(how = How.ID, using = "email")
    private  WebElement email;

    @FindBy(how = How.ID, using = "id_order")
    private WebElement orderReference;

    @FindBy(how = How.ID, using = "message")
    private WebElement message;

    @FindBy(how = How.ID, using = "submitMessage")
    private WebElement submit;

    @FindBy(how = How.ID, using = "desc_contact1")
    private WebElement desc_contact1;

    @FindBy(how = How.ID, using = "desc_contact2")
    private WebElement desc_contact2;

    @FindBy(how = How.CSS, using = "div.alert.alert-danger > ol > li")
    private WebElement blad;

    @FindBy(how = How.CSS, using = "p.alert.alert-success")
    private WebElement sukces;

    @FindBy(how = How.ID, using = "passwd")
    private WebElement password;

    @FindBy(how = How.ID, using = "SubmitLogin")
    private WebElement signIn;

    @FindBy(how = How.ID, using = "selectProductSort")
    private WebElement sortBy;

    public WebElement getSubjectHeading() {
        return subjectHeading;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getOrderReference() {
        return orderReference;
    }

    public WebElement getMessage() {
        return message;
    }

    public WebElement getSubmit() {
        return submit;
    }

    public WebElement getDesc_contact1() {
        return desc_contact1;
    }

    public WebElement getDesc_contact2() {
        return desc_contact2;
    }

    public WebElement getBlad() {
        return blad;
    }

    public WebElement getSukces() {
        return sukces;
    }


    public WebElement getPassword() {
        return password;
    }

    public WebElement getSignIn() {
        return signIn;
    }

    public WebElement getSortBy() {
        return sortBy;
    }
}
