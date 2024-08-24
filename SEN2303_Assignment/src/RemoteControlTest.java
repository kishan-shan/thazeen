public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl=new RemoteControl(2);
        Light KitchenLight=new KitchenRoomLight();
        Light livingRoomLight=new LivingRoomLight();

        LightOnCommand KitchenLightOn=new LightOnCommand(KitchenLight);
        LightOffCommand KitchenLightOff=new LightOffCommand(KitchenLight);
        LightDimCommand KitchenLightDim=new LightDimCommand(KitchenLight, 50);

        LightOnCommand livingRoomLightOn=new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff=new LightOffCommand(livingRoomLight);
        LightDimCommand livingRoomLightDim=new LightDimCommand(livingRoomLight,30);

        remoteControl.setCommand(0,KitchenLightOn,KitchenLightOff);
        remoteControl.setCommand(1,livingRoomLightOn,livingRoomLightOff);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonWasPressed();

        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.undoButtonWasPressed();

        KitchenLightDim.execute();
        KitchenLightDim.undo();

        livingRoomLightDim.execute();
        livingRoomLightDim.undo();





    }
}
