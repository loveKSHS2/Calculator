package com.example.seunghyun.calculator;
import java.util.*;
import java.util.Stack;
import java.util.Arrays;
import java.util.HashMap;

import java.util.*;
import java.util.Stack;
import java.util.Arrays;
import java.util.HashMap;

public class InputOutput {

    Stack <String> stack;
    Stack <String> stack2;
    List<String> expList;
    HashMap<String, Integer> opPriority;

    public String expression(String expression) {

        stack = new Stack<>();
        stack2 = new Stack<>();
        expList = new ArrayList<String>();


        //String expression = "((1.5/2)+3-2*1/1)+2^3";
        String temp[] = expression.split("(?<=[\\(\\)\\+\\-*!%^le√\\/\\^A-Za-z])|(?=[\\(\\)\\+\\-*!%^le√\\/\\^A-Za-z])");
        System.out.println(Arrays.toString(temp));

        opPriority = new HashMap<>();
        opPriority.put("(", 0);
        opPriority.put("+",1);
        opPriority.put("-", 1);
        opPriority.put("*", 2);
        opPriority.put("/", 2);
        opPriority.put("%", 2);
        opPriority.put("^", 2);
        opPriority.put("l", 3);
        opPriority.put("√",3);
        opPriority.put("e", 3);
        opPriority.put("!", 3);
        opPriority.put("s", 3);
        opPriority.put("c", 3);
        opPriority.put("t", 3);

        String op;

        for(int i =0;i<temp.length;i++) {

            if(isNumber(temp[i])){
                //double number = Double.parseDouble(temp[i]);
                //System.out.println(number);
                expList.add(temp[i]);
            }

            else if(temp[i].equals("(")) {
                stack.push(temp[i]);
            }
            else if(temp[i].equals(")")) {
                while(!stack.isEmpty()) {
                    op = stack.pop();
                    if(op.equals("(")) {break;}
                    else {//System.out.println(op);
                        expList.add(op);
                    }
                }
            }
            else if(temp[i].equals("+")||temp[i].equals("-")||temp[i].equals("/")||temp[i].equals("*")||temp[i].equals("!")
                    ||temp[i].equals("%")||temp[i].equals("^")||temp[i].equals("l")||temp[i].equals("e")||temp[i].equals("s")
                    ||temp[i].equals("c")||temp[i].equals("t")||temp[i].equals("√"))
            {
                while(!stack.isEmpty()) {
                    op = stack.peek();
                    if(opPriority.get(temp[i])<=opPriority.get(op)) {
                       // System.out.println(op);
                        expList.add(op);
                        stack.pop();
                    }
                    else {break;}

                }
                stack.push(temp[i]);
            }


        }// end for

        while(!stack.isEmpty()) {

//            String str;
//            str = stack.pop();
//            System.out.println(str);
            expList.add(stack.pop());

        }

     //   System.out.println("");

        for(int i =0;i<expList.size();i++) {

            if(isNumber(expList.get(i))){
                stack2.push(expList.get(i));
            }
            else {
                String first="0";
                String second="0";
                double third=0.0;

                if(expList.get(i).equals("l")||expList.get(i).equals("e")||expList.get(i).equals("!")||expList.get(i).equals("s")
                        ||expList.get(i).equals("c")||expList.get(i).equals("t")||expList.get(i).equals("√")){
                    first = stack2.pop();
                    third = operator(first,second,expList.get(i));
                    stack2.push(Double.toString(third));
                }
                else {
                    first = stack2.pop();
                    second = stack2.pop();
                    third = operator(first,second,expList.get(i));
                    stack2.push(Double.toString(third));
                }

            }

        }
        return stack2.pop();

    }// end InputOutput method

    public double operator(String first, String second, String string) {

        double num1 = Double.valueOf(first);
        double num2 = Double.valueOf(second);
        Operation cal = new Operation();
        double result=0.0;

        if(string.equals("+")) {
            result = cal.plus(num1,num2);
            System.out.println("+"+result);
        }
        else if(string.equals("-")) {
            result = cal.minu(num2, num1);
            System.out.println("-"+result);
        }
        else if(string.equals("*")) {
            result = cal.mult(num1, num2);
        }
        else if(string.equals("/")) {
            result = cal.div(num2, num1);
            System.out.println("result"+result);
        }
        else if(string.equals("%")) {
            result = cal.mod(num2, num1);
        }
        else if(string.equals("^")) {
            result = cal.inFunction(num2, num1);
            System.out.println("^:"+result);
        }
        else if(string.equals("l")) {
            result = cal.LogFunction(num1);
        }
        else if(string.equals("√")){
            result = cal.RootFunction(num1);
        }
        else if(string.equals("e")) {
            result = cal.expFunction(num1);
        }
        else if(string.equals("!")) {
            result = cal.factFunction(num1);
        }
        else if(string.equals("s")) {
            result = cal.sinFunction(num1);
        }
        else if(string.equals("c")) {
            result = cal.cosFunction(num1);
        }
        else if(string.equals("t")) {
            result = cal.tanFunction(num1);
        }

        return result;

    }


    public boolean isNumber(String temp){
        boolean result = false;

        try{
            Double.parseDouble(temp) ;
            result = true ;
        }catch(Exception e){}

        return result ;
    }




}//end class

