import java.util.Scanner;

public class TesteCarro {


    public static void menu() {
        System.out.println("\n------------------ \n");
        System.out.println("\tMenu de Carro: ");
        System.out.println("0. Fim");
        System.out.println("1. Digitar o dados do seu carro ");
        System.out.println("2. Ver os dados do carro ");
        System.out.println("3. Consultar consumo médio");
        System.out.println("4. Consultar autonomia");
        System.out.println("\n ------------------- \n");
    }


    public static void main(String[] args) {
        int opcaoMenu;
        Scanner scan = new Scanner(System.in);

        Carro carro = new Carro();

        do {
            menu();
            opcaoMenu = scan.nextInt();


            switch (opcaoMenu) {
                case 1: {
                    System.out.println("Digite a marca do carro: ");
                    carro.setMarca(scan.next());
                    System.out.println("Digite o modelo do carro: ");
                    carro.setModelo(scan.next());
                    System.out.println("Digite o nº de passageiros do carro: ");
                    carro.setNumPassageiros(scan.nextInt());
                    System.out.println("Digite a capacidade de combustivel do carro: ");
                    carro.setCapCombustivel(scan.nextDouble());
                    break;
                }
                case 2: {
                    System.out.println("Marca do carro: " + carro.getMarca());
                    System.out.println("Modelo do carro: " + carro.getModelo());
                    System.out.println("Nº de passageiros do carro: " + carro.getNumPassageiros());
                    System.out.println("Capacidade de combustivel do carro: " + carro.getCapCombustivel());
                    break;
                }
                case 3: {
                    System.out.println("Digite a distância percorrida (km): ");
                    carro.setKmRodado(scan.nextDouble());
                    System.out.println("E a litragem de combustivel abastecida: ");
                    carro.setLitragemAbastecida(scan.nextDouble());

                    double consumoMedio = carro.consumoMedio();
                    System.out.println(consumoMedio);
                    break;


                }
                case 4: {
                    double autonomia = carro.obterAutonomia();
                    System.out.println(autonomia);
                    break;
                }
            }
        } while (opcaoMenu != 0);
    }
}