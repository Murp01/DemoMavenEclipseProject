Feature: Accordian Widget
Description

Background: Opens on the homepage
	Given the user is on the homepage
	
Scenario: Open each accordian topic
	Given clicks on the "About Us" link in the primary navigation
	And locates the accordian widget
	When clicking on the "third" topic
	
	