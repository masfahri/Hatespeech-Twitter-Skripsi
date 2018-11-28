/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sayamasfahri
 */
public class dummyTweet {
    
    private static String UserId;
    private static String Tweet;
    private static String TanggalTweet;
    private static String Location;

    public static String getUserId() {
        return UserId;
    }

    public static void setUserId(String UserId) {
        dummyTweet.UserId = UserId;
    }

    public static String getTweet() {
        return Tweet;
    }

    public static void setTweet(String Tweet) {
        dummyTweet.Tweet = Tweet;
    }

    public static String getTanggalTweet() {
        return TanggalTweet;
    }

    public static void setTanggalTweet(String TanggalTweet) {
        dummyTweet.TanggalTweet = TanggalTweet;
    }

    public static String getLocation() {
        return Location;
    }

    public static void setLocation(String Location) {
        dummyTweet.Location = Location;
    }
    
}
