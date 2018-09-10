package net.rafaeltoledo.web

import net.rafaeltoledo.web.component.hello
import react.dom.render
import kotlin.browser.document
import kotlin.browser.window

fun main(args: Array<String>) {
    window.onload = {
        val root = document.getElementById("root") ?: throw IllegalStateException("Element with id \"root\" not found!")
        render(root) {
            hello()
        }
    }
}