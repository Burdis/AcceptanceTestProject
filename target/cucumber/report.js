$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GoogleNavigation.feature");
formatter.feature({
  "line": 1,
  "name": "Visit Google and click on a link",
  "description": "",
  "id": "visit-google-and-click-on-a-link",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Visit google.com and check the page title",
  "description": "",
  "id": "visit-google-and-click-on-a-link;visit-google.com-and-check-the-page-title",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go to google",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I will be on Google",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I will click on Gmail",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I will be on Gmail - Free Storage and Email from Google",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "google",
      "offset": 8
    }
  ],
  "location": "StepDefs.java:17"
});
formatter.result({
  "duration": 1608607900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Google",
      "offset": 13
    }
  ],
  "location": "StepDefs.java:21"
});
formatter.result({
  "duration": 14698080,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gmail",
      "offset": 16
    }
  ],
  "location": "StepDefs.java:26"
});
formatter.result({
  "duration": 4237744415,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gmail - Free Storage and Email from Google",
      "offset": 13
    }
  ],
  "location": "StepDefs.java:21"
});
formatter.result({
  "duration": 11829918,
  "status": "passed"
});
});