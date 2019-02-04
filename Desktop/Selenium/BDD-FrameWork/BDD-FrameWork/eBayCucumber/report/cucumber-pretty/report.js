$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/nafas/Desktop/sohag/eBayBDD/eBayCucumber/src/test/java/feature/Register.feature");
formatter.feature({
  "line": 2,
  "name": "Register Feature",
  "description": "",
  "id": "register-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Register Feature test",
  "description": "",
  "id": "register-feature;register-feature-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user in the register page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "put first name",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "put last name",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "provide email address",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "give password",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click create account button",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.user_in_the_register_page()"
});
formatter.result({
  "duration": 9663595052,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.put_first_name()"
});
formatter.result({
  "duration": 763270706,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.put_last_name()"
});
formatter.result({
  "duration": 545540490,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.provide_email_address()"
});
formatter.result({
  "duration": 379026430,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.give_password()"
});
formatter.result({
  "duration": 240976617,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.click_create_account_button()"
});
formatter.result({
  "duration": 21843818015,
  "status": "passed"
});
});