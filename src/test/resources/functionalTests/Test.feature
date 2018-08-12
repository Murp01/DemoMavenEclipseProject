Feature: Test feature
Description:

@Trythis
Scenario: Find people dropdown search
	Given the user is on the homepage
	And clicks on the "Find People" link in the primary navigation
	And Types "ian" into the name input field
	And asserts all returned profiles names contain the word "ian"
	
	
Scenario: Ensure legal text appears for lawyer based in Tokyo
	Given the user is on the homepage
	And clicks on the "Find People" link in the primary navigation
	And Types "Paul" into the name input field
	
Scenario: Ensure search failure message appears when search term does not return a profile
	Given the user is on the homepage
	And clicks on the "Find People" link in the primary navigation
	And Types "akakupapa" into the name input field







	
	
	