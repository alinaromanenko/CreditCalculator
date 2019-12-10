package ru.nsu.flowerstore;

public class Data {

    int minSum;
    int maxSum;
    int minTime;
    int maxTime;
    double rate;

    public Data(int minSum, int maxSum, int minTime, int maxTime, double rate){
        this.minSum = minSum;
        this.maxSum = maxSum;
        this.minTime = minTime;
        this.maxTime = maxTime;
        this.rate = rate;
    }

    public String toSql(){
       return "('"+minSum+"', "+
                "'"+maxSum+"', "+
                "'"+minTime+"', "+
                "'"+maxTime+"')";
    }

    public int getMinSum() {
        return minSum;
    }

    public int getMaxSum() {
        return maxSum;
    }

    public int getMinTime() {
        return minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public double getRate() {
        return rate;
    }
}
