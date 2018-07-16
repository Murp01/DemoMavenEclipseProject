@Firstfeature
Feature: Primary Navigation
	
Scenario: Click on Linklaters home button
	Given the user is on the Careers homepage
	And clicking on the "Title03" title from the careers primary navigation
	When clicking on the Linklaters home button		
	Then the user is on the Careers homepage
		
Scenario: Click on Linklaters home button for each language
	Given the user is on the Careers homepage
	When "Location01" is selected from the location select drop down box
	Then the "Location01" version of the site will be opened
		
Scenario: Click on each primary navigation title
	Given the user is on the Careers homepage
	When clicking on the "Title03" title from the careers primary navigation
	Then "Title03" careers page is open
	And clicking on the Linklaters home button		
		
Scenario: Select languages from the primary navigation
	Given the user is on the Careers homepage
	When "Location01" is selected from the location select drop down box
	Then the "Location01" version of the site will be opened
		
@Trythis
Scenario: Apply for an Early Careers role
	Given the user is on the Careers homepage

