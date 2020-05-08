/**
 * Created By
 * Anand Verma
 * adventures92@gmail.com
 * Last Update : 8th May 2020
 */

object Libs {

    const val MIN_SDK_VERSION = 21
    const val TARGET_SDK_VERSION = 29
    const val COMPILE_SDK_VERSION = 29

    object Plugins {

        const val kotlinAndroid = "kotlin-android"
        const val kotlinAndroidExtensions = "kotlin-android-extensions"
        const val androidApplication = "com.android.application"
        const val kotlinKapt = "kotlin-kapt"

        object Navigation {
            const val javaPlugin = "androidx.navigation.safeargs"
            const val kotlinPlugin = "androidx.navigation.safeargs.kotlin"
        }
    }

    object Kotlin {
        private const val VER_KOTLIN = "1.3.72"
        private const val VER_COROUTINES = "1.3.5"
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib:$VER_KOTLIN"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$VER_KOTLIN"
        const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$VER_COROUTINES"
        const val coroutinesAndroid =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:$VER_COROUTINES"
    }

    object GradlePlugin {
        private const val VERSION = "3.6.3"
        const val androidGradlePlugin = "com.android.tools.build:gradle:$VERSION"
    }

    object Retrofit {
        private const val VERSION = "2.8.1"
        const val retrofit = "com.squareup.retrofit2:retrofit:$VERSION"
        const val converterGson = "com.squareup.retrofit2:converter-gson:$VERSION"
        const val converterScalar = "com.squareup.retrofit2:converter-scalars:$VERSION"
        const val converterMoshi = "com.squareup.retrofit2:converter-moshi:$VERSION"
        const val converterJackson = "com.squareup.retrofit2:converter-jackson:$VERSION"
        const val converterSimpleXml = "com.squareup.retrofit2:converter-simplexml:$VERSION"
        const val adapterRxJava = "com.squareup.retrofit2:adapter-rxjava:$VERSION"
        const val adapterRxJava2 = "com.squareup.retrofit2:adapter-rxjava2:$VERSION"
        const val adapterMock = "com.squareup.retrofit2:retrofit-mock:$VERSION"
    }

    object AndroidX {
        private const val VER_CORE_KTX = "1.2.0"
        private const val VER_APPCOMPAT = "1.1.0"
        private const val VER_CONSTRAINT_LAYOUT = "1.1.3"
        private const val VER_VIEWPAGER_2 = "1.0.0"
        private const val VER_CHROME_CUSTOM = "1.2.0"
        private const val VER_PALETTE = "1.0.0"
        private const val VER_MATERIAL_DESIGN = "1.1.0"
        private const val VER_RECYCLER_VIEW = "1.1.0"
        private const val VER_SWIPE_REFRESH = "1.0.0"

        const val coreKtx = "androidx.core:core-ktx:$VER_CORE_KTX"
        const val appCompat = "androidx.appcompat:appcompat:$VER_APPCOMPAT"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:$VER_CONSTRAINT_LAYOUT"
        const val recyclerView = "androidx.recyclerview:recyclerview:$VER_RECYCLER_VIEW"
        const val viewPager2 = "androidx.viewpager2:viewpager2:$VER_VIEWPAGER_2"
        const val palette = "androidx.palette:palette:$VER_PALETTE"
        const val chromeCustomTab = "androidx.browser:browser:$VER_CHROME_CUSTOM"
        const val materialDesign = "com.google.android.material:material:$VER_MATERIAL_DESIGN"
        const val swipeRefresh = "androidx.swiperefreshlayout:swiperefreshlayout:$VER_SWIPE_REFRESH"


        // Androidx LifeCycle Libraries

        object LifeCycle {
            private const val VER_LIFECYCLE = "2.2.0"
            private const val VER_LIFECYCLE_SAVED_STATE = "2.2.0"
            private const val VER_LIFECYCLE_ARCH = "2.1.0"

            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel:$VER_LIFECYCLE"
            const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$VER_LIFECYCLE"
            const val liveData = "androidx.lifecycle:lifecycle-livedata:$VER_LIFECYCLE"
            const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$VER_LIFECYCLE"
            const val runtime = "androidx.lifecycle:lifecycle-runtime:$VER_LIFECYCLE"
            const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$VER_LIFECYCLE"
            const val viewModelSavedState =
                "androidx.lifecycle:lifecycle-viewmodel-savedstate:$VER_LIFECYCLE_SAVED_STATE"
            const val compile = "androidx.lifecycle:lifecycle-compiler:$VER_LIFECYCLE"
            const val java8 = "androidx.lifecycle:lifecycle-common-java8:$VER_LIFECYCLE"
            const val reactiveStream = "androidx.lifecycle:lifecycle-reactivestreams:$VER_LIFECYCLE"
            const val reactiveStreamKtx =
                "androidx.lifecycle:lifecycle-reactivestreams-ktx:$VER_LIFECYCLE"
            const val coreText = "androidx.arch.core:core-testing:$VER_LIFECYCLE_ARCH"
        }

        object Navigation {
            const val VERSION = "2.2.2"

            const val fragment = "androidx.navigation:navigation-fragment:$VERSION"
            const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$VERSION"
            const val ui = "androidx.navigation:navigation-ui:$VERSION"
            const val uiKtx = "androidx.navigation:navigation-ui-ktx:$VERSION"
            const val navArgsGradlePlugin =
                "androidx.navigation:navigation-safe-args-gradle-plugin:${AndroidX.Navigation.VERSION}"
        }

        object Paging {
            private const val VERSION = "2.1.2"

