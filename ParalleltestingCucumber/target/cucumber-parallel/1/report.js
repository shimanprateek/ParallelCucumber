$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/shima/workspace/ParalleltestingCucumber/src/test/java/Features/test2.feature");
formatter.feature({
  "line": 2,
  "name": "LogIn to Facebook Session2",
  "description": "",
  "id": "login-to-facebook-session2",
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
  "name": "LogIn in test2",
  "description": "",
  "id": "login-to-facebook-session2;login-in-test2",
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
  "duration": 19217264200,
  "status": "passed"
});
formatter.after({
  "duration": 1221906100,
  "status": "passed"
});
});