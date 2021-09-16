package com.company;

public class Clock {
        private int hr;
        private int min;
        private int sec;

        public Clock(){
            hr = 0;
            min = 0;
            sec = 0;
        }

        public void setTime(int hours, int minutes, int seconds){
            if(0 <= hours && hours < 24)
                hr = hours;
            else
                hr = 0;

            if(0 <= minutes && minutes < 60)
                min = minutes;
            else
                min = 0;

            if(0 <= seconds && seconds < 60)
                sec = seconds;
            else
                sec = 0;


        }

        public int getHours(){
            return hr;
        }

        public int getMinutes(){
            return min;
        }

        public int getSeconds(){
            return sec;
        }

        public void printTime(){
            if(hr < 10){
                System.out.print("0" + hr + ":");
            }
            if(min < 10){
                System.out.print("0" + min + ":");
            }

            if(sec < 10){
                System.out.print("0" + sec);
            }
        }

        public void incrementSeconds(){
            sec++;
            if(sec > 59){
                sec = 0;
                incrementSeconds();
            }
        }

        public void incrementMinutes(){
            min++;
            if(min > 59){
                min = 0;
                incrementMinutes();
            }
        }

        public void incrementHours(){
            hr++;
            if(hr > 23){
                hr = 0;
                incrementHours();
            }
        }

        public boolean equals(Clock clocks){
            return (hr == clocks.hr && min == clocks.min && sec == clocks.sec);
        }

        public void makeCopy(Clock clocks){
            hr = clocks.hr;
            min = clocks.min;
            sec = clocks.sec;
        }

        public Clock getCopy(){
            Clock time = new Clock();

            time.hr = hr;
            time.min = min;
            time.sec = sec;

            return time;
        }
    }

