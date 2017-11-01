package com.example.pedestrian.ordersforbigbaby;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by pedestrian-username on 17-8-29.
 */

public class ChatAdapter extends BaseAdapter{

    private LayoutInflater layoutInflater;
    private List<ChatItem> list;

    public ChatAdapter(Context context, List<ChatItem> list){
        this.layoutInflater = LayoutInflater.from(context);
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public ChatType getItemChatType(int i){
        return this.list.get(i).getChatType();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(getItemChatType(i) == ChatType.IN){
            viewHolder = new ViewHolder();
            view = layoutInflater.inflate(R.layout.chat_item_in, null);
            viewHolder.imageView = (ImageView)view.findViewById(R.id.icon_in);
            viewHolder.textView = (TextView)view.findViewById(R.id.text_in);
        } else {
            viewHolder = new ViewHolder();
            view = layoutInflater.inflate(R.layout.chat_item_out, null);
            viewHolder.imageView = (ImageView)view.findViewById(R.id.icon_out);
            viewHolder.textView = (TextView)view.findViewById(R.id.text_out);
        }
        viewHolder.imageView.setImageBitmap(list.get(i).getBitmap());
        viewHolder.textView.setText(list.get(i).getText());
        return view;
    }

    class ViewHolder {
        private ImageView imageView;
        private TextView textView;
    }
}
