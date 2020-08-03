package View.UtilsView.DirectoryScan;

import Init.Init;
import com.jfoenix.controls.*;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class DirectoryScanController {
    DirectoryScanBean bean = new DirectoryScanBean();
    DirectoryScanIcon directoryScanIcon = new DirectoryScanIcon();
    DirectoryScanImpl directoryScanimpl = new DirectoryScanImpl();

    ArrayList<JFXCheckBox> allCheckBoxList = new ArrayList<>();

    ObservableList<String> ResultList = FXCollections.observableArrayList();

    private static int SCAN_CONTER = 0;
    private static String PROTOCOL = "http://";

    @FXML AnchorPane settingPane;
    @FXML AnchorPane resultPane;
    @FXML JFXComboBox CB_Protocol;

    @FXML JFXTextField field_target;
    @FXML JFXTextField field_dicPath;
    @FXML JFXTextField field_preview;

    @FXML JFXTextField field_threadCount;
    @FXML JFXTextField field_delay;
    @FXML JFXTextField field_dicCount;
    @FXML JFXTextField field_state;

    @FXML JFXCheckBox check_200_box;
    @FXML JFXCheckBox check_301_box;
    @FXML JFXCheckBox check_302_box;
    @FXML JFXCheckBox check_303_box;
    @FXML JFXCheckBox check_401_box;
    @FXML JFXCheckBox check_403_box;
    @FXML JFXCheckBox check_404_box;
    @FXML JFXCheckBox check_1XX_box;
    @FXML JFXCheckBox check_2XX_box;
    @FXML JFXCheckBox check_3XX_box;
    @FXML JFXCheckBox check_4XX_box;
    @FXML JFXCheckBox check_5XX_box;
    @FXML JFXCheckBox check_ALL_box;

    @FXML JFXButton BT_start;
    @FXML JFXButton BT_selectDic;
    @FXML JFXButton BT_next;
    @FXML JFXButton BT_back;

    @FXML JFXComboBox CB_filter;

    @FXML JFXButton LBT_save;
    @FXML JFXButton LBT_ststusCodeFast;
    @FXML JFXButton LBT_copy;
    @FXML JFXButton LBT_04;
    @FXML JFXButton LBT_05;

    @FXML JFXListView view_result;

    @FXML JFXProgressBar progressBar;
    @FXML JFXSpinner spinner;

    @FXML private void initialize(){
        LBT_ststusCodeFast.setGraphic(directoryScanIcon.book_mark_fill);
        LBT_save.setGraphic(directoryScanIcon.save_fill);
        BT_back.setGraphic(directoryScanIcon.arrow_go_back);
        BT_next.setGraphic(directoryScanIcon.arrow_right);
        LBT_copy.setGraphic(directoryScanIcon.clipbord);

        view_result.setItems(ResultList);

        BT_start.setDisable(true);
        initCB_CB_Protocol();
        FieldsListener();
        CheckBoxListCreate();
    }
// Button
    @FXML private void OnBT_start(){
        initOnBT_start();
        initCB_filter();
        BT_next.setDisable(false);
        paneCheckAnime(resultPane,settingPane);
        field_state.setVisible(false);
        BT_start.setDisable(true);
        DirectoryScan();
    }

    @FXML private void OnDirectory_select(){
        bean.setDirectoryFile(directoryScanimpl.DirectoryGet(Init.languageResourceBundle.getString("FileChooserTitle")));
        try{
            field_dicPath.setText(bean.getDirectoryFile().toString());
            field_dicPath.setAlignment(Pos.CENTER_LEFT);
            bean.setDirectoryLineCountNum(directoryScanimpl.DirectoryLineGet(bean.getDirectoryFile()));
            field_dicCount.setText(String.valueOf(bean.getDirectoryLineCountNum()));
            bean.setDirectoryText(directoryScanimpl.DirectoryTextGet(bean.getDirectoryFile()));
            // for (String a: bean.getDirectoryText()) { System.out.println(a); }
            // System.out.println(bean.getDirectoryFile());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void FieldsListener(){
        field_target.textProperty().addListener((observable, oldValue, newValue) -> Platform.runLater(() -> {
            if(!field_target.getText().isEmpty()&&!field_dicPath.getText().isEmpty()){
                bean.setTargetURL(field_target.getText());
                PROTOCOL = CB_Protocol.getValue().toString();
                field_preview.setText(PROTOCOL + bean.getTargetURL()+bean.getDirectoryText().get(1));
            }
        }));

        field_preview.textProperty().addListener((observable, oldValue, newValue) -> Platform.runLater(() -> {
            if(!field_preview.getText().isEmpty()){
                BT_start.setDisable(false);
            }
        }));

        field_dicPath.textProperty().addListener((observable, oldValue, newValue) -> Platform.runLater(() -> {
            if(!field_target.getText().isEmpty()&&!field_dicPath.getText().isEmpty()){
                bean.setTargetURL(field_target.getText());
                PROTOCOL = CB_Protocol.getValue().toString();
                field_preview.setText(PROTOCOL + bean.getTargetURL()+bean.getDirectoryText().get(1));
            }
        }));
    }

    @FXML private void OnBT_back(){
        paneCheckAnime(settingPane,resultPane);
    }

    @FXML private void OnBT_next(){
        paneCheckAnime(resultPane,settingPane);
    }

    private void initOnBT_start(){
        progressBar.lookup(".bar").setStyle("-fx-background-color: #26a7e2;");
        bean.setThreadCount(Integer.parseInt(field_threadCount.getText()));
        bean.setDelay(Integer.parseInt(field_delay.getText()));
        field_state.setVisible(false);
        spinner.setVisible(true);
        SCAN_CONTER = 0;
    }
// Anime
    private void paneCheckAnime(AnchorPane set,AnchorPane noset){
        Timeline timeLine = new Timeline();

        KeyValue kv_S_Start = new KeyValue(noset.translateXProperty(), 0);
        KeyFrame kf_S_Start = new KeyFrame(Duration.seconds(0), "Start", event -> noset.setVisible(false),kv_S_Start);

        KeyValue kv_S_Stop = new KeyValue(noset.translateXProperty(), -680);
        KeyFrame kf_S_Stop = new KeyFrame(Duration.seconds(0.3), "Stop", event -> { },kv_S_Stop);

        KeyValue kv_N_Start = new KeyValue(set.translateXProperty(), 680);
        KeyFrame kf_N_Start = new KeyFrame(Duration.seconds(0), "Start", event -> set.setVisible(true),kv_N_Start);

        KeyValue kv_N_Stop = new KeyValue(set.translateXProperty(), 0);
        KeyFrame kf_N_Stop = new KeyFrame(Duration.seconds(0.3), "Stop", event -> { },kv_N_Stop);

        timeLine.getKeyFrames().addAll(kf_S_Start,kf_S_Stop,kf_N_Start,kf_N_Stop);
        timeLine.play();
    }
// CheckBox
    private void CheckBoxListCreate(){
        allCheckBoxList.add(check_200_box);
        allCheckBoxList.add(check_301_box);
        allCheckBoxList.add(check_302_box);
        allCheckBoxList.add(check_303_box);
        allCheckBoxList.add(check_401_box);
        allCheckBoxList.add(check_403_box);
        allCheckBoxList.add(check_404_box);
        allCheckBoxList.add(check_1XX_box);
        allCheckBoxList.add(check_2XX_box);
        allCheckBoxList.add(check_3XX_box);
        allCheckBoxList.add(check_4XX_box);
        allCheckBoxList.add(check_5XX_box);
        allCheckBoxList.add(check_ALL_box);
    }

    private ObservableList<String> CheckBoxCheck(){
        ObservableList<String> result = FXCollections.observableArrayList();
        for (JFXCheckBox TempCB:allCheckBoxList) {
            if(TempCB.isSelected()){
                result.add(TempCB.getText());
            }
            TempCB.getText();
        }
        // for (String a:result) { System.out.println(a); }
        return result;
    }
// ComboBox
    private void initCB_filter(){
        bean.setCheckStstusCode(CheckBoxCheck());
        ObservableList<String> Checking = FXCollections.observableArrayList();
        Checking.addAll("ALL");
        for (String a:bean.getCheckStstusCode()) {
            if(!a.equals("ALL")){
                Checking.addAll(a);
            }
        }
        CB_filter.setItems(Checking);
        CB_filter.getSelectionModel().select(0);
    }

    private void initCB_CB_Protocol(){
        ObservableList<String> Protocol = FXCollections.observableArrayList();
        Protocol.add("http://");
        Protocol.add("https://");
        CB_Protocol.setItems(Protocol);
        CB_Protocol.getSelectionModel().select(0);
    }
//OnScan
    private void DirectoryScan(){
        Executor exec = Executors.newFixedThreadPool(bean.getThreadCount(), runnable -> {
            Thread t = Executors.defaultThreadFactory().newThread(runnable);
            t.setDaemon(true);
            return t ;
        });

        for (int Times = 0; Times <= bean.getDirectoryLineCountNum(); Times++) {
            int frequency = Times;
            Task<String> task = new Task<String>() {
                @Override
                public String call() {
                    // in real life, do real work here...
                    ProgressSet();
                    if(SCAN_CONTER>=bean.getDirectoryLineCountNum())
                    {
                        PortScanEnd();
                    }
                    return DirectoryScanner(frequency);
                }
            };
            task.setOnSucceeded(e -> ResultSet(task.getValue()));
            exec.execute(task);
        }
    }

    private void ResultSet(String Result){
        if(Result!=null){
            synchronized(this) {
                ResultList.add(Result);
            }
        }
    }

    private void PortScanEnd(){
        BT_start.setDisable(false);
        spinner.setVisible(false);
        field_state.setVisible(true);
    }

    private void ProgressSet(){
        PortCountAdd();

        spinner.setProgress((double)SCAN_CONTER/bean.getDirectoryLineCountNum());
        progressBar.setProgress((double)SCAN_CONTER/bean.getDirectoryLineCountNum());
    }

    private void PortCountAdd(){
        synchronized(this) {
            SCAN_CONTER++;
        }
    }

    private String DirectoryScanner(int frequency){
        String ResultNumber = directoryScanimpl.ResponseNumGet(PROTOCOL + bean.getTargetURL()+bean.getDirectoryText().get(frequency),bean.getDelay());
        String Result;
        for (String a : bean.getCheckStstusCode()) {
            if (a.equals(ResultNumber)) {
                Result = ResultNumber+"     "+bean.getDirectoryText().get(frequency);
                return Result;
            }else if(a.equals(((Integer.parseInt(ResultNumber)/100)+"XX"))){
                Result = ResultNumber+"     "+bean.getDirectoryText().get(frequency);
                return Result;
            }
        }
        return null;
    }

}
