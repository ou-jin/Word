package com.example.word.entity;

public class Word {
    private String account;

    private int week;

    private String word;

    private String score;

    public Word(String account, int week, String word, String score) {
        this.account = account;
        this.week = week;
        this.word = word;
        this.score = score;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
