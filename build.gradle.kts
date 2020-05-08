// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Libs.Kotlin.kotlinGradlePlugin)
        classpath(Libs.GradlePlugin.androidGradlePlugin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.create("clean",Delete::class){
    delete(rootProject.buildDir)
}
