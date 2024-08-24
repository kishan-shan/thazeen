public class KitchenRoomLight implements Light{
    private int brightnesslevel;

    @Override
    public void off() {
        brightnesslevel=0;
        System.out.println("Kitchen Room light is OFF.");


    }

    @Override
    public void on() {
        brightnesslevel=100;
        System.out.println("Kitchen Room light is ON at full brightness.");

    }

    @Override
    public void dim(int level) {
        brightnesslevel=level;
        System.out.println("Kitchen Room light is dimmed to "+level+"%.");


    }

    @Override
    public int getBrightnessLevel() {
        return brightnesslevel;
    }
}
