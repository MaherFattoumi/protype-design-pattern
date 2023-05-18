Feature: Shape Cache

  Scenario: Clone a circle shape
    Given a loaded shape cache
    When cloning a circle shape
    Then a new circle shape is created

  Scenario: Clone a rectangle shape
    Given a loaded shape cache
    When cloning a rectangle shape
    Then a new rectangle shape is created
