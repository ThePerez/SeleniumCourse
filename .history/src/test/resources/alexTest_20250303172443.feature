@Navigation
Feature: Navigation Bar
    To see the subpages
    Without logging in
    I can click the navigation bar links

    Background: I am on the Globalsqa Web 
        Given I navigate to www.globalsqa.com


    Scenario Outline: The User can access the subpages through the navigation bar
        When I go to <sectionLink> using the navigation bar

        Examples:
            | sectionLink   |
            | Tabs          | 
            | Slider        | 
            | ToolTip       |
    @List
    Scenario: Enter to 'List Of CheatSheets'
         When I go to Tabs using the navigation bar
         And Select Sortable option

    @Simple
    Scenario: Users can selects Simple List option 
        When The User selects DropDown Button
        Then I can validate the option in the country page  
