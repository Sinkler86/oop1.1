package ru.netology;

public class Radio {
    private int minWave = 0;
    private int currentWave = 0;
    private int maxWave = 9;
    private int minVolume = 0;
    private int currentVolume = 30;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int currentWave, int maxWave) {
        this.maxWave = maxWave;
        this.currentWave = currentWave;
    }

    public Radio(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public Radio(int currentWave, int maxWave, int minVolume, int currentVolume, int maxVolume) {
        this.currentWave = currentWave;
        this.maxWave = maxWave;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
    }

    public int getMinWave() {
        return minWave;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public int getMaxWave() {
        return maxWave;
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
        if (currentWave > getMaxWave()) {
            currentWave = getMaxWave();//попытка исправить покрытие... не ясно почему этот код не работает.
        }
        this.currentWave = currentWave;
    }

    public void next() {
        if (currentWave < getMaxWave()) {
            currentWave = currentWave + 1;
        } else {
            currentWave = minWave;
        }
    }

    public void prev() {
        if (currentWave > getMinWave()) {
            currentWave = currentWave - 1;
        } else {
            currentWave = getMaxWave();
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


