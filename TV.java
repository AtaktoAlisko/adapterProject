class TV implements ColumnAliceAdapter {
    private TVDev adapter;
    public TV(ColumnAliceDev columnAliceDev){
        adapter = new TVDev(columnAliceDev);
    }
    @Override
    public void operateNew() {
        System.out.println("The TV device is working.");
    }
    public void transferToOldDevice(){
        adapter.operateNew();
    }
}