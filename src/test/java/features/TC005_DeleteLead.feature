Feature: Delete Lead functionality in Leaftaps



Scenario Outline: Delete Lead in Leaftaps
Given Click Find Leads Link for Delete
And Clicked the Phone number for Delete
And Entered the phone number for Delete "<phNo>"
And CLicks the find link button for Delete
And Get the first link details for Delete
And Click the Delete button
And Clicking the findLeads link again
And Enter the lead ID
When Clicking the findLead button again
Then No records found should display

Examples:
|phNo|
|9|