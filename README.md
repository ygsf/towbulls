Task 1-6:
To answer questions 1-6 I created a small framework using gradle, cucumber and java.

I created it like proper testing framework, using page objects, base objects, before and after method etc.

The test steps found in feature files:
QA1.feature
QA2.feature
QAPI1.feature
QAPI2.feature

If proper software installed the tests may be running by command ‘gradle clean build’ from command line.
The run will generate 2 separate reports.
Gradle report generated in folder build/reports/tests/test/index.html
Cucumber report generated in target/report/index.html


Task 1: google give me required task in position different than 2, so I access the link using link text.
The steps are in QA1.feature

Task 2: I added 5 seconds waiting as required from the task. However, it is not necessary because I use wait object to access element that I check. Therefore, the test will wait exact amount of time required for verification, unless timeout happen.
The steps are in QA2.feature

Task 3: I added print of current time to generated log file and cucumber report.

Task 4: I created the code of the test, however, test fails with UnknownHostException.
The steps are in file QAPI1.feature.

Task 5: I created the code of the test, however, test fails. There is no response from the server.
The steps are in file QAPI2.feature

Task 6: I added verification step in tasks 4 and 5, however, as I said there is no response from the services.

