package View.RootView;

import java.util.ArrayList;

public class RootViewNodeList {
    public ArrayList<String> NodeList = new ArrayList<>();

    public RootViewNodeList(){
        this.NodeList.add("/View/UtilsView/PortScanView/PortScan.fxml");
        this.NodeList.add("/View/UtilsView/DirectoryScan/DirectoryScan.fxml");
        // this.NodeList.add("/View/UtilsView/DNSScan/DNSScan.fxml");
    }
}
