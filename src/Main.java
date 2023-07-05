import java.util.Scanner;

public class Main {

    // creacion variable IVA + p (precio de la compra)
    public static double calcularIVA (double p){
        double IVA;
        IVA = p * 0.19;
        return IVA;
    }

    // calcular IVA en una compra -> valor IVA 19%
    public static void main(String[] args) {
        // pedir a usuario valor de la compra
        Scanner lector = new Scanner(System.in);

        double precioDeLaCompra, IVA; // precio de la compra y variable IVA
        System.out.println("Ingrese precio de la compra: ");
        precioDeLaCompra = lector.nextDouble(); // guardar valor de la compra

        IVA = calcularIVA(precioDeLaCompra);

        // precio de la compra sin IVA
        System.out.println("El precio de la compra sin IVA es: " + precioDeLaCompra);
        // precio de la compra + IVA
        System.out.println("El precio total de la compras es: " + (precioDeLaCompra + IVA));
    }
}