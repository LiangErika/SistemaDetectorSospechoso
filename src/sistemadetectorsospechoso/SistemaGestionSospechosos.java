/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadetectorsospechoso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arike
 */
public class SistemaGestionSospechosos {
    private List<Sospechosos> listaSospechosos;
    private Camara camara;
    
    public SistemaGestionSospechosos() {
        listaSospechosos = new ArrayList<>();
        camara = new Camara();
    }
    
    public void agregarSospechoso(Sospechosos sospechoso) {
        listaSospechosos.add(sospechoso);
    }

    public void eliminarSospechoso(Sospechosos sospechoso) {
        listaSospechosos.remove(sospechoso);
    }

    public List<Sospechosos> getListaSospechosos() {
        return listaSospechosos;
    }

    public String capturarSospechoso() {
        return camara.getCapturaImagen();
    }
    
    public boolean esSospechoso(String imagenBuscada){
        for (Sospechosos sospechoso : listaSospechosos) {
            if (sospechoso.getImagen().equals(imagenBuscada)) {
                return true; 
            }
        }
        return false;
    }

}
