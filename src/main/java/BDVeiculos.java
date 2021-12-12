
import java.util.ArrayList;
import java.util.List;



public class BDVeiculos {
    
    private static List<Passeio> listaPasseio = new ArrayList<Passeio>();
    private static List<Carga>  listaCarga = new ArrayList<Carga>();



    private Passeio passeio = new Passeio();
    private Carga carga = new Carga();
    private Leitura l = new Leitura();

    public BDVeiculos() {

    }

    public List<Passeio> getListaPasseio() {
        return listaPasseio;
    }

//    public void setListaPasseio(Passeio listaPasseio) {
//        this.listaPasseio = listaPasseio;
//    }

    public List<Carga> getListaCarga() {
        return listaCarga;
    }

//    public void setListaCarga(Carga listaCarga) {
//        this.listaCarga = listaCarga;
//    }

    public static Passeio cadPasseio (Passeio passeio) {
            listaPasseio.add(passeio);
            return passeio;
        }
    
    public Passeio consPasseio(Passeio passeio) {
        for (int i = 0; i < listaPasseio.size(); i++) {
            if (passeio.getPlaca() == listaPasseio.get(i).getPlaca()) {
                passeio = listaPasseio.get(i);
                return passeio;
            }
        }
        return null;
    }
    
    public void removePasseioPlaca(Passeio passeio){
        for(int i = 0; i < listaPasseio.size(); i++){
            if(passeio.getPlaca() == listaPasseio.get(i).getPlaca()){
                listaPasseio.remove(listaPasseio.get(i));
            }
        }
    }

    
    
    public Passeio removePasseioAll(Passeio passeio){
        for(int i = 0; i < listaPasseio.size(); i++){            
                listaPasseio.remove(listaPasseio.get(i));                          
        }
        return null;
    }
    
    public static Carga cadCarga (Carga carga) {
            listaCarga.add(carga);
            return carga;
        }

    public Carga consCarga(Carga carga) {
        for (int i = 0; i < listaCarga.size(); i++) {
            if (carga.getPlaca() == listaCarga.get(i).getPlaca()) {
                carga = listaCarga.get(i);
                return carga;
            }
        }
        return null;
    }
    
    public Carga removeCargaAll(Carga carga){
        for(int i = 0; i < listaCarga.size(); i++){            
                listaCarga.remove(listaCarga.get(i));                          
        }
        return null;
    }
     
    public void removeCargaPlaca(Carga carga){
        for(int i = 0; i < listaCarga.size(); i++){
            if(carga.getPlaca() == listaCarga.get(i).getPlaca()){
                listaCarga.remove(listaCarga.get(i));
            }
        }
    }
}
