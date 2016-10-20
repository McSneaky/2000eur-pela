package com.company;

import jdk.nashorn.internal.objects.NativeJSON;

import java.io.*;
import java.util.LinkedList;

/**
 * Margus Kevin Sünter
 * Ville Maripuu
 * Raigo
 * Jüri
 * Maria
 * Rainer
 */
public class Main {
    private static int mapSize = 10;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputBuffer;
        System.out.println("Oled pimedas tunnelis, mis teha?");
        System.out.println("1) Sured ära 2) Ei sure");
        try
        {
            inputBuffer = br.readLine();
            if (inputBuffer.equals("1")) {
                System.out.println("Said surma");
            } else {
                System.out.println("Ei saanud surma");
            }
        } catch (IOException error){
            System.out.println(error);
        }

        Room map[][] = new Room[mapSize/2][mapSize/2];
        Room map2[][] = new Room[mapSize/2][mapSize/2];
        for (int i = 0; i < mapSize/2; i++) {
            System.out.println("Sisesta ruumi x");
            map[i][i] = new Room();
        }
        try {
            FileOutputStream fos = new FileOutputStream("test.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(map);

            FileInputStream fis = new FileInputStream("test.dat");
            ObjectInputStream iis = new ObjectInputStream(fis);
            map2 = (Room[][]) iis.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
