pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    plugins {
        id("com.android.application") version "8.2.0"
        id("com.android.library") version "8.2.0"
        id("org.jetbrains.kotlin.android") version "2.0.20"
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS) // Allow repositories here to take precedence
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MPM"
include(":app")
