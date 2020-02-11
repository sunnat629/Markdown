package dev.sunnat629.markdown

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        markdownView.loadMarkdownFromText(test)
        markdownView.loadMarkdownFromAssets("README.md")
    }
}

private const val test = "# kotlinx.coroutines \n" +
        "\n" +
        "| Tables        | Are           | Cool  |\n" +
        "| ------------- |:-------------:| -----:|\n" +
        "| col 3 is      | right-aligned | $1600 |\n" +
        "| col 2 is      | centered      |   $12 |\n" +
        "| zebra stripes | are neat      |    $1 |\n" +
        " \n" +
        " ![alt text](https://github.com/adam-p/markdown-here/raw/master/src/common/images/icon48.png \"Logo Title Text 1\")\n" +
        "\n" +
        " \n" +
        " [![text](http://img.youtube.com/vi/ADPEAX2ApR4/0.jpg)](http://www.youtube.com/watch?v=ADPEAX2ApR4 \"test\")\n" +
        "\n" +
        " \n" +
        " \n" +
        "Library support for Kotlin coroutines with [multiplatform](#multiplatform) support.\n" +
        "This is a companion version for Kotlin `1.3.61` release.\n" +
        "\n" +
        "```kotlin\n" +
        "suspend fun main() = coroutineScope {\n" +
        "    launch { \n" +
        "       delay(1000)\n" +
        "       println(\"Kotlin Coroutines World!\") \n" +
        "    }\n" +
        "    println(\"Hello\")\n" +
        "}\n" +
        "```\n" +
        "\n" +
        "> Play with coroutines online [here](https://pl.kotl.in/hG_tKbid_)\n" +
        "\n" +
        "## Modules\n" +
        "\n" +
        "* [core](kotlinx-coroutines-core/README.md) &mdash; common coroutines across all platforms:\n" +
        "  * [launch] and [async] coroutine builders returning [Job] and [Deferred] light-weight futures with cancellation support;\n" +
        "  * [Dispatchers] object with [Main][Dispatchers.Main] dispatcher for Android/Swing/JavaFx, and [Default][Dispatchers.Default] dispatcher for background coroutines;\n" +
        "  * [delay] and [yield] top-level suspending functions;\n" +
        "  * [Flow] &mdash; cold asynchronous stream with [flow][_flow] builder and comprehensive operator set ([filter], [map], etc);\n" +
        "  * [Channel], [Mutex], and [Semaphore] communication and synchronization primitives;\n" +
        "  * [coroutineScope], [supervisorScope], [withContext], and [withTimeout] scope builders;\n" +
        "  * [MainScope()] for Android and UI applications;\n" +
        "  * [SupervisorJob()] and [CoroutineExceptionHandler] for supervision of coroutines hierarchies;\n" +
        "  * [select] expression support and more.\n" +
        "* [core/jvm](kotlinx-coroutines-core/jvm/) &mdash; additional core features available on Kotlin/JVM:\n" +
        "  * [Dispatchers.IO] dispatcher for blocking coroutines;\n" +
        "  * [Executor.asCoroutineDispatcher] extension, custom thread pools, and more.\n" +
        "* [core/js](kotlinx-coroutines-core/js/) &mdash; additional core features available on Kotlin/JS:\n" +
        "  * Integration with `Promise` via [Promise.await] and [promise] builder;\n" +
        "  * Integration with `Window` via [Window.asCoroutineDispatcher], etc.\n" +
        "* [test](kotlinx-coroutines-test/README.md) &mdash; test utilities for coroutines:\n" +
        "  * [Dispatchers.setMain] to override [Dispatchers.Main] in tests;\n" +
        "  * [TestCoroutineScope] to test suspending functions and coroutines.\n" +
        "* [debug](kotlinx-coroutines-debug/README.md) &mdash; debug utilities for coroutines:\n" +
        "  * [DebugProbes] API to probe, keep track of, print and dump active coroutines;\n" +
        "  * [CoroutinesTimeout] test rule to automatically dump coroutines on test timeout.\n" +
        "* [reactive](reactive/README.md) &mdash; modules that provide builders and iteration support for various reactive streams libraries:\n" +
        "  * Reactive Streams ([Publisher.collect], [Publisher.awaitSingle], [publish], etc), \n" +
        "    RxJava 2.x ([rxFlowable], [rxSingle], etc), and \n" +
        "    Project Reactor ([flux], [mono], etc). \n" +
        "* [ui](ui/README.md) &mdash; modules that provide coroutine dispatchers for various single-threaded UI libraries:\n" +
        "  * Android, JavaFX, and Swing.\n" +
        "* [integration](integration/README.md) &mdash; modules that provide integration with various asynchronous callback- and future-based libraries:\n" +
        "  * JDK8 [CompletionStage.await], Guava [ListenableFuture.await], and Google Play Services [Task.await];\n" +
        "  * SLF4J MDC integration via [MDCContext].\n" +
        "\n" +
        "## Documentation\n" +
        "\n" +
        "* Presentations and videos:\n" +
        "  * [Introduction to Coroutines](https://www.youtube.com/watch?v=_hfBv0a09Jc) (Roman Elizarov at KotlinConf 2017, [slides](https://www.slideshare.net/elizarov/introduction-to-coroutines-kotlinconf-2017))\n" +
        "  * [Deep dive into Coroutines](https://www.youtube.com/watch?v=YrrUCSi72E8) (Roman Elizarov at KotlinConf 2017, [slides](https://www.slideshare.net/elizarov/deep-dive-into-coroutines-on-jvm-kotlinconf-2017))\n" +
        "  * [Kotlin Coroutines in Practice](https://www.youtube.com/watch?v=a3agLJQ6vt8) (Roman Elizarov at KotlinConf 2018, [slides](https://www.slideshare.net/elizarov/kotlin-coroutines-in-practice-kotlinconf-2018))\n" +
        "* Guides and manuals: \n" +
        "  * [Guide to kotlinx.coroutines by example](https://kotlinlang.org/docs/reference/coroutines/coroutines-guide.html) (**read it first**)\n" +
        "  * [Guide to UI programming with coroutines](ui/coroutines-guide-ui.md)\n" +
        "  * [Debugging capabilities in kotlinx.coroutines](docs/debugging.md)\n" +
        "* [Compatibility policy and experimental annotations](docs/compatibility.md)\n" +
        "* [Change log for kotlinx.coroutines](CHANGES.md)\n" +
        "* [Coroutines design document (KEEP)](https://github.com/Kotlin/KEEP/blob/master/proposals/coroutines.md)\n" +
        "* [Full kotlinx.coroutines API reference](https://kotlin.github.io/kotlinx.coroutines)\n" +
        " \n" +
        "## Using in your projects\n" +
        "\n" +
        "The libraries are published to [kotlinx](https://bintray.com/kotlin/kotlinx/kotlinx.coroutines) bintray repository,\n" +
        "linked to [JCenter](https://bintray.com/bintray/jcenter?filterByPkgName=kotlinx.coroutines) and \n" +
        "pushed to [Maven Central](https://search.maven.org/#search%7Cga%7C1%7Cg%3Aorg.jetbrains.kotlinx%20a%3Akotlinx-coroutines*).\n" +
        "\n" +
        "### Maven\n" +
        "\n" +
        "Add dependencies (you can also add other modules that you need):\n" +
        "\n" +
        "```xml\n" +
        "<dependency>\n" +
        "    <groupId>org.jetbrains.kotlinx</groupId>\n" +
        "    <artifactId>kotlinx-coroutines-core</artifactId>\n" +
        "    <version>1.3.3</version>\n" +
        "</dependency>\n" +
        "```\n" +
        "\n" +
        "And make sure that you use the latest Kotlin version:\n" +
        "\n" +
        "```xml\n" +
        "<properties>\n" +
        "    <kotlin.version>1.3.61</kotlin.version>\n" +
        "</properties>\n" +
        "```\n" +
        "\n" +
        "### Gradle\n" +
        "\n" +
        "Add dependencies (you can also add other modules that you need):\n" +
        "\n" +
        "```groovy\n" +
        "dependencies {\n" +
        "    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.3'\n" +
        "}\n" +
        "```\n" +
        "\n" +
        "And make sure that you use the latest Kotlin version:\n" +
        "\n" +
        "```groovy\n" +
        "buildscript {\n" +
        "    ext.kotlin_version = '1.3.61'\n" +
        "}\n" +
        "```\n" +
        "\n" +
        "Make sure that you have either `jcenter()` or `mavenCentral()` in the list of repositories:\n" +
        "\n" +
        "```\n" +
        "repository {\n" +
        "    jcenter()\n" +
        "}\n" +
        "```\n" +
        "\n" +
        "### Gradle Kotlin DSL\n" +
        "\n" +
        "Add dependencies (you can also add other modules that you need):\n" +
        "\n" +
        "```groovy\n" +
        "dependencies {\n" +
        "    implementation(\"org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.3\")\n" +
        "}\n" +
        "```\n" +
        "\n" +
        "And make sure that you use the latest Kotlin version:\n" +
        "\n" +
        "```groovy\n" +
        "plugins {\n" +
        "    kotlin(\"jvm\") version \"1.3.61\"\n" +
        "}\n" +
        "```\n" +
        "\n" +
        "Make sure that you have either `jcenter()` or `mavenCentral()` in the list of repositories.\n" +
        "\n" +
        "### Multiplatform\n" +
        "\n" +
        "Core modules of `kotlinx.coroutines` are also available for \n" +
        "[Kotlin/JS](#js) and [Kotlin/Native](#native).\n" +
        "In common code that should get compiled for different platforms, add dependency to  \n" +
        "[`kotlinx-coroutines-core-common`](https://search.maven.org/artifact/org.jetbrains.kotlinx/kotlinx-coroutines-core-common/1.3.3/jar)\n" +
        "(follow the link to get the dependency declaration snippet).\n" +
        "\n" +
        "### Android\n" +
        "\n" +
        "Add [`kotlinx-coroutines-android`](ui/kotlinx-coroutines-android)\n" +
        "module as dependency when using `kotlinx.coroutines` on Android:\n" +
        "\n" +
        "```groovy\n" +
        "implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.3'\n" +
        "```\n" +
        "\n" +
        "This gives you access to Android [Dispatchers.Main]\n" +
        "coroutine dispatcher and also makes sure that in case of crashed coroutine with unhandled exception this\n" +
        "exception is logged before crashing Android application, similarly to the way uncaught exceptions in \n" +
        "threads are handled by Android runtime. \n" +
        "\n" +
        "#### R8 and ProGuard\n" +
        "\n" +
        "For R8 no actions required, it will take obfuscation rules from the jar.\n" +
        "\n" +
        "For Proguard  you need to add options from [coroutines.pro](kotlinx-coroutines-core/jvm/resources/META-INF/proguard/coroutines.pro) to your rules manually.\n" +
        " \n" +
        "R8 is a replacement for ProGuard in Android ecosystem, it is enabled by default since Android gradle plugin 3.4.0 (3.3.0-beta also had it enabled).\n" +
        "\n" +
        "### JS\n" +
        "\n" +
        "[Kotlin/JS](https://kotlinlang.org/docs/reference/js-overview.html) version of `kotlinx.coroutines` is published as \n" +
        "[`kotlinx-coroutines-core-js`](https://search.maven.org/artifact/org.jetbrains.kotlinx/kotlinx-coroutines-core-js/1.3.3/jar)\n" +
        "(follow the link to get the dependency declaration snippet).\n" +
        " \n" +
        "You can also use [`kotlinx-coroutines-core`](https://www.npmjs.com/package/kotlinx-coroutines-core) package via NPM. \n" +
        "\n" +
        "### Native\n" +
        "\n" +
        "[Kotlin/Native](https://kotlinlang.org/docs/reference/native-overview.html) version of `kotlinx.coroutines` is published as \n" +
        "[`kotlinx-coroutines-core-native`](https://search.maven.org/artifact/org.jetbrains.kotlinx/kotlinx-coroutines-core-native/1.3.3/jar)\n" +
        "(follow the link to get the dependency declaration snippet).\n" +
        "\n" +
        "Only single-threaded code (JS-style) on Kotlin/Native is currently supported. \n" +
        "Kotlin/Native supports only Gradle version 4.10 and you need to enable Gradle metadata in your\n" +
        "`settings.gradle` file:\n" +
        "\n" +
        "```groovy\n" +
        "enableFeaturePreview('GRADLE_METADATA')\n" +
        "```\n" +
        "\n" +
        "Since Kotlin/Native does not generally provide binary compatibility between versions, \n" +
        "you should use the same version of Kotlin/Native compiler as was used to build `kotlinx.coroutines`. \n" +
        "\n" +
        "## Building \n" +
        "\n" +
        "This library is built with Gradle. To build it, use `./gradlew build`. \n" +
        "You can import this project into IDEA, but you have to delegate build actions\n" +
        "to Gradle (in Preferences -> Build, Execution, Deployment -> Build Tools -> Gradle -> Runner)\n" +
        "\n" +
        "### Requirements\n" +
        "\n" +
        "* JDK >= 1.8 referred to by the `JAVA_HOME` environment variable. JDK must include JavaFX.\n" +
        "* JDK 1.6 referred to by the `JDK_16` environment variable. It is okay to have `JDK_16` pointing to `JAVA_HOME` for external contributions.\n" +
        "\n" +
        "## Contributions and releases\n" +
        "\n" +
        "All development (both new features and bug fixes) is performed in `develop` branch. \n" +
        "This way `master` sources always contain sources of the most recently released version.\n" +
        "Please send PRs with bug fixes to `develop` branch.\n" +
        "Fixes to documentation in markdown files are an exception to this rule. They are updated directly in `master`.\n" +
        "                                                                          \n" +
        "The `develop` branch is pushed to `master` during release.\n" +
        "\n" +
        "* Full release procedure checklist is [here](RELEASE.md).\n" +
        "* Steps for contributing new integration modules are explained [here](integration/README.md#Contributing).\n" +
        "\n" +
        "<!--- MODULE kotlinx-coroutines-core -->\n" +
        "<!--- INDEX kotlinx.coroutines -->\n" +
        "[launch]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/launch.html\n" +
        "[async]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/async.html\n" +
        "[Job]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-job/index.html\n" +
        "[Deferred]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-deferred/index.html\n" +
        "[Dispatchers]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-dispatchers/index.html\n" +
        "[Dispatchers.Main]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-dispatchers/-main.html\n" +
        "[Dispatchers.Default]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-dispatchers/-default.html\n" +
        "[delay]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/delay.html\n" +
        "[yield]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/yield.html\n" +
        "[coroutineScope]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/coroutine-scope.html\n" +
        "[supervisorScope]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/supervisor-scope.html\n" +
        "[withContext]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/with-context.html\n" +
        "[withTimeout]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/with-timeout.html\n" +
        "[MainScope()]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-main-scope.html\n" +
        "[SupervisorJob()]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-supervisor-job.html\n" +
        "[CoroutineExceptionHandler]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-coroutine-exception-handler/index.html\n" +
        "[Dispatchers.IO]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-dispatchers/-i-o.html\n" +
        "[Executor.asCoroutineDispatcher]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/java.util.concurrent.-executor/as-coroutine-dispatcher.html\n" +
        "[Promise.await]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/kotlin.js.-promise/await.html\n" +
        "[promise]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/promise.html\n" +
        "[Window.asCoroutineDispatcher]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/org.w3c.dom.-window/as-coroutine-dispatcher.html\n" +
        "<!--- INDEX kotlinx.coroutines.flow -->\n" +
        "[Flow]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/index.html\n" +
        "[_flow]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/flow.html\n" +
        "[filter]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/filter.html\n" +
        "[map]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/map.html\n" +
        "<!--- INDEX kotlinx.coroutines.channels -->\n" +
        "[Channel]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.channels/-channel/index.html\n" +
        "<!--- INDEX kotlinx.coroutines.selects -->\n" +
        "[select]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.selects/select.html\n" +
        "<!--- INDEX kotlinx.coroutines.sync -->\n" +
        "[Mutex]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.sync/-mutex/index.html\n" +
        "[Semaphore]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.sync/-semaphore/index.html\n" +
        "<!--- MODULE kotlinx-coroutines-test -->\n" +
        "<!--- INDEX kotlinx.coroutines.test -->\n" +
        "[Dispatchers.setMain]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-test/kotlinx.coroutines.test/kotlinx.coroutines.-dispatchers/set-main.html\n" +
        "[TestCoroutineScope]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-test/kotlinx.coroutines.test/-test-coroutine-scope/index.html\n" +
        "<!--- MODULE kotlinx-coroutines-debug -->\n" +
        "<!--- INDEX kotlinx.coroutines.debug -->\n" +
        "[DebugProbes]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-debug/kotlinx.coroutines.debug/-debug-probes/index.html\n" +
        "<!--- INDEX kotlinx.coroutines.debug.junit4 -->\n" +
        "[CoroutinesTimeout]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-debug/kotlinx.coroutines.debug.junit4/-coroutines-timeout/index.html\n" +
        "<!--- MODULE kotlinx-coroutines-slf4j -->\n" +
        "<!--- INDEX kotlinx.coroutines.slf4j -->\n" +
        "[MDCContext]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-slf4j/kotlinx.coroutines.slf4j/-m-d-c-context/index.html\n" +
        "<!--- MODULE kotlinx-coroutines-jdk8 -->\n" +
        "<!--- INDEX kotlinx.coroutines.future -->\n" +
        "[CompletionStage.await]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-jdk8/kotlinx.coroutines.future/java.util.concurrent.-completion-stage/await.html\n" +
        "<!--- MODULE kotlinx-coroutines-guava -->\n" +
        "<!--- INDEX kotlinx.coroutines.guava -->\n" +
        "[ListenableFuture.await]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-guava/kotlinx.coroutines.guava/com.google.common.util.concurrent.-listenable-future/await.html\n" +
        "<!--- MODULE kotlinx-coroutines-play-services -->\n" +
        "<!--- INDEX kotlinx.coroutines.tasks -->\n" +
        "<!--- MODULE kotlinx-coroutines-reactive -->\n" +
        "<!--- INDEX kotlinx.coroutines.reactive -->\n" +
        "[Publisher.collect]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-reactive/kotlinx.coroutines.reactive/org.reactivestreams.-publisher/collect.html\n" +
        "[Publisher.awaitSingle]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-reactive/kotlinx.coroutines.reactive/org.reactivestreams.-publisher/await-single.html\n" +
        "[publish]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-reactive/kotlinx.coroutines.reactive/publish.html\n" +
        "<!--- MODULE kotlinx-coroutines-rx2 -->\n" +
        "<!--- INDEX kotlinx.coroutines.rx2 -->\n" +
        "[rxFlowable]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-rx2/kotlinx.coroutines.rx2/rx-flowable.html\n" +
        "[rxSingle]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-rx2/kotlinx.coroutines.rx2/rx-single.html\n" +
        "<!--- MODULE kotlinx-coroutines-reactor -->\n" +
        "<!--- INDEX kotlinx.coroutines.reactor -->\n" +
        "[flux]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-reactor/kotlinx.coroutines.reactor/flux.html\n" +
        "[mono]: https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-reactor/kotlinx.coroutines.reactor/mono.html\n" +
        "<!--- END -->\n"