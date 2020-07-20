package View.RootView;

import Init.Init;
import javafx.scene.control.TreeItem;

public class RootViewNodeSet {
    public static TreeItem<String> NodeSet(){
        TreeItem<String> rootItem = new TreeItem<>(Init.languageResourceBundle.getString("Index"));

        TreeItem<String> PortScan = new TreeItem<>(Init.languageResourceBundle.getString("PortScan"));
        TreeItem<String> WebScan = new TreeItem<>(Init.languageResourceBundle.getString("WebScan"));
            TreeItem<String> DirectoryScan = new TreeItem<>(Init.languageResourceBundle.getString("DirectoryScan"));
            TreeItem<String> DNSScan = new TreeItem<>(Init.languageResourceBundle.getString("DNSScan"));
            TreeItem<String> AssetsScan = new TreeItem<>(Init.languageResourceBundle.getString("AssetsScan"));
        TreeItem<String> BlastIntruder = new TreeItem<>(Init.languageResourceBundle.getString("BlastIntruder"));
            TreeItem<String> SSH = new TreeItem<>("SSH");
            TreeItem<String> Telnet = new TreeItem<>("Telnet");
            TreeItem<String> VNC = new TreeItem<>("VNC");
            TreeItem<String> FTP = new TreeItem<>("FTP");
            TreeItem<String> Database = new TreeItem<>(Init.languageResourceBundle.getString("Database"));
                TreeItem<String> MySQL = new TreeItem<>("MySQL");
                TreeItem<String> MSSQL = new TreeItem<>("MSSQL");
                TreeItem<String> Oracle = new TreeItem<>("Oracle");
                TreeItem<String> MongoDB = new TreeItem<>("MongoDB");
                TreeItem<String> Redis = new TreeItem<>("Redis");

        rootItem.setExpanded(true);
        rootItem.getChildren().add(PortScan);
        rootItem.getChildren().add(WebScan);
            WebScan.setExpanded(true);
            WebScan.getChildren().add(DirectoryScan);
            WebScan.getChildren().add(DNSScan);
            WebScan.getChildren().add(AssetsScan);
        rootItem.getChildren().add(BlastIntruder);
            BlastIntruder.setExpanded(true);
            BlastIntruder.getChildren().add(SSH);
            BlastIntruder.getChildren().add(Telnet);
            BlastIntruder.getChildren().add(VNC);
            BlastIntruder.getChildren().add(FTP);
            BlastIntruder.getChildren().add(Database);
                Database.setExpanded(true);
                Database.getChildren().add(MySQL);
                Database.getChildren().add(MSSQL);
                Database.getChildren().add(Oracle);
                Database.getChildren().add(MongoDB);
                Database.getChildren().add(Redis);

        return rootItem;
    }
}