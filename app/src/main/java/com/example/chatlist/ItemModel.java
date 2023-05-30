package com.example.chatlist;

public class ItemModel {

    public ItemModel(int itemid) {
        this.itemid = itemid;
    }
    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    private int itemid;
}
