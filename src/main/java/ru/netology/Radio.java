package ru.netology;

public class Radio {
    private int currentVolume;
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int numberOfStations = 10;
    private int maxStation = numberOfStations - 1;
    private int minStation = 0;

    public Radio() {
    }

    public Radio(int numberOfStations) {
        this.maxStation = numberOfStations - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (getCurrentVolume() < maxVolume) {
            setCurrentVolume(getCurrentVolume() + 1);
        }
    }

    public void decreaseVolume() {
        if (getCurrentVolume() > minVolume) {
            setCurrentVolume(getCurrentVolume() - 1);
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minStation) {
            return;
        }
        if (newCurrentRadioStation > maxStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextStation() {
        if (getCurrentRadioStation() == maxStation) {
            setCurrentRadioStation(minStation);
        } else {
            setCurrentRadioStation(getCurrentRadioStation() + 1);
        }
    }

    public void prevStation() {
        if (getCurrentRadioStation() == minStation) {
            setCurrentRadioStation(maxStation);
        } else {
            setCurrentRadioStation(getCurrentRadioStation() - 1);
        }
    }

}
