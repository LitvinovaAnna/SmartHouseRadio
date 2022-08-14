package ru.netology.SmartHouse.Radio.java;

public class Radio {
    protected int numberOfCurrentRadiostation; // номер текущей радиостанции

    protected int currentVolume; //громкость звука

    protected int maxStation = 9;

    protected int maxVolume = 100; //максимальная громкость

    protected int minVolume = 0; //минимальная громкость

    protected int minRadiostation = 0; //минимальная радиостанция

    public Radio() {

    }

    public Radio(int stationCounts) {

        maxStation = stationCounts - 1;

    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public void next() {
        if (numberOfCurrentRadiostation < maxStation) {
            numberOfCurrentRadiostation++;

        } else {
            numberOfCurrentRadiostation = minRadiostation;
        }
    }

    public void prev() {
        if (numberOfCurrentRadiostation > minRadiostation) {
            numberOfCurrentRadiostation--;
        } else {
            numberOfCurrentRadiostation = maxStation;
        }
    }

    public int getNumberOfCurrentRadiostation() {
        return numberOfCurrentRadiostation;
    }


    public void setNumberOfCurrentRadiostation(int numberOfCurrentRadiostation) {
        if (numberOfCurrentRadiostation < minRadiostation) {
            return;
        }
        if (numberOfCurrentRadiostation > maxStation) {
            return;
        }
        this.numberOfCurrentRadiostation = numberOfCurrentRadiostation;
    }


    public int getCurrentVolume() {

        return currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


}