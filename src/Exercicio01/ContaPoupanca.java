package Exercicio01;

import Exercicio02.Imposto;

public class ContaPoupanca extends Conta implements Imposto {


    @Override
    public double rendimentoMensal() {
        setSaldo(getSaldo() + getSaldo() * 0.05);
        return getSaldo();
    }

    @Override
    public void calcularImposto() {


    }
}