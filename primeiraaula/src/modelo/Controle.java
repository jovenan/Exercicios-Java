package modelo;

public class Controle
{
    
    public String calcular(String n1,String n2,String op)
    {
        String resposta = "";
        Validacao validacao = new Validacao();
        validacao.validar(n1, n2);
        if (validacao.mensagem.equals(""))
        {
            Calcular calcular = new Calcular();
            resposta = calcular.calculo(validacao.num1, validacao.num2, op).toString();
        }
        else
        {
            resposta = validacao.mensagem;
        }
        return resposta;
    }
}
