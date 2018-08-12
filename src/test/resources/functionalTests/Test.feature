Feature: Test feature
Description:

@Trythis
Scenario: Find people dropdown search
	Given the user is on the homepage
	And clicks on the "Find People" link in the primary navigation
	And Types "akaka" into the name input field
	And asserts all returned profiles names contain the word "akaka"







	
	
	