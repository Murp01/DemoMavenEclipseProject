@Firstfeature
Feature: Single Stacked Tab


Scenario: Open all stacked tabs DT
	Given the user is on the Careers homepage
	And clicking on "Meet Us" from "Title01"
	And clicking on "Our opportunities" from "Title01"
	And clicking on "Our people" from "Title01"
	And clicking on "Commercial Awareness" from "Title01"
	And clicking on "Our Work" from "Title01"
	And clicking on "Your Career" from "Title01"
	And clicking on "Your Application" from "Title01"
	And clicking on "Our Deals" from "Title01"
	And clicking on "Why Join" from "Title01"
	And clicking on "Who we are" from "Title01"

#use data table for above	
 
@Trythis 
Scenario Outline: Open all stacked tabs
	Given the user is on the Careers homepage
	And clicking on <SecNavTitle> from "Title01"
	Examples:
	|SecNavTitle|
	|Meet Us|
	|Our opportunities|
	|Our people|
	
