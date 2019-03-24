package pt.ipp.isep_1nb_tp1_1171343_1161874;

/**
 * Esta classe permite a construção de uma hierarquia de classes para
 * representarem atletas profissionais.
 * 
 * @author António (1171343) & João (1161874)
 */
public class AtletaProfissional extends Atleta {

    /**
     * Parcela fixa que cada atleta recebe mensalmente
     */
    private float valorParcelaFixa;
    /**
     * valor mensal arrecadado em prémios que cada jogador recebe
     */
    private float valorPremios;
    /**
     * Percentagem do valor mensal que cada jogador recebe
     */
    private static float percentParcelaVariavel = 0.2f;
    /**
     * Quantidade de atletas profissionais no clube
     */
    private static int contadorAtletaProfissional = 0;

    /**
     * Parcela fixa que cada atleta recebe mensalmente por omissão
     */
    private static final int VALOR_PARCELAFIXA_POR_OMISSAO = 0;
    /**
     * valor mensal arrecadado em prémios que cada jogador recebe por omissão
     */
    private static final int VALOR_PREMIOS_POR_OMISSAO = 0;

    /**
     * Inicializa construtor do atleta Profissional por omissão
     */
    public AtletaProfissional() {
        super();
        valorParcelaFixa = VALOR_PARCELAFIXA_POR_OMISSAO;
        valorPremios = VALOR_PREMIOS_POR_OMISSAO;
        contadorAtletaProfissional++;
    }

    /**
     * Inicializa o construtor atleta Profissional com o nome, número de identificação civil,
     * género, idade, atividade, frequência cardíaca em repouso, valor da parcela fixa e valor prémios
     * 
     * @param nome - nome do atleta
     * @param numIdCivil - número de identificação civil do atleta
     * @param genero - género do atleta
     * @param idade - idade do atleta
     * @param atividade - atividade do atleta
     * @param freqCardRepouso - frequencia cardiaca em repouso do atleta
     * @param valorParcelaFixa - Parcela fixa que cada atleta recebe mensalmente
     * @param valorPremios - valor mensal arrecadado em prémios que cada jogador recebe
     */
    public AtletaProfissional(String nome, int numIdCivil, String genero, int idade,
            String atividade, int freqCardRepouso, float valorParcelaFixa, float valorPremios) {
        super(nome, numIdCivil, genero, idade, atividade, freqCardRepouso);
        this.valorParcelaFixa = valorParcelaFixa;
        this.valorPremios = valorPremios;
        contadorAtletaProfissional++;
    }

    /**
     * Devolve valor parcela fixa
     * 
     * @return valor parcela fixa
     */
    public float getValorParcelaFixa() {
        return valorParcelaFixa;
    }

    /**
     * Modifica valor parcela fixa
     * 
     * @param valorParcelaFixa valor parcela fixa
     */
    public void setValorParcelaFixa(float valorParcelaFixa) {
        this.valorParcelaFixa = valorParcelaFixa;
    }

    /**
     * Devolve valor arrecadado dos prémios
     * 
     * @return valor arrecadado dos prémios
     */
    public float getValorPremios() {
        return valorPremios;
    }

    /**
     * Modifica valor arrecadado em prémios
     * 
     * @param valorPremios valor arrecadado em prémios
     */
    public void setValorPremios(float valorPremios) {
        this.valorPremios = valorPremios;
    }

    /**
     * Devolve Percentagem do valor mensal que cada jogador recebe
     * 
     * @return Percentagem do valor mensal que cada jogador recebe
     */
    public static float getPercentParcelaVariavel() {
        return percentParcelaVariavel;
    }

    /**
     * Modifica Percentagem do valor mensal que cada jogador recebe
     * 
     * @param percentParcelaVariavel Percentagem do valor mensal que cada jogador recebe
     */
    public static void setPercentParcelaVariavel(float percentParcelaVariavel) {
        AtletaProfissional.percentParcelaVariavel = percentParcelaVariavel;
    }

    /**
     * Devolve quantidade de atletas profissionais
     * 
     * @return quantidade de atletas profissionais
     */
    public static int getcontadorAtletaProfissional() {
        return contadorAtletaProfissional;
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
        return (valorParcelaFixa + valorPremios * percentParcelaVariavel);
    }

    /**
     * Devolve a descrição textual do atleta profissional
     *
     * @return caraterísticas do atleta profissional
     */
    @Override
    public String toString() {
        return String.format(super.toString() + "Valor Fixo Individual: %.2f%nValor Prémios: %.2f%n", 
                valorParcelaFixa, valorPremios);
    }
}
