/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

/**
 *
 * @author Hifazz
 */
public class Tugas1 extends Application {
    
    @Override
    public void start(Stage window) {
        GridPane index = new GridPane();
        index.setMinSize(400,200);
        index.setPadding(new Insets(10,10,10,10));
        index.setVgap(10);
        index.setHgap(10);
        index.setAlignment(Pos.CENTER);
        
        Text txtnama = new Text("Nama");
        Text txttelepon = new Text("Telepon");
        Text txtalamat = new Text("Alamat");
        Text text1 = new Text(":");
        Text text2 = new Text(":");
        Text text3 = new Text(":");
        
        TextField tFnama = new TextField();
        TextField tFtelepon = new TextField();
        TextField tFalamat = new TextField();
        
        Button btnKirim = new Button("Kirim");
        Button btnHapus = new Button("Hapus");
        
        TilePane tpane = new TilePane();
        tpane.setOrientation(Orientation.HORIZONTAL);
        tpane.setAlignment(Pos.CENTER);
        tpane.getChildren().addAll(btnKirim, btnHapus);
       
        
        // --- Initial To Grip Pane --- //

        index.add(txtnama,0,0);
        index.add(text1,1,0);
        index.add(tFnama,2,0);
        
        index.add(txttelepon,0,1);
        index.add(text2,1,1);
        index.add(tFtelepon,2,1);
        
        index.add(txtalamat,0,2);
        index.add(text3,1,2);
        index.add(tFalamat,2,2);
        
        index.add(tpane,2,3);
        
        // Window Title
        window.setTitle("Layout Form");
        
        // Call Window
        Scene scene = new Scene(index);
        window.setScene(scene);
        
        // Show Windows
        window.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
