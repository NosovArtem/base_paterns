package com.nsv.soft.dev.lab.base.patterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println(ProgramLogger.getLogger().toString());
        System.out.println(ProgramLogger.getLogger().toString());
        System.out.println(ProgramLogger.getLogger().toString());

        ProgramLogger.getLogger().addLogData("Fist record...");
        ProgramLogger.getLogger().addLogData("Second record...");
        ProgramLogger.getLogger().addLogData("Third record...");

        ProgramLogger.getLogger().showLog();

    }
}
