plugins {
    id(Libs.Plugins.androidApplication)
    id(Libs.Plugins.kotlinAndroid)
    id(Libs.Plugins.kotlinAndroidExtensions)
    id(Libs.Plugins.kotlinKapt)
}

android {

    compileSdkVersion(Libs.COMPILE_SDK_VERSION)

    defaultConfig {
        applicationId = "com.adven.starter"
        minSdkVersion(Libs.MIN_SDK_VERSION)
        targetSdkVersion(Libs.TARGET_SDK_VERSION)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes{
        getByName("release"){
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions{
        jvmTarget = "1.8"
    }

}

dependencies {
    implementation(Libs.Kotlin.stdLib)
    implementation(Libs.AndroidX.coreKtx)
    implementation(Libs.AndroidX.appCompat)
    implementation(Libs.AndroidX.constraintLayout)
    implementation(Libs.AndroidX.materialDesign)

    testImplementation(Libs.Testing.junit)
    androidTestImplementation(Libs.Testing.Androidx.junitExt)
    androidTestImplementation(Libs.Testing.Androidx.expresso)
}