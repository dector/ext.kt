package io.github.dector.ext.html

import kotlinx.html.BODY
import kotlinx.html.HEAD
import kotlinx.html.body
import kotlinx.html.head
import kotlinx.html.html
import kotlinx.html.lang
import kotlinx.html.meta
import kotlinx.html.stream.appendHTML
import kotlinx.html.title

fun html5Page(
    lang: String? = null,
    charset: String? = "utf-8",
    title: String? = null,
    headExt: HEAD.() -> Unit = {},
    bodyExt: BODY.() -> Unit = {}
): WebPageContent =
    buildString {
        appendln("<!DOCTYPE html>")
        appendHTML()
            .html {
                if (lang != null) {
                    this.lang = lang
                }

                head {
                    if (charset != null) {
                        meta(charset = charset)
                    }
                    if (title != null) {
                        title { +title }
                    }

                    headExt()
                }

                body {
                    bodyExt()
                }
            }
    }.let(::WebPageContent)
