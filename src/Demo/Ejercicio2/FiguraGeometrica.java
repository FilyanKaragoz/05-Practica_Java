package Demo.Ejercicio2;

public abstract class FiguraGeometrica {
    public abstract double area();

    public static void areaPromedio(FiguraGeometrica arr[]){
        double sum = 0;
        for (FiguraGeometrica fg:arr){
            sum+= fg.area();
        }
        return sum/arr.length;
    }


}
