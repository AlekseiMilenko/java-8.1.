package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiServiceTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio radioVolume = new Radio();

        radioVolume.setIncreaseVolume(0);

        int actual = radioVolume.getIncreaseVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeFromUpperLimit() {
        Radio radioVolume = new Radio();

        radioVolume.setIncreaseVolume(10);

        int actual = radioVolume.getIncreaseVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeFromUnderLimit() {
        Radio radioVolume = new Radio();

        radioVolume.setIncreaseVolume(-1);

        int actual = radioVolume.getIncreaseVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radioVolume = new Radio();

        radioVolume.setDecreaseVolume(5);

        int actual = radioVolume.getDecreaseVolume();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeFromLowerLimit() {
        Radio radioVolume = new Radio();

        radioVolume.setDecreaseVolume(0);

        int actual = radioVolume.getDecreaseVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeFromAboveLimit() {
        Radio radioVolume = new Radio();

        radioVolume.setDecreaseVolume(11);

        int actual = radioVolume.getDecreaseVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

        @Test
        public void shouldSwitchUpStation () {
            Radio radioStation = new Radio();

            radioStation.setNextStation(5);

            int actual = radioStation.getNextStation();
            int expected = 6;

            assertEquals(expected, actual);
        }

        @Test
        public void shouldSwitchUpStationFromUpperLimit () {
            Radio radioStation = new Radio();

            radioStation.setNextStation(9);

            int actual = radioStation.getNextStation();
            int expected = 0;

            assertEquals(expected, actual);
        }
    @Test
    public void shouldSwitchUpStationFromUnderLimit () {
        Radio radioStation = new Radio();

        radioStation.setNextStation(-1);

        int actual = radioStation.getNextStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

        @Test
        public void shouldSwitchDownStationFromUpperLimit () {
            Radio radioStation = new Radio();

            radioStation.setPreviousStation(0);

            int actual = radioStation.getPreviousStation();
            int expected = 9;

            assertEquals(expected, actual);
        }

        @Test
        public void shouldSwitchDownStation () {
            Radio radioStation = new Radio();

            radioStation.setPreviousStation(9);

            int actual = radioStation.getPreviousStation();
            int expected = 8;

            assertEquals(expected, actual);
        }

    @Test
    public void shouldSwitchDownStationFromAboveLimit () {
        Radio radioStation = new Radio();

        radioStation.setPreviousStation(10);

        int actual = radioStation.getPreviousStation();
        int expected = 9;

        assertEquals(expected, actual);
    }
        @Test
        public void shouldSetStationUpperLimit () {
            Radio radioStation = new Radio();

            radioStation.setStation(195);

            int actual = radioStation.getStation();
            int expected = 0;

            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetStationLowerLimit () {
            Radio radioStation = new Radio();

            radioStation.setStation(6);

            int actual = radioStation.getStation();
            int expected = 0;

            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetStation () {
            Radio radioStation = new Radio();

            radioStation.setStation(100);

            int actual = radioStation.getStation();
            int expected = 100;

            assertEquals(expected, actual);
        }
}
