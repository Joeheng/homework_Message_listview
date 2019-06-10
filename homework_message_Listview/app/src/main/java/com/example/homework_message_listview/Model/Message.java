package com.example.homework_message_listview.Model;

public class Message {
    private String name,textmessage,time;
    private int image;

    public Message(String name, String textmessage, String time, int image) {
        this.name = name;
        this.textmessage = textmessage;
        this.time = time;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTextmessage() {
        return textmessage;
    }

    public void setTextmessage(String textmessage) {
        this.textmessage = textmessage;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
