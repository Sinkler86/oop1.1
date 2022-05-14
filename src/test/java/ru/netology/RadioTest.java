package ru.netology;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void testNext() {
        Radio radio = new Radio(10);
        int actual = radio.getNumWave();

        radio.next();

        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void testNextMid() {
        Radio radio = new Radio(9);
        radio.setCurrentWave(5);
        radio.next();

        int actual = radio.getCurrentWave();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void testPref() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);

        radio.prev();

        int actual = radio.getCurrentWave();
        int expected = radio.getNumWave();

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
        Radio radio = new Radio();
        radio.volumeUp();
        int actual = radio.getCurrentVolume();

        int expected = 31;

        assertEquals(expected, actual);
    }

    @Test
    public void testVolumeUpMid() {
        Radio radio = new Radio();

        radio.volumeUp();

        int expected = 31;

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testVolumeDown() {
        Radio radio = new Radio();
        radio.volumeDown();
        int actual = radio.getCurrentVolume();

        int expected = 29;

        assertEquals(expected, actual);
    }

    @Test
    public void testWaveUp() {
        Radio radio = new Radio();
        radio.setCurrentWave(radio.getNumWave());

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
        int expected = radio.getNumWave();

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
    public void testSetOverCurrentWave() {
        Radio radio = new Radio(5);
        radio.setCurrentWave(6);
    }

    @Test
    public void testMaxVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.volumeUp();
        int result = radio.getCurrentVolume();
        System.out.println(result);
    }

    @Test
    public void testSetMaxWave() {
        Radio radio = new Radio(5);
        radio.next();
        int a = radio.getCurrentWave();
        System.out.println(a);
    }

    @Test
    public void testMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeDown();
    }

    @Test
    public void testOverMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
    }

    @Test
    public void testOverMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
    }
}
