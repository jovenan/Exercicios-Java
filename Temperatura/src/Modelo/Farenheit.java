package Modelo;

public class Farenheit extends absPropriedades
{

    public Farenheit(Double valorTemperatura)
    {
        super(valorTemperatura);
    }

    @Override
    public void Executar()
    {
        this.resultado = (this.valorTemperatura - 32) / 1.8;
    }
    
}
