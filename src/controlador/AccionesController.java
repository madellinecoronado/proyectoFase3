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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class AccionesController implements Initializable {

    @FXML
    private Button btnTomarFotografia;
    @FXML
    private Button btnCopiarTexto;
    @FXML
    private Button btnPegarTexto;
    @FXML
    private Button btnCompartirDoc;
    @FXML
    private Button btnReproducirMusica;
    @FXML
    private Button btnRecibirDocs;
    @FXML
    private Button btnRecibirLlamada;
    @FXML
    private Button btnVerMensajes;
    @FXML
    private Button btnVerNotificaciones;
    @FXML
    private Button btnCerrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tomarFotografia(ActionEvent event) {
        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/TomarFotografia.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            controlador.TomarFotografiaController controlador = loader.getController();

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
    private void copiarTexto(ActionEvent event) {
        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/CopiarTexto.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            controlador.CopiarTextoController controlador = loader.getController();

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
    private void pegarTexto(ActionEvent event) {
        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/PegarTexto.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            controlador.PegarTextoController controlador = loader.getController();

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
    private void compartirDocumentos(ActionEvent event) {
        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/CompartirDocumento.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            controlador.CompartirDocumentoController controlador = loader.getController();

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
    private void reproducirMusica(ActionEvent event) {
         try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/ReproduccionMusica.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            controlador.ReproduccionMusicaController controlador = loader.getController();

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
    private void recibirDocumentos(ActionEvent event) {
        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/RecibirDocumentos.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            controlador.RecibirDocumentosController controlador = loader.getController();

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
    private void recibirLlamada(ActionEvent event) {
        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/RecibirLlamada.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            controlador.RecibirLlamadaController controlador = loader.getController();

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
    private void verMensajes(ActionEvent event) {
        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Mensajes.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            controlador.MensajesController controlador = loader.getController();

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
    private void verNotificaciones(ActionEvent event) {
        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Notificaciones.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            controlador.NotificacionesController controlador = loader.getController();

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
    private void cerrar(ActionEvent event) {
         Node source = (Node) event.getSource();
    Stage stage = (Stage) source.getScene().getWindow();
    stage.close();
    }
    
}
