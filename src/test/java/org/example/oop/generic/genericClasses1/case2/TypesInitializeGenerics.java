package org.example.oop.generic.genericClasses1.case2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TypesInitializeGenerics {
    @Test
    public void type1(){
        List<String> list = new ArrayList<String>();
        list.add("Hello World");
        String data = list.get(0);
        System.out.println(data);
    }

    @Test
    public void type2(){
        List<String> list = new ArrayList<>();
        list.add("Hello World");
        //list.add(123);    //нельзя, проверяется во время компиляции
        String data = list.get(0);
        System.out.println(data);
    }

    @Test
    public void type3(){
        //плохой стиль
        List list = new ArrayList<>();  //List list of Objects
        list.add("Hello World");
        //String data = list.get(0);  //Error: java: incompatible types: java.lang.Object cannot be converted to java.lang.String
        list.add(123);
        //приходиться явно преобразовывать
        String data = (String) list.get(0);
        System.out.println(data);
    }

    @Test
    public void type4(){
        //раньше в до java 1.5 так все работало
        List list = new ArrayList();    //list of Objects
        list.add("Hello World");
        list.add(123);
        //приходиться явно преобразовывать
        String data = (String)list.get(0);
        int integer = (int)list.get(1);
        System.out.println(data);
    }

    @Test
    public void type5(){
        List<String> list = new ArrayList();
        //list.add(123);    //нельзя, проверяется во время компиляции
        list.add("Hello World");
        String data = (String)list.get(0);
        System.out.println(data);
    }

    public static void main(String[] args) {
        new TypesInitializeGenerics().type5();
    }

    @Test
    public void type6(){
        //Чтобы избежать предупреждений в логе о том, что "uses unchecked or unsafe operations" можно над используемым методом или классом указать особую аннотацию: @SuppressWarnings("unchecked")
        @SuppressWarnings("unchecked")
        List<String> list = new ArrayList();
        list.add("Hello World");
        String data = (String)list.get(0);
        System.out.println(data);
    }

    @Test
    public void type7(){
//        List<> list = new ArrayList();  //java: illegal start of type
//        list.add("Hello World");
//        String data = (String)list.get(0);
//        System.out.println(data);
    }

    @Test
    public void type8(){
//        List<> list = new ArrayList<String>();    //java: illegal start of type
//        list.add("Hello World");
//        String data = list.get(0);
//        System.out.println(data);
    }
}

