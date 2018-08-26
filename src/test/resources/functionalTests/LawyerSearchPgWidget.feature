Feature: Lawyer Search Page Widget
Description:

#Assert renames needs work
Scenario: Find people dropdown search
	Given the user is on the homepage
	And clicks on the "Find People" link in the primary navigation
	And Types "Paul" into the name input field
	And asserts all returned profiles names contain the word "Paul"
		
#Assert renames needs work
Scenario: Ensure legal text appears for lawyer based in Tokyo
	Given the user is on the homepage
	And clicks on the "Find People" link in the primary navigation
	And Types "michael" into the name input field
	And clicks on each occurance of the Load More button
	And then asserts all returned profiles names contain the word "michael"
	
Scenario: Ensure search failure message appears when search term does not return a profile
	Given the user is on the homepage
	And clicks on the "Find People" link in the primary navigation
	And Types "akakupapa" into the name input field
	Then asserts a message is displayed stating the search retrieved no results