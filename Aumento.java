public class Aumento {
    public static void main(String[] args) {
        int salario = 1000;
        double porcentagemAumento = 1.5;
        double aumento;
        for (int ano = 2006; ano <=2024; ano++){
            aumento = salario * (porcentagemAumento / 100);
            salario += aumento;
            System.out.println("Ano:" + ano + "% : " + porcentagemAumento + "aumento" + aumento + "salario: " + salario);
            porcentagemAumento *= 2;
        }
    }
}
