package com.linqxxy.git.wwh1;


class SyncThread extends Thread {
    private Sync sync ;
    public SyncThread(Sync sync) {
        this.sync = sync ;
    }
    @Override
    public void run() {
        this.sync.test();
    }
}