package Modelo;

public class Controle extends absPropriedades
{
    
    public Controle(String lado1, String lado2, String lado3)
    {
        super(lado1, lado2, lado3);
        this.Verificar();
    }
    private void Verificar()
    {
        this.setMensagem("");
        Validacao validacao = new Validacao(getLado1(), getLado2(), getLado3());
        if (validacao.getMensagem().equals(""))
        {
            Triangulos triangulos = new Triangulos(validacao.getL1(), validacao.getL2(), validacao.getL3());
            this.setResposta(triangulos.getResposta());
        }
        else
        {
            this.setMensagem(validacao.getMensagem());
        }
    }
}
