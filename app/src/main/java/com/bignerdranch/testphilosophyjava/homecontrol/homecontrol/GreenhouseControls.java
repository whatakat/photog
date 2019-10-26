package com.bignerdranch.testphilosophyjava.homecontrol.homecontrol;

public class GreenhouseControls extends Controller {
    private boolean light = false;
    public class LightOn extends Event {
        public LightOn(long delayTime){super(delayTime);}

        @Override
        public void action() {
            light = true;
        }
        public String toString(){return "Light ON";}
    }
    public class LightOff extends Event{
        public LightOff(long delayTime){super(delayTime);}

        @Override
        public void action() {
            light =false;
        }
        public String toString(){return "Light OFF";}
    }
    private boolean water = false;
    public class WaterOn extends Event{
       public WaterOn(long delayTime){super(delayTime);}

        @Override
        public void action() {
            water= true;
        }
        public String toString(){
           return "Water ON";
        }
    }
    public class WaterOff extends Event{
        public WaterOff(long delayTime){super(delayTime);}

        @Override
        public void action() {
            water= false;
        }
        public String toString(){
            return "Water OFF";
        }
    }
    private String thermostat = "Day";
    public class ThermostatNight extends Event{
        public ThermostatNight(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Night";
        }

        @Override
        public String toString() {
            return "Thermostat used NIGHT method";
        }
    }
    public class ThermostatDay extends Event{
        public ThermostatDay(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Day";
        }

        @Override
        public String toString() {
            return "Thermostat used DAY method";
        }
    }
    public class Bell extends Event{
        public Bell(long delyTime){super(delyTime);}
        public void action(){
            addEvent(new Bell(delayTime));
        }
        public String toString(){return "Bam!";}
    }
    public class Restart extends Event{
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList){
            super(delayTime);
            this.eventList= eventList;
            for(Event e: eventList)
                addEvent(e);
        }

        @Override
        public void action() {
            for (Event e : eventList){
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }
        public String toString(){
            return "Restart system";
        }
    }
    public static class Terminate extends Event{
        public Terminate(long delayTime){super(delayTime);}
        public void action(){System.exit(0);}
        public String toString(){return "Switch OFF";}
    }




}
