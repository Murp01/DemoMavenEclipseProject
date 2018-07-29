Feature: Test feature
Description:

@Trythis
Scenario: Click on all people module profiles
	Given the user is on the homepage
	And clicks on the "About Us" link in the primary navigation
	And asserts people widget is visible on the page
	And clicks on the "first" characters profile 
	#Try capturing name text for profile first and assert it matches a string, then click, then assert the name is on page




	
	
	