package Veiculo;

import Veiculo.Carga.Carga;
import Veiculo.Passeio.Passeio;

import java.util.ArrayList;
import java.util.List;

public class BDVeiculos {

    private static final List<Passeio> listaPasseio = new ArrayList<>();
    private static final List<Carga> listaCarga = new ArrayList<>();

    public BDVeiculos() {
    }

    //CRUD Veiculo.Passeio
    public List<Passeio> getListaPasseio() {
        return listaPasseio;
    }

    public static void cadastroPasseio(Passeio passeio) {
        listaPasseio.add(passeio);
    }

    public Passeio consultaPasseio(Passeio passeio) {
        for (Passeio value : listaPasseio) {
            if (passeio.getPlaca() == value.getPlaca()) {
                passeio = value;
                return passeio;
            }
        }
        return null;
    }

    public void removePasseioPlaca(Passeio passeio) {
        for (int i = 0; i < listaPasseio.size(); i++) {
            if (passeio.getPlaca() == listaPasseio.get(i).getPlaca()) {
                listaPasseio.remove(listaPasseio.get(i));
            }
        }
    }

    public void removeAllPasseio() {
        for (int i = 0; i < listaPasseio.size(); i++) {
            listaPasseio.remove(listaPasseio.get(i));
        }
    }

    public List<Carga> getListaCarga() {
        return listaCarga;
    }

    //CRUD Veiculo.Carga
    public static void cadastroCarga(Carga carga) {
        listaCarga.add(carga);
    }

    public Carga consultaCarga(Carga carga) {
        for (Carga value : listaCarga) {
            if (carga.getPlaca() == value.getPlaca()) {
                carga = value;
                return carga;
            }
        }
        return null;
    }

    public void removeAllCarga() {
        for (int i = 0; i < listaCarga.size(); i++) {
            listaCarga.remove(listaCarga.get(i));
        }
    }

    public void removeCargaPlaca(Carga carga) {
        for (int i = 0; i < listaCarga.size(); i++) {
            if (carga.getPlaca() == listaCarga.get(i).getPlaca()) {
                listaCarga.remove(listaCarga.get(i));
            }
        }
    }

}