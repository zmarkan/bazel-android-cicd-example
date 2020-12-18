load("@rules_jvm_external//:defs.bzl", "artifact")
load("@rules_android//android:rules.bzl", "android_binary", "android_local_test")
load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_android_library")

package(default_visibility = ["//visibility:private"])

PACKAGE_NAME = "com.circleci.bazelsample"
MANIFEST = "main/AndroidManifest.xml"

kt_android_library(
    name = "kotlin_sources",
    custom_package = PACKAGE_NAME,
    resource_files = glob(["main/res/**"]),
    srcs = glob(["main/java/**/*.kt"]),
    manifest = MANIFEST,
    deps = [
        artifact('androidx.core:core-ktx'),
        artifact('androidx.appcompat:appcompat'),
        artifact('com.google.android.material:material'),
        artifact('androidx.constraintlayout:constraintlayout'),
        artifact("androidx.core:core"),
        artifact("androidx.lifecycle:lifecycle-runtime"),
        artifact("androidx.lifecycle:lifecycle-viewmodel"),
        artifact("androidx.lifecycle:lifecycle-common"),

    ]
)

kt_android_library(
    name = "kotlin_unit_test_sources",
    srcs = glob(["test/java/**/*.kt"]),
    custom_package = PACKAGE_NAME,
    manifest = MANIFEST,
    deps = [
        ':kotlin_sources',
        artifact("androidx.test.ext:junit"),
        artifact("org.robolectric:robolectric"),
        artifact("org.assertj:assertj-core"),
    ]
)

android_local_test(
    name="unit_tests",
    custom_package = PACKAGE_NAME,
    manifest = MANIFEST,
    manifest_values = {
            "minSdkVersion": "21",
            "versionCode" : "1",
            "versionName" : "0.1",
            "targetSdkVersion": "29",
        },
    test_class = "com.circleci.bazelsample.ExampleUnitTest",
    deps = [
        ":kotlin_unit_test_sources",
        "@robolectric//bazel:android-all",
    ]
)

android_binary(
    name = "app",
    manifest = MANIFEST,
    manifest_values = {
            "minSdkVersion": "21",
            "versionCode" : "2",
            "versionName" : "0.2",
            "targetSdkVersion": "29",
        },
    custom_package = PACKAGE_NAME,
    deps = [
        ':kotlin_sources'
    ],
)