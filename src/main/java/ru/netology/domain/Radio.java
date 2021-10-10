package ru.netology.domain;

public class Radio {

    public int currentVolume;

    public int getIncreaseVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume(int actualCurrentVolume) {
        if (actualCurrentVolume < 10 && actualCurrentVolume >= 0) {
            actualCurrentVolume = actualCurrentVolume + 1;
        } else {
            actualCurrentVolume = 10;
        }
        currentVolume = actualCurrentVolume;
    }

    public int getDecreaseVolume() {
        return currentVolume;
    }

    public void setDecreaseVolume(int actualCurrentVolume) {
        if (actualCurrentVolume > 0 && actualCurrentVolume <= 10) {
            actualCurrentVolume = actualCurrentVolume - 1;
        } else {
            actualCurrentVolume = 0;
        }
        currentVolume = actualCurrentVolume;
    }

    public int currentStation;

    public int getNextStation() {
        return currentStation;
    }

    public void setNextStation(int actualCurrentStation) {
        if (actualCurrentStation < 9 && actualCurrentStation >= 0) {
            actualCurrentStation = actualCurrentStation + 1;
        } else {
            actualCurrentStation = 0;
        }
        currentStation = actualCurrentStation;
    }

    public int getPreviousStation() {
        return currentStation;
    }

    public void setPreviousStation(int actualCurrentStation) {
        if (actualCurrentStation <= 9 && actualCurrentStation > 0) {
            actualCurrentStation = actualCurrentStation - 1;
        } else {
            actualCurrentStation = 9;
        }
        currentStation = actualCurrentStation;
    }

    public int station;

    public int getStation() {
        return station;
    }

    public void setStation(int actualStation) {
        if (actualStation < 86) {
            return;
        }
        if (actualStation > 108) {
            return;
        }
        station = actualStation;
    }
}

