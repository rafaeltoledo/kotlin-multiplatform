package net.rafaeltoledo.web.component

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.h1

class HelloComponent: RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        div(classes = "content") {
            h1 {
                +"Hello!"
            }
        }
    }
}

fun RBuilder.hello() = child(HelloComponent::class) { }
