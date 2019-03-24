package pt.ipp.isep_1nb_tp1_1171343_1161874;

/**
 * Esta classe permite a construção de uma hierarquia de classes para
 * representarem atletas não profissionais.
 * 
 * @author António (1171343) & João (1161874)
 */
public abstract class AtletaNaoProfissional extends Atleta {

    /**
     * Antiguidade do atleta no clube
     */
    private int antiguidade;
    /**
     * percentagem para atletas que tenham entre 5 a 10 anos no clube
     */
    private static float percentAntiguidade510 = 0.02f;
    /**
     * percentagem para atletas que tenham entre 10 a 20 anos no clube
     */
    private static float percentAntiguidade1020 = 0.08f;
    /**
     * percentagem para atletas que tenham mais de 20 anos no clube
     */
    private static float percentAntiguidade20 = 0.2f;

    /**
     * Antiguidade do atleta por omissão
     */
    private final static int ANTIGUIDADE_POR_OMISSAO = 0;

    /**
     * Inicializa construtor do atleta por omissão
     */
    public AtletaNaoProfissional() {
        super();
        antiguidade = ANTIGUIDADE_POR_OMISSAO;
    }

    /**
     * Inicializa o construtor atleta não profissional com o nome, número de identificação cívil,
     *  género, idade, atividade, frequência cardíaca em repouso e antiguidade
     * 
     * @param nome - nome do atleta
     * @param numIdCivil - número de identificação cívil do atleta
     * @param genero - género do atleta
     * @param idade - idade do atleta
     * @param atividade - atividade do atleta
     * @param freqCardRepouso - frequencia cardiaca em repouso do atleta
     * @param antiguidade - antiguidade no clube
     */
    public AtletaNaoProfissional(String nome, int numIdCivil, String genero,
            int idade, String atividade, int freqCardRepouso, int antiguidade) {
        super(nome, numIdCivil, genero, idade, atividade, freqCardRepouso);
        this.antiguidade = antiguidade;
    }

    /**
     * Devolve número de anos no clube
     * 
     * @return antiguidade no clube
     */
    public int getAntiguidade() {
        return antiguidade;
    }

    /**
     * Modifica o número de anos no clube
     * 
     * @param antiguidade no clube
     */
    public void setAntiguidade(int antiguidade) {
        this.antiguidade = antiguidade;
    }

    /**
     * Devolve a percentagem do prémio de atletas com mais de 5
     * anos e 10 ou menos
     * 
     * @return percentagem de antiguidade
     */
    public static float getPercentAntiguidade510() {
        return percentAntiguidade510;
    }

    /**
     * Modifica o valor da percentagem do prémio de atletas com mais
     * de 5 anos e 10 ou menos
     * 
     * @param percentAntiguidade510 novo valor de percentagem
     */
    public static void setPercentAntiguidade510(float percentAntiguidade510) {
        AtletaNaoProfissional.percentAntiguidade510 = percentAntiguidade510;
    }

    /**
     * Devolve a percentagem do prémio de atletas com mais de 5
     * anos e 10 ou menos
     * 
     * @return percentagem de antiguidade
     */
    public static float getPercentAntiguidade1020() {
        return percentAntiguidade1020;
    }

    /**
     * Modifica o valor da percentagem do prémio de atletas com mais
     * de 10 anos e 20 ou menos
     * 
     * @param percentAntiguidade1020 novo valor de percentagem
     */
    public static void setPercentAntiguidade1020(float percentAntiguidade1020) {
        AtletaNaoProfissional.percentAntiguidade1020 = percentAntiguidade1020;
    }

    /**
     * Devolve a percentagem do prémio de atletas com mais de 20 anos
     * 
     * @return percentagem de antiguidade
     */
    public static float getPercentAntiguidade20() {
        return percentAntiguidade20;
    }

    /**
     * Modifica o valor da percentagem do prémio de atletas com mais
     * de 20 anos
     * 
     * @param percentAntiguidade20 novo valor de percentagem
     */
    public static void setPercentAntiguidade20(float percentAntiguidade20) {
        AtletaNaoProfissional.percentAntiguidade20 = percentAntiguidade20;
    }
    
    /**
     * Devolve a descrição textual do atleta não profissional
     * 
     * @return caraterísticas do atleta não profissional
     */    
    @Override
    public String toString() {
        return String.format(super.toString() + "Antiguidade: %d%n", antiguidade);
    }
}
