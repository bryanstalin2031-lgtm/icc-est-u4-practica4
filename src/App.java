import java.util.concurrent.Callable;
import controllers.SortPersonaMethods;
import models.Persona;
import utils.Benchmarking;

public class App {

    public static void main(String[] args) throws Exception {
        int[] samples = {10000, 50000, 100000};
        SortPersonaMethods metodos = new SortPersonaMethods();

        for (int size : samples) {
            ejecutarEscenarioDesordenado(size, metodos);
            ejecutarEscenarioCasiOrdenado(size, metodos);
        }
    }

    public static void ejecutarEscenarioDesordenado(int size, SortPersonaMethods metodos) throws Exception {
        Persona[] base = generarPersonas(size);
        Persona[] copiaInsercion = base.clone();
        Persona[] copiaQuickSort = base.clone();

        Callable<Void> taskInsertion = () -> {
            metodos.insertionSort(copiaInsercion);
            return null;
        };
        Callable<Void> taskQuick = () -> {
            metodos.qucikSort(copiaQuickSort, 0, copiaQuickSort.length - 1);
            return null;
        };
        var r1 = Benchmarking.medirTiempo(taskInsertion, "Inserción", "Desordenado", size);
        var r2 = Benchmarking.medirTiempo(taskQuick, "QuickSort", "Desordenado", size);
        imprimirResultado(r1);
        imprimirResultado(r2);
    }

    public static void ejecutarEscenarioCasiOrdenado(int size, SortPersonaMethods metodos) throws Exception {
        Persona[] base = generarPersonas(size);
        metodos.qucikSort(base, 0, base.length - 1);

        Persona[] baseMasUno = new Persona[base.length + 1];
   
        System.arraycopy(base, 0, baseMasUno, 0, base.length);
        baseMasUno[baseMasUno.length - 1] = new Persona("Persona Extra", (int)(Math.random() * 101));
        Persona[] copiaInsercion = baseMasUno.clone();
        Persona[] copiaQuickSort = baseMasUno.clone();

        Callable<Void> taskInsertion = () -> {
            metodos.insertionSort(copiaInsercion);
            return null;
        };
        Callable<Void> taskQuick = () -> {
            metodos.qucikSort(copiaQuickSort, 0, copiaQuickSort.length - 1);
            return null;
        };
        var r1 = Benchmarking.medirTiempo(taskInsertion, "Inserción", "Casi Ordenado", baseMasUno.length);
        var r2 = Benchmarking.medirTiempo(taskQuick, "QuickSort", "Casi Ordenado", baseMasUno.length);

        imprimirResultado(r1);
        imprimirResultado(r2);
    }
    public static Persona[] generarPersonas(int cantidad) {
        Persona[] personas = new Persona[cantidad];
        for (int i = 0; i < cantidad; i++) {
            String nombre = "Persona " + (i + 1);
            int edad = (int) (Math.random() * 101);
            personas[i] = new Persona(nombre, edad);
        }
        return personas;
    }
    private static void imprimirResultado(Object resultado) {
        if (resultado != null) {
            System.out.println(resultado.toString());
        }
    }
}




