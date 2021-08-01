package com.learncoding;

public class Main {

    public static void main(String[] args) {

        System.out.println(getBucketCount(0.0,2.1,1.5,7 ));
        System.out.println( getBucketCount(7.25,4.3,2.35));
        System.out.println(getBucketCount(3.26,0.75));
    }


// how many bucket do you need if you have some in extra!
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double bucketArea = areaPerBucket * extraBuckets;
        double wall = width * height;
        double difference1 = wall - bucketArea;

       //System.out.println(wall);
        double extraBucket = Math.ceil(difference1 / areaPerBucket);
        //System.out.println(extraBucket);
        return (int) extraBucket;
    }

    // how many bucket do you need if you do not have extra!
    public static int getBucketCount (double width, double height, double areaPerBucket){
            double wall = width * height;
            double buckets;

        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        buckets = Math.ceil(wall / areaPerBucket);
        //System.out.println(wall);
        //System.out.println(areaPerBucket);
            return (int) buckets;
    }

//some cass you do not no the with and the height just the area of the wall !
    public static int getBucketCount (double area, double areaPerBucket){

        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double buckets = Math.ceil(area / areaPerBucket) ;
        return (int) buckets;
    }
}
