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
            version("aves", "1.11.1")
            version("xerus", "1.8.0")
            version("mycelium.bom", "1.4.3")
            version("guira", "0.5.0")

            library("mycelium.bom", "net.onelitefeather", "mycelium-bom").versionRef("mycelium.bom")
            library("guira", "net.onelitefeather", "guira").versionRef("guira")

            library("aves", "net.theevilreaper", "aves").versionRef("aves")
            library("xerus", "net.theevilreaper", "xerus").versionRef("xerus")
        }
    }
}
