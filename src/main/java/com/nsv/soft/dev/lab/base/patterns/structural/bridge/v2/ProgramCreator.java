package com.nsv.soft.dev.lab.base.patterns.structural.bridge.v2;

public class ProgramCreator{
    public static void main(String[] args) {

        Program [] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for (Program program : programs){
            program.developProgram();
        }

    }

}