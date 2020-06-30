package Modelo;

public class Controle extends absPropriedades implements intMetodos
{

    public Controle(String numero)
    {
        super(numero);
        this.Executar();
    }

    @Override
    public void Executar()
    {
        Validacao validacao = new Validacao(this.numero);
        if(Estaticos.mensagem.equals(""))
        {
            Fatorial fatorial = new Fatorial(validacao.num);
            this.num = fatorial.num;
        }

    }
    
}
