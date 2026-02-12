
public class Distancia 
{
    //Esta clase tiene 2 atributos de tipo punto
    private Punto puntoA;
    private Punto puntoB;
    private double distancia;
    
    public Distancia(Punto puntoA,Punto puntoB)
    {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
        calcular();
    }
    
    
    private void calcular()
    {
        double dx = puntoB.getX() - puntoA.getX();
        double dy = puntoB.getY() - puntoA.getY();
        this.distancia = Math.sqrt(dx*dx+dy*dy);
        
    }
    
    
    public double getDistancia()
    {
        return distancia;
    }
    
    @Override
    public String toString()
    {
    return "Distancia entre "+this.puntoA +" y "+ this.puntoB +" = "+ String.format("%.4f", this.distancia);
    }
    
    
}
