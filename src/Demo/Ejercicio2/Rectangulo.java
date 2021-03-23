package Demo.Ejercicio2;

public class Rectangulo extends FiguraGeometrica{
    private int altura;
    private int base;

    public Rectangulo(int altura, int base){
        this.altura = altura;
        this.base = base;
    }
    @Override
    public double area() {
        return (base * altura);
    }
}