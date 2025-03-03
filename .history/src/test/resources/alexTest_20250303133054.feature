@Navigation
Feature: Navigation Bar
    To see the subpages
    Without logging in
    I can click the navigation bar links

    Background: I am on the Globalsqa Web 
        Given I navigate to www.globalsqa.com


    Scenario Outline: I can access the subpages through the navigation bar
        When I go to <sectionLink> using the navigation bar

        Examples:
            | sectionLink   |
            | Tabs      |  
              
    @List
    Scenario: Enter to 'List Of CheatSheets'
         When I go to Tabs using the navigation bar
         And Select Sortable option

    @Simple
    Scenario: Users can select Simple List option 
        When I select DropDown Button
        Then I can validate the option in the country page    
