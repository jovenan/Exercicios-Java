package Modelo;

public class Primo extends absPropriedades
{

    public Primo(int num)
    {
        super(num);
        this.VerificarPrimo();
    }
    
    private void VerificarPrimo()
    {
        this.setMensagem("É primo");
        for (int i = 2; i <= getNum()/2; i++)
        {
            if (getNum() % i == 0)
            {
                this.setMensagem("Não é primo");
                break;
            }
        }
        
    }
}
