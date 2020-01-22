package io.github.dector.ext.html

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import kotlinx.html.div
import kotlinx.html.h1
import kotlinx.html.script

class HtmlPageKtTest : StringSpec({

    "empty html" {
        html5Page().html.trim() shouldBe """
            <!DOCTYPE html>
            <html>
              <head>
                <meta charset="utf-8">
              </head>
              <body></body>
            </html>
        """.trimIndent()
    }

    "extended html" {
        val actual = html5Page(
            lang = "en",
            title = "hello, world",
            headExt = {
                script { +"helloJs()" }
            }
        ) {
            div("content") {
                h1 { +"I'm alive" }
            }
        }

        actual.html.trim() shouldBe """
            <!DOCTYPE html>
            <html lang="en">
              <head>
                <meta charset="utf-8">
                <title>hello, world</title>
                <script>helloJs()</script>
              </head>
              <body>
                <div class="content">
                  <h1>I'm alive</h1>
                </div>
              </body>
            </html>
        """.trimIndent()
    }
})
