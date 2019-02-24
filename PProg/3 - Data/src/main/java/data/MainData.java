/*
 * Analise a classe Data fornecida e que foi construída com base nos seguintes requisitos:
    a) Permitir obter o estado de um objeto Data no formato "ano/mês/dia".
    b) Determinar o dia da semana de uma data, tendo em conta que:
        § O dia 1/1/1 é uma segunda-feira;
        § Um ano não bissexto avança um dia da semana (365 % 7 = 1);
        § Um ano bissexto avança 2 dias da semana (366 % 7 = 2).
        § Anos bissextos são os anos divisíveis por 4 mas não por 100, ou os divisíveis por 400.
    c) Permitir obter o estado de um objeto Data por extenso. Exemplo: "terça-feira, 23 de fevereiro de
    2016".
    d) Verificar se uma data é maior (mais recente) do que outra.
    e) Determinar a diferença, em dias, entre duas datas.
 */
package data;

/**
 *
 * @author ssilv
 */
public class MainData {
    
    public static void main(String []args){
        //ex a/b
        Data data1 = new Data(2019, 02, 23);
        System.out.println(data1.toString());
        
        // c/d
        Data data2 = new Data(1974 , 04, 25);
        System.out.println(data2.getAno()+"/" + data2.getMes()+"/"+data2.getDia());
      
        //e
        if (data1.isMaior(data2) == true){
            System.out.println("A primeira data: " + data1.getAno()+"/"+data1.getMes()+"/"+data1.getDia()
            + " ,é maior do que a segunda data: "+data2.getAno()+"/"+data2.getMes()+"/" +data2.getDia());
            
        }else
            System.out.println("A segunda data: " + data2.getAno()+"/"+data2.getMes()+"/"+data2.getDia()
            + " ,é maior do que a primeira data: "+data1.getAno()+"/"+data1.getMes()+"/" +data1.getDia());
        
        //f
        System.out.println("O número de dias entre data1 e data2 é de: " + data1.calcularDiferenca(data2));
        
        // g
        int ano = 2019;
        int mes = 12;
        int dia = 25;
        
        System.out.println("Faltam " + data1.calcularDiferenca(ano, mes, dia) + " dias para o Natal");
        
        //h
        System.out.println("O 25 de Abril de 1974 calhou numa: " + data2.determinarDiaDaSemana());
        
        //i
        
        if (Data.isAnoBissexto(data2.getAno())== true){
            System.out.println("O ano de 1974 é bissexto");
        }else
            System.out.println("O ano de 1974 não é bissexto");
        
        // ou podia usar...
        //System.out.println(data2.isAnoBissexto(ano));
    }
}
