package com.algo.arraysExample;

public class Array {
    private int [] num;
    private int count;

    public Array(int len){
        num = new int[len];
    }
    public void insert(int item){
        if(num.length==count){
            int[] newArr = new int[count*2];
            for(int i=0;i<count;i++){
                newArr[i]=num[i];
            }
            num = newArr;
        }
        num[count++]=item;
    }
    public void removeAt(int index){
        //validate the index
        if(index <0 || index >=count){
            System.out.println("Invalid Index entered");
        }
        else{
            System.out.println("count is " + count + "start of remove operation");
            for(int i=index;i<count;i++){
                num[i]=num[i+1];
            }
            count--;
        }
    }
    public int indexOf(int item){
        for(int i=0;i<count;i++){
            if(num[i]==item){
                return i;
            }
        }
        return -1;
    }
    public void print(){
        for(int i =0;i<count;i++){
            System.out.println(num[i]);
        }
    }
}
