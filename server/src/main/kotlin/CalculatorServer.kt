import io.grpc.Server
import io.grpc.ServerBuilder

class CalculatorServer(
    val port: Int,
    val server: Server = ServerBuilder.forPort(port).addService(CalculatorService()).build()
) {

    fun start() {
        server.start()
        println("Listening on port $port")
    }

    fun blockUntilShutdown() {
        server.awaitTermination()
    }
}