package Demo.Ejercicio2;

public class Triangulo extends FiguraGeometrica{
    private int altura;
    private int base;

    public Triangulo(int altura, int base){
        this.altura = altura;
        this.base = base;
    }
    @Override
    public double area() {
        return (base * altura) / 2;
    }
}