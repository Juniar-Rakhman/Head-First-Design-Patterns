public class NoCommand implements Command {
    @Override
    public void execute() {
        throw new UnsupportedOperationException("No Command");
    }
}
