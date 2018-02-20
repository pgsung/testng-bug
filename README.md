# testng-bug

https://github.com/cbeust/testng/issues/1701

https://github.com/gradle/gradle/issues/4457

steps to reproduce:

run ./gradlew clean test

```
content-backoffice-ci-uitest Suite > thread-test > parallel.test.Test1.runTests STANDARD_OUT
    10
Running test: Test method runTests(parallel.test.Test2)

content-backoffice-ci-uitest Suite > thread-test > parallel.test.Test2.runTests STANDARD_OUT
    10
Running test: Test method runTests(parallel.test.Test3)

content-backoffice-ci-uitest Suite > thread-test > parallel.test.Test3.runTests STANDARD_OUT
    10


BUILD SUCCESSFUL in 2s
```
Expect different thread id.