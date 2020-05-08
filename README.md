# kotlinStarter
Pure Kotlin Android Starter Project Based On Kotlin Gadle And Easy Dependency Management

> Creating a new project is more stiff then developing ?
> Searching for libraries, finding new versions takes lot of efforts
> Wish it should be like intant 2 minutes noodles

There is **misa en place**
created for you with the finest ingredients and all you need to do is start cooking your master recipie,
I'll pick the finest and fresh ingredients for you i.e your all your favourite libraries with latest versions

## Advantages

Using this repo in place of creating new project from android studio will give you lot more advantage

- pure kotlin project
- gradle file based on kotlin dsl
- all of the gradle kotlin script advantage
- easy library management
- material design setup
- andorid theme & style followed by material design
- light & dark themes

**kolinStarter** is a starter project to get you started quickly and save your efforts.
All you need to do follow few steps

- Download / Clone the repo
- Refactor Package Name & App Name
- Change ```applicationId = "your.app.id"```
- Change ```rootProject.name = "Your App Name"``` in ```settings.gralde.kts```

 Or you can just use ***buildSrc** or **[Libs](/buildSrc/src/main/java/Libs.kt)** file to get updated and easy to implement dependencies as per your choice

That's it your project is setup successfully now what's you need to do just add your dependencies as spices

> All of the dependencies versions in [Libs](/buildSrc/src/main/java/Libs.kt) file are to update & it get updated on weekly bases, I use only sable versions and if it goes out dated feel free to fork

#### To add your dependencies just follow these steps

use  **[Libs](/buildSrc/src/main/java/Libs.kt)**  file in buildSrc for library implementation

**Sample**

```
dependencies {
    implementation(Libs.Kotlin.stdLib)
    implementation(Libs.AndroidX.coreKtx)
    implementation(Libs.AndroidX.appCompat)
    implementation(Libs.AndroidX.constraintLayout)
    implementation(Libs.AndroidX.materialDesign)
    implementation(Libs.Glide.glide)
    kapt(Libs.Glide.compiler)

    testImplementation(Libs.Testing.junit)
    androidTestImplementation(Libs.Testing.Androidx.junitExt)
    androidTestImplementation(Libs.Testing.Androidx.expresso)
}
```

**There are the library that you can implement using [Libs](/buildSrc/src/main/java/Libs.kt)**

All Plugin can be found under ```Libs.Plugin``` object

| Gradle Plugin | Use As |
| ------ | ------ |
| com.android.application | ```Libs.Plugins.androidApplication``` |
| kotlin-android | ```Libs.Plugins.androidApplication``` |
| kotlin-android-extensions | ```Libs.Plugins.kotlinAndroidExtensions``` |
| kotlin-kapt| ```Libs.Plugins.kotlinKapt``` |

**Sample**

```
plugins {
    id(Libs.Plugins.androidApplication)
    id(Libs.Plugins.kotlinAndroid)
    id(Libs.Plugins.kotlinAndroidExtensions)
    id(Libs.Plugins.kotlinKapt)
}
```

**Android ViewModel & LiveData**
All viewmodel & livedata related dependencies can be found under ```Libs.LifeCycle``` object

| Retrofit | Use As | Use With |
| --- | --- | --- |
| lifecycle-viewmodel | ```Libs.LifeCycle.viewModel``` | implementation |
| lifecycle-viewmodel-ktx | ```Libs.LifeCycle.viewModelKtx``` | implementation |
| lifecycle-livedata | ```Libs.LifeCycle.liveData``` | implementation|
| lifecycle-livedata-ktx | ```Libs.LifeCycle.liveDataKtx``` | implementation |
| lifecycle-runtime | ```Libs.LifeCycle.runtime``` | implementation |
| lifecycle-runtime-ktx | ```Libs.LifeCycle.runtimeKtx``` | implementation |
| lifecycle-viewmodel-savedstate | ```Libs.LifeCycle.viewModelSavedState``` | implementation |
| lifecycle-compiler | ```Libs.LifeCycle.compile``` | kapt |
| lifecycle-common-java8 | ```Libs.LifeCycle.java8``` | implementation |
| lifecycle-reactivestreams | ```Libs.LifeCycle.reactiveStream``` | implementation |
| lifecycle-reactivestreams-ktx | ```Libs.LifeCycle.reactiveStreamKtx``` | implementation |
| core-testing | ```Libs.LifeCycle.reactiveStreamKtx``` | testImplementation |

**Android Navigation Component**
All viewmodel & livedata related dependencies can be found under ```Libs.Navigation``` object

| Navigation | Use As | Use With |
| --- | --- | --- |
| navigation-fragment | ```Libs.Navigation.fragment``` | implementation |
| navigation-fragment-ktx | ```Libs.Navigation.fragmentKtx``` | implementation |
| navigation-ui | ```Libs.Navigation.ui``` | implementation |
| navigation-ui-ktx | ```Libs.Navigation.uiKtx``` | implementation |
| navigation-safe-args-gradle-plugin | ```Libs.Navigation.navArgsGradlePlugin``` | classpath *use this in project level gradle* |

don't forget to add safe arg plugin in your project if you are using it you can implement it as

```Libs.Plugins.Navigation.javaPlugin``` if using java
```Libs.Plugins.Navigation.kotlinPlugin``` if using kotlin

**Retrofit**
All retrofit dependencies can be found under ```Libs.Rerofit``` object use with ```implementation()``` only

| Retrofit | Use As |
| --- | --- |
| retrofit | ```Libs.Retrofit.Retrofit``` |
| converter-gson | ```Libs.Retrofit.converterGson``` |
| converter-scalars | ```Libs.Retrofit.converterScalar``` |
| converter-moshi | ```Libs.Retrofit.converterMoshi``` |
| converter-jackson | ```Libs.Retrofit.converterJackson``` |
| converter-simplexml |```Libs.Retrofit.converterSimpleXml``` |
| adapter-rxjava |```Libs.Retrofit.adapterRxJava``` |
| adapter-rxjava2 |```Libs.Retrofit.adapterRxJava2``` |
| retrofit-mock |```Libs.Retrofit.adapterMock``` |

**Checkout [Libs](/buildSrc/src/main/java/Libs.kt) to get more library implementations**

> For more reference on using kotlin script on gradle take a look at this medium post
> [The New Way of Writing Build Gradle with Kotlin DSL](https://proandroiddev.com/the-new-way-of-writing-build-gradle-with-kotlin-dsl-script-8523710c9670) thanks to [Pro Android Dev](https://proandroiddev.com/)