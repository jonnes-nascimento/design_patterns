from impostos import *

class Calculador_de_impostos(object):

    # padrao de projeto STRATEGY: um dos parametros da funcao de calculo e uma outra funcao que possui a estrategia de calculo
    # isso evita que tenhamos que colocar um monte de ifs na rotina de calculo, para selecionar qual imposto queremos calcular
    
    def realiza_calculo(self, orcamento, imposto):
        impostos_calculado = imposto.calcula(orcamento)
        print impostos_calculado

if __name__ == '__main__':
    from orcamento import Orcamento

    calculador = Calculador_de_impostos()

    orcamento = Orcamento(500)

    calculador.realiza_calculo(orcamento, ISS())
    calculador.realiza_calculo(orcamento, ICMS())
    calculador.realiza_calculo(orcamento, IRPF())
