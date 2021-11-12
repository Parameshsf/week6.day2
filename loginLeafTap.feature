@leadsLogin # This tag denotes to execute lead functionality feature file
Feature: Login to Leaftap application
# Background helps to execute the line of codes as a precondition for each scenarios created
# Once Hooks implementation class is created then Background section is not required

#Background:
#Given launch the chrome browser
#And Enter the URL of leaftap application 'http://leaftaps.com/opentaps/control/main'

# Scenario 1: Login to Leaf Tap application
@smoke
Scenario: Login with Positive login credentials
Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When Click the login button
Then home page should be displayed

@regression
#Scenario 2: Login with negative credentials
Scenario: Login with negative login credentials
Given Enter the username as 'Demoda'
And Enter the password as 'crmsfada'
When Click the login button
But error message should be displayed

@functional
#Scenario 3: Pass multiple data variables
Scenario Outline: Login with multiple data credentials
Given Enter the username as <username>
And Enter the password as <password>
When Click the login button
Then home page should be displayed


Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|
