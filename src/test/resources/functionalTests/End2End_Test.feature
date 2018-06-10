Feature: Automated End2End Tests
Description:

Scenario: Open Insights article detail page
	Given the user is on the homepage
	And clicks on Insights on the title header
	When the user enters a search term into the Insights Keywords field
	And filtered Insights articles appear
	And clicks Read More on Insights article
	Then Insight article detail page opens


