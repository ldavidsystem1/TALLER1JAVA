package entidades.notas;
public class Nota {
    private double nSeg;
    private double nPar;
    private double nFinal;

    public double getnSeg()
    {
        return nSeg;
    }
    public void setnSeg(double nSeg)
    {
        this.nSeg = nSeg;
    }
    public double getnPar()
    {
        return nPar;
    }
    public void setnPar(double nPar)
    {
        this.nPar = nPar;
    }
    public double getnFinal()
    {
        return nFinal;
    }
    public void setnFinal(double nFinal)
    {
        this.nFinal = nFinal;
    }
    public double calcularNota()
    {
        return ((this.getnSeg()*0.4)+(this.getnPar()*0.3)+(getnFinal()*0.3));
    }
}