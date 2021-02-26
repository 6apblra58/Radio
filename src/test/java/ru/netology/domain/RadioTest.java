package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void validateChangeFields() {
        Radio station = new Radio("Philips", 10,0,5,100,0,20);
        assertEquals("Philips", station.getName());
        assertEquals(10, station.getLastRadioStation());
        assertEquals(0, station.getInitialRadioStation());
        assertEquals(5, station.getCurrentRadioStation());
        assertEquals(100, station.getMaxVolume());
        assertEquals(0,station.getMinVolume());
        assertEquals(20,station.getVolume());




    }

    @Test
    public void changeOverLastRadioStation() {
        Radio station = new Radio("Philips", 10,0,10,100,0,20);
        station.nextRadioStation();
        assertEquals(0, station.getCurrentRadioStation());

    }
    @Test
    public void OverLastRadioStation() {
        Radio station = new Radio("Philips", 10,0,11,100,0,20);
        station.nextRadioStation();
        assertEquals(0, station.getCurrentRadioStation());

    }

    @Test
    public void changeUnderInitialRadioStation() {
        Radio station = new Radio("Philips", 10,0,11,100,0,20);
        station.prevRadioStation();
        assertEquals(10, station.getCurrentRadioStation());

    }
    @Test
    public void UnderInitialRadioStation() {
        Radio station = new Radio("Philips", 10,0,-1,100,0,20);
        station.prevRadioStation();
        assertEquals(10, station.getCurrentRadioStation());

    }

    @Test
    public void nextRadioStation() {
        Radio station = new Radio("Philips", 10,0,6,100,0,20);
        station.nextRadioStation();
        assertEquals(7, station.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        Radio station =new Radio("Philips", 10,0,6,100,0,20);
        station.prevRadioStation();
        assertEquals(5, station.getCurrentRadioStation());
    }

    @Test
    public void volumeUpOverMax() {
        Radio volume = new Radio("Philips", 10,0,11,100,0,100);
        volume.volumeUp();
        assertEquals(100, volume.getVolume());
    }
    @Test
    public void volumeOverMax() {
        Radio volume = new Radio("Philips", 10,0,11,100,0,101);
        volume.volumeUp();
        assertEquals(100, volume.getVolume());
    }


    @Test
    public void volumeDownUnderMin() {
        Radio volume = new Radio("Philips", 10,0,11,100,0,-1);
        volume.volumeDown();
        assertEquals(0, volume.getVolume());
    }
    @Test
    public void volumeZero() {
        Radio volume = new Radio("Philips", 10,0,11,100,0,0);
        volume.volumeDown();
        assertEquals(0, volume.getVolume());
    }

    @Test
    public void volumeDown() {
        Radio volume = new Radio("Philips", 10,0,11,100,0,7);
        volume.volumeDown();
        assertEquals(6, volume.getVolume());
    }

    @Test
    public void volumeUp() {
        Radio volume = new Radio("Philips", 10,0,11,100,0,97);
        volume.volumeUp();
        assertEquals(98, volume.getVolume());
    }
}