package ru.netology.SmartHouse.Radio.java;

public class Radio {

    protected int numberOfCurrentRadiostation; // номер текущей радиостанции

    protected int currentVolume; //громкость звука

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void next() {
        if (numberOfCurrentRadiostation < 9) {
            numberOfCurrentRadiostation++;

        } else {
            numberOfCurrentRadiostation = 0;
        }
    }

    public void prev() {
        if (numberOfCurrentRadiostation > 0) {
            numberOfCurrentRadiostation--;
        } else {
            numberOfCurrentRadiostation = 9;
        }
    }

    public int getNumberOfCurrentRadiostation() {
        return numberOfCurrentRadiostation;
    }


    public void setNumberOfCurrentRadiostation(int numberOfCurrentRadiostation) {
        if (numberOfCurrentRadiostation < 0) {
            return;
        }
        if (numberOfCurrentRadiostation > 9) {
            return;
        }
        this.numberOfCurrentRadiostation = numberOfCurrentRadiostation;
    }


    public int getCurrentVolume() {

        return currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }


}
