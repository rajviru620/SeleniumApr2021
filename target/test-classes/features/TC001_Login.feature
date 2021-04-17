Feature: Login into Leaftaps


#Background:
#Given Open the browser
#And Load the application url
#
#Scenario: Login with valid credentials
#Given Enter username as 'DemoSalesManager'
#And Enter password as 'crmsfa'
#When Click on Login button
#Then HomePage should be displayed
#
#Scenario: Login with invalid credentials
#
#Given Enter username as 'DemoCSR'
#And Enter password as 'crmsaf'
#When Click on Login button
#But Error Message should be displayed


Scenario Outline: Login with correct credentials

Given Enter username as <username>
And Enter password as <password>
When Click on Login button
Then HomePage should be displayed

Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|


