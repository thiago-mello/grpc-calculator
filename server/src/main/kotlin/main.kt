fun main() {
    val port = 3000
    val server = CalculatorServer(port)

    server.start()
    server.blockUntilShutdown()
}