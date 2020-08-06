package View.UtilsView.DNSScan;

import com.jfoenix.controls.*;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class DNSScanController {
    DNSScanIcon dnsScanIcon = new DNSScanIcon();

    @FXML AnchorPane settingPane;
    @FXML AnchorPane resultPane;
    @FXML JFXComboBox<String> CB_Protocol;

    @FXML JFXTextField field_target;
    @FXML JFXTextField field_dicPath;
    @FXML JFXTextField field_preview;

    @FXML JFXTextField field_threadCount;
    @FXML JFXTextField field_delay;
    @FXML JFXTextField field_dicCount;
    @FXML JFXTextField field_state;

    @FXML
    JFXButton BT_start;
    @FXML JFXButton BT_selectDic;
    @FXML JFXButton BT_next;
    @FXML JFXButton BT_back;

    @FXML JFXComboBox<String> CB_filter;

    @FXML JFXButton LBT_save;
    @FXML JFXButton LBT_02;
    @FXML JFXButton LBT_copy;
    @FXML JFXButton LBT_order;
    @FXML JFXButton LBT_05;

    @FXML JFXListView<String> view_dicPreview;
    @FXML JFXListView<String> view_result;

    @FXML JFXProgressBar progressBar;
    @FXML JFXSpinner spinner;

    @FXML private void initialize(){
        LBT_save.setGraphic(dnsScanIcon.save_fill);
        BT_back.setGraphic(dnsScanIcon.arrow_go_back);
        BT_next.setGraphic(dnsScanIcon.arrow_right);
        LBT_copy.setGraphic(dnsScanIcon.clipbord);
        LBT_order.setGraphic(dnsScanIcon.sort_desc);

    }
// Button
    @FXML private void OnBT_start(){
        paneCheckAnime(resultPane,settingPane);
    }

    @FXML private void OnBT_back(){
        paneCheckAnime(settingPane,resultPane);
    }

    @FXML private void OnBT_next(){
        paneCheckAnime(resultPane,settingPane);
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
}
