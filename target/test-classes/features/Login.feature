Feature: Application Login

Scenario Outline: Home page default login
Given Initialize the browser
And Navigate to "http://qaclickacademy.com" Site
And Click on Login link on home page to land on secure sign in page
When User enters <username> and <password> and logs in
Then Verify that user is successfully logged in
And Close all browsers

Examples:
|username					|password		|
|saranshchitnis@gmail.com   |saransh1985	|
|saransh@gmail.com   		|saransh1987	|

