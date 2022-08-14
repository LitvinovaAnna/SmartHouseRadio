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
    public void boundaryValuePrev10() {
        Radio radio = new Radio();
        radio.setNumberOfCurrentRadiostation(10);

        radio.prev();

        assertEquals(9, radio.getNumberOfCurrentRadiostation());

    }

    @Test
    public void boundaryValuePrev1() {
        Radio radio = new Radio();
        radio.setNumberOfCurrentRadiostation(1);

        radio.prev();

        assertEquals(0, radio.getNumberOfCurrentRadiostation());

    }

    @Test
    public void volumeIncrease9() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    public void volumeMaxIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());

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
        radio.setCurrentVolume(54);

        radio.decreaseVolume();

        assertEquals(53, radio.getCurrentVolume());
    }

    @Test
    public void currentVolume10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.setCurrentVolume(101);

        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void currentVolumeAbove10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        assertEquals(0, radio.getCurrentVolume());


    }

    @Test
    public void currentVolumeLower0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-6);

        assertEquals(0, radio.getCurrentVolume());


    }

    @Test
    public void currentRadiostation10() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadiostation(10);

        assertEquals(0, radio.getNumberOfCurrentRadiostation());


    }

    @Test
    public void currentRadiostationMinus0() {
        Radio radio = new Radio();

        radio.setNumberOfCurrentRadiostation(-5);

        assertEquals(0, radio.getNumberOfCurrentRadiostation());


    }

    @Test
    public void testConstruct1() {
        Radio radio = new Radio(20);

        radio.setNumberOfCurrentRadiostation(19);

        assertEquals(19, radio.getNumberOfCurrentRadiostation());
    }

    @Test
    public void testConstruct2() {
        Radio radio = new Radio(20);

        radio.setNumberOfCurrentRadiostation(20);

        assertEquals(0, radio.getNumberOfCurrentRadiostation());
    }

    @Test
    public void testConstruct3() {
        Radio radio = new Radio(20);

        radio.setNumberOfCurrentRadiostation(21);

        assertEquals(0, radio.getNumberOfCurrentRadiostation());
    }


}