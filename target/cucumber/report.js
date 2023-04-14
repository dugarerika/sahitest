$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Calendar.feature");
formatter.feature({
  "line": 1,
  "name": "Calendar - Create Booking",
  "description": "",
  "id": "calendar---create-booking",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User should be able to access to the calendar section",
  "description": "",
  "id": "calendar---create-booking;user-should-be-able-to-access-to-the-calendar-section",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on the vendor login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user login into the vendor with Admin credentials",
  "rows": [
    {
      "cells": [
        "Email",
        "Password"
      ],
      "line": 6
    },
    {
      "cells": [
        "testsalon",
        "testsalon1o"
      ],
      "line": 7
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the user clicks on the calendar icon",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user has access to the calendar section",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});