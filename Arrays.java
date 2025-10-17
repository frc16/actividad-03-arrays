public class Arrays {




/**
 * La clase {@code IntroduccionArrays} sirve como ejemplo básico para introducir
 * el uso de <b>arrays unidimensionales</b> en Java.
 * <p>
 * En este ejemplo se muestra cómo:
 * <ul>
 *   <li>Declarar y crear un array de tipo {@code int}.</li>
 *   <li>Asignar valores a cada elemento del array.</li>
 *   <li>Pasar un array como argumento a un método.</li>
 *   <li>Recorrer y mostrar su contenido por pantalla.</li>
 * </ul>
 * </p>
 *
 * <p>El programa imprime las temperaturas máximas registradas durante una semana.</p>
 *
 * @author Iván Corrales
 * @version 12/10/202{

    /**
     * Muestra por consola la temperatura máxima correspondiente a cada día de la semana.
     * <p>Ejemplo de salida esperada:</p>
     * <pre>
     * Lunes: 22º
     * Martes: 25º
     * Miércoles: 24º
     * ...
     * Domingo: 18º
     * </pre>
     *
     * @param temperaturas array de enteros que contiene las temperaturas máximas
     *                     correspondientes a los días de la semana, en orden.
     *                     Debe tener exactamente 7 elementos.
     */
    public void mostrarTemperaturas(int[] temperaturas) {

    }

    /**
     * Método principal del programa. Crea un array con las temperaturas máximas
     * de la semana y llama al método {@link #mostrarTemperaturas(int[])} para
     * mostrar los valores en consola.
     *
     * @param args argumentos de línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {

        // 1. Declara un array de tipo int llamado maxTemperaturas que tiene 7 elementos
        //    Cada elemento se corresponde con un día de la semana: Lunes, ... Domingo

           String[] dias  = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
                
        // 2. Los valores son: 22, 23, 24, 24 , 23, 21, 20
           int[] maxTemperaturas = {22,23,24,24,23,21,20};
        // 3. Llama a la función mostrarTemperaturas

        System.out.println(dias[0] + ":" + maxTemperaturas[0] + "º");
        System.out.println(dias[1] + ":" + maxTemperaturas[1] + "º");
        System.out.println(dias[2] + ":" + maxTemperaturas[2] + "º");
        System.out.println(dias[3] + ":" + maxTemperaturas[3] + "º");
        System.out.println(dias[4] + ":" + maxTemperaturas[4] + "º");
        System.out.println(dias[5] + ":" + maxTemperaturas[5] + "º");
        System.out.println(dias[6] + ":" + maxTemperaturas[6] + "º");

        

    }
}

/* Producto[] carrito = {
new Prodcuto("teclado", 24.50),
new Producto("raton", 10.10),
new Producto("teclado", 16.70),
};

public static double totalCarrito(Producto[] carrito){
double total = 0;
for (int i = 0; < carrito.length;i++){
     Producto p = carrito[i];
     total += p.getPrecio();
}
     return total;
}*/