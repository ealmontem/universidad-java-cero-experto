public class ArgumentosVariablesParteDos {
    public static void main(String[] args) {
        //imprimirVarios(1,2,3,4,5);
        imprimirVariosDos("Elvis",1,2,3);
    }

    private static void imprimirVariosDos(String nombre, int...numeros) {
        System.out.println("Nombre: " + nombre);
        imprimirVarios(numeros);
    }

    private static void imprimirVarios(int...numeros) {
        for (int i = 0;i<numeros.length;i++){
            System.out.print(numeros[i]);
        }
    }
}
