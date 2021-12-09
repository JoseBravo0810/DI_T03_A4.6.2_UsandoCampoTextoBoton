/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandocampotextoboton;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import miscontroles.CampoTextoBoton;

/**
 *
 * @author jose
 */
public class FXMLUsandoCampoTextoBotonController implements Initializable {
    
    // Componentes mapeados del FXML
    @FXML
    private CampoTextoBoton campoBoton1;
    @FXML
    private CampoTextoBoton campoBoton2;
    @FXML
    private Label lbTexto;
    
    // Metodo que se ejecuta al cargar la aplicacion
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    // Metodo para grabar el CampoTextoBoton1
    public void grabarCampo1(){
        // Mostramos en la etiqueta lo guardado
        lbTexto.setText("Se ha grabado: " + campoBoton1.getText());
        // Limpiamos el TextField del componente customizado
        campoBoton1.clearText();
    }
    
    // Metodo para grabar el CampoTextoBoton2
    public void grabarCampo2(){
        // Mostramos en la etiqueta lo guardado
        lbTexto.setText("Se ha grabado: " + campoBoton2.getText());
        // Limpiamos el TextField del componente customizado
        campoBoton2.clearText();
    }
    
}
