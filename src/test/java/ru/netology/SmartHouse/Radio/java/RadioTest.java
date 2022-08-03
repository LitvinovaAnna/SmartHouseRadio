package ru.netology.SmartHouse.Radio.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void boundaryValueNext8() {
        Radio radio = new Radio();
        radio.setNumberOfCurrentRadiostation(8);

        radio.next();

        assertEquals(9, radio.getNumberOfCurrentRadiostation());

    }

    @Test
    public void boundaryValueNext9() {
        Radio radio = new Radio();
        radio.setNumberOfCurrentRadiostation(9);

        radio.next();

        assertEquals(0, radio.getNumberOfCurrentRadiostation());

    }


    @Test
    public void boundaryValuePrev0() {
        Radio radio = new Radio();
        radio.setNumberOfCurrentRadiostation(0);

        radio.prev();

        assertEquals(9, radio.getNumberOfCurrentRadiostation());

    }

    @Test
    public void boundaryValuePrev8() {
        Radio radio = new Radio();
        radio.setNumberOfCurrentRadiostation(8);

        radio.prev();

        assertEquals(7, radio.getNumberOfCurrentRadiostation());

    }

    @Test
    public void volumeIncrease9() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.increaseVolume();

        assertEquals(10, radio.getCurrentVolume());

    }

    @Test
    public void volumeMaxIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        assertEquals(10, radio.getCurrentVolume());

    }

    @Test
    public void volumeMinimumDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void volumeDecrease4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);

        radio.decreaseVolume();

        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    public void currentVolume10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        radio.setCurrentVolume(11);

        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void currentVolumeAbove10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        assertEquals(0,radio.getCurrentVolume());


    }

    @Test
    public void currentVolumeLower0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-6);

        assertEquals(0,radio.getCurrentVolume());


    }

    @Test
    public void currentRadiostation10() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadiostation(10);

        assertEquals(0,radio.getNumberOfCurrentRadiostation());


    }

    @Test
    public void currentRadiostationMinus0() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadiostation(-5);

        assertEquals(0,radio.getNumberOfCurrentRadiostation());


    }




}