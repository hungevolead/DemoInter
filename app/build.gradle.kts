plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.frank.demointer"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.frank.demointer"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("com.github.bumptech.glide:glide:4.16.0")
//    implementation("com.squareup.retrofit2:retrofit:2.9.0")
//    implementation("com.google.code.gson:gson:2.10.1")
//    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
//    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")

    implementation("com.github.tomasharkema:RetrofitCurlPrinter:0.0.1")

    /*Android architectures libraries*/
    implementation("android.arch.navigation:navigation-fragment:1.0.0")
    implementation("android.arch.navigation:navigation-ui:1.0.0")
    implementation("android.arch.navigation:navigation-fragment-ktx:1.0.0")
    implementation("android.arch.navigation:navigation-ui-ktx:1.0.0")
    implementation("android.arch.lifecycle:extensions:1.0.0")
    implementation("android.arch.persistence.room:runtime:1.0.0")
    implementation("android.arch.persistence.room:rxjava2:1.0.0")
    implementation("android.arch.work:work-runtime:1.0.1")
    //kapt("android.arch.persistence.room:compiler:$rootProject.arch_room_version"
    implementation("androidx.core:core-ktx:1.1.0")

    /*Use this to long message instead Log.d*/
    implementation("com.jakewharton.timber:timber:4.7.1")

    /*Dagger libraries*/
    implementation("com.google.dagger:dagger:2.21")
    //kapt "com.google.dagger:dagger-compiler:$rootProject.dagger_version"

    /*Rx libraries to send and receive data use Observer pattern*/
    implementation("io.reactivex.rxjava2:rxjava:2.2.7")
    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")
    implementation("com.jakewharton.rxbinding2:rxbinding:2.0.0")
    implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")

    /*Retrofit and OkHttp  to call API to server*/
    implementation("com.squareup.retrofit2:retrofit:2.3.0")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.3.0")
    implementation("com.squareup.retrofit2:converter-gson:2.3.0")
    implementation("com.squareup.okhttp3:okhttp:3.8.1")
    implementation("com.squareup.okhttp3:logging-interceptor:3.8.1")
    implementation("com.google.code.gson:gson:2.8.1")

    /*EventBus to send and receive data use Observer pattern*/
    implementation("org.greenrobot:eventbus:3.0.0")

    /*EasyPermission to handle permission on Android 5.0 above*/
    implementation("pub.devrel:easypermissions:3.0.0")

    /*Kotlin Coroutine to set coroutines*/
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.2.0")

    /*Viewpager Indicator*/
    implementation("com.mcxiaoke.viewpagerindicator:library:2.4.1")

    /*threetenabp to use some functions relative to time*/
    implementation("com.jakewharton.threetenabp:threetenabp:1.2.0")

    implementation("androidx.work:work-runtime-ktx:2.7.1")

}