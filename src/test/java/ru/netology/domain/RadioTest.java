package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void createRadio() {
        Radio radio = new Radio();
        String expected = "RadioPhilips";
        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }
    @Test
    public void changeCertainRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(5);
        station.changeRadioStation();
        assertEquals(5, station.getCurrentRadioStation());

    }

    @Test
    public void changeOverLastRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(10);
        station.changeRadioStation();
        assertEquals(0, station.getCurrentRadioStation());

    }
    @Test
    public void OverLastRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(11);
        station.nextRadioStation();
        station.changeRadioStation();
        assertEquals(0, station.getCurrentRadioStation());

    }

    @Test
    public void changeUnderInitialRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);
        station.changeRadioStation();
        station.prevRadioStation();
        assertEquals(9, station.getCurrentRadioStation());

    }
    @Test
    public void UnderInitialRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(-1);
        station.changeRadioStation();
        assertEquals(9, station.getCurrentRadioStation());

    }

    @Test
    public void nextRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(6);
        station.changeRadioStation();
        station.nextRadioStation();
        assertEquals(7, station.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(6);
        station.changeRadioStation();
        station.prevRadioStation();
        assertEquals(5, station.getCurrentRadioStation());
    }

    @Test
    public void volumeUpOverMax() {
        Radio volume = new Radio();
        volume.setVolume(10);
        volume.volumeUp();
        assertEquals(10, volume.getVolume());
    }
    @Test
    public void volumeOverMax() {
        Radio volume = new Radio();
        volume.setVolume(11);
        volume.volumeUp();
        assertEquals(10, volume.getVolume());
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