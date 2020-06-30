package modelo;

public class Calcular extends Propriedades
{
    

    public Calcular(Double num1, Double num2, String operacao)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
        Calculos();
    }
    
    private void Calculos()
    {
        if (operacao.equals("+")) 
                Somar();
        if (operacao.equals("-")) 
                Subtrair();
        if (operacao.equals("/")) 
                Dividir();
        if (operacao.equals("*")) 
                Multiplicar();
    }
    private void Somar()
    {
        this.res = this.num1 + this.num2;
    }
    private void Subtrair()
    {
        this.res = this.num1 - this.num2;
    }
    private void Dividir()
    {
        this.res = this.num1 / this.num2;
    }
    private void Multiplicar()
    {
        this.res = this.num1 * this.num2;
    }

    public Double getRes()
    {
        return res;
    }
    
}

