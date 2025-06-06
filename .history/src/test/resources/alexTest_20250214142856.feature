Feature: Navigation Bar
    To see the subpages
    Without logging in
    I can click the navigation bar links

    Scenario Outline: I can access the subpages through the navigation bar
        Given I navigate to www.globalsqa.com
        When I go to <section> using the navigation bar

        Examples:
            | section   |
            | Tabs      |         

    Scenario: Enter to 'List Of CheatSheets'
         Given I navigate to www.globalsqa.com
         When I go to Tabs using the navigation bar       

    @Simple
    Scenario: Users can select Simple List option 
        Given I navigate to www.globalsqa.com
        When I select DropDown Button
        Then I can validate the option in the country page    