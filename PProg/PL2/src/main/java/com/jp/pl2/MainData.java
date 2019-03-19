/*
2. Crie uma nova classe com o nome MainData para invocar todas as funcionalidades da classe Data. Para
isso:
a) Crie uma instância da classe Data com o nome data1 e que represente a data de hoje.
b) Mostre data1 usando o formato por extenso.
c) Crie uma outra instância da classe Data chamada data2 que guarde a data 25 de abril de 1974.
d) Mostre data2 no formato "ano/mês/dia".
e) Utilize o método de instância isMaior para confirmar que, de facto, data1 é mais recente do que
data2.
f) Determine o número de dias entre data1 e data2.
g) Determine o número de dias que faltam para o Natal, usando o método que recebe, por
parâmetro, o dia, o mês e o ano de uma data.
h) Determine o dia da semana em que ocorreu o dia 25 de abril de 1974.
i) Verifique se o ano 1974 foi bissexto, invocando o método de classe isAnoBissexto:
    § Através do objeto data2;
    § Através da classe Data.
 */
package com.jp.pl2;

/**
 *
 * @author ASUS
 */
public class MainData {
    
    public static void main(String[] args) {
        //a)
        Data data1 = new Data(2019, 2, 22);
        //b)
        System.out.println(data1.toString());
        //c)
        Data data2 = new Data(1974, 4, 25);
        //d)
        System.out.println(data2.toAnoMesDiaString());
        //e)
        System.out.println(data1.isMaior(data2));
        //f)
        System.out.println(data1.calcularDiferenca(data2));
        //g)
        Data natal = new Data();
        natal.setData(2019, 12, 25);
        System.out.println(data1.calcularDiferenca(natal));
        //h)
        System.out.println(data2.determinarDiaDaSemana());
        //i)
        System.out.println(Data.isAnoBissexto(data2.getAno()));
        System.out.println(Data.isAnoBissexto(1974));
    }    
}
