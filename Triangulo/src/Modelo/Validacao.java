package Modelo;

public class Validacao extends absPropriedades
{
    
    public Validacao(String lado1, String lado2, String lado3)
    {
        super(lado1, lado2, lado3);
        this.Validar();
    }
    
    private void Validar()
    {
        this.setMensagem("");
        try
        {
            this.setL1(Double.parseDouble(this.getLado1()));
            this.setL2(Double.parseDouble(this.getLado2()));
            this.setL3(Double.parseDouble(this.getLado3()));
            if(getL1() + getL2() > getL3() &&
               getL2() + getL3() > getL1() &&
               getL1() +getL3() > getL2())
            {
                
            }
            else this.setMensagem("Estes lados não pertencem a um triangulo");
        }
        catch (NumberFormatException e)
        {
            this.setMensagem("Erro de conversão");
        }
        
        
    }
}
