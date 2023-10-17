package com.nsv.soft.dev.lab.base.patterns.creational.singleton;

public class ProgramLogger {
    private static String logData = "This is log file. \n\n";
    private static ProgramLogger logger;

    public synchronized static ProgramLogger getLogger() {
        if (logger == null) {
            logger = new ProgramLogger();
        }

        return logger;
    }

    public ProgramLogger() {
    }

    void showLog() {
        System.out.println(logData);
    }

    void addLogData(String logRecord) {
        logData += logRecord + " \n";
    }
}
