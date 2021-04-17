Feature: Edit Lead functionality in Leaftaps



Scenario Outline: Edit Lead in Leaftaps
Given Clicking Find Leads Link
And Click the Phone number
And Enter the phone number "<phNo>"
And CLicking the find link button
And clicked the first link
And Click the Edit button
And Update the company name "<companyName>"
When click the submit button
Then Lead page should display

Examples:
|phNo|companyName|
|9|TestLeaf|