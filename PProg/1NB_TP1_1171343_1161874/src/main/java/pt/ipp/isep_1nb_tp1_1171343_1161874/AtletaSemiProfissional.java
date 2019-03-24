package pt.ipp.isep_1nb_tp1_1171343_1161874;

/**
 * Esta classe permite a construção de uma hierarquia de classes para
 * representarem atletas Semiprofissionais.
 * 
 * @author António (1171343) & João (1161874)
 */
public class AtletaSemiProfissional extends AtletaNaoProfissional {

    /**
     * Quantidade de atletas semiprofissionais
     */
    private static int contadorAtletaSemiProfissional = 0;
    /**
     * Valor fixe que cada atleta recebe
     */
    private static float valorParcelaFixa = 100;

    /**
     * Inicializa construtor do atleta Semiprofissional por omissão
     */
    public AtletaSemiProfissional() {
        super();
        contadorAtletaSemiProfissional++;
    }

    /**
     * Inicializa o construtor atleta Semiprofissional com o nome, número de identificação civil,
     * género, idade, atividade, frequência cardíaca em repouso e antiguidade
     * 
     * @param nome - nome do atleta
     * @param numIdCivil - número de identificação civil do atleta
     * @param genero - género do atleta
     * @param idade - idade do atleta
     * @param atividade - atividade do atleta
     * @param freqCardRepouso - frequencia cardiaca em repouso do atleta
     * @param antiguidade - antiguidade no clube
     */
    public AtletaSemiProfissional(String nome, int numIdCivil, String genero, int idade,
            String atividade, int freqCardRepouso, int antiguidade) {
        super(nome, numIdCivil, genero, idade, atividade, freqCardRepouso, antiguidade);
        contadorAtletaSemiProfissional++;
    }

    /**
     * Devolve valor da parcela fixa
     * 
     * @return valor da parcela fixa
     */
    public static float getValorParcelaFixa() {
        return valorParcelaFixa;
    }

    /**
     * Modifica valor da parcela fixa
     * 
     * @param valorParcelaFixa valor da parcela fixa
     */
    public static void setValorParcelaFixa(float valorParcelaFixa) {
        AtletaSemiProfissional.valorParcelaFixa = valorParcelaFixa;
    }

    /**
     * Devolve quantidade de atletas semiProfissionais
     * 
     * @return quantidade de atletas semiProfissionais
     */
    public static int getContadorAtletaSemiProfissional() {
        return contadorAtletaSemiProfissional;
    }

     /**
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
        return (valorParcelaFixa + valorParcelaFixa * (super.getAntiguidade() >= 5 && super.getAntiguidade() <= 10
                ? AtletaNaoProfissional.getPercentAntiguidade510() : super.getAntiguidade() > 10 && super.getAntiguidade() <= 20
                ? AtletaNaoProfissional.getPercentAntiguidade1020() : super.getAntiguidade() > 20
                ? AtletaNaoProfissional.getPercentAntiguidade20() : 1));
    }

    /**
     * Devolve a descrição textual do atleta semiprofissional
     *
     * @return caraterísticas do atleta semiprofissional
     */
    @Override
    public String toString() {
        return String.format(super.toString() + "Valor Fixo Coletivo: %.2f%n", valorParcelaFixa);
    }
}
