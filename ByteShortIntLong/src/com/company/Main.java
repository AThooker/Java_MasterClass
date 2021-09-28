package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10_000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Int Min = " + myMinIntValue);
        System.out.println("Int Max =  " + myMaxValue);

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Byte Min = " + minByte);
        System.out.println("Byte Max =  " + maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Short Min = " + minShort);
        System.out.println("Short Max =  " + maxShort);


        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Long Min = " + minLong);
        System.out.println("Long Max =  " + maxLong);

        //Casting
        byte myCastedByte = (byte)(myMinIntValue / 2);
        short myCastedShort = (short)(myMinIntValue / 2);

        //Challenge
        byte challengeByte = 120;
        short challengeShort = 1280;
        int challengeInt = 12800;
        long challengeLong = 5_000 + 10 * (challengeInt + challengeByte + challengeShort);
        System.out.println(challengeByte);
        System.out.println(challengeShort);
        System.out.println(challengeInt);
        System.out.println(challengeLong);
    }
}
