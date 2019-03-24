package pt.ipp.isep_1nb_tp1_1171343_1161874;

/**
 * Esta classe permite a construção de uma hierarquia de classes para
 * representarem atletas amadores.
 * 
 * @author António (1171343) & João (1161874)
 */
public class AtletaAmador extends AtletaNaoProfissional {

    /**
     * Valor monetario pela quantidade prémios que cada jogador tem
     */
    private float valorPremios;
    /**
     * Percentagem do valor mensal que cada jogador recebe
     */
    private float percentParcelaVariavelDois = 0.07f;
    /**
     * Cada jogador recebe pelo menos 5€
     */
    private float valorFixoParcelaVariavelDois = 5;
    /**
     * Contador de atletas amadores
     */
    private static int contadorAtletaAmador = 0;

    /**
     * Valor de premios por omissao
     */
    private final static int VALOR_PREMIOS_POR_OMISSAO = 0;

    /**
     * Inicia construtor do atleta amador por omissão
     */
    public AtletaAmador() {
        super();
        valorPremios = VALOR_PREMIOS_POR_OMISSAO;
        contadorAtletaAmador++;
    }

    /**
     * Inicializa o construtor atleta amador com o nome, número de identificação cívil,
     * género, idade, atividade, frequência cardíaca em repouso, antiguidade e valor por premios
     * 
     * @param nome - nome do atleta
     * @param numIdCivil - número de identificação cívil do atleta
     * @param genero - género do atleta
     * @param idade - idade do atleta
     * @param atividade - atividade do atleta
     * @param freqCardRepouso - frequencia cardiaca em repouso do atleta
     * @param antiguidade - antiguidade no clube
     * @param valorPremios - valor pelos prémios ganhos
     */
    public AtletaAmador(String nome, int numIdCivil, String genero, int idade,
            String atividade, int freqCardRepouso, int antiguidade, float valorPremios) {
        super(nome, numIdCivil, genero, idade, atividade, freqCardRepouso, antiguidade);
        this.valorPremios = valorPremios;
        contadorAtletaAmador++;
    }

    /**
     * Devolve o valor pelos prémios ganhos
     * 
     * @return valor pelos prémios ganhos
     */
    public float getValorPremios() {
        return valorPremios;
    }

    /**
     * Modifica o valor pelos prémios ganhos
     * @param valorPremios prémios ganhos
     */
    public void setValorPremios(float valorPremios) {
        this.valorPremios = valorPremios;
    }

    /**
     * Devolve percentagem do valor mensal que cada jogador recebe
     * 
     * @return percentagem do valor mensal que cada jogador recebe
     */
    public float getPercentParcelaVariavelDois() {
        return percentParcelaVariavelDois;
    }

    /**
     * Modifica a percentagem do valor mensal que cada jogador recebe
     * 
     * @param percentParcelaVariavelDois percentagem do valor mensal que cada jogador recebe
     */
    public void setPercentParcelaVariavelDois(float percentParcelaVariavelDois) {
        this.percentParcelaVariavelDois = percentParcelaVariavelDois;
    }

    /**
     * Devolve valor mínimo que cada jogador recebe
     * 
     * @return valor mínimo que cada jogador recebe
     */
    public float getValorParcelaVariavelDois() {
        return valorFixoParcelaVariavelDois;
    }

    /**
     * Modifica valor mínimo que cada jogador pode receber
     * 
     * @param valorFixoParcelaVariavelDois valor mínimo que cada jogador pode receber
     */
    public void setValorParcelaVariavelDois(float valorFixoParcelaVariavelDois) {
        this.valorFixoParcelaVariavelDois = valorFixoParcelaVariavelDois;
    }

    /**
     * Contador de atletas amadores
     * 
     * @return quantidade de atletas amadores
     */
    public static int getContadorAtletaAmador() {
        return contadorAtletaAmador;
    }

    /**
     * **
     * Permite o cálculo da Frequência Cardíaca Trabalho queima de gordura
     * através de polimorfismo
     * 
     * @return Frequência Cardíaca Trabalho queima de gordura
     */
     
    @Override
    public float calcularFreqCardTrabGordura() {
        return super.getFreqCardRepouso() + Atleta.getIntesidadeTreinoGordura()
                * (super.calcularFreqCardMax() - super.getFreqCardRepouso());
    }

    /**
     * Permite o cálculo da Frequência Cardíaca Trabalho cardiorrespiratória
     * através de polimorfismo
     * 
     * @return Frequência Cardíaca Trabalho cardiorrespiratória
     */
    @Override
    public float calcularFreqCardTrabCardio() {
        return super.getFreqCardRepouso() + Atleta.getIntesidadeTreinoCardio()
                * (super.calcularFreqCardMax() - super.getFreqCardRepouso());
    }

    /**
     * Permite o cálculo do valor mensal que cada atleta recebe
     * através de polimorfismo
     * 
     * @return cálculo do valor mensal
     */
    @Override
    public float calcularValorMensal() {

        return (valorPremios * (super.getAntiguidade() >= 5 && super.getAntiguidade() <= 10
                ? AtletaNaoProfissional.getPercentAntiguidade510() : super.getAntiguidade() > 10 && super.getAntiguidade() <= 20
                ? AtletaNaoProfissional.getPercentAntiguidade1020() : super.getAntiguidade() > 20
                ? AtletaNaoProfissional.getPercentAntiguidade20() : 1)) + (valorPremios * percentParcelaVariavelDois) + valorFixoParcelaVariavelDois;
    }

    /**
     * Devolve a descrição textual do atleta amador
     *
     * @return caraterísticas do atleta amador
     */
    @Override
    public String toString() {
        return String.format(super.toString() + "Valor Prémios: %.2f%n", valorPremios);
    }

}
