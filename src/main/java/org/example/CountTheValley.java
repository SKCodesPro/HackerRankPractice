package org.example;

public class CountTheValley {
    public static void main(String[] args) {
//        String hikes = "UDUUUDUDDD";
        String hikes = "UDDDUDUU";
        int noOfValley = countTheValley(hikes);
        System.out.println("No of Valley " + noOfValley);
    }

    private static int countTheValley(String path) {
        int valleyCounter = -0;
        int seaLevel = 0;
        boolean isDownhill = false;
        for (int i = 0; i < path.length(); i++) {
            // if the hiker is at  sea level,
            // He has to go downhill and that's when he enters a valley
            if (seaLevel == 0 && path.charAt(i) == 'D') {
                isDownhill = true;
            }
            // Caluculate steps from sea level
            if (path.charAt(i) == 'U') {
                seaLevel += 1;
            } else if (path.charAt(i) == 'D') {
                seaLevel -= 1;
            }
            // If the hiker has reached Sea Level
            // And he was downhill that means he's  coming out of a valley
            if (isDownhill && seaLevel == 0) {
                // this is very important
                // if the hike is at sea level reset the downhill to false
                // this ensures our logic is reset for every iteration of uphill/downhill
                // starting froms sea level
                isDownhill = false;
                valleyCounter += 1;
            }
        }
        return valleyCounter;
    }
}
