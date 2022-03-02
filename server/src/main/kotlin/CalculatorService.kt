import Calculator.OperationRequest as OperationRequest
import Calculator.OperationResponse as OperationResponse

class CalculatorService(): CalculatorServiceGrpcKt.CalculatorServiceCoroutineImplBase() {
    override suspend fun addValues(request: OperationRequest): OperationResponse {
        val value = request.firstArg + request.secondArg;

        return OperationResponse.newBuilder().apply { error = false;  result = value}.build();
    }

    override suspend fun divValues(request: OperationRequest): OperationResponse {
        val value = request.firstArg / request.secondArg;

        return OperationResponse.newBuilder().apply { error = false; result = value}.build();
    }

    override suspend fun multValues(request: OperationRequest): OperationResponse {
        val value = request.firstArg * request.secondArg;

        return OperationResponse.newBuilder().apply { error = false;  result = value}.build();
    }

    override suspend fun subValues(request: OperationRequest): OperationResponse {
        val value = request.firstArg - request.secondArg;

        return OperationResponse.newBuilder().apply { error = false; result = value;}.build();
    }
}