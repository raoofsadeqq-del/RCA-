plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.rcatool.app"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.rcatool.app"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    signingConfigs {
        create("rca") {
            storeFile = file("rca.jks")
            storePassword = "rca123456"
            keyAlias = "rca"
            keyPassword = "rca123456"
        }
    }
    buildTypes {
        debug { signingConfig = signingConfigs.getByName("rca") }
        release { isMinifyEnabled = false }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}
