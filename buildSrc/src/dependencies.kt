object Deps {
    object kotlin {
        const val jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin.version}"
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlin.coroutines}"
    }

    const val kotlintest = "io.kotlintest:kotlintest-runner-junit5:${Versions.kotlintest}"

    object kotlinx {
        const val html = "org.jetbrains.kotlinx:kotlinx-html-jvm:${Versions.kotlinx.html}"
    }
}

object Versions {
    object kotlin {
        const val version = "1.3.61"
        const val coroutines = "1.3.2"
    }

    const val kotlintest = "3.4.2"

    object kotlinx {
        const val html = "0.6.12"
    }
}
