public class LightDimCommand implements Command{

    private Light light;
    private int previousLevel;
    private int newLevel;

    public LightDimCommand(Light light,int newLevel){
        this.light=light;
        this.newLevel=newLevel;

    }

    @Override
    public void execute() {
        previousLevel=light.getBrightnessLevel();
        light.dim(newLevel);

    }

    @Override
    public void undo() {
        light.dim(previousLevel);

    }
}
