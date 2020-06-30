package Modelo;

public class Validacao extends absPropriedades implements intMetodos
{

    public Validacao(String numero)
    {
        super(numero);
        this.Executar();
    }

    @Override
    public void Executar()
    {
        Estaticos.mensagem = "";
        try
        {
            this.num= Integer.parseInt(numero);
        }
        catch (NumberFormatException e)
        {
            Estaticos.mensagem = "Número inválido";
        }
    }
    
}
