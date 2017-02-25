package pizzeria;

import java.util.Optional;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Pizzeria extends Application implements EventHandler <ActionEvent>{
    Stage _primaryStage;
    Label lblNombre, lblApellidos, lblTelefono, lblCP, lblCalle, lblNumExt, 
          lblNumInt, lblColonia, lblCiudad, lblPago, lblEmpleado;
    TextField txtNombre, txtApellidos, txtTelefono, txtCP, txtCalle, txtNumExt, txtNumInt, txtColonia, txtCiudad;
    ComboBox<String> cmbPaquete, cmbAlitas, cmbPastor, cmbRefresco, cmbPago, 
            cmbIngrediente1, cmbIngrediente2, cmbIngrediente3, cmbEmpleado;
    Label lblPaq1, lblPaq2, lblPaq3, lblAlitas, lblPastor, lblIngrediente1, 
          lblIngrediente2, lblIngrediente3,lblRefresco, lblContenido;
    Button btnGuardar, btnCancelar;
    TextArea resumen=new TextArea();
    Alert alert;
    
    @Override
    public void start(Stage primaryStage) {
        _primaryStage=primaryStage;
        inicializa();
    }
    
    private void inicializa(){
        BorderPane principal=new BorderPane();
        principal.setTop(datosCliente());
        principal.setCenter(paquetes());
        principal.setBottom(botones());
        
        StackPane root = new StackPane();
        root.getChildren().add(principal);
        
        Scene scene = new Scene(root, 1000, 500);
        
        _primaryStage.setTitle("Pizzeria ITC - Pedidos");
        _primaryStage.setScene(scene);
        _primaryStage.show();
    }
    
    private GridPane datosCliente(){
        GridPane panelCliente=new GridPane();
        panelCliente.setPadding(new Insets(5));
        panelCliente.setHgap(5);
        panelCliente.setVgap(5);
        
        lblNombre=new Label("Nombre");
        lblApellidos=new Label("Apellidos");
        lblTelefono=new Label("Teléfono");
        lblCP=new Label("Código postal");
        lblCalle=new Label("Calle");
        lblNumExt=new Label("Número exterior");
        lblNumInt=new Label("Número interior");
        lblColonia=new Label("Colonia");
        lblCiudad=new Label("Ciudad");
        lblPago=new Label("Forma de pago");
        
        txtNombre=new TextField();
        txtApellidos=new TextField();
        txtTelefono=new TextField();
        txtCP=new TextField();
        txtCalle=new TextField();
        txtNumExt=new TextField();
        txtNumInt=new TextField();
        txtColonia=new TextField();
        txtCiudad=new TextField();
        
        cmbPago=new ComboBox<String>();
        cmbPago.getItems().addAll("Efectivo", "Tarjeta");
        
        panelCliente.add(lblNombre,0,0);
        panelCliente.add(txtNombre,1,0);
        panelCliente.add(lblApellidos,2,0);
        panelCliente.add(txtApellidos,3,0);
        panelCliente.add(lblTelefono,0,1);
        panelCliente.add(txtTelefono,1,1);
        panelCliente.add(lblCP,2,1);
        panelCliente.add(txtCP,3,1);
        panelCliente.add(lblCalle,0,2);
        panelCliente.add(txtCalle,1,2);
        panelCliente.add(lblNumExt,2,2);
        panelCliente.add(txtNumExt,3,2);
        panelCliente.add(lblNumInt,0,3);
        panelCliente.add(txtNumInt,1,3);
        panelCliente.add(lblColonia,2,3);
        panelCliente.add(txtColonia,3,3);
        panelCliente.add(lblCiudad,0,4);
        panelCliente.add(txtCiudad,1,4);
        panelCliente.add(lblPago,2,4);
        panelCliente.add(cmbPago,3,4);
                
        return panelCliente;
    }
    
    private HBox paquetes(){
        HBox panelPaquetes=new HBox(20);
        
        panelPaquetes.getChildren().add(paquete1());
        panelPaquetes.getChildren().add(paquete2());
        panelPaquetes.getChildren().add(paquete3());
        
        return panelPaquetes;
    }
    
    private BorderPane paquete1(){
        BorderPane panelP1=new BorderPane();
        panelP1.setStyle("-fx-border-color:blue");
        panelP1.setPadding(new Insets(5,10,5,10));
        GridPane panelPaq=new GridPane();
        panelPaq.setPadding(new Insets(5));
        panelPaq.setHgap(5);
        panelPaq.setVgap(5);
        
        lblPaq1=new Label("PAQUETE 1");
        lblContenido=new Label("Pizza grande con tres ingredientes, \nalitas y refresco de 1 lt.");
        lblIngrediente1=new Label("Ingrediente extra 1");
        lblIngrediente2=new Label("Ingrediente extra 2");
        lblIngrediente3=new Label("Ingrediente extra 3");
        lblAlitas=new Label("Alitas");
        lblRefresco=new Label("Refresco");
        
        cmbIngrediente1=new ComboBox<String>();
        cmbIngrediente1.getItems().addAll("Aceitunas", "Chorizo", "Piña", "Salchicha", "Peperoni", "Salami", "Tocino", "Champiñon", "Jamón", "Pimiento");
        cmbIngrediente2=new ComboBox<String>();
        cmbIngrediente2.getItems().addAll("Aceitunas", "Chorizo", "Piña", "Salchicha", "Peperoni", "Salami", "Tocino", "Champiñon", "Jamón", "Pimiento");
        cmbIngrediente3=new ComboBox<String>();
        cmbIngrediente3.getItems().addAll("Aceitunas", "Chorizo", "Piña", "Salchicha", "Peperoni", "Salami", "Tocino", "Champiñon", "Jamón", "Pimiento");
        cmbAlitas=new ComboBox<String>();
        cmbAlitas.getItems().addAll("Picosas", "Barbecue", "Naturales");
        cmbRefresco=new ComboBox<String>();
        cmbRefresco.getItems().addAll("Sprite", "Fanta", "Pepsi", "Coca Cola", "Manzanita", "Fresca");
        
        panelPaq.add(lblPaq1,0,0);
        panelPaq.add(lblContenido,0,1);
        panelPaq.add(lblIngrediente1,0,2);
        panelPaq.add(cmbIngrediente1,1,2);
        panelPaq.add(lblIngrediente2,0,3);
        panelPaq.add(cmbIngrediente2,1,3);
        panelPaq.add(lblIngrediente3,0,4);
        panelPaq.add(cmbIngrediente3,1,4);
        panelPaq.add(lblAlitas,0,5);
        panelPaq.add(cmbAlitas,1,5);
        panelPaq.add(lblRefresco,0,6);
        panelPaq.add(cmbRefresco,1,6);
        
        panelP1.setTop(panelPaq);
        
        return panelP1;
    }
    
    private BorderPane paquete2(){
        BorderPane panelP2=new BorderPane();
        panelP2.setStyle("-fx-border-color:blue");
        panelP2.setPadding(new Insets(5,10,5,10));
        GridPane panelPaq=new GridPane();
        panelPaq.setPadding(new Insets(5));
        panelPaq.setHgap(5);
        panelPaq.setVgap(5);
        
        lblPaq1=new Label("PAQUETE 2");
        lblContenido=new Label("Pizza mediana con dos ingredientes, \npastor y refresco de 1 lt.");
        lblIngrediente1=new Label("Ingrediente extra 1");
        lblIngrediente2=new Label("Ingrediente extra 2");
        lblPastor=new Label("Pastor");
        lblRefresco=new Label("Refresco");
        
        cmbIngrediente1=new ComboBox<String>();
        cmbIngrediente1.getItems().addAll("Aceitunas", "Chorizo", "Piña", "Salchicha", "Peperoni", "Salami", "Tocino",
                "Champiñon", "Jamón", "Pimiento");
        cmbIngrediente2=new ComboBox<String>();
        cmbIngrediente2.getItems().addAll("Aceitunas", "Chorizo", "Piña", "Salchicha", "Peperoni", "Salami", "Tocino",
                "Champiñon", "Jamón", "Pimiento");
        cmbPastor=new ComboBox<String>();
        cmbPastor.getItems().addAll("Picante", "Sin picante");
        cmbRefresco=new ComboBox<String>();
        cmbRefresco.getItems().addAll("Sprite", "Fanta", "Pepsi", "Coca Cola", "Manzanita", "Fresca");
        
        panelPaq.add(lblPaq1,0,0);
        panelPaq.add(lblContenido,0,1);
        panelPaq.add(lblIngrediente1,0,2);
        panelPaq.add(cmbIngrediente1,1,2);
        panelPaq.add(lblIngrediente2,0,3);
        panelPaq.add(cmbIngrediente2,1,3);
        panelPaq.add(lblPastor,0,4);
        panelPaq.add(cmbPastor,1,4);
        panelPaq.add(lblRefresco,0,5);
        panelPaq.add(cmbRefresco,1,5);
        
        panelP2.setTop(panelPaq);
        
        return panelP2;
    }  

    private BorderPane paquete3(){
        BorderPane panelP3=new BorderPane();
        panelP3.setStyle("-fx-border-color:blue");
        panelP3.setPadding(new Insets(5,10,5,10));
        GridPane panelPaq=new GridPane();
        panelPaq.setPadding(new Insets(5));
        panelPaq.setHgap(5);
        panelPaq.setVgap(5);
        
        lblPaq1=new Label("PAQUETE 3");
        lblContenido=new Label("Pizza individual con dos \ningredientes y refresco de 600 ml");
        lblIngrediente1=new Label("Ingrediente extra 1");
        lblIngrediente2=new Label("Ingrediente extra 2");
        lblRefresco=new Label("Refresco");
        
        cmbIngrediente1=new ComboBox<String>();
        cmbIngrediente1.getItems().addAll("Aceitunas", "Chorizo", "Piña", "Salchicha", "Peperoni", "Salami", "Tocino",
                "Champiñon", "Jamón", "Pimiento");
        cmbIngrediente2=new ComboBox<String>();
        cmbIngrediente2.getItems().addAll("Aceitunas", "Chorizo", "Piña", "Salchicha", "Peperoni", "Salami", "Tocino",
                "Champiñon", "Jamón", "Pimiento");
        cmbRefresco=new ComboBox<String>();
        cmbRefresco.getItems().addAll("Sprite", "Fanta", "Pepsi", "Coca Cola", "Manzanita", "Fresca");
        
        panelPaq.add(lblPaq1,0,0);
        panelPaq.add(lblContenido,0,1);
        panelPaq.add(lblIngrediente1,0,2);
        panelPaq.add(cmbIngrediente1,1,2);
        panelPaq.add(lblIngrediente2,0,3);
        panelPaq.add(cmbIngrediente2,1,3);
       panelPaq.add(lblRefresco,0,4);
        panelPaq.add(cmbRefresco,1,4);
        
        panelP3.setTop(panelPaq);
        
        return panelP3;
    }
    
    private BorderPane ingredientesAdicional(){
        BorderPane adicional=new BorderPane();
        
        return adicional;
    }
    
    private FlowPane botones(){
        FlowPane panelBotones=new FlowPane(Orientation.HORIZONTAL);
        panelBotones.setHgap(10);
        panelBotones.setAlignment(Pos.CENTER);
        
        lblEmpleado=new Label("Llevará la orden: ");
        cmbEmpleado=new ComboBox<String>();
        cmbEmpleado.getItems().addAll("Jorge", "Luis", "Ernesto");
        btnGuardar=new Button("Levantar pedido");
        btnGuardar.setOnAction((EventHandler<ActionEvent>) this);
        btnCancelar=new Button("Cancelar");
        btnCancelar.setOnAction((EventHandler<ActionEvent>) this);
        panelBotones.getChildren().addAll(lblEmpleado, cmbEmpleado, btnGuardar, btnCancelar);
        
        return panelBotones;
    }
    
    public void handle(ActionEvent e){
        if(e.getSource()==btnCancelar){
            alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("SALIR");
            alert.setContentText("¿Desea salir de la aplicación");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                System.exit(0);
            }
        }
        if(e.getSource()==btnGuardar){
            //alert=new Alert(AlertType.INFORMATION);
            //alert.setTitle("RESUMEN DE PEDIDO");
            //alert.setContentText("PAQUETE 1\nINGREDIENTE 1: "+cmbIngrediente1.getItems()+"\nINGREDIENTE 2: "+
            //cmbIngrediente2.getValue()+"\nINGREDIENTE 3: "+cmbIngrediente3.getValue());
            //alert.showAndWait();
            System.out.println(cmbIngrediente1.getSelectionModel().toString()+"");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
