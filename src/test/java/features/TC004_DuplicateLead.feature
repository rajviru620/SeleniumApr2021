Feature: Duplicate Lead functionality in Leaftaps



Scenario Outline: Duplicate Lead in Leaftaps
Given Clicked Find Leads Link
And Clicked the Phone number
And Entered the phone number "<phNo>"
And CLicks the find link button
And clicks the first link
And Click the Duplicate button
When clicking the submit button
Then DupLead page should display

Examples:
|phNo|
|9|