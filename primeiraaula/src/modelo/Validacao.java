package modelo;

public class Validacao
{
    public String mensagem;
    public Double num1;
    public Double num2;
    
    public void validar(String n1, String n2)
    {
        this.mensagem = "";
        try
        {
            this.num1 = Double.parseDouble(n1);
            this.num2 = Double.parseDouble(n2);
            
        }
        catch (Exception e)
        {
           this.mensagem = "Erro de conversão"; 
        }
    }
}
