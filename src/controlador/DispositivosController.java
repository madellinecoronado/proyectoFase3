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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modelo.Dispositivo;

public class DispositivosController implements Initializable {

    @FXML
    private Button btnCrearDispositivo;
    @FXML
    private Button btnEliminarDispositivo;
    @FXML
    private Button btnCargaMasiva;
    @FXML
    private Button btnCargaAdministracion;
    @FXML
    private Button btnEditarDispositivo;
    @FXML
    private TableColumn colNombre;
    @FXML
    private TableColumn colCorreo;
    @FXML
    private TableView<Dispositivo> tblDispositivos;

        private ObservableList<Dispositivo> dispositivos;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
                dispositivos = FXCollections.observableArrayList();
        this.tblDispositivos.setItems(dispositivos);

        this.colCorreo.setCellValueFactory(new PropertyValueFactory("correo"));
        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
    }    

    @FXML
    private void crearDispositivo(ActionEvent event) {
        
        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/CrearDispositivo.fxml"));
          // Cargo la ventana
            Parent root = loader.load();

            // Cojo el controlador
            CrearDispositivoController controlador = loader.getController();
            controlador.initAttributtes(dispositivos);

            // Creo el Scene
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();

            // cojo la persona devuelta
            Dispositivo d= controlador.getDispositivo();
            if (d != null) {

                // Añado la persona
                this.dispositivos.add(d);

                // Refresco la tabla
                this.tblDispositivos.refresh();
            }

        } catch (IOException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText(ex.getMessage());
            alert.showAndWait();
        }

     
    }
    
    @FXML
    private void eliminarDispositivo(ActionEvent event) {
        
        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/EliminarDispositivo.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            controlador.EliminarDispositivoController controlador = loader.getController();

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
    private void cargaMasiva(ActionEvent event) {
        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/CargaMasiva.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            controlador.CargaMasivaController controlador = loader.getController();

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
    private void cargaMasivaAdministracion(ActionEvent event) {
        
         try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/CargaMasivaAdministracion.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            controlador.CargaMasivaAdministracionController controlador = loader.getController();

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
    private void editarDispositivo(ActionEvent event) {
        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/EditarDispositivo.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            controlador.EditarDispositivoController controlador = loader.getController();

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
    
}
