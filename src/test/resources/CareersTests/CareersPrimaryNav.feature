Feature: Primary Navigation

Scenario: Click on each primary navigation title
	Given the user is on the Careers homepage
	When clicking on the "Title03" title from the careers primary navigation
	Then "Title03" careers page is open

Scenario: Select languages from the primary navigation
	Given the user is on the Careers homepage
	When "Location01" is selected from the location select drop down box
