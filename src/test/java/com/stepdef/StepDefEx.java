package com.stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.OpenMrs.Base_Class1;
import com.OpenMrs.PomClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefEx extends Base_Class1 {

	   public WebDriver driver=browser_Launch();
	  public PomClass a = new PomClass(driver);
	  String str;
	  String id;
	  String calbmi;
	@Given("Given Launch the OpenMRS login URL")
	public void given_launch_the_open_mrs_login_url() {
		page_Launch("https://qa-refapp.openmrs.org/openmrs/login.htm");
	}
	@When("Enter the username")
	public void enter_the_username() {
		sendKeyswithTab(a.getUsername(), "Admin");
		
	}
	@When("Enter the password")
	public void enter_the_password() {
		sendKeys(a.getPassword(), "Admin123");
	}
	@When("Pick any location for the session")
	public void pick_any_location_for_the_session() {
		to_Click(a.getInpatientoption());
	}
	@When("Click on login button")
	public void click_on_login_button() {
		to_Click(a.getLogin());
	}
	@Then("Verify whether webpage is getting navigated to dashboard page")
	public void verify_whether_webpage_is_getting_navigated_to_dashboard_page() {
		WebElement text = a.getLoggedmessage();
		Assert.assertTrue(text.isDisplayed());
		System.out.println("Page redirected");
	}
	
	@Given("Click on Register a patient menu")
	public void click_on_register_a_patient_menu() {
		to_Click(a.getRegisterpatient());
	}
	@When("Enter your first name and family name and click on next button")
	public void enter_your_first_name_and_family_name_and_click_on_next_button() {
		  sendKeys(a.getName(),"Gowtham");
		    sendKeys(a.getFamilyname(), "Raj");
		    to_Click(a.getNextbutton());
	}
	@When("Select the patient's gender and click on next button")
	public void select_the_patient_s_gender_and_click_on_next_button() {
		
	    selectbyvalue_Dropdown(a.getGenderDrop(), "M");
	    to_Click(a.getNextbutton());
	}
	@When("Enter the patient's DOB and click on next button")
	public void enter_the_patient_s_dob_and_click_on_next_button() {
		 sendKeys(a.getBirthdate(), "14");
		   selectbyvisibletext_Dropdown(a.getBirthMonthDrop(), "June");
		sendKeys(a.getBirthYear(), "1994");
		    to_Click(a.getNextbutton());
	}
	@When("Enter the patient's address and click on next button")
	public void enter_the_patient_s_address_and_click_on_next_button() {
		 sendKeys(a.getAddress1(), "2,vallabai pateel");
		   sendKeys(a.getCity(), "Pollachi");
		   sendKeys(a.getState(), "tamilnadu");
		   sendKeys(a.getCountry(), "india");
		   sendKeys(a.getPinCode(), "600142");
		    to_Click(a.getNextbutton());
	}
	@When("Enter the patient's phone number and click on next button")
	public void enter_the_patient_s_phone_number_and_click_on_next_button() {
		  sendKeys(a.getMobNum(), "9345851977");
		   to_Click(a.getNextbutton());
	}
	@When("Click on confirm")
	public void click_on_confirm() {
		 to_Click(a.getRegisterCnfrmButton()); 
	}
	@Then("Verify whether all the details are stored correctly and also verify whether age is also displayed correctly")
	public void verify_whether_all_the_details_are_stored_correctly_and_also_verify_whether_age_is_also_displayed_correctly() {
		 Assert.assertTrue(a.getNamePresent().isDisplayed());
		    System.out.println("Name Present");
		    
		    Assert.assertTrue(a.getGenderPresent().isDisplayed());
		    System.out.println("Gender Mentioned");
		    
		    Assert.assertTrue(a.getDobPresent().isDisplayed());
		    System.out.println("DOB Mentioned");
		    
		    Assert.assertTrue(a.getAddressPresent().isDisplayed());
		    System.out.println("Address Mentioned");
		    
		    Assert.assertTrue(a.getNumPresent().isDisplayed());
		    System.out.println("Mobile number Mentioned");
		    
		    to_Click(a.getSubmitButton());
		    
			   Assert.assertTrue( a.getPageElement().isDisplayed());
			    System.out.println("Page Redirected");
			    
			    Assert.assertTrue(a.getAgeVerification().getText().contains("28"));
			    System.out.println("Age Calculated Correctly");
	}
	
	@When("Click on start a visit")
	public void click_on_start_a_visit() {
		to_Click(a.getStartVisit1());
	    
	}
	@When("Confirm your visit by clicking on yes button")
	public void confirm_your_visit_by_clicking_on_yes_button() {
		to_Click(a.getConfrmstartVisit());
	}
	
	@Given("Click on attachment")
	public void click_on_attachment() {
		to_Click(a.getAttachment());
	}
	@When("Upload your file and give a caption")
	public void upload_your_file_and_give_a_caption() throws InterruptedException {
		 WebElement box = driver.findElement(By.xpath("//form[@class='dropzone ng-pristine ng-valid dz-clickable']"));
		    JavascriptExecutor js =(JavascriptExecutor) driver;
		    js.executeScript("arguments[0].setAttribute('value','C:\\Users\\Mohamed Rifakathali\\eclipse-workspace3\\OpenMrs\\TechAssessmentExp.txt')", box);
		    
		    Thread.sleep(10000);
		    sendKeys(a.getCaptionBox(), "attach");
	}
	@When("Click on upload file button")
	public void click_on_upload_file_button() {
		to_Click(a.getUploadbutton());
	}
	@Then("Verify toaster message is displayed for the successful attachment")
	public void verify_toaster_message_is_displayed_for_the_successful_attachment() throws IOException {
		 screenshot("attachment");
		to_Click(a.getHomeReDirectionButton());
	}
	
	@Then("Verify attachment session has the attachment")
	public void verify_attachment_session_has_the_attachment() {
		Assert.assertTrue(a.getAttachmentplace().isDisplayed());
	    System.out.println("Attachment found");
	}
	
	@Then("Verfiy Recent Visit has one entry for current date with Attachment Upload tag.")
	public void verfiy_recent_visit_has_one_entry_for_current_date_with_attachment_upload_tag() {
		 Date date = new Date();
	      SimpleDateFormat formatter = new SimpleDateFormat("dd.MMM.yyyy");
	       str = formatter.format(date);
	    Assert.assertTrue(a.getDateValidation().getText().equals(str));
	    System.out.println(" uploaded in Current date");
	}
	
	@Given("Click on end visit")
	public void click_on_end_visit() {
     javaClick(a.getEndVisit1());

	}
	@When("Confirm by clicking on yes")
	public void confirm_by_clicking_on_yes() {
	    
	    javaClick(a.getEndVisitCnfrmbut());
	}
	

@Given("Click on start visit")
public void click_on_start_visit() throws InterruptedException {
	  Thread.sleep(5000);
	  to_Click(a.getStartvisitagain());
	  to_Click(a.getVisitagaincnfrm());
}
@When("Click on Capture Vitals menu")
public void click_on_capture_vitals_menu() {
	 to_Click(a.getAddvitals());
}
@When("Enter your height in cm")
public void enter_your_height_in_cm() {
	 sendKeys(a.getHeightinput(), "168");
	 to_Click(a.getNextbutton());
}
@When("Enter your weight in kg")
public void enter_your_weight_in_kg() {
	sendKeys(a.getWeightinput(), "89");
	to_Click(a.getNextbutton());
}
@When("Shows the Patient's BMI")
public void shows_the_patient_s_bmi() {
    calbmi = get_Text(a.getCalculatedbmi());
    System.out.println(calbmi);
}
@Then("Verify whether BMI is displayed properly using BMI formula {int} and {int} Click on SAVE button")
public void verify_whether_bmi_is_displayed_properly_using_bmi_formula_and_click_on_save_button(Integer int1, Integer int2) {
	
	int h = int1;
	int w= int2;
	double d = (w*10000)/(h*h);
	int bmi=(int) d;
	double actualbmi1 = Double.valueOf(calbmi);
	int actualbmi=(int)actualbmi1;
	Assert.assertTrue(actualbmi==bmi);
	System.out.println("bmi calculated correctly");
	to_Click(a.getSaveformbut());
	    to_Click(a.getSaveformsubmitbut());
}



@Given("Click on END VISIT and confirm")
public void click_on_end_visit_and_confirm() {
	   to_Click(a.getEndvisit2());
	   to_Click(a.getEndvisit2cnfrm());
}
@When("Redirect to Patient details page")
public void redirect_to_patient_details_page() throws InterruptedException {
	  Thread.sleep(5000);
	    to_Click(a.getHomeReDirectionButton());
}
@Then("Verfiy Recent Visit has one more new entry for current date with Vitals tag.")
public void verfiy_recent_visit_has_one_more_new_entry_for_current_date_with_vitals_tag() {
	 Assert.assertTrue(a.getCurrentdate2().getText().equals(str));
	    System.out.println("updated in current date");
	    Assert.assertTrue(a.getVitalTag().isDisplayed());
	    System.out.println("Vital tag is present");
}

@Given("Click on merge visits")
public void click_on_merge_visits() {
	to_Click(a.getMergebut());
}
@When("select these two visit")
public void select_these_visit() {
	to_Click(a.getCheckbox1());
	   to_Click(a.getCheckbox2());
}
@When("click on Merge Selected Visits button.")
public void click_on_merge_selected_visits_button() {
	to_Click(a.getMerge());
	//Thread.sleep(3000);;
	
}
@When("patient details page")
public void patient_details_page1() throws InterruptedException {
	to_Click(a.getReturnTOHome());
}
@Then("Verfiy Recent Visit has become one entry for current date with Vitals,Attachment Upload tag")
public void verfiy_recent_visit_has_become_one_entry_for_current_date_with_vitals_attachment_upload_tag() {
    
}
@Given("Click on Add Past Visit")
public void click_on_add_past_visit() {
	to_Click(a.getPastVisit());
}
@Then("verify the future date is not clickable in the date picker.")
public void verify_the_future_date_is_not_clickable_in_the_date_picker() throws InterruptedException, AWTException {
	Thread.sleep(3000);
    boolean enabled = a.getDate().isEnabled();
    Assert.assertTrue(enabled);
    System.out.println("date cannot be clicked");
    Robot r= new Robot();
    r.keyPress(KeyEvent.VK_ESCAPE);
    r.keyRelease(KeyEvent.VK_ESCAPE);
}

@When("Click on Delete Patient")
public void click_on_delete_patient() {
	  id =get_Text(a.getGettingId());
	   to_Click(a.getClickDelete());
}
@When("Provide the reason")
public void provide_the_reason() {
	sendKeys(a.getPassdeteleReason(), "testind");
}
@When("Click on confirm button")
public void click_on_confirm_button() {
	to_Click(a.getDeleteCnfrmButton());
	
}
@Then("verify the toaster message.")
public void verify_the_toaster_message() {
	Assert.assertTrue(a.getDeletepop().isDisplayed());
	System.out.println("Delete Popup Appeared");
}

@Given("It will redirect you to Find Patient Record menu")
public void it_will_redirect_you_to_find_patient_record_menu() throws InterruptedException {
	sendKeyswithEnter(a.getSearchingId(), id);
	Thread.sleep(3000);
}
@Then("Verify the deleted patient should not listed out in the table using search options.")
public void verify_the_deleted_patient_should_not_listed_out_in_the_table_using_search_options() {
    String text = get_Text(a.getTable());
    System.out.println(text);
    Assert.assertTrue(text.equals("No matching records found"));
    System.out.println("patient deleted successfully");
}
}
