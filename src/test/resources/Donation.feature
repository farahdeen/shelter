Feature: donation

  @testing-donation

  Scenario: testing donation
Given landing on shelter homepage
    When click england
    Then verify the page
    When i click donate
    Then verify donation page
    And click donate once
    And click 10 pound
    And click donate
    Then verify the navigation of customer detail page
    And enter email address in the text box "deensfr@hotamill.com"
    And select title mr
      And enter first name "mohamed"
        And enter second name "deen"
      And enter mobile number"number"
      And enter 1st address "65 ruskin avenue"
      And enter city "manor park"
      And enter postcode "e12 6pl"
      And select united kingdom from drop box
      And select no in all option for updates
      And click gift aid option to reclaim tax
      And click paypal option for payments
      Then verify popup paypal redirect link
      And click paypal link



