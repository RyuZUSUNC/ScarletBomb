package View.UtilsView.DirectoryScan;

import javafx.collections.ObservableList;

import java.io.File;
import java.util.ArrayList;

public class DirectoryScanBean {
    private String targetURL;//目标URL
    private ArrayList<String> directoryText;//字典内容
    private File directoryFile;//字典文件
    private int directoryLineCountNum;//字典行数
    private int threadCount;//线程数
    private int delay;//延迟

    private ObservableList<String> CheckStstusCode;//选中的待匹配的状态码

    public ObservableList<String> getCheckStstusCode() {
        return CheckStstusCode;
    }

    public void setCheckStstusCode(ObservableList<String> checkStstusCode) {
        CheckStstusCode = checkStstusCode;
    }

    public String getTargetURL() {
        return targetURL;
    }

    public void setTargetURL(String targetURL) {
        this.targetURL = targetURL;
    }

    public ArrayList<String> getDirectoryText() {
        return directoryText;
    }

    public void setDirectoryText(ArrayList<String> directoryText) {
        this.directoryText = directoryText;
    }

    public File getDirectoryFile() {
        return directoryFile;
    }

    public void setDirectoryFile(File directoryFile) {
        this.directoryFile = directoryFile;
    }

    public int getDirectoryLineCountNum() {
        return directoryLineCountNum;
    }

    public void setDirectoryLineCountNum(int directoryLineCountNum) {
        this.directoryLineCountNum = directoryLineCountNum;
    }

    public int getThreadCount() {
        return threadCount;
    }

    public void setThreadCount(int threadNum) {
        this.threadCount = threadNum;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }
}
