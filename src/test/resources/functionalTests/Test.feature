Feature: Test feature
Description:

@Trythis	
Scenario: Site search bar
	Given the user is on the homepage
	And clicks on the the site search magnify button
	And asserts the site search bar appears
	And types "Paul" into the site search bar
	And asserts the search results generate below the site search bar
	When clicks on the "" search result
	Then asserts the "" page will open












	
	
	