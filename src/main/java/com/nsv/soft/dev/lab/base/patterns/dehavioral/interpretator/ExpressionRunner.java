package com.nsv.soft.dev.lab.base.patterns.dehavioral.interpretator;

public class ExpressionRunner {
    public static String CORE = "Core";
    public static String SPRING = "Spring";
    public static String JAVA = "Java";

    public static void main(String[] args) {
        String CV = "Java Core";
        String CV2 = "Java Spring";

        Expression java = getJava();
        Expression javaEE = getJavaEE();

        System.out.println("Does dev know Java: " + java.interpret(CV));
        System.out.println("Does dev know Spring : " + javaEE.interpret(CV2));
    }


    public static Expression getJava() {
        Expression expression = new Terminate(JAVA);
        Expression expression2 = new Terminate(CORE);
        return new Or(expression, expression2);
    }

    public static Expression getJavaEE() {
        Expression expression = new Terminate(JAVA);
        Expression expression2 = new Terminate(SPRING);
        return new And(expression, expression2);
    }
}
