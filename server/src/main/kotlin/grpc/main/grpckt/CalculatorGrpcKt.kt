import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for CalculatorService.
 */
object CalculatorServiceGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = CalculatorServiceGrpc.getServiceDescriptor()

  val addValuesMethod: MethodDescriptor<Calculator.OperationRequest, Calculator.OperationResponse>
    @JvmStatic
    get() = CalculatorServiceGrpc.getAddValuesMethod()

  val subValuesMethod: MethodDescriptor<Calculator.OperationRequest, Calculator.OperationResponse>
    @JvmStatic
    get() = CalculatorServiceGrpc.getSubValuesMethod()

  val multValuesMethod: MethodDescriptor<Calculator.OperationRequest, Calculator.OperationResponse>
    @JvmStatic
    get() = CalculatorServiceGrpc.getMultValuesMethod()

  val divValuesMethod: MethodDescriptor<Calculator.OperationRequest, Calculator.OperationResponse>
    @JvmStatic
    get() = CalculatorServiceGrpc.getDivValuesMethod()

  /**
   * A stub for issuing RPCs to a(n) CalculatorService service as suspending coroutines.
   */
  @StubFor(CalculatorServiceGrpc::class)
  class CalculatorServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<CalculatorServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): CalculatorServiceCoroutineStub =
        CalculatorServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun addValues(request: Calculator.OperationRequest): Calculator.OperationResponse =
        unaryRpc(
      channel,
      CalculatorServiceGrpc.getAddValuesMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun subValues(request: Calculator.OperationRequest): Calculator.OperationResponse =
        unaryRpc(
      channel,
      CalculatorServiceGrpc.getSubValuesMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun multValues(request: Calculator.OperationRequest): Calculator.OperationResponse =
        unaryRpc(
      channel,
      CalculatorServiceGrpc.getMultValuesMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun divValues(request: Calculator.OperationRequest): Calculator.OperationResponse =
        unaryRpc(
      channel,
      CalculatorServiceGrpc.getDivValuesMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the CalculatorService service based on Kotlin coroutines.
   */
  abstract class CalculatorServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for CalculatorService.AddValues.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun addValues(request: Calculator.OperationRequest): Calculator.OperationResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method CalculatorService.AddValues is unimplemented"))

    /**
     * Returns the response to an RPC for CalculatorService.SubValues.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun subValues(request: Calculator.OperationRequest): Calculator.OperationResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method CalculatorService.SubValues is unimplemented"))

    /**
     * Returns the response to an RPC for CalculatorService.MultValues.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun multValues(request: Calculator.OperationRequest): Calculator.OperationResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method CalculatorService.MultValues is unimplemented"))

    /**
     * Returns the response to an RPC for CalculatorService.DivValues.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun divValues(request: Calculator.OperationRequest): Calculator.OperationResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method CalculatorService.DivValues is unimplemented"))

    final override fun bindService(): ServerServiceDefinition =
        builder(CalculatorServiceGrpc.getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CalculatorServiceGrpc.getAddValuesMethod(),
      implementation = ::addValues
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CalculatorServiceGrpc.getSubValuesMethod(),
      implementation = ::subValues
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CalculatorServiceGrpc.getMultValuesMethod(),
      implementation = ::multValues
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CalculatorServiceGrpc.getDivValuesMethod(),
      implementation = ::divValues
    )).build()
  }
}
