package ru.netology.domain;

public class Radio {
    private String name;
    private int lastRadioStation = 10;
    private int initialRadioStation = 0;
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume;

    //NoArgsConstructor
    public Radio() {
    }
    //AllArgsConstructor


    public Radio(String name, int lastRadioStation, int initialRadioStation, int currentRadioStation, int maxVolume, int minVolume, int volume) {
        this.name = name;
        this.lastRadioStation = lastRadioStation;
        this.initialRadioStation = initialRadioStation;
        this.currentRadioStation = currentRadioStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.volume = volume;
    }

    public int getLastRadioStation() {
        return lastRadioStation;
    }

    public void setLastRadioStation(int lastRadioStation) {
        this.lastRadioStation = lastRadioStation;
    }

    public int getInitialRadioStation() {
        return initialRadioStation;
    }

    public void setInitialRadioStation(int initialRadioStation) {
        this.initialRadioStation = initialRadioStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

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
        this.currentRadioStation = currentRadioStation;
    }

    public void changeRadioStation() {
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
        if (currentRadioStation >= lastRadioStation) {
            currentRadioStation = initialRadioStation;
            return;
        }
        currentRadioStation ++;
    }

    public void prevRadioStation() {
        if (currentRadioStation <= initialRadioStation) {
            currentRadioStation = lastRadioStation;
            return;
        }
        currentRadioStation --;
    }

    public int getVolume() {
        return volume;
    }


    public void setVolume(int volume) {
        if (volume >= maxVolume) {
            this.volume = maxVolume;
        }
        if (volume <= minVolume) {
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
