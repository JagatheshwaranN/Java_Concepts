package com.gc;

public class GarbageCollectionDemo {

    int objId;

    public GarbageCollectionDemo(int objId) {
        this.objId = objId;
        System.out.println(STR."Created \{this.objId}");
    }

    public static void main(String[] args) {
        for(int i = 1; i <= 900000; i++ ) {
            new GarbageCollectionDemo(i);
        }
    }

    @Override
    protected void finalize() {
        System.out.println(STR."Finalized \{objId}");
    }
}
