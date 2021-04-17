Feature: Create Lead functionality in Leaftaps


#Background:
#Given Open the browser
#And Load the application url as 'http://leaftaps.com/opentaps/control/main'
@Smoke
Scenario Outline: Create Lead with only mandatory fields
#Given Enter the username as 'DemoSalesManager'
#And Enter the password as 'crmsfa'
#When Click on the Login button
#Then The HomePage should be displayed
#When Click on crmsfa link
#And Click on Leads link 
And Click Create Lead link
And Enter company name as "<companyName>"
And Enter first name as "<firstName>"
And Enter last name as "<lastName>"
When Click the Create Lead button
Then LeadPage should be displayed

Examples:
|companyName|firstName|lastName|
|TestLeaf|Hari|Krishnan|

