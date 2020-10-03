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
      "line": 6,
      "value": "#When I login with credentials"
    },
    {
      "line": 7,
      "value": "#Then I logout"
    }
  ],
  "line": 9,
  "name": "BLogInOther",
  "description": "",
  "id": "login-to-facebook-session3;bloginother",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
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
  "duration": 13721418200,
  "status": "passed"
});
formatter.after({
  "duration": 1591231500,
  "status": "passed"
});
});