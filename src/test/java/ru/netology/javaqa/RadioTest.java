package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadio() { //выбор станции в ручную
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.setCurrentRadio(10);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioLess() { //граничные значения
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.setCurrentRadio(-1);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextRadio2() { //переключение на следующую станцию граничные значения
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.setCurrentRadio(2);

        int expected = 3;
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadio() { //переключение на следующую станцию граничные значения
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.setCurrentRadio(9);

        int expected = 0;
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadio() { //переключение на предыдущую станцию граничные значения
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.setCurrentRadio(0);

        int expected = 9;
        int actual = radio.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadio4() { //переключение на предыдущую станцию эквивалентные значения
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.setCurrentRadio(4);

        int expected = 3;
        int actual = radio.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioAboveMax() { //граничные значения
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.setCurrentRadio(15);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadio1() { //переключение на текущую станцию
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.setCurrentRadio(9);

        radio.increaseRadio1();

        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadio() { //максимальное значение

        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.getCurrentRadio();

        int expected = 9;
        int actual = radio.getMaxRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadioAboveLimit() { //максимальное значение

        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.setMaxRadio();

        int expected = 9;
        int actual = radio.getMaxRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadio() { //минимальное значение
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.getCurrentRadio();

        int expected = 0;
        int actual = radio.getMinRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadioBeforeLimit() { //минимальное значение
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.setMinRadio();

        int expected = 0;
        int actual = radio.getMinRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() { //выставление громкости
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.setCurrentVolume(109);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeLess() { //граничные значения громкости
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.setCurrentVolume(-2);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeByOne() { //увеличение громкости на 1, эквивалентные значения
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.setCurrentVolume(99);

        int expected = 100;
        int actual = radio.increaseTheVolumeByOne(99);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolumeByOneMax() { //увеличение громкости на 1, эквивалентные значения
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.increaseTheVolumeByOne(100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeByOneMax102() { //увеличение громкости на 1, граничные значения
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио
        radio.setCurrentVolume(102);
        int expected = 100;
        int actual = radio.increaseTheVolumeByOne(102);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolumeByOne() { //уменьшение громкости, эквивалентные значения
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.setCurrentVolume(4);

        int expected = 3;
        int actual = radio.decreaseTheVolumeByOne();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeByOne0() { //уменьшение громкости, граничные значения
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.decreaseTheVolumeByOne();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioAboveMaxVolume() { //выставление громкости выше максимальной, граничные значения
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.setMaxVolume();

        int expected = 100;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() { //максимальная громкость, граничные значения
        Radio radio = new Radio(); //объект радио

        radio.getCurrentVolume();

        int expected = 100;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolumeAboveLimit() { //максимальная громкость, граничные значения
        Radio radio = new Radio(); //объект радио

        radio.setMinVolume();

        int expected = 100;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() { //минимальная громкость, граничные значения
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.getCurrentVolume();

        int expected = 0;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolumeBeforeLimit() { //минимальная громкость, граничные значения
        Radio radio = new Radio(0, 9, 0, 0, 100, 0); //объект радио

        radio.setCurrentRadio(-1);

        int expected = 0;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

}



