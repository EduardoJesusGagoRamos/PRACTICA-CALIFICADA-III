//ORDENACIÓN RÁPIDA (QUICKSORT)
package OrdRapida;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class Ejemplo {

    public static void main(String[] args) {
        int array[] = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 900) + 1;
            System.out.print(array[i] + ", ");
        }
        quicksort(array);
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void quicksort(int a[]) {
        quicksort(a, 0, a.length - 1);
    }

    private static void quicksort(int a[], int primero, int ultimo) {
        int i, j, central;
        double pivote;
        central = (primero + ultimo) / 2;
        pivote = a[central];
        i = primero;
        j = ultimo;
        do {
            while (a[i] < pivote) {
                i++;
            }
            while (a[j] > pivote) {
                j--;
            }
            if (i <= j) {
                intercambiar(a, i, j);
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            quicksort(a, primero, j); // mismo proceso con sublista izqda
        }
        if (i < ultimo) {
            quicksort(a, i, ultimo); // mismo proceso con sublista drcha
        }
    }

    public static void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
}
