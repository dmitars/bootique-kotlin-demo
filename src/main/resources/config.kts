import io.bootique.kotlin.config.undertow.httpListener
import io.bootique.kotlin.config.undertow.undertowFactory
import io.bootique.kotlin.demo.ApplicationConfiguration
import io.bootique.undertow.UndertowFactory


val application: ApplicationConfiguration = ApplicationConfiguration(
        message = "Message from config.kts"
)

val undertow: UndertowFactory = undertowFactory(httpListeners = listOf(
        httpListener(port = 9988)
))
