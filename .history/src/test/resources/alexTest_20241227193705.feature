Feature: Navigation Bar
    To see the subpages
    Without logging in
    I can click the navigation bar links

Scenario Outline: I can access the subpages through the navigation bar
    Given I navigate to www.globalsqa.com
    When I go to <section> using the navigation bar
    Examples:
        | section     |
        | about       |
       -- | CheatSheets |
      --  | Free Books  |
     --   | Contact Us  |