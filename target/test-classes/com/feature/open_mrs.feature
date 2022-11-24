Feature: Checking whether it is possible to schedule patient visit through OpenMRS web application

  
Scenario Outline: Login and check whether app is getting navigated to Dashboard page
Given Given Launch the OpenMRS login URL
When Enter the username
And Enter the password
And Pick any location for the session
And Click on login button
Then Verify whether webpage is getting navigated to dashboard page



Given Click on Register a patient menu
When Enter your first name and family name and click on next button
And Select the patient's gender and click on next button
And Enter the patient's DOB and click on next button
And Enter the patient's address and click on next button
And Enter the patient's phone number and click on next button
And Click on confirm
Then Verify whether all the details are stored correctly and also verify whether age is also displayed correctly

 
When Click on start a visit
And Confirm your visit by clicking on yes button


Given Click on attachment 
When Upload your file and give a caption
And Click on upload file button
Then Verify toaster message is displayed for the successful attachment


Then Verify attachment session has the attachment

 
Then Verfiy Recent Visit has one entry for current date with Attachment Upload tag.

 
Given Click on end visit 
When Confirm by clicking on yes


Given Click on start visit
When Confirm by clicking on yes
And Click on Capture Vitals menu
And Enter your height in cm
And Enter your weight in kg
And Shows the Patient's BMI
Then Verify whether BMI is displayed properly using BMI formula <height> and <weight> Click on SAVE button

 
Given Click on END VISIT and confirm
When Redirect to Patient details page
Then Verfiy Recent Visit has one more new entry for current date with Vitals tag.


Given Click on merge visits
When select these two visit 
And click on Merge Selected Visits button.
And patient details page
Then Verfiy Recent Visit has become one entry for current date with Vitals,Attachment Upload tag

Given Click on Add Past Visit
Then verify the future date is not clickable in the date picker.


 
When Click on Delete Patient
And Provide the reason
And Click on confirm button
Then verify the toaster message.  


Given It will redirect you to Find Patient Record menu 
Then Verify the deleted patient should not listed out in the table using search options.
 

Examples:
|height|weight|
|168|89|






    