package com.maleshen;

import java.util.ArrayList;

public class str {
    protected ArrayList<Character> chars = new ArrayList<>();
    protected int l;

    public str(){}

    public str(String S){
        for (int i = 0; i < S.length(); i++) {
            chars.add(S.toCharArray()[i]);
        }
    }
    public str(char S){
        chars.add(S);
    }
    public int length(){
        return this.l=chars.size();
    }
    public void clear(){
        chars.clear();
    }
    public void print(){
        for (int i = 0; i < this.length(); i++) {
            System.out.print(this.chars.get(i));
        }
        System.out.println();
    }
}