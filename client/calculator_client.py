from email import message
import grpc
import calculator_pb2
import calculator_pb2_grpc


class CalculatorClient(object):
    def __init__(self):
        self.host = 'localhost'
        self.server_port = 3000
        self.channel = grpc.insecure_channel(f'{self.host}:{self.server_port}')

        self.stub = calculator_pb2_grpc.CalculatorServiceStub(self.channel)

    def add(self, firstValue, secondValue):
        request_message = calculator_pb2.OperationRequest(
            firstArg=firstValue, secondArg=secondValue)
        return self.stub.AddValues(request_message).result

    def div(self, firstValue, secondValue):
        request_message = calculator_pb2.OperationRequest(
            firstArg=firstValue, secondArg=secondValue)
        return self.stub.DivValues(request_message).result

    def mult(self, firstValue, secondValue):
        request_message = calculator_pb2.OperationRequest(
            firstArg=firstValue, secondArg=secondValue)
        return self.stub.MultValues(request_message).result

    def sub(self, firstValue, secondValue):
        request_message = calculator_pb2.OperationRequest(
            firstArg=firstValue, secondArg=secondValue)
        return self.stub.SubValues(request_message).result


def parse_response(response: str):
    res_array = response.split(';')
    if len(res_array) != 2:
        raise AssertionError('O valor retornado pelo servidor foi incorreto.')

    if(res_array[0] == 'ERR'):
        raise RuntimeError(f'Erro na operação do servidor. {res_array[1]}')

    return res_array[1]


if __name__ == '__main__':
    client = CalculatorClient()

    while 1:

        print(
            'Operações disponíveis:\n(1) Soma [+]\n(2) Subtração [-]\n(3) Multiplicação [*]\n(4) Divisão [/]')
        op_char = ''
        op_text = ''

        while op_char == '':

            op = input('\nDigite o número da operação desejada:')

            if op == '1':
                op_char = '+'
                op_text = 'somados'
            elif op == '2':
                op_char = '-'
                op_text = 'subtraídos'
            elif op == '3':
                op_char = '*'
                op_text = 'multiplicados'
            elif op == '4':
                op_char = '/'
                op_text = 'divididos'
            else:
                print('\nOperação não reconhecida.\n')

        input_values = input(
            f'\nDigite os dois numeros a serem {op_text}, separados por um espaço: ')

        input_array = input_values.split(sep=' ')
        if len(input_array) != 2:
            print('\nValores digitados de forma incorreta. Tente novamente.\n')
            continue

        try:
            firstValue = float(input_array[0])
            secondValue = float(input_array[1])
            result = None

            if op_char == '+':
                result = client.add(firstValue, secondValue)
            elif op_char == '-':
                result = client.sub(firstValue, secondValue)
            elif op_char == '*':
                result = client.mult(firstValue, secondValue)
            else:
                result = client.div(firstValue, secondValue)

            print("\033[1m" + f'O resultado da operação é {result}\n')
            input("\033[0m" + '\nPressione ENTER para uma nova operação\n')

        except:
            print('\033[1m')
            print('\nOs valores precisam ser números decimais válidos. Tente novamente\n')
            print('\033[0m')
            continue
