package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Radio {
    private String name;
    private int lastRadioStation = 10;
    private int initialRadioStation = 0;
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume;


    public int getLastRadioStation() {
        return lastRadioStation;
    }



    public int getInitialRadioStation() {
        return initialRadioStation;
    }



    public int getMaxVolume() {
        return maxVolume;
    }



    public int getMinVolume() {
        return minVolume;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
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
