import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
}

kotlin {
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        moduleName = "firebase"
        browser {
            commonWebpackConfig {
                outputFileName = "firebaseConfig.js"
                devServer = (devServer ?: KotlinWebpackConfig.DevServer()).apply {
                    static = (static ?: mutableListOf()).apply {
                        // Serve sources to debug inside browser
                        add("C:\\Users\\nagib\\IdeaProjects\\TeacherTask\\firebase\\src\\wasmJsMain\\kotlin\\teacher\\task\\project\\firebase\\")
                        add(project.projectDir.path)
                    }
                }
            }
        }
        binaries.executable()
    }

    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    jvm()

    sourceSets {

        val wasmJsMain by getting
        val jvmMain by getting

        commonMain.dependencies {

            implementation(libs.koin.core)
        }

        androidMain.dependencies {

            implementation(libs.play.services.auth)

            implementation(libs.firebase.auth)
            implementation(libs.firebase.appcheck.debug)
        }

        wasmJsMain.dependencies {
            implementation(npm("firebase", "10.12.2"))
        }

        jvmMain.dependencies {
            implementation("dev.gitlive:firebase-java-sdk:0.4.3")
        }
    }
}

android {
    namespace = "teacher.task.project.firebase"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}