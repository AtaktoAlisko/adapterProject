class TVDev implements ColumnAliceAdapter {
    private ColumnAliceDev columnAliceDev;

    public TVDev(ColumnAliceDev oldDevice) {
        this.columnAliceDev = oldDevice;
    }

    @Override
    public void operateNew() {
        System.out.println("\n" + "The adapter runs the Column Alice device through the TV interface.");
        columnAliceDev.operateOld();
    }
}