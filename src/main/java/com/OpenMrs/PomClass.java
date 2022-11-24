package com.OpenMrs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {

	private WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getInpatientoption() {
		return inpatientoption;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getLoggedmessage() {
		return loggedmessage;
	}
	public WebElement getRegisterpatient() {
		return registerpatient;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getFamilyname() {
		return familyname;
	}
	public WebElement getNextbutton() {
		return nextbutton;
	}
	public WebElement getGenderDrop() {
		return genderDrop;
	}
	public WebElement getBirthdate() {
		return birthdate;
	}
	public WebElement getBirthMonthDrop() {
		return birthMonthDrop;
	}
	public WebElement getBirthYear() {
		return birthYear;
	}
	public WebElement getAddress1() {
		return address1;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getPinCode() {
		return pinCode;
	}
	public WebElement getMobNum() {
		return mobNum;
	}
	public WebElement getRegisterCnfrmButton() {
		return registerCnfrmButton;
	}
	public WebElement getNamePresent() {
		return namePresent;
	}
	public WebElement getGenderPresent() {
		return genderPresent;
	}
	public WebElement getDobPresent() {
		return dobPresent;
	}
	public WebElement getAddressPresent() {
		return addressPresent;
	}
	public WebElement getNumPresent() {
		return numPresent;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	public WebElement getPageElement() {
		return pageElement;
	}
	public WebElement getAgeVerification() {
		return ageVerification;
	}
	public WebElement getStartVisit1() {
		return startVisit1;
	}
	public WebElement getConfrmstartVisit() {
		return confrmstartVisit;
	}
	public WebElement getAttachment() {
		return attachment;
	}
	public WebElement getDropBox() {
		return dropBox;
	}
	public WebElement getCaptionBox() {
		return captionBox;
	}
	public WebElement getUploadbutton() {
		return uploadbutton;
	}
	public WebElement getHomeReDirectionButton() {
		return homeReDirectionButton;
	}
	public WebElement getAttachmentplace() {
		return attachmentplace;
	}
	public WebElement getDateValidation() {
		return dateValidation;
	}
	public WebElement getEndVisit1() {
		return endVisit1;
	}
	public WebElement getEndVisitCnfrmbut() {
		return endVisitCnfrmbut;
	}
	public WebElement getStartvisitagain() {
		return startvisitagain;
	}
	public WebElement getVisitagaincnfrm() {
		return visitagaincnfrm;
	}
	public WebElement getAddvitals() {
		return addvitals;
	}
	public WebElement getHeightinput() {
		return heightinput;
	}
	public WebElement getWeightinput() {
		return weightinput;
	}
	public WebElement getCalculatedbmi() {
		return calculatedbmi;
	}
	public WebElement getSaveformbut() {
		return saveformbut;
	}
	public WebElement getSaveformsubmitbut() {
		return saveformsubmitbut;
	}
	public WebElement getEndvisit2() {
		return endvisit2;
	}
	public WebElement getEndvisit2cnfrm() {
		return endvisit2cnfrm;
	}
	public WebElement getCurrentdate2() {
		return currentdate2;
	}
	public WebElement getVitalTag() {
		return vitalTag;
	}
	public WebElement getMergebut() {
		return mergebut;
	}
	public WebElement getCheckbox1() {
		return checkbox1;
	}
	public WebElement getCheckbox2() {
		return checkbox2;
	}
	public WebElement getMerge() {
		return merge;
	}
	public WebElement getReturnTOHome() {
		return returnTOHome;
	}
	public WebElement getPastVisit() {
		return pastVisit;
	}
	public WebElement getDate() {
		return date;
	}
	public WebElement getGettingId() {
		return gettingId;
	}
	public WebElement getClickDelete() {
		return clickDelete;
	}
	public WebElement getPassdeteleReason() {
		return passdeteleReason;
	}
	public WebElement getDeleteCnfrmButton() {
		return deleteCnfrmButton;
	}
	public WebElement getSearchingId() {
		return searchingId;
	}
	@FindBy(name = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id="Inpatient Ward")
	private WebElement inpatientoption;
	@FindBy(id ="loginButton" )
	private WebElement login;
	@FindBy(xpath = "//h4[contains(text(),'Logged')]")
	private WebElement loggedmessage;
	@FindBy(id = "referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")
	private WebElement registerpatient;
	@FindBy(name = "givenName")
	private WebElement name;
	@FindBy(name ="familyName" )
	private WebElement familyname;
	@FindBy(id = "next-button")
	private WebElement nextbutton;
	@FindBy(id = "gender-field")
	private WebElement genderDrop;
	@FindBy(name = "birthdateDay")
	private WebElement birthdate;
	@FindBy(name="birthdateMonth")
	private WebElement birthMonthDrop;
	@FindBy(name = "birthdateYear")
	private WebElement birthYear;
	@FindBy(id ="address1" )
	private WebElement address1;
	@FindBy(id = "cityVillage")
	private WebElement city;
	@FindBy(id ="stateProvince" )
	private WebElement state;
	@FindBy(id ="country" )
	private WebElement country;
	@FindBy(id ="postalCode" )
	private WebElement pinCode;
	@FindBy(name ="phoneNumber" )
	private WebElement mobNum;
	@FindBy(id ="confirmation_label" )
	private WebElement registerCnfrmButton;
	@FindBy(xpath ="//p[contains(text(),'Gowtham')]" )
	private WebElement namePresent;
	@FindBy(xpath ="//p[contains(text(),'Male')]" )
	private WebElement genderPresent;
	@FindBy(xpath ="//p[contains(text(),'June')]" )
	private WebElement dobPresent;
	@FindBy(xpath ="//p[contains(text(),'Pollachi')]" )
	private WebElement addressPresent;
	@FindBy(xpath = "//p[contains(text(),'93')]")
	private WebElement numPresent;
	@FindBy(id = "submit")
	private WebElement submitButton;
	@FindBy(xpath ="//h3[text()='General Actions']" )
	private WebElement pageElement;
	@FindBy(xpath ="//span[contains(text(),'28 year')]" )
	private WebElement ageVerification;
	@FindBy(xpath = "(//div[@class='col-11 col-lg-10'])[1]")
	private WebElement startVisit1;
	@FindBy(id = "start-visit-with-visittype-confirm")
	private WebElement confrmstartVisit;
	@FindBy(id ="attachments.attachments.visitActions.default" )
	private WebElement attachment;
	@FindBy(xpath ="//form[@class='dropzone ng-pristine ng-valid dz-clickable']" )
	private WebElement dropBox;
	@FindBy(xpath ="//textarea[@class='ng-pristine ng-untouched ng-valid ng-empty']" )
	private WebElement captionBox;
	@FindBy(xpath ="//button[text()='Upload file']" )
	private WebElement uploadbutton;
	@FindBy(xpath ="//span[@class='PersonName-givenName']" )
	private WebElement homeReDirectionButton;
	@FindBy(xpath ="(//div[@class='ng-scope'])[3]" )
	private WebElement attachmentplace;
	@FindBy(xpath ="//a[contains(text(),'Nov')]" )
	private WebElement dateValidation;
	@FindBy(xpath = "(//div[contains(text(),'End')])[1]")
	private WebElement endVisit1;
	@FindBy(xpath = "(//button[text()='Yes'])[2]")
	private WebElement endVisitCnfrmbut;
	@FindBy(xpath = "(//div[@class='col-11 col-lg-10'])[1]")
	private WebElement startvisitagain;
	@FindBy(id ="start-visit-with-visittype-confirm" )
	private WebElement visitagaincnfrm;
	@FindBy(xpath = "(//a[@class='button task activelist'])[4]")
	private WebElement addvitals;
	@FindBy(id = "w8")
	private WebElement heightinput;
	@FindBy(id ="w10" )
	private WebElement weightinput;
	@FindBy(xpath ="//span[@id='calculated-bmi']" )
	private WebElement calculatedbmi;
	@FindBy(id = "save-form")
	private WebElement saveformbut;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveformsubmitbut;
	@FindBy(xpath = "(//a[@class='button task activelist'])[1]")
	private WebElement endvisit2;
	@FindBy(xpath ="(//button[text()='Yes'])[3]" )
	private WebElement endvisit2cnfrm;
	@FindBy(xpath = "(//a[@class='ng-binding'])[1]")
	private WebElement currentdate2;
	@FindBy(xpath = "//div[@class='tag ng-binding ng-scope']")
	private WebElement vitalTag;
	@FindBy(xpath = "(//div[@class='col-11 col-lg-10'])[3]")
	private WebElement mergebut;
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement checkbox1;
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkbox2;
	@FindBy(id = "mergeVisitsBtn")
	private WebElement merge;
	@FindBy(xpath = "//input[@type='button']")
	private WebElement returnTOHome;
	@FindBy(xpath = "(//div[@class='col-11 col-lg-10'])[2]")
	private WebElement pastVisit;
	@FindBy(xpath = "(//td[@class='day disabled' and text()='30'])[1]")
	private WebElement date;
	@FindBy(xpath = "//div[@class='float-sm-right']/span")
	private WebElement gettingId;
	@FindBy(xpath = "(//div[@class='col-11 col-lg-10'])[8]")
	private WebElement clickDelete;
	@FindBy(id = "delete-reason")
	private WebElement passdeteleReason;
	@FindBy(xpath = "(//button[@class='confirm right'])[6]")
	private WebElement deleteCnfrmButton;
	@FindBy(xpath = "//div[@class='toast-item toast-type-success']")
	private WebElement deletepop;
	public WebElement getDeletepop() {
		return deletepop;
	}
	
	@FindBy(id = "patient-search")
	private WebElement searchingId;
	@FindBy(xpath = "//table/tbody/tr/td")
	private WebElement table;
	public WebElement getTable() {
		return table;
	}
	
	public PomClass(WebDriver driver1) {
    this.driver=driver1;
    PageFactory.initElements(driver1, this);
	}
}
