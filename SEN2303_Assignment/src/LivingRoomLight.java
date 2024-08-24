public class LivingRoomLight implements Light{
    private int brightnesslevel;
    @Override
    public void on() {
        brightnesslevel=100;
        System.out.println("Living Room light is ON at full brightness.");

    }

    @Override
    public void off() {
        brightnesslevel=0;
        System.out.println("Living Room light is OFF.");

    }

    @Override
    public void dim(int level) {
        brightnesslevel=level;
        System.out.println("Living Room light dimmed to "+level+"%.");

    }

    @Override
    public int getBrightnessLevel() {
        return brightnesslevel;
    }
}
