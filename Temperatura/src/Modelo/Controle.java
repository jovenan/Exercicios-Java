package Modelo;

public class Controle extends absPropriedades
{

    public Controle(String valor, String tipoCalculo)
    {
        super(valor, tipoCalculo);
    }

    @Override
    public void Executar()
    {
        this.mensagem = "";
        absPropriedades validacao = new Validacao(this.valor);
        if (validacao.toString().equals(""))
        {
            if (this.tipoCalculo.equals("CF"))
            {
                absPropriedades celsius = new Celsius(validacao.valorTemperatura);
                this.resposta = celsius.resultado.toString();
            }
            if (this.tipoCalculo.equals("FC"))
            {
                absPropriedades fahrenheit = new Farenheit(validacao.valorTemperatura);
                this.resposta = fahrenheit.resultado.toString();
            }
        }
        else
        {
            this.mensagem = validacao.toString();
        }
        
    }
    
}
