load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

android_sdk_repository(
    name = "androidsdk",
    api_level = 30,
    build_tools_version = "30.0.2"
)

http_archive(
    name = "rules_android",
    urls = ["https://github.com/bazelbuild/rules_android/archive/v0.1.1.zip"],
    sha256 = "cd06d15dd8bb59926e4d65f9003bfc20f9da4b2519985c27e190cddc8b7a7806",
    strip_prefix = "rules_android-0.1.1",
)

RULES_JVM_EXTERNAL_TAG = "2.2"
RULES_JVM_EXTERNAL_SHA = "f1203ce04e232ab6fdd81897cf0ff76f2c04c0741424d192f28e65ae752ce2d6"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "androidx.core:core-ktx:1.3.2",
        "androidx.core:core:1.3.2",
        "androidx.lifecycle:lifecycle-runtime:2.2.0",
        "androidx.lifecycle:lifecycle-viewmodel:2.2.0",
        "androidx.lifecycle:lifecycle-common:2.2.0",

        "androidx.appcompat:appcompat:1.2.0",

        "androidx.constraintlayout:constraintlayout:2.0.4",
        "com.google.android.material:material:1.2.1",

        "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.1",
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.1",

        "junit:junit:4.13.1",
        "androidx.test.ext:junit:1.1.0",
        "org.robolectric:robolectric:4.4",
        "org.assertj:assertj-core:3.12.1",

    ],
    repositories = [
        "https://maven.google.com",
        "https://jcenter.bintray.com",
    ],
    fetch_sources = True,
)

rules_kotlin_version = "v1.5.0-alpha-1"
rules_kotlin_sha = "8b5c656030558a54c5a118f216c8807e1f009675d6fc546704ee7ec74c95af12"

rules_kotlin_version = "legacy-1.4.0-rc4"
rules_kotlin_sha = "9cc0e4031bcb7e8508fd9569a81e7042bbf380604a0157f796d06d511cff2769"

http_archive(
    name = "io_bazel_rules_kotlin",
    urls = ["https://github.com/bazelbuild/rules_kotlin/releases/download/%s/rules_kotlin_release.tgz" % rules_kotlin_version],
    sha256 = rules_kotlin_sha,
)
load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kotlin_repositories", "kt_register_toolchains")

kotlin_version = "1.4.20"
kotlin_release_sha = "11db93a4d6789e3406c7f60b9f267eba26d6483dcd771eff9f85bb7e9837011f"
rules_kotlin_compiler_release = {
    "urls": [
    "https://github.com/JetBrains/kotlin/releases/download/v{v}/kotlin-compiler-{v}.zip".format(v = kotlin_version),
    ],
    "sha256": kotlin_release_sha,
}
kotlin_repositories(compiler_release = rules_kotlin_compiler_release)
kt_register_toolchains()

http_archive(
    name = "robolectric",
    urls = ["https://github.com/robolectric/robolectric-bazel/archive/4.4.tar.gz"],
    strip_prefix = "robolectric-bazel-4.4",
)
load("@robolectric//bazel:robolectric.bzl", "robolectric_repositories")
robolectric_repositories()