            const val runtime = "androidx.paging:paging-runtime:$VERSION"
            const val runtimeKtx = "androidx.paging:paging-runtime-ktx:$VERSION"
            const val rxJava = "androidx.paging:paging-rxjava2:$VERSION"
            const val rxJavaKtx = "androidx.paging:paging-rxjava2-ktx:$VERSION"
            const val testing = "androidx.paging:paging-common:$VERSION"
            const val testingKtx = "androidx.paging:paging-common-ktx:$VERSION"
        }

        object Room {
            private const val VERSION = "2.2.5"

            const val runtime = "androidx.room:room-runtime:$VERSION"
            const val compiler = "androidx.room:room-compiler:$VERSION"
            const val roomKtx = "androidx.room:room-ktx:$VERSION"
            const val roomRxJava = "androidx.room:room-rxjava2:$VERSION"
            const val roomGuava = "androidx.room:room-guava:$VERSION"
            const val testing = "androidx.room:room-testing:$VERSION"
        }

        object WorkManager {
            private const val VERSION = "2.3.4"

            const val runtime = "androidx.work:work-runtime:$VERSION"
            const val runtimeKtx = "androidx.work:work-runtime-ktx:$VERSION"
            const val rxJava = "androidx.work:work-rxjava2:$VERSION"
            const val gcm = "androidx.work:work-gcm:$VERSION"
            const val testing = "androidx.work:work-testing:$VERSION"
        }

    }

    object Rx {
        private const val VER_RX_JAVA = "2.2.19"
        private const val VER_RX_ANDROID = "2.1.1"
        private const val VER_RX_KOTLIN = "2.4.0"

        const val rxJava2 = "io.reactivex.rxjava2:rxjava:$VER_RX_JAVA"
        const val rxAndroid = "io.reactivex.rxjava2:rxandroid:$VER_RX_ANDROID"
        const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:$VER_RX_KOTLIN"
    }

    object DI {

        object Dagger {
            private const val VERSION = "2.27"

            const val dagger = "com.google.dagger:dagger-android:$VERSION"
            const val daggerCompiler = "com.google.dagger:dagger-compiler:$VERSION"
            const val daggerAndroid = "com.google.dagger:dagger-android:$VERSION"
            const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:$VERSION"
            const val daggerAndroidSupportCompiler =
                "com.google.dagger:dagger-android-processor:$VERSION"
        }

        object Koin {
            private const val VERSION = "2.1.5"

            object Android {
                const val core = "org.koin:koin-android:$VERSION"
                const val scope = "org.koin:koin-android-scope:$VERSION"
                const val viewModel = "org.koin:koin-android-viewmodel:$VERSION"
                const val experimental = "org.koin:koin-android-ext:$VERSION"
            }

            object Androidx {
                const val fragment = "org.koin:koin-androidx-fragment:$VERSION"
                const val scope = "org.koin:koin-androidx-scope:$VERSION"
                const val viewModel = "org.koin:koin-androidx-viewmodel:$VERSION"
                const val experimental = "org.koin:koin-androidx-ext:$VERSION"
            }

        }

        object ViewModelInject {
            private const val VERSION = "0.3.3"
            const val viewModelInject = "com.vikingsen.inject:viewmodel-inject:$VERSION"
            const val viewModelInjectProcessor =
                "com.vikingsen.inject:viewmodel-inject-processor:$VERSION"
        }

    }

    object OkHttp {
        private const val VERSION = "4.6.0"

        const val okHttp = "com.squareup.okhttp3:okhttp:$VERSION"
        const val okHttpMockServer = "com.squareup.okhttp3:mockwebserver:$VERSION"
        const val okHttpLogging = "com.squareup.okhttp3:logging-interceptor:$VERSION"
    }

    object Testing {

        private const val VER_JUNIT = "4.13"

        const val junit = "junit:junit:$VER_JUNIT"

        object Androidx {
            private const val VER_JUNIT_EXT = "1.1.1"
            private const val VER_ESPRESSO = "3.2.0"
            const val junitExt = "androidx.test.ext:junit:$VER_JUNIT_EXT"
            const val expresso = "androidx.test.espresso:espresso-core:$VER_ESPRESSO"
        }

    }

    object AirBnb {
        private const val VER_MVRX = "1.4.0"
        private const val VER_LOTTIE = "3.4.0"
        private const val VER_EPOXY = "3.9.0"
        private const val VER_PARIS = "1.4.0"

        const val mvRx = "com.airbnb.android:mvrx:$VER_MVRX"
        const val lottie = "com.airbnb.android:lottie:$VER_LOTTIE"
        const val epoxy = "com.airbnb.android:epoxy:$VER_EPOXY"
        const val epoxyProcessor = "com.airbnb.android:epoxy-processor:$VER_EPOXY"
        const val paris = "com.airbnb.android:paris:"
        const val parisProcessor = "com.airbnb.android:paris-processor:$VER_PARIS"
    }


    object Extra {
        private const val VER_TIMBER = "4.7.1"
        const val timber = "com.jakewharton.timber:timber:$VER_TIMBER"
    }

    object Glide {
        private const val VERSION = "4.11.0"

        const val glide = "com.github.bumptech.glide:glide:$VERSION"
        const val compiler = "com.github.bumptech.glide:compiler:$VERSION"
    }

    object AgodaNinjato {

        private const val VERSION = "0.3.0"

        const val core = "com.agoda.ninjato:ninjato-core:$VERSION"
        const val okHttp = "com.agoda.ninjato:ninjato-okhttp$VERSION"
        const val gsonConverter = "com.agoda.ninjato:converter-gson:$VERSION"
        const val callWrapper = "com.agoda.ninjato:extension-call:$VERSION"
        const val rxJavaWrapper = "com.agoda.ninjato:extension-rxjava:$VERSION"
        const val rxJava2Wrapper = "com.agoda.ninjato:extension-rxjava2:$VERSION"

    }

}