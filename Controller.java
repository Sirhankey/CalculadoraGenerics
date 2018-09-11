package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static sample.Generics.*;

public class Controller implements Initializable{
double numero1;
double numero2;
String operacao;
Double resultado =0d;

@FXML
private TextField mostrador;
@FXML
private Button button0;
@FXML
private Button button1;
@FXML
private Button button2;
@FXML
private Button button3;
@FXML
private Button button4;
@FXML
private Button button5;
@FXML
private Button button6;
@FXML
private Button button7;
@FXML
private Button button8;
@FXML
private Button button9;
@FXML
private Button buttonSoma;
@FXML
private Button buttonSubtracao;
@FXML
private Button buttonDivisao;
@FXML
private Button buttonMultiplicacao;
@FXML
private Button buttonPontoFlutuante;
@FXML
private Button buttonIgualdade;
@FXML
private Button buttonApagar;








    public void getOperacao(int i){
    switch (i){
        case 0: {//subtracao
            System.out.println("subtracao");
            break;
        }
        case 1: {//soma
            System.out.println("soma");
            break;
        }
        case 2: {//multiplicacao
            System.out.println("multiplicacao");
            break;
        }
        case 3: {//divisao
            System.out.println("divisao");
            break;
        }
        case 4: {//igualdade
            System.out.println("igualdade");
            break;
        }
        default:{

        }
    }
}

    @FXML
    private void setButton0() {
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mostrador.setText(mostrador.getText()+"1");
            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mostrador.setText(mostrador.getText()+"2");
            }
        });
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mostrador.setText(mostrador.getText()+"3");
            }
        });
        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mostrador.setText(mostrador.getText()+"4");

            }
        });
        button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mostrador.setText(mostrador.getText()+"5");
            }
        });
        button6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mostrador.setText(mostrador.getText()+"6");
            }
        });
        button7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mostrador.setText(mostrador.getText()+"7");
            }
        });
        button8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mostrador.setText(mostrador.getText()+"8");

            }
        });
        button9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mostrador.setText(mostrador.getText()+"9");
            }
        });
        button0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mostrador.setText(mostrador.getText()+"0");

            }
        });
        buttonSoma.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numero1= Double.parseDouble(mostrador.getText());
                mostrador.setText("");
                operacao = "+";
            }
        });
        buttonSubtracao.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numero1= Double.parseDouble(mostrador.getText());
                mostrador.setText("");
                operacao = "-";
            }
        });
        buttonDivisao.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numero1= Double.parseDouble(mostrador.getText());
                mostrador.setText("");
                operacao = "/";
            }
        });
        buttonMultiplicacao.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numero1= Double.parseDouble(mostrador.getText());
                mostrador.setText("");
                operacao = "*";
            }
        });
        buttonPontoFlutuante.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mostrador.setText(mostrador.getText()+".");

            }
        });
        buttonApagar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mostrador.setText("");
                numero1 = 0;
                numero2 = 0;
                operacao = "";
            }
        });
        buttonIgualdade.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numero2 = Double.parseDouble(mostrador.getText());
                switch (operacao){
                    case "+":{
                        resultado = (Double) soma(numero1,numero2);
                        mostrador.setText(String.valueOf(resultado));
                        break;
                    }
                    case "-":{
                        resultado = (Double) subtracao(numero1,numero2);
                        mostrador.setText(String.valueOf(resultado));
                        break;
                    }
                    case "/":{
                        resultado = (Double) divisao(numero1,numero2);
                        mostrador.setText(String.valueOf(resultado));
                        break;
                    }
                    case "*":{
                        resultado = (Double) multiplicacao(numero1,numero2);
                        mostrador.setText(String.valueOf(resultado));
                        break;
                    }
                    default:{

                    }
                }
            }
        });

    }
}
