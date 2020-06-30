package modelo;

public class Validacao
{
    private String numero1 = "";
    private String numero2 = "";
    private Double num1 = 0.0;
    private Double num2 = 0.0;
    private String mensagem = "";
    private String operacao = "";


    public  Validacao(String numero1, String numero2, String operacao)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
        ValidarNumero();
        ValidarOperacao();
    }
    
    private void ValidarNumero()
    {
        this.mensagem = "";
        try
        {
            this.num1 = Double.parseDouble(this.numero1);
        }
        catch (NumberFormatException e)
        {
            this.mensagem = "Número inválido campo 1 \n";
        }
        
        try
        {
            this.num2 = Double.parseDouble(this.numero2);
        }
        catch (NumberFormatException e)
        {
            this.mensagem += "Número inválido campo 2";
        }
       
        
        }
    private void ValidarOperacao()
    {
        if (this.num2 != null)
        {
            if (this.operacao.equals("/") && this.num2.equals(0.0))
            {
                this.mensagem += "Divisão por 0";
            }
        }
        
    }

    public Double getNum1()
    {
        return num1;
    }

    public Double getNum2()
    {
        return num2;
    }

    public String getMensagem()
    {
        return mensagem;
    }
    
}
