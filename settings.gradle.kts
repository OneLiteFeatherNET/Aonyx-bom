rootProject.name = "aonyx-bom"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven {
            name = "OneLiteFeatherRepository"
            url = uri("https://repo.onelitefeather.dev/onelitefeather")
            if (System.getenv("CI") != null) {
                credentials {
                    username = System.getenv("ONELITEFEATHER_MAVEN_USERNAME")
                    password = System.getenv("ONELITEFEATHER_MAVEN_PASSWORD")
                }
            } else {
                credentials(PasswordCredentials::class)
                authentication {
                    create<BasicAuthentication>("basic")
                }
            }
        }
    }
    versionCatalogs {
        create("libs") {
            version("aves", "1.6.1")
            version("xerus", "1.3.0")
            version("mycelium.bom", "1.1.2")

            library("mycelium.bom", "net.theevilreaper.mycelium.bom", "mycelium-bom").versionRef("mycelium.bom")
            library("aves", "de.icevizion.lib", "aves").versionRef("aves")
            library("xerus", "net.theevilreaper.xerus", "xerus").versionRef("xerus")
        }
    }
}
