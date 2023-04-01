package tareaunidad13;

public class Triangulo implements Figura {
    private int lado;
    private char caracter;

    public Triangulo(int lado, char caracter) {
        this.lado = lado;
        this.caracter = caracter;
    }

    @Override
    public String nombre() {
        return "Triángulo tipo " + tipoDeLado();
    }

    @Override
    public void dibujar() {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    @Override
    public int area() {
        return (lado * lado) / 2;
    }

    @Override
    public void setCaracter(char c) {
        caracter = c;
    }

    @Override
    public char getCaracter() {
        return caracter;
    }

    private String tipoDeLado() {
        if (lado <= 0) {
            return "inválido";
        } else if (lado == 1) {
            return "equilátero";
        } else if (lado % 2 == 0) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }
}

