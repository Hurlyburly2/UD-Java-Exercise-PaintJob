package com.dsimon;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;

        double bucketsNeeded = area / areaPerBucket;
        int roundedBucketsNeeded = (int) Math.ceil(bucketsNeeded);
        roundedBucketsNeeded -= extraBuckets;
        return roundedBucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int bucketsNeeded = getBucketCount(width, height, areaPerBucket, 0);
        return bucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        double width = area / 2;
        int bucketsNeeded = getBucketCount(width, 2, areaPerBucket, 0);
        return bucketsNeeded;
    }
}
