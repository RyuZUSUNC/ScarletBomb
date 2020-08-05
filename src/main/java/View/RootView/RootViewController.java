package View.RootView;

import Init.Init;
import com.sun.scenario.effect.impl.prism.PrImage;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;

import javax.swing.text.Element;
import javax.swing.text.html.ImageView;
import java.io.IOException;
import java.util.Locale;

public class RootViewController {
    public Node SelectNode = new AnchorPane();

    @FXML
    private BorderPane borderPane;

    @FXML
    private AnchorPane allpane;

    @FXML
    private TreeView<String> RootTree;

    private final RootViewNodeList NodeList = new RootViewNodeList();

    @FXML
    private void initialize() {
        RootTree.setRoot(RootViewNodeSet.NodeSet());
        addView();
    }

    public void addView() {
        Thread addview = new Thread(() -> {
            try {
                FXMLLoader indexloader = new FXMLLoader();//FXML布局加载器
                indexloader.setLocation(RootViewController.class.getResource("IndexAnchorpane.fxml"));//根据路径加载布局
                AnchorPane ap = indexloader.load();
                allpane.getChildren().addAll(ap);//添加至主pane
            } catch (IOException e) {
                e.printStackTrace();
            }

            for (String NodePath : NodeList.NodeList) {
                // System.out.println(NodePATH);//输出测试
                try {
                    FXMLLoader loader = new FXMLLoader();//FXML布局加载器
                    loader.setLocation(RootViewController.class.getResource(NodePath));//根据路径加载布局
                    loader.setResources(Init.languageResourceBundle);//加载语言配置文件
                    AnchorPane ap = loader.load();
                    ap.setVisible(false);//设置默认不显示
                    allpane.getChildren().addAll(ap);//添加至主pane
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });//启动一个新线程添加节点对应的pane
        addview.run();//线程运行
    }

    @FXML
    private void getView() {
        if ((RootTree.getSelectionModel().getSelectedItem()).isLeaf()) {

            String SelectNodeValue = (RootTree.getSelectionModel().getSelectedItem().toString().split(" "))[3];//获取tree选中节点value
            if (Locale.getDefault().getLanguage().equals("zh")) {
                try {
                    SelectNodeValue = Init.languageResourceBundle.getString(SelectNodeValue);
                } catch (Exception e) {
                    System.out.println("无对应，返回原始值");
                }
            }//如果是中文环境，做中英文对应变化
            // System.out.println(SelectNode);//输出选中节点value测试

            for (Node a : allpane.getChildren()) {
                if (a.getId().equals(SelectNodeValue)) {

                    for (Node b : allpane.getChildren()) {
                        b.setVisible(false);
                    }//隐藏所有pane

                    a.setVisible(true);
                    // if(SelectNode!=a){
                    //     Pane_Anime(SelectNode,a);
                    //     SelectNode = a;
                    //     a.setVisible(true);
                    // }
                }
            }//显示与选中节点对应的pane
        }//如果选中节点是叶子节点才进行pane切换
    }

    private static void Pane_Anime(Node SelectNode,Node NextNode) {
        Timeline timeLine = new Timeline();

        KeyValue kv_S_Start = new KeyValue(SelectNode.translateYProperty(), 0);
        KeyFrame kf_S_Start = new KeyFrame(Duration.seconds(0), "Start", event -> { },kv_S_Start);

        KeyValue kv_S_Stop = new KeyValue(SelectNode.translateYProperty(), -600);
        KeyFrame kf_S_Stop = new KeyFrame(Duration.seconds(0.3), "Stop", event -> { },kv_S_Stop);

        KeyValue kv_N_Start = new KeyValue(NextNode.translateYProperty(), 600);
        KeyFrame kf_N_Start = new KeyFrame(Duration.seconds(0), "Start", event -> { },kv_N_Start);

        KeyValue kv_N_Stop = new KeyValue(NextNode.translateYProperty(), 0);
        KeyFrame kf_N_Stop = new KeyFrame(Duration.seconds(0.3), "Stop", event -> { },kv_N_Stop);
        timeLine.getKeyFrames().addAll(kf_S_Start,kf_S_Stop,kf_N_Start,kf_N_Stop);
        timeLine.play();
    }

}
