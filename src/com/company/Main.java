package com.company;

public class Main {

    public static void main(String[] args) {
	int w = 10;
        int a = w / 2;
        int b = w / 5;
	if (w <= 2)
        System.out.println(3 + " euros for posting");
	if (2 < w && w <= 5)
        System.out.println(2*a + " euros for posting");
	if (w > 5)
        System.out.println(3*b + " euros for posting");

    }
}
