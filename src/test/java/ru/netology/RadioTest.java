package ru.netology;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void testNext() {
        Radio radio = new Radio();
        radio.setCurrentWave(radio.getMaxWave());

        radio.next();

        int actual = radio.getCurrentWave();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testNextMid() {
        Radio radio = new Radio();
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
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume());

        radio.volumeUp();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void testVolumeUpMid() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);

        radio.volumeUp();

        int actual = radio.getCurrentVolume();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void testVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.volumeDown();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testVolumeDownMid() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.volumeDown();

        int actual = radio.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolume() {
        int a = 0;
        Radio radio = new Radio();
        radio.setCurrentVolume(a);
        int volume = radio.getCurrentVolume();

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
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        radio.volumeUp();
    }

    @Test
    public void testSetMaxWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(10);
    }
}
