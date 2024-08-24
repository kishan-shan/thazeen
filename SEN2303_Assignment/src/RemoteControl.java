import java.util.Stack;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> commandHistory;

    public RemoteControl(int numberOfSlots) {
        onCommands = new Command[numberOfSlots];
        offCommands = new Command[numberOfSlots];
        commandHistory = new Stack<>();

        // avoid null checks
        Command noCommand = new NoCommand();
        for (int i = 0; i < numberOfSlots; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        commandHistory.push(onCommands[slot]);
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        commandHistory.push(offCommands[slot]);
    }

    public void undoButtonWasPressed() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        } else {
            System.out.println("No commands to undo.");
        }
    }

    private class NoCommand implements Command {
        @Override
        public void execute() {

        }

        @Override
        public void undo() {

        }
    }
}
