package ru.netology;

public class Radio {
    private int currentVolume;
    private int currentRadioStation;

    public int getCurrentVolume() {
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

    public void increaseVolume() {
        if (getCurrentVolume() < 100) {
            setCurrentVolume(getCurrentVolume() + 1);
        }
    }

    public void decreaseVolume() {
        if (getCurrentVolume() > 0) {
            setCurrentVolume(getCurrentVolume() - 1);
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextStation() {
        if (getCurrentRadioStation() == 9) {
            setCurrentRadioStation(0);
        } else {
            setCurrentRadioStation(getCurrentRadioStation() + 1);
        }
    }

    public void prevStation() {
        if (getCurrentRadioStation() == 0) {
            setCurrentRadioStation(9);
        } else {
            setCurrentRadioStation(getCurrentRadioStation() - 1);
        }
    }

}
