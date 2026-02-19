pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MedicationsCat"
include(":app")
include(":core:common")
include(":core:model")
include(":core:database")
include(":core:network")
include(":core:data")
include(":feature:auth")
include(":feature:medications")
include(":feature:profile")
include(":common")
