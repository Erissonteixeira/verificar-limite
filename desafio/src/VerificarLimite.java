import java.util.Scanner;

public class VerificarLimite{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o limite disponível: ");
        double limite = scanner.nextDouble();
        System.out.print("Digite a quantidade de itens na lista de compras: ");
        int quantidade = scanner.nextInt();
        double total = 0;

        for (int i = 1; i <= quantidade; i++){
            System.out.print("Digite o valor do item " + i + ": ");
            double valor = scanner.nextDouble();
            total += valor;
        }
        System.out.println("Total das compras: R$ " + total);
        if (total > limite){
            System.out.println("Você excedeu o limite em R$ " + (total - limite));
        } else {
            System.out.println("Compra dentro do limite! Você ainda tem R$ " + (limite - total) + " disponíveis.");
        }
        scanner.close();
    }
}
