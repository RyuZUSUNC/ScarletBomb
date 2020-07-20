package View.UtilsView.PortScanView;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXSpinner;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class PortScanController {
    private final PortScanBean bean = new PortScanBean();
    private static int PORT_CONTER = 0;

    // @FXML private AnchorPane anchorPane;

    @FXML private JFXTextField target;
    @FXML private JFXTextField start_port;
    @FXML private JFXTextField end_port;
    @FXML private JFXTextField thred_count;
    @FXML private JFXTextField delay;
    @FXML private JFXTextField state;

    @FXML private JFXButton startBT;
    @FXML private JFXSpinner spinner;
    @FXML private JFXButton littleBT01;
    @FXML private JFXButton littleBT02;
    @FXML private JFXButton littleBT03;

    // @FXML private TextArea ResultArea;
    @FXML private JFXListView ResultListView;

    PortScanIcon icon = new PortScanIcon();
    ObservableList<String> ResultPortList = FXCollections.observableArrayList();

    @FXML private void initialize(){
        spinner.setVisible(false);
        littleBT01.setGraphic(icon.sort_desc);
        littleBT02.setGraphic(icon.book_mark_fill);
        littleBT03.setGraphic(icon.clipbord);
        validatorSet();
        inputCheck();
    }

    @FXML private void Startscan(){
        PORT_CONTER = 1;

        ResultPortList.clear();
        ResultListView.setItems(ResultPortList);

        spinner.setProgress(0);
        spinner.setVisible(true);
        startBT.setDisable(true);
        state.setVisible(false);
        BeanSet();
        PortScan();
    }

    @FXML private void PortOrder(){
        for(int i=0;i<ResultPortList.size()-1;i++)
        {
            for (int j = 0; j < ResultPortList.size()-1-i; j++) {
               if(Integer.parseInt(ResultPortList.get(j))>Integer.parseInt(ResultPortList.get(j+1))){
                   String temp = ResultPortList.get(j);
                   ResultPortList.set(j,ResultPortList.get(j+1));
                   ResultPortList.set(j+1,temp);
               }
            }
        }
    }

    @FXML private void PortFast(){
        //// TODO: 2020/7/20
    }

    @FXML private void PortCopy(){
        StringBuilder result = new StringBuilder();
        for (String a:ResultPortList) {
            result.append(a).append("\n");
        }

        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable tText = new StringSelection(result.toString());
        clip.setContents(tText, null);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setGraphic(icon.clipbord_alert);
        alert.setTitle("Infomation");
        alert.setHeaderText("Copy Complete");
        alert.setContentText("Port information is copied to the clipboard");

        alert.showAndWait();
    }

    private void validatorSet(){
        RequiredFieldValidator target_validator = new RequiredFieldValidator("¿ NULL ?");
        RequiredFieldValidator start_port_validator = new RequiredFieldValidator("0-65535");
        RequiredFieldValidator end_port_validator = new RequiredFieldValidator("0-65535");
        RequiredFieldValidator thred_count_validator = new RequiredFieldValidator("¿ NULL ?");
        RequiredFieldValidator delay_validator = new RequiredFieldValidator("¿ NULL ?");

        target.setValidators(target_validator);
        start_port.setValidators(start_port_validator);
        end_port.setValidators(end_port_validator);
        thred_count.setValidators(thred_count_validator);
        delay.setValidators(delay_validator);
    }

    private void inputCheck(){
        start_port.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                start_port.validate();
            }
        });

        end_port.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                end_port.validate();
            }
        });

        thred_count.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                thred_count.validate();
            }
        });

        delay.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                delay.validate();
            }
        });
    }

    private void ResultSet(String Port){
        if(Port!=null){
            synchronized(this) {
                ResultPortList.add(Port);
            }
        }
    }

    private void BeanSet(){
        try{
            bean.setTarget(target.getText());
            bean.setStart_port(Integer.parseInt(start_port.getText()));
            bean.setEnd_port(Integer.parseInt(end_port.getText()));
            bean.setThread_count(Integer.parseInt(thred_count.getText()));
            bean.setDelay(Integer.parseInt(delay.getText()));
            bean.setState(state.getText());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void PortScanEnd(){
        startBT.setDisable(false);
        spinner.setVisible(false);
        state.setVisible(true);
    }

    private void ProgressSet(){
        PortCountAdd();
        spinner.setProgress((double)PORT_CONTER/bean.getEnd_port());
    }

    private void PortCountAdd(){
        synchronized(this) {
            PORT_CONTER++;
        }
    }

    private void PortScan() {
        Executor exec = Executors.newFixedThreadPool(bean.getThread_count(), runnable -> {
            Thread t = Executors.defaultThreadFactory().newThread(runnable);
            t.setDaemon(true);
            return t ;
        });

        for (int Port = bean.getStart_port(); Port <= bean.getEnd_port(); Port++) {
            int NPort = Port;
            Task<String> task = new Task<String>() {
                @Override
                public String call() {
                    // in real life, do real work here...
                    if (Objects.equals(PortScanner(bean.getTarget(), NPort, bean.getDelay()), "OPEN")) {
                        // System.out.println(NPort + ": open");
                        ProgressSet();
                        // ResultSet(String.valueOf(NPort));
                        if(PORT_CONTER>=bean.getEnd_port())
                        {
                            PortScanEnd();
                        }
                        return String.valueOf(NPort); // value to be processed in onSucceeded
                    } else {
                        // System.out.println(NPort);
                        ProgressSet();
                        if(PORT_CONTER>=bean.getEnd_port())
                        {
                            PortScanEnd();
                        }
                        return null; // value to be processed in onSucceeded
                    }
                }
            };
            task.setOnSucceeded(e -> ResultSet(task.getValue()));
            exec.execute(task);
        }
    }

    private String PortScanner(String address, int port, int delay) {
        String result = "OPEN";
        Socket socket;
        try {
            socket = new Socket();
            SocketAddress addport = new InetSocketAddress(address, port);
            socket.connect(addport, delay);
            socket.close();
        } catch (IOException e) {
            result = "CLOSE";
        }
        return result;
    }
}
