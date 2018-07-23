@Firstfeature
Feature: Accordion Widget

@Trythis 
Scenario: Open accordion widget
	Given the user is on the Careers homepage
	And clicking on "Our opportunities" from "Title01"
	When clicking on the "first" tab of the accordion widget
	Then the contents of the "first" tab will be displayed below
	When clicking on the "first" tab of the accordion widget
	Then the contents of the "first" tab will be hidden
	When clicking on the "second" tab of the accordion widget
	
	

	
