# Bazel Android sample project running with CircleCI

Project to accompany a blog post on CircleCI blog.

See .circleci for integration instructioins

[![CircleCI](https://circleci.com/gh/zmarkan/bazel-android-cicd-example
.svg?style=svg)](https://app.circleci.com/pipelines/github/zmarkan/bazel-android-cicd-example)

## Running locally

- Install Bazel (tested on v3.2.0)
- Android SDK 29 (Robolectric version 4.4 doesn't support Android SDK 30)
- JDK 9 or higher

### Known issues

- Android Studio doesn't want to run the Robolectric tests due to Java 8 incopatibility. Tests run when run from the commandline using `bazel test //src/main:unit_test`
