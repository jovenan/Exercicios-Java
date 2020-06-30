package Modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String numero)
    {
        super(numero);
        this.ValidarNumero();
    }
    
    
    private void ValidarNumero()
    {
        this.setMensagem("");
        try
        {
            this.setNum(Integer.parseInt(getNumero()));
        }
        catch (NumberFormatException e)
        {
            this.setMensagem("Erro de conversão");
        }
    }
    
}
