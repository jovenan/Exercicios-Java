package Modelo;

public class Celsius extends absPropriedades
{

    public Celsius(Double valorTemperatura)
    {
        super(valorTemperatura);
    }

    @Override
    public void Executar()
    {
        this.resultado = valorTemperatura * 1.8 + 32;
    }
    
}
