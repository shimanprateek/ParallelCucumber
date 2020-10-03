$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/shima/workspace/ParalleltestingCucumber/src/test/java/Features/test3.feature");
formatter.feature({
  "line": 2,
  "name": "LogIn to Facebook Session3",
  "description": "",
  "id": "login-to-facebook-session3",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke3"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 11,
      "value": "#When I login with credentials"
    },
    {
      "line": 12,
      "value": "#Then I logout"
    }
  ],
  "line": 14,
  "name": "ALogInOtherOther",
  "description": "",
  "id": "login-to-facebook-session3;aloginotherother",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I am on facebook page \"Chrome\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 23
    }
  ],
  "location": "facebookdetails.i_am_on_facebook_page(String)"
});
formatter.result({
  "duration": 14017951300,
  "status": "passed"
});
formatter.after({
  "duration": 1743794100,
  "status": "passed"
});
});