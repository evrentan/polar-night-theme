plugins {
    id("org.jetbrains.intellij.platform") version "2.1.0"
}

group = "com.evren"
version = "1.0.0"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        // Minimum IDE to build against — covers all JetBrains IDEs
        intellijIdeaCommunity("2024.1")
        instrumentationTools()
    }
}

// Theme-only plugin — no Java/Kotlin source to instrument
tasks {
    instrumentCode     { enabled = false }
    instrumentTestCode { enabled = false }
}

intellijPlatform {
    pluginConfiguration {
        id = "com.evren.polar-night-theme"
        name = "Polar Night Theme"
        version = "1.0.0"
        description = """
            A deep navy dark theme with rich but muted syntax colors,
            designed for focused, distraction-free coding sessions.

            Features:
            - Deep navy background (easy on eyes for long sessions)
            - Rich but desaturated palette: sage green, soft amber, lavender, pale blue
            - Comprehensive UI coverage: editor, tool windows, terminal, diff, debugger
            - Full syntax coverage: Java, Kotlin, Python, JS/TS, Go, Rust, CSS, HTML, XML, JSON, YAML, Markdown
            - Italic comments for visual hierarchy
        """.trimIndent()

        ideaVersion {
            sinceBuild = "241"        // IntelliJ IDEA 2024.1+
            untilBuild = provider { null }  // no upper limit
        }

        vendor {
            name = "evren"
            url = "https://github.com/evrentan/polar-night-theme"
        }

        changeNotes = """
            <ul>
                <li>1.0.0 — Initial release</li>
            </ul>
        """.trimIndent()
    }

    // Publishing and signing configured manually via plugins.jetbrains.com
}
