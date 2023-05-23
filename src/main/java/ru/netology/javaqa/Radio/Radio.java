package ru.netology.javaqa.Radio;

public class Radio {
    private int maxRadio = 9;
    private int minRadio = 0;
    private int currentRadio = minRadio; //текущая радиостанция
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio(int minRadio, int maxRadio, int minVolume, int maxVolume) {
        this.minRadio = minRadio;
        this.maxRadio = maxRadio;
        this.currentRadio = minRadio;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = minVolume;
    }

    public int getCurrentVolume() {//получить данные
        return currentVolume;
    }

    public int getCurrentRadio() {//получить данные
        return currentRadio;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < minRadio) {
            return;
        }
        if (newCurrentRadio > maxRadio) {
            return;
        }
        currentRadio = newCurrentRadio;
    }

    public int next() {
        if (currentRadio < maxRadio) {
            currentRadio = currentRadio + 1;
        }
        if (currentRadio == maxRadio) {
            currentRadio = minRadio;
        }
        return currentRadio;
    }

    public int prev() {
        if (currentRadio > minRadio) {
            currentRadio = currentRadio - 1;
        }
        if (currentRadio == minRadio) {
            currentRadio = maxRadio;
        }
        return currentRadio;
    }

    public void increaseRadio1() {
        int target = currentRadio + 1;
        setCurrentRadio(target);
    }

    public void setToMaxRadio() {    //меняется внутреннее состояние, функция
        currentRadio = maxRadio;
    }

    public void setToMinRadio() {
        currentRadio = minRadio;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int increaseTheVolumeByOne() {
        if (currentVolume <= maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int decreaseTheVolumeByOne() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == minVolume) {
            currentVolume = minVolume;
        }
        return currentVolume;
    }

    public int setToMaxVolume() {    //меняется внутреннее состояние, функция
        return currentVolume = maxVolume;
    }

    public void setToMinVolume() {
        currentVolume = minVolume;
    }

}
