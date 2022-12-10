//ORDENACIÓN POR INTERCAMBIO
package OrdIntercambio;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class Ejemplo {

    public static void main(String[] args) {
        int array[] = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 600) + 1;
            System.out.print(array[i] + ", ");
        }
        ordIntercambio(array);
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }

    public static void ordIntercambio(int a[]) {
        int i, j;
        for (i = 0; i < a.length - 1; i++) // sitúa mínimo de a[i+1]...a[n-1] en a[i]
        {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    intercambiar(a, i, j);
                }
            }
        }
    }
}
