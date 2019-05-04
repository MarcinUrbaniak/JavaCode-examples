package com.collections;

import java.util.*;

public class Comparison {

    private List<Integer> integerList;
    private List<Integer> maxIntegers = new ArrayList<>();
    private List<Integer> basicList;
    private int howManyParameters;

    public Comparison(List<Integer> integerList, List<Integer> basicList) {
        this.integerList = integerList;
        this.basicList = basicList;
    }



    public  String compareThreeMax(List<Integer> integerList, List<Integer> basicList ){


        for (int i = 0; i < 3 ; i++) {
            int k = Collections.max(this.integerList);
            maxIntegers.add(k);
            int j = this.integerList.indexOf(k);
            this.integerList.remove(j);

        }

        String message;

        if (maxIntegers.equals(this.basicList)){
            message = "Success";
        } else {
            message = "Error";
        }

       return message;
    }

    public List<Integer> returnMaxList(List<Integer> integerList,int howManyParameters){
        this.integerList = integerList;
        this.howManyParameters = howManyParameters;
        System.out.println("howManyParameters = " + howManyParameters);
        System.out.println("this.integerList.size() = " + this.integerList.size());

        if(this.integerList.size() < this.howManyParameters){
            this.howManyParameters = this.integerList.size();
        }

        Collections.sort(integerList);
        Collections.reverse(integerList);
        maxIntegers =  integerList.subList(0, this.howManyParameters);
        return maxIntegers;
    }

    public void checkList(List<Integer> integerList, List<Integer> basicList){
        this.integerList = integerList;
        this.basicList = basicList;
        if (this.integerList.equals(this.basicList)){
            System.out.println("Success");
        }
        System.out.println("Error. Wartośc oczekiwana" + basicList);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comparison that = (Comparison) o;
        return howManyParameters == that.howManyParameters &&
                Objects.equals(integerList, that.integerList) &&
                Objects.equals(maxIntegers, that.maxIntegers) &&
                Objects.equals(basicList, that.basicList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integerList, maxIntegers, basicList, howManyParameters);
    }
}
