# testng-bug

https://github.com/cbeust/testng/issues/1701

steps to reproduce:

run ./gradlew clean test


> Task :test
Running test: Test method runTests(parallel.test.Test1)

content-backoffice-ci-uitest Suite > thread-test > parallel.test.Test1.runTests STANDARD_OUT
    10
Running test: Test method runTests(parallel.test.Test2)

content-backoffice-ci-uitest Suite > thread-test > parallel.test.Test2.runTests STANDARD_OUT
    10
Running test: Test method runTests(parallel.test.Test3)

content-backoffice-ci-uitest Suite > thread-test > parallel.test.Test3.runTests STANDARD_OUT
    10


BUILD SUCCESSFUL in 2s

Eexpect differenct thread id.

run on macOS high sierra.