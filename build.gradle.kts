plugins {
    kotlin("multiplatform") version "1.7.10"
}

group = "me.purofle"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-cli:0.3.5")
            }
        }
        findByName("windowsMain")?.apply {
            dependsOn(commonMain)
        }

        findByName("linuxMain")?.apply {
            dependsOn(commonMain)
        }

    }

    linuxX64("linux") {
        compilations["main"].enableEndorsedLibs = true
        binaries {
            binaries {
                executable {
                    entryPoint = "com.github.purofle.fadian.main"
                }
            }
        }
    }
    val windows = mingwX64("windows") {
        binaries {
            binaries {
                binaries {
                    executable {
                        entryPoint = "com.github.purofle.fadian.main"
                    }
                }
            }
        }
    }

}