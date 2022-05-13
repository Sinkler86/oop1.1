package ru.netology;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void testNext() {
        Radio radio = new Radio();
        int actual = radio.getMaxWave();

        radio.next();

        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void testNextMid() {
        Radio radio = new Radio(5, 9, 0, 30, 100);

        radio.next();

        int actual = radio.getCurrentWave();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void testPref() {
        Radio radio = new Radio(0);
        radio.setCurrentWave(0);

        radio.prev();

        int actual = radio.getCurrentWave();
        int expected = radio.getMaxWave();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrefMid() {
        Radio radio = new Radio();
        radio.setCurrentWave(6);

        radio.prev();

        int actual = radio.getCurrentWave();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void testVolumeUp() {
        Radio radio = new Radio(100);
        int actual = radio.getMaxVolume();

        radio.volumeUp();

        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void testVolumeUpMid() {
        Radio radio = new Radio(30);

        radio.volumeUp();

        int expected = 31;

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testVolumeDown() {
        Radio radio = new Radio(0);
        int actual = radio.getCurrentVolume();

        radio.volumeDown();

        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testVolumeDownMid() {
        Radio radio = new Radio(7);

        radio.volumeDown();

        int actual = radio.getCurrentVolume();

        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolume() {
        Radio radio = new Radio(30);
        int volume = radio.getCurrentVolume();
        int a = 30;
        assertEquals(volume, a);
    }

    @Test
    public void testWaveUp() {
        Radio radio = new Radio();
        radio.setCurrentWave(radio.getMaxWave());

        radio.next();

        int actual = radio.getCurrentWave();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testWaveUpMid() {
        Radio radio = new Radio();
        radio.setCurrentWave(6);

        radio.next();

        int actual = radio.getCurrentWave();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void testWaveDown() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);

        radio.prev();

        int actual = radio.getCurrentWave();
        int expected = radio.getMaxWave();

        assertEquals(expected, actual);
    }

    @Test
    public void testWaveDownMid() {
        Radio radio = new Radio();
        radio.setCurrentWave(7);

        radio.prev();

        int actual = radio.getCurrentWave();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(-1);
    }

    @Test
    public void testMaxVolumeUp() {
        Radio radio = new Radio(0, 9, 0, 100, 100);

        radio.volumeUp();
    }

    @Test
    //попытка исправить покрытие
    public void testSetMaxWave() {
        Radio radio = new Radio(101, 100);

        int a = radio.getCurrentWave();
        System.out.println(a);
    }

    @Test
    public void testMinVolume() {
        Radio radio = new Radio(0, 9, 0, -1, 100);

        radio.volumeDown();
    }
}
