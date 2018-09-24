package test.memory;

import java.text.MessageFormat;
import java.text.NumberFormat;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import weblogic.logging.NonCatalogLogger;

public class TestJob implements Job {

    private static final NonCatalogLogger LOG = new NonCatalogLogger("test.memory.TestJob");

    @Override
    public void execute(final JobExecutionContext ctx)
            throws JobExecutionException {
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory(); // current heap allocated to the VM process
        long freeMemory = runtime.freeMemory(); // out of the current heap, how much is free
        long maxMemory = runtime.maxMemory(); // Max heap VM can use e.g. Xmx setting
        long usedMemory = totalMemory - freeMemory; // how much of the current heap the VM is using
        long availableMemory = maxMemory - usedMemory; // available memory i.e. Maximum heap size minus the current amount used
        LOG.info(String.format("Usando %s de %s (%s)", new Object[]{humanReadableByteCount(usedMemory), humanReadableByteCount(maxMemory), getPercentaje(usedMemory, maxMemory)}));
        System.gc();
        // LOG.info("Usando {} de {} ({})", new Object[]{humanReadableByteCount(usedMemory), humanReadableByteCount(maxMemory), getPercentaje(usedMemory, maxMemory)});
    }

    private String humanReadableByteCount(long bytes) {
        return humanReadableByteCount(bytes, false);
    }
    
    private String getPercentaje(long a, long b) {
        return NumberFormat.getPercentInstance().format(a /(double) b);
    }

    public static String humanReadableByteCount(long bytes, boolean si) {
        int unit = si ? 1000 : 1024;
        if (bytes < unit) {
            return bytes + " B";
        }
        int exp = (int) (Math.log(bytes) / Math.log(unit));
        String pre = (si ? "kMGTPE" : "KMGTPE").charAt(exp - 1) + (si ? "" : "");
        return String.format("%.2f %sB", bytes / Math.pow(unit, exp), pre);
    }

}
