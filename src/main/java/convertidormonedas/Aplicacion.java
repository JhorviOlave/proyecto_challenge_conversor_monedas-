package convertidormonedas;

import java.util.ArrayList;

public class Aplicacion {

    private static ArrayList<Convertidor> listaConverticiones = new ArrayList<>();

    public static void agregarRegistro(Convertidor registro) {
        if (registro.getCodigoBase() != null && registro.getCodigoDestino() != null) {
            listaConverticiones.add(registro);
        }
    }

    public static void mostrarLista() {
        for (Convertidor listaConverticione : listaConverticiones) {
            System.out.println("Codigo Base: " + listaConverticione.getCodigoBase() +
                    " |\tCodigo Destino: " + listaConverticione.getCodigoDestino() +
                    "\t Cantidad: " + listaConverticione.getCantidadConvetir() +
                    " |\tValor final: " + listaConverticione.getCantidadConvetida());
        }
    }

    public static boolean tieneLista() {
        return !Aplicacion.listaConverticiones.isEmpty();
    }

    @Override
    public String toString() {
        return "Aplicacion{" + "listaConverticiones=" + listaConverticiones + '}';
    }
}
