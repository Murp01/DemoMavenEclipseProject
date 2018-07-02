Feature: Social Wall

Scenario: filter the contents of the Social wall by Report
	Given the user is on the Careers homepage
	And selects "UK" from the location selector at the top-right of the header banner
	And "UK" will be displayed in the header banner next to the search icon
	And the "UK" Social Wall will be displayed with default filters set 
	When the user clicks on the "Report" filter
	And the Social wall displays only "Report" content.
	And clicking on one of the "Report" tiles
	Then a "Report" details page will open
	When the user clicks on the 'Return' CTA at the bottom of the page
	
Scenario: Scroll through the entirety of the content
	Given the user is on the Careers homepage
	And selects "UK" from the location selector at the top-right of the header banner
	And "UK" will be displayed in the header banner next to the search icon
	And the "UK" Social Wall will be displayed with default filters set
	And there are more than ten tiles on the wall
	When clicking on the Load More button
	Then ten more tiles will appear
	
Scenario: View Twitter feeds from the Social wall
	Given the user is on the Careers homepage
	And selects "UK" from the location selector at the top-right of the header banner
	And "UK" will be displayed in the header banner next to the search icon
	And the "UK" Social Wall will be displayed with default filters set
	When clicking on one of the "TwitterFeed" tiles
	Then a webpage will open on the twitter feed page
