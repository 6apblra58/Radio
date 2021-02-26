package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private String name;
    private int lastRadioStation = 10;
    private int initialRadioStation = 0;
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume;


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
