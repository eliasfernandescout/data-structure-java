package br.aula3;

public class CookieMain {
    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("blue");

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
    }
}
