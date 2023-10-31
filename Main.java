public class Main {
    public static void main(String[] args) {
        TV newDevice = new TV(new ColumnAlice());

        newDevice.operateNew();
        newDevice.transferToOldDevice();
    }
}