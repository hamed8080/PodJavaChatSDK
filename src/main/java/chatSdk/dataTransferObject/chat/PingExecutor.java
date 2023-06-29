package chatSdk.dataTransferObject.chat;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Created By Khojasteh on 7/28/2019
 */
public class PingExecutor {
    static ScheduledExecutorService taskExecutor;

    public static ScheduledExecutorService getInstance() {
        if (taskExecutor == null) {
            taskExecutor = Executors.newSingleThreadScheduledExecutor();
        }
        return taskExecutor;
    }

    public static void setTaskExecutor(ScheduledExecutorService taskExecutor) {
        PingExecutor.taskExecutor = taskExecutor;
    }

    public static ScheduledExecutorService getTaskExecutor() {
        return taskExecutor;
    }

    public static void stopThread() {
        if (taskExecutor != null && !taskExecutor.isShutdown())
            taskExecutor.shutdownNow();
    }
}
