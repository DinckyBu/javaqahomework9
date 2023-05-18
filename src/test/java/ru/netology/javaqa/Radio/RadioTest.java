package ru.netology.javaqa.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RadioTest {

    @Test
    public void shouldSetRadio() {
        Radio radio = new Radio(); //объект радио

        radio.setCurrentRadio(10);
        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioLess() {
        Radio radio = new Radio(); //объект радио

        radio.setCurrentRadio(-1);
        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldNextRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(9);

        int expected = 0;
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(4);

        int expected = 3;
        int actual = radio.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadio(15);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadio1() {
        Radio radio = new Radio();
        radio.setCurrentRadio(9);

        radio.increaseRadio1();

        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadio() {
        Radio radio = new Radio();

        radio.setToMaxRadio();

        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadio() {
        Radio radio = new Radio();

        radio.setToMinRadio();

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio(); //объект радио

        radio.setCurrentVolume(109);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeLess() {
        Radio radio = new Radio(); //объект радио

        radio.setCurrentVolume(-2);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeByOne() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 100;
        int actual = radio.increaseTheVolumeByOne();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeByOne() {
        Radio radio = new Radio();

        radio.setCurrentVolume(4);

        int expected = 3;
        int actual = radio.decreaseTheVolumeByOne();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioAboveMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(105);

        int expected = 100;
        int actual = radio.setToMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();

        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio radio = new Radio();

        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


