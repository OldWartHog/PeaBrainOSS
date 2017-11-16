import com.beust.kobalt.*
import com.beust.kobalt.plugin.packaging.*
import com.beust.kobalt.plugin.application.*
import com.beust.kobalt.plugin.kotlin.*

val p = project {
    name = "kobalt-line-count"
    group = "uk.co.strand.peabrain.kobalt.plugin"
    artifactId = name
    version = "0.1"

    dependencies {
        compile("org.jetbrains.kotlin:kotlin-runtime:1.1.51")
        compile("org.jetbrains.kotlin:kotlin-stdlib:1.1.51")
        compile("com.beust:kobalt-plugin-api:")
    }

    dependenciesTest {
        compile("org.testng:testng:6.11")
    }

    assemble {
        jar {
        }
    }

    application {
        mainClass = "com.example.MainKt"
    }
}