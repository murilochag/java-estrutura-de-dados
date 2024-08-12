package com.projeto.node;

public class Main {

    public static void main(String[] args) {

        No<String> n1 = new No<>("murilo");
        No<String> n2 = new No<>("paula");

        n1.setProximo(n2);

        No<String> n3 = new No<>("luid");
        n2.setProximo(n3);

        No<String> n4 = new No<>("ana");
        n3.setProximo(n4);

        System.out.println(n1);
        System.out.println(n1.getProximo());
        System.out.println(n1.getProximo().getProximo());
        System.out.println(n1.getProximo().getProximo().getProximo());
        System.out.println(n1.getProximo().getProximo().getProximo().getProximo());

    }

}
