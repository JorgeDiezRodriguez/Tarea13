package tareaunidad13;

import java.util.ArrayList;
import java.util.List;

public class Pantalla {
    private List<Figura> figuras;

    public Pantalla() {
        figuras = new ArrayList<>();
    }

    public void anadeFigura(Figura figura) {
        figuras.add(figura);
    }

    public void modificaFigura(char c) {
        for (Figura figura : figuras) {
            figura.setCaracter(c);
        }
    }

    public void listaFiguras() {
        System.out.println("Figuras en la pantalla:");
        for (Figura figura : figuras) {
            System.out.println(figura.nombre());
        }
    }

    public int areaPantalla() {
        int areaTotal = 0;
        for (Figura figura : figuras) {
            areaTotal += figura.area();
        }
        return areaTotal;
    }

    public void muestraPantalla() {
        System.out.println("Figuras en la pantalla:");
        for (Figura figura : figuras) {
            figura.dibujar();
            System.out.println();
        }
        System.out.println("Área total de la pantalla: " + areaPantalla());
    }
}

