@createLead #This tag is used to execute feature files having tag as "createLead" 
Feature: Verify Create Lead
#This feature is to execute create lead functionality
@functional @regression
Scenario: Create lead in to leaftap application
Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When Click the login button
Then home page should be displayed
When click CRMSFA link to get in to Home page
And click Leads tab
And click Create Lead link  
And enter the values in the Create Lead Page
And click Create Lead button on the create lead page 