package ru.netology;

public class Radio {

    private int currentWave;
    private int currentVolume;

    public int getCurrentWave() {
        return currentWave;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentWave(int сurrentWave) {
        if (сurrentWave < 0) {
            return;
        }
        if (сurrentWave > getMaxWave()) {
            return;
        }
        this.currentWave = сurrentWave;
    }

    public int getMaxWave() {
        return 9;
    }

    public void setCurrentVolume(int сurrentVolume) {
        if (сurrentVolume < 1) {
            return;
        }
        if (сurrentVolume > getMaxVolume()) {
            return;
        }
        this.currentVolume = сurrentVolume;
    }

    public int getMaxVolume() {
        return 10;
    }

    public void next() {
        if (currentWave < getMaxWave()) {
            currentWave = currentWave + 1;
        } else {currentWave = 0;}
    }

    public void prev() {
        if (currentWave > 0) {
            currentWave = currentWave - 1;
        } else {currentWave = getMaxWave();}
    }

    public void volumeUp() {
        if (currentVolume < getMaxVolume()) {
            currentVolume = currentVolume + 1;
        } else {currentVolume = getMaxVolume();}
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {currentVolume = 0;}
    }
}


