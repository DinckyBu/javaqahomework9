package ru.netology.javaqa.Radio;

public class Radio {
    public int currentRadio; //текущая радиостанция

    public int getCurrentRadio() {//получить данные
        return currentRadio;
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

    public void setToMaxRadio() {    //меняется внутреннее состояние, функция
        currentRadio = 9;
    }

    public void setToMinRadio() {
        currentRadio = 0;
    }


    public int currentVolume; //текущая громкость

    public int getCurrentVolume() {//получить данные
        return currentVolume;
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

    public int increaseTheVolumeByOne() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 100) {
            currentVolume = 100;
        }
        return currentVolume;
    }

    public int decreaseTheVolumeByOne() {
        if (currentVolume >= 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = 0;
        }
        return currentVolume;
    }

    public int setToMaxVolume() {    //меняется внутреннее состояние, функция
        return currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

}

