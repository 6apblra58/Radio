package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void verifyRadioFields() {
        Radio radio = new Radio("Philips",10,0,5,100,0,50);
        assertEquals(5, radio.getCurrentRadioStation());
        assertEquals(10,radio.getLastRadioStation());
        assertEquals(0,radio.getInitialRadioStation());
        assertEquals(50,radio.getVolume());
        assertEquals(100,radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());


    }

    @Test
    public void OverLastRadioStation() {
        Radio station = new Radio("Philips",10,0,10,100,0,50);
        station.changeRadioStation();
        station.nextRadioStation();
        assertEquals(0, station.getCurrentRadioStation());

    }
    @Test
    public void ChangeOverLastRadioStation() {
        Radio station = new Radio("Philips",10,0,11,100,0,50);
        station.changeRadioStation();
        assertEquals(0, station.getCurrentRadioStation());

    }

    @Test
    public void UnderInitialRadioStation() {
        Radio station = new Radio("Philips",10,0,0,100,0,50);
        station.prevRadioStation();
        assertEquals(10, station.getCurrentRadioStation());

    }
    @Test
    public void ChangeUnderInitialRadioStation() {
        Radio station = new Radio("Philips",10,0,-1,100,0,50);
        station.changeRadioStation();
        assertEquals(10, station.getCurrentRadioStation());

    }

    @Test
    public void nextRadioStation() {
        Radio station = new Radio("Philips",10,0,6,100,0,50);
        station.changeRadioStation();
        station.nextRadioStation();
        assertEquals(7, station.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        Radio station = new Radio("Philips",10,0,6,100,0,50);
        station.changeRadioStation();
        station.prevRadioStation();
        assertEquals(5, station.getCurrentRadioStation());
    }

    @Test
    public void volumeUpOverMax() {
        Radio volume = new Radio("Philips",10,0,6,100,0,100);
        volume.volumeUp();
        assertEquals(100, volume.getVolume());
    }
    @Test
    public void volumeOverMax() {
        Radio volume = new Radio();
        volume.setVolume(110);
        volume.volumeUp();
        assertEquals(100, volume.getVolume());
    }


    @Test
    public void volumeDownUnderMin() {
        Radio volume = new Radio();
        volume.setVolume(-1);
        volume.volumeDown();
        assertEquals(0, volume.getVolume());
    }
    @Test
    public void volumeZero() {
        Radio volume = new Radio();
        volume.setVolume(0);
        volume.volumeDown();
        assertEquals(0, volume.getVolume());
    }

    @Test
    public void volumeDown() {
        Radio volume = new Radio();
        volume.setVolume(7);
        volume.volumeDown();
        assertEquals(6, volume.getVolume());
    }

    @Test
    public void volumeUp() {
        Radio volume = new Radio();
        volume.setVolume(7);
        volume.volumeUp();
        assertEquals(8, volume.getVolume());
    }
}