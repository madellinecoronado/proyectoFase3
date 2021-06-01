/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import modelo.Dispositivo;


public class CrearDispositivoController implements Initializable {

    @FXML
    private MenuItem btncrearAuriculares;
    @FXML
    private Button btnCancelar;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtTelefono;
    @FXML
    private Button btnGuardar;

        private Dispositivo dispositivo;

    private ObservableList<Dispositivo> dispositivos;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void initAttributtes(ObservableList<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
    }

    public void initAttributtes(ObservableList<Dispositivo> dispositivos, Dispositivo d) {
        this.dispositivos = dispositivos;
        this.dispositivo = d;
        // cargo los datos de el dispositivo
        this.txtCorreo.setText(d.getCorreo());
        this.txtNombre.setText(d.getNombre());

    }
 @FXML
    private void guardar(ActionEvent event) {
                String correo = this.txtCorreo.getText();
        String nombre = this.txtNombre.getText();
 

        // Creo el dispositivo
        Dispositivo d = new Dispositivo(correo, nombre);
        
  
                     if (!dispositivos.contains(d)) {

            // Modificar
            if (this.dispositivo != null) {

                // Modifico el objeto
                this.dispositivo.setCorreo(correo);
                this.dispositivo.setNombre(nombre);
             

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Informacion");
                alert.setContentText("Se ha modificado correctamente");
                alert.showAndWait();

            } else {
                // insertando

                this.dispositivo = d;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Informacion");
                alert.setContentText("Se ha añadido correctamente");
                alert.showAndWait();

            }

            // Cerrar la ventana
            Stage stage = (Stage) this.btnGuardar.getScene().getWindow();
            stage.close();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("La persona ya existe");
            alert.showAndWait();
        }

    }
    
 
    @FXML
    private void crearAuriculares(ActionEvent event) {
        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/CrearAuriculares.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            controlador.CrearAuricularesController controlador = loader.getController();

            // Creo la scene y el stage
            Scene scene = new Scene(root);
            Stage stage = new Stage();

            // Asocio el stage con el scene
            stage.setScene(scene);
            stage.show();

            // Indico que debe hacer al cerrar
           //stage.setOnCloseRequest(e -> controlador.closeWindows());

            // Ciero la ventana donde estoy
           //Stage myStage = (Stage) this.btnGestionarDispositivos.getScene().getWindow();
            //myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
     
    }
    }

    @FXML
    private void cancelar(ActionEvent event) {
         Node source = (Node) event.getSource();
    Stage stage = (Stage) source.getScene().getWindow();
    stage.close();
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }
   
        
    
}
