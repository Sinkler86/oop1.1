package ru.netology;

public class Radio {

    private int minWave = 0;
    private int currentWave = 0;
    private int numOfWave = 9;
    private int minVolume = 0;
    private int currentVolume = 30;
    private int maxVolume = 100;
    private int newNumOfWave;


    public Radio() {
    }

    public Radio(int newNumOfWave) {
        if (newNumOfWave != 9) {
            numOfWave = newNumOfWave - 1;
        } else {
            int numOfWave = this.numOfWave;
        }
    }

    public int getMinWave() {
        return minWave;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public int getNumWave() {
        return numOfWave;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentWave(int currentWave) {
        if (currentWave < getMinWave()) {
            return;
        }
        if (currentWave > getNumWave()) {
            return;
        }
        this.currentWave = currentWave;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < getMinVolume()) {
            return;
        }
        if (currentVolume > getMaxVolume()) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentWave < getNumWave()) {
            currentWave = currentWave + 1;
        } else {
            currentWave = minWave;
        }
    }

    public void prev() {
        if (currentWave > getMinWave()) {
            currentWave = currentWave - 1;
        } else {
            currentWave = getNumWave();
        }
    }

    public void volumeUp() {
        if (currentVolume < getMaxVolume()) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = getMaxVolume();
        }
    }

    public void volumeDown() {
        if (currentVolume > getMinVolume()) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = getMinVolume();
        }
    }
}


