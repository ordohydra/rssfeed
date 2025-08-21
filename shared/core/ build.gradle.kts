plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm()
    applyDefaultHierarchyTemplate()
    iosSimulatorArm64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(":shared:core:FeedItemsProvider:FeedItemImpl")
            }
        }
        val commonTest by getting
    }
}