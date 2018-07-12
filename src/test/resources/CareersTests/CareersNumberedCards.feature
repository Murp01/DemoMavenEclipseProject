Feature: Numbered Cards widget

Scenario: View a step by step numbered card module
	Given the user is on the Careers homepage
	And selects "UK" from the location selector at the top-right of the header banner
	And "UK" will be displayed in the header banner next to the search icon
	And the user opens a page that contains a Step by step numbered card module
	And the Step by step numbered cards will be displayed
	And while on the first tab clicks on the left arrow above the module
	Then the last tab will be selected
	And while on the last tab clicks on the right arrow above the module
	Then the first tab will be selected
	And while on the first tab clicks on the right tab to cycle through all available tabs
	Then each tab will be highlighted and all cards will be displayed in the correct order
	And while on the last tab clicks on the left tab to cycle through all available tabs
	Then each tab will be highlighted and all cards will be displayed in the correct orde
	
Scenario: Click on a link from within a numbered card's description
	Given the user is on the Careers homepage
	And selects "UK" from the location selector at the top-right of the header banner
	And "UK" will be displayed in the header banner next to the search icon
	And the user opens a page that contains a Step by step numbered card module
	And the Step by step numbered cards will be displayed
	When locating a numbered card with a link within the description
	And clicks on the link
	Then the page specified on the link will open
	