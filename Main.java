// Classe base abstrata (com abstração)
abstract class Forma {
    public abstract double calcularArea(); // Método abstrato para abstração
}

// Subclasse que herda de Forma
class Retangulo extends Forma {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }
}

// Subclasse que herda de Forma
class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criar uma forma de retângulo
        Retangulo retangulo = new Retangulo(5.0, 4.0);

        // Calcular e imprimir a área do retângulo
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());

        // Criar uma forma de círculo
        Circulo circulo = new Circulo(3.0);

        // Calcular e imprimir a área do círculo
        System.out.println("Área do Círculo: " + circulo.calcularArea());
    }
}
