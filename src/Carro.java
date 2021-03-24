public class Carro {

    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double kmRodado;
    private double litragemAbastecida;


    public double getLitragemAbastecida() {
        return litragemAbastecida;
    }

    public void setLitragemAbastecida(double litragemAbastecida) {
        this.litragemAbastecida = litragemAbastecida;
    }

    public double getKmRodado() {
        return kmRodado;
    }

    public void setKmRodado(double kmRodado) {
        this.kmRodado = kmRodado;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getNumPassageiros() {
        return numPassageiros;
    }
    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }
    public double getCapCombustivel() {
        return capCombustivel;
    }
    public void setCapCombustivel(double capCombustivel) {
        this.capCombustivel = capCombustivel;
    }


     double consumoMedio() {
         System.out.println("O consumo médio do seu carro é (km/l): " );
         return getKmRodado() / getLitragemAbastecida();
     }

    double obterAutonomia() {
        System.out.println("A autonomia do seu carro é: " );
        return consumoMedio() * getCapCombustivel();
    }
}


