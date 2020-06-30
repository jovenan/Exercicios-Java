package Modelo;

public class Fatorial extends absPropriedades implements intMetodos
{
    
    public Fatorial(Integer num)
    {
        super(num);
        this.Executar();
    }
    
    @Override
    public void Executar()
    {
        int base = this.num;
        for(int i = 1; i < base;i++)
        {
            num = num * i;
        }
    }
}
