$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("P:/Praveen/CurieBDDCucucmberFramework/src/main/java/CurieBDDLogin/BDDLogin2.feature");
formatter.feature({
  "line": 1,
  "name": "BDDCuucmberLoginFeature",
  "description": "",
  "id": "bddcuucmberloginfeature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "BDD Login Scenario",
  "description": "",
  "id": "bddcuucmberloginfeature;bdd-login-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Url of application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "url is opened",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user user clicks Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "bddcuucmberloginfeature;bdd-login-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "bddcuucmberloginfeature;bdd-login-scenario;;1"
    },
    {
      "cells": [
        "amit@gmail.com",
        "amit123"
      ],
      "line": 13,
      "id": "bddcuucmberloginfeature;bdd-login-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "BDD Login Scenario",
  "description": "",
  "id": "bddcuucmberloginfeature;bdd-login-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Url of application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "url is opened",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter \"amit@gmail.com\" and \"amit123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user user clicks Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginBDDStepDefinition.url_of_app()"
});
formatter.result({
  "duration": 9134486000,
  "status": "passed"
});
formatter.match({
  "location": "LoginBDDStepDefinition.url_is_opened()"
});
formatter.result({
  "duration": 8815100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "amit@gmail.com",
      "offset": 12
    },
    {
      "val": "amit123",
      "offset": 33
    }
  ],
  "location": "LoginBDDStepDefinition.user_enter_and(String,String)"
});
formatter.result({
  "duration": 264930100,
  "status": "passed"
});
formatter.match({
  "location": "LoginBDDStepDefinition.user_user_clicks_Login_button()"
});
formatter.result({
  "duration": 76424800,
  "status": "passed"
});
formatter.match({
  "location": "LoginBDDStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 6238400,
  "status": "passed"
});
});