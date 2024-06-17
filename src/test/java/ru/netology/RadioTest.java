package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void shouldSetVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(16);

        int expected = 16;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetAboveMaxVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(110);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetBelowMinVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-10);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.increaseVolume();

        int expected = 11;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void shouldDecreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.decreaseVolume();

        int expected = 9;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void shouldNotDecreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);

        int expected = 5;
        int actual = rad.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetAboveStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(10);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetBelowStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetNextIfLastStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetNextStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(6);
        rad.nextStation();

        int expected = 7;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetPrevIfFirstStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetPrevStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(4);
        rad.prevStation();

        int expected = 3;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}
