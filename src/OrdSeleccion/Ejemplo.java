//ORDENACIÓN POR SELECCIÓN
package OrdSeleccion;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class Ejemplo {

    public static void main(String[] args) {
        int array[] = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 700) + 1;
            System.out.print(array[i] + ", ");
        }
        ordSeleccion(array);
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void ordSeleccion(int a[]) {
        int indiceMenor, i, j, n;
        n = a.length;
        for (i = 0; i < n - 1; i++) {
            // comienzo de la exploración en índice i
            indiceMenor = i;
            // j explora la sublista a[i+1]..a[n-1]
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            // sitúa el elemento mas pequeño en a[i]
            if (i != indiceMenor) {
                intercambiar(a, i, indiceMenor);
            }
        }
    }

    public static void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
}
