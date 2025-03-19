plugins {
    id("com.android.application")
}

android {
    namespace = "lanchon.sigspoof.checker"
    compileSdk = 34

    defaultConfig {
        applicationId = "lanchon.sigspoof.checker"
        minSdk = 9
        targetSdk = 35
        versionCode = 3
        versionName = "1.2"
    }

    signingConfigs {
        create("release") {
            storeFile = rootDir.resolve("keystore.jks")
            storePassword = "android"
            keyAlias = "key"
            keyPassword = "android"

            enableV1Signing = true
            enableV2Signing = true
            enableV3Signing = true
            enableV4Signing = false
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("release")
        }
    }
}

dependencies {
    //noinspection GradleDependency
    implementation("com.android.support:appcompat-v7:25.4.0")
}
