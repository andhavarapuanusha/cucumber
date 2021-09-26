Feature: Furniture
Scenario Outline: search products

Given intilize the browser
When navigate to furniture website
Then click on search tab and give the <products>
Then close the browser
Examples:
|products|
|beds|
|study tables|  






