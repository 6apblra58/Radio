package ru.netology.domain;

public class Radio {
    private String name;
    private int lastRadioStation = 9;
    private int initialRadioStation = 0;
    private int currentRadioStation;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int volume;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > lastRadioStation) {
            this.currentRadioStation = initialRadioStation;
            return;
        }
        if (currentRadioStation < initialRadioStation) {
            this.currentRadioStation = lastRadioStation;
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation == lastRadioStation) {
            currentRadioStation = initialRadioStation;
            return;
        }
        currentRadioStation ++;
    }

    public void prevRadioStation() {
        if (currentRadioStation == initialRadioStation) {
            currentRadioStation = lastRadioStation;
            return;
        }
        currentRadioStation --;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > maxVolume) {
            this.volume = maxVolume;
        }
        if (volume < minVolume) {
            this.volume = minVolume;
            return;
        }
        this.volume = volume;

    }

    public void volumeUp() {
        if (volume >= maxVolume) {
            volume = maxVolume;
            return;
        }
        volume ++;
    }

    public void volumeDown() {
        if (volume <= minVolume) {
            volume = minVolume;
            return;
        }
        volume --;
    }
}

