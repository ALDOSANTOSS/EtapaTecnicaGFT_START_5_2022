package Exercicio01;


import Exercicio02.Imposto;

public class ContaCorrente extends Conta implements Imposto {

        @Override
        public double rendimentoMensal() {
            setSaldo(getSaldo() + getSaldo() *0.03);
            return getSaldo();
        }

    @Override
    public void calcularImposto() {

    }
}

