$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test2.feature");
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
formatter.step({
  "line": 6,
  "name": "I login with credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I logout",
  "keyword": "Then "
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
  "duration": 15689247200,
  "status": "passed"
});
formatter.match({
  "location": "facebookdetails.i_login_with_credentials()"
});
formatter.result({
  "duration": 29800,
  "status": "passed"
});
formatter.match({
  "location": "facebookdetails.i_logout()"
});
formatter.result({
  "duration": 1564946200,
  "status": "passed"
});
});