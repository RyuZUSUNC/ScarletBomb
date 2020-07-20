package View.UtilsView.PortScanView;

public class PortScanBean {
    private String target;
    private int start_port = 1;
    private int end_port = 65535;
    private int thread_count = 1000;
    private int delay = 200;
    private String state = "Wait";

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public int getStart_port() {
        return start_port;
    }

    public void setStart_port(int start_port) {
        this.start_port = start_port;
    }

    public int getEnd_port() {
        return end_port;
    }

    public void setEnd_port(int end_port) {
        this.end_port = end_port;
    }

    public int getThread_count() {
        return thread_count;
    }

    public void setThread_count(int thread_count) {
        this.thread_count = thread_count;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
