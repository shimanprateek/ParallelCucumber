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
  "line": 4,
  "name": "LogIn",
  "description": "",
  "id": "login-to-facebook-session3;login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
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
  "duration": 18419978800,
  "status": "passed"
});
formatter.after({
  "duration": 1523640800,
  "status": "passed"
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
  "duration": 13627412900,
  "status": "passed"
});
formatter.after({
  "duration": 1052484500,
  "status": "passed"
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
  "duration": 13981739800,
  "status": "passed"
});
formatter.after({
  "duration": 996183600,
  "status": "passed"
});
});