package ru.netology.javaqa;

public class Radio {
    private int minRadio = 0;
    private int maxRadio = 9;
    private int currentRadio = minRadio;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio() {

    }

    public Radio(int minRadio, int maxRadio, int currentRadio, int minVolume, int maxVolume, int currentVolume) {
        this.minRadio = minRadio;
        this.maxRadio = maxRadio;
        this.currentRadio = currentRadio;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
    }

    public int getMinRadio() {
        return minRadio;
    }

    public int getMaxRadio() {
        return maxRadio;
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setMinRadio() {
        this.minRadio = minRadio;
    }

    public void setMaxRadio() {
        this.maxRadio = maxRadio;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < 0) {
            return;
        }
        if (newCurrentRadio > 9) {
            return;
        }
        currentRadio = newCurrentRadio;
    }

    public void setMinVolume() {
        this.minVolume = minVolume;
    }

    public void setMaxVolume() {
        this.maxVolume = maxVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int next() {
        if (currentRadio < 9) {
            currentRadio = currentRadio + 1;
        }
        if (currentRadio == 9) {
            currentRadio = 0;
        }
        return currentRadio;
    }

    public int prev() {
        if (currentRadio > 0) {
            currentRadio = currentRadio - 1;
        }
        if (currentRadio == 0) {
            currentRadio = 9;
        }
        return currentRadio;
    }

    public void increaseRadio1() {
        int target = currentRadio + 1;
        setCurrentRadio(target);
    }

    public int increaseTheVolumeByOne(int newCurrentVolume) {
        if (newCurrentVolume < 100) {
            currentVolume = newCurrentVolume + 1;
        }
        if (newCurrentVolume > 100) {
            currentVolume = 100;
        }
        return currentVolume;
    }

    public int decreaseTheVolumeByOne() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = 0;
        }
        return currentVolume;
    }
}
