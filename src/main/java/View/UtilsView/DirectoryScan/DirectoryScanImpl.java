package View.UtilsView.DirectoryScan;

import javafx.scene.input.TouchPoint;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DirectoryScanImpl {
    public File DirectoryGet(String Title){
        Stage primaryStage = null;
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle(Title);
        FileSystemView fsv = FileSystemView.getFileSystemView();
        fileChooser.setInitialDirectory(fsv.getHomeDirectory());
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("txt","*.txt"));
        return fileChooser.showOpenDialog(primaryStage);
    }//字典获取

    public int DirectoryLineGet(File file){
        int count = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(scanner.hasNextLine()){
            scanner.nextLine();
            count++;
        }
        return count;
    }//字典行数获取

    public ArrayList<String> DirectoryTextGet(File file) throws IOException {
        ArrayList<String> out = new ArrayList<>();
        String line;
        FileInputStream fis = new FileInputStream(file);//Input流
        InputStreamReader isr = new InputStreamReader(fis);//读取流
        BufferedReader br = new BufferedReader(isr);//缓冲区
        while ((line=br.readLine())!=null) {
            out.add(line);
        }
        br.close();
        isr.close();
        fis.close();
        return out;
    }//字典内容获取

    public String ResponseNumGet(String url, int timeOut){
        HttpClient client = new HttpClient();
        GetMethod getMethod = new GetMethod(url);
        getMethod.setFollowRedirects(false);//取消跟随300段跳转
        client.setTimeout(timeOut);
        client.setConnectionTimeout(timeOut+2000);
        //client.getHttpConnectionManager().getParams().setConnectionTimeout(5000);
        int code = 0;
        try {
            code = client.executeMethod(getMethod);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String Result = Integer.toString(code);
        return Result;
    }//返回值获取

}
