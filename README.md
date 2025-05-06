## Aonyx

The Aonyx project is a Software Bill of Materials (SBOM) definition primarily intended for use in minigames.  
It builds on top of the `mycelium-bom` and defines additional dependencies.

These include:
- Aves
- Xerus
- Guira

> [!WARNING]
> This project is intended for internal use only and is not suitable for public distribution.

Gradle (Kotlin DSL):

```kotlin
dependencies {
    implementation(platform("net.onelitefeather:aonyx-bom:<version>"))

    // Dependencies without version specification
    implementation("net.theevilreaper:aves")
    implementation("net.theevilreaper:xerus")
    implementation("net.onelitefeather:guira")
    // ...
}
