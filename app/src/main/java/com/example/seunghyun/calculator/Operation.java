package com.example.seunghyun.calculator;

public class Operation {
    // 사칙연산
    // 덧셈
    public double plus(double x, double y){
        return x+y;
    }

    // 뺄셈: -1을 곱한 것으로 변환
    public double minu(double x, double y){
        return x+(-1)*y;
    }

    // 곱셈
    public double mult(double x, double y){
        return x*y;
    }

    // 나눗셈
    public double div(double x, double y){
        return x/y;
    }

    // 나머지 연산
    public double mod(double x, double y){
        return x%y;
    }

    // exp() 지수 연산
    public double expFunction(double x){

        return Math.exp(x);
    }

    // 상용로그 연산
    public double LogFunction(double x){
        return Math.log10(x);
    }

    //root 연산
    public double RootFunction(double x){
        return Math.sqrt(x);
    }

    //sin함수
    public double sinFunction(double x) {
        return Math.sin(x*(Math.PI/180));
    }

    //cos함수
    public double cosFunction(double x) {
        return Math.cos(x*(Math.PI/180));
    }

    //sin함수
    public double tanFunction(double x) {
        return Math.tan(x*(Math.PI/180));
    }

    // 거듭제곱 연산
    public double inFunction(double x, double y) {
        return Math.pow(x,y);
    }

    // 팩토리얼 연산
    public double factFunction(double x) {

        if (x <= 1) {
            return 1;
        } else {
            return factFunction(x - 1)*x;
        }
    }

}
