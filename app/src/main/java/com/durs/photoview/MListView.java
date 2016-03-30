package com.durs.photoview;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by durs on 2016/3/30.
 */
public class MListView extends Activity {

    private ListView lv_kindergarten;
    String[] kindergartenNames;
    String[] address;
    int[] imgIds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.mlistview);
        initView();
        initData();
        registerListener();

        lv_kindergarten.setAdapter(new ListViewAdapter(kindergartenNames, address, imgIds));
    }

    private void initView() {
        lv_kindergarten = (ListView) findViewById(R.id.lv_kindergarten);
    }

    private void initData() {
        kindergartenNames = new String[]{"幼儿园1", "幼儿园2", "幼儿园3", "幼儿园4", "幼儿园5", "幼儿园6", "幼儿园7"};
        address = new String[]{"地址1", "地址2", "地址3", "地址4", "地址5", "地址6", "地址7"};
        imgIds = new int[]{R.mipmap.kindergarten_img, R.mipmap.kindergarten_img, R.mipmap.kindergarten_img, R.mipmap.kindergarten_img, R.mipmap.kindergarten_img, R.mipmap.kindergarten_img, R.mipmap.kindergarten_img};
    }

    private void registerListener() {

    }

    public class ListViewAdapter extends BaseAdapter {

        View[] itemViews;

        public ListViewAdapter(String[] kindergartenNames, String[] address, int[] imgIds) {
            itemViews = new View[kindergartenNames.length];
            for (int i = 0; i < itemViews.length; i++) {
                itemViews[i] = makeItemView(kindergartenNames[i], address[i], imgIds[i]);

            }
        }

        @Override
        public int getCount() {
            return itemViews.length;
        }

        @Override
        public Object getItem(int position) {
            return itemViews[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        private View makeItemView(String strKindergartenName, String strAddress, int imgId) {
            LayoutInflater inflater = (LayoutInflater) MListView.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View itemView = inflater.inflate(R.layout.listitem_kindergarten, null);
            ImageView iv_kindergarten_img = (ImageView) itemView.findViewById(R.id.iv_kindergarten_img);
            iv_kindergarten_img.setBackgroundResource(imgId);
            TextView tv_kindergarten_name = (TextView) itemView.findViewById(R.id.tv_kindergarten_name);
            tv_kindergarten_name.setText(strKindergartenName);
            TextView tv_kindergarten_address = (TextView) itemView.findViewById(R.id.tv_kindergarten_address);
            tv_kindergarten_address.setText(strAddress);

            return itemView;
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                return itemViews[position];
            }
            return convertView;
        }
    }
}
