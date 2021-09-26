Feature: furniture
Scenario: login

When driver is set
Then send the url
Then click on tractorder
And click on login button
Then give emailaddress as "anushaandhavarapu2@gmail.com" and password as "Anusha@123"
And click on submit button
Then close driver tab