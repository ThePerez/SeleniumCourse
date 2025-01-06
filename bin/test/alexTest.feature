Feature: Navigation Bar
    To see the subpages
    Without logging in
    I can click the navigation bar links

# Scenario Outline: I can access the subpages through the navigation bar
#     Given I navigate to www.globalsqa.com
#     When I go to <section> using the navigation bar
#     Examples:
#         | section   |
#         | Tabs      |
#         | Slider    |
#         | Toottip   |
  
Scenario: Enter to 'How to debug with Android Studio'
    Given I navigate to www.globalsqa.com
    When I go to CheatSheets using the navigation bar
    And Select SQL Cheat Sheet