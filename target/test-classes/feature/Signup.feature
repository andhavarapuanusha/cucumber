Feature: furniture
Scenario: signup

When setting driver
Then setting the url;
Then tab on trackorder
And tab on loginbutton
Then tab on signup 
Then send the email as "anushaandhavarapu2@gmail.com" and password as "Anusha@123"
And tab on submit button
Then closing the driver