package View.ViewTset;

import javafx.concurrent.Task;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Test_02 {
    public static void main(String[] args) {
        Executor exec = Executors.newFixedThreadPool(2000, runnable -> {
            Thread t = Executors.defaultThreadFactory().newThread(runnable);
            t.setDaemon(true);
            return t ;
        });

        for (int i = 1; i <= 300; i++) {
            int value = i ;
            Task<String> task = new Task<String>() {
                @Override
                public String call() {
                    // in real life, do real work here...
                    return "\n" + value ; // value to be processed in onSucceeded
                }
            };
            // task.setOnSucceeded(e -> ta_Statusbereich.appendText(task.getValue()));
            // exec.execute(task);
        }
    }
}
