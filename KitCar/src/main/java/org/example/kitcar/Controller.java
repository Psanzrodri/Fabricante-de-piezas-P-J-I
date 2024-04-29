package org.example.kitcar;

import DBConnection.databaseconection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

    public class Controller {

        @FXML
        private Label showUsernameLabel;

        @FXML
        private ListView<String> showDatosListView;
        public void connectButton (ActionEvent event) {
            databaseconection connectNow = new databaseconection ( );
            Connection connectDB = connectNow.getConnection ( );

            String connectQuery = "select precio, cantidad from Stock;";

            try {
                Statement statement = connectDB.createStatement ( );
                ResultSet queryOutput = statement.executeQuery ( connectQuery );
                while (queryOutput.next ( )) {
                    String precio = queryOutput.getString(1);
                    String cantidad = queryOutput.getString(2);
                    String listOut = precio + "\""+cantidad +"\"";
                    showDatosListView.getItems().add (listOut);
                    //showDatosListView.setText ( queryOutput.getString ( 1) );
                   //System.out.print ( queryOutput.getString ( 1) + " : " );
                   //System.out.println ( queryOutput.getString ( 2)  );
                }

            } catch (Exception e) {
                e.printStackTrace ( );
            }
        }
}