public class ArgumentosVariables {
    public static void main(String[] args) {
      // imprimirNumeros(12,24);
        variosParametros("Karla", 10, 20, 30);
    }

    private static void variosParametros(String nombre, int...numeros) {
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }

    private static void imprimirNumeros(int...numeros) {
       for (int i = 0; i < numeros.length;i++){
           System.out.print(numeros[i]);
       }
    }
}
