package com.example.pedestrian.ordersforbigbaby;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by pedestrian-username on 17-8-29.
 */

enum ChatType {
    IN, OUT
}

public class ChatItem {
    ChatType chatType;
    Bitmap bitmap;
    String string;
    
    public ChatItem(ChatType chatType, Bitmap bitmap, String string){
        this.chatType = chatType;
        this.bitmap = bitmap;
        this.string = string;
    }

    public ChatType getChatType() {
        return chatType;
    }

    public void setChatType(ChatType chatType) {
        this.chatType = chatType;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public String getText() {
        return string;
    }

    public void setText(String string) {
        this.string = string;
    }
}
