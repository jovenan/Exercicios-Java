package Modelo;

public abstract class absPropriedades implements intMetodos
{
    protected String valor;
    protected String tipoCalculo;
    protected Double valorTemperatura;
    protected Double resultado;
    protected String mensagem;
    protected String resposta;

    public absPropriedades(String valor, String tipoCalculo)
    {
        this.valor = valor;
        this.tipoCalculo = tipoCalculo;
        Executar();
    }

    public absPropriedades(String valor)
    {
        this.valor = valor;
    }

    public absPropriedades(Double valorTemperatura)
    {
        this.valorTemperatura = valorTemperatura;
    }

    public String getResposta()
    {
        return resposta;
    }

    @Override
    public String toString()
    {
        return mensagem;
    }

    
    
}
