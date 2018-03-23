package cn.thl.view.statemanager;

import android.view.View;


public interface StateListener {

    interface OnClickListener {
        void onClick(View view);
    }

    interface ConvertListener {

        void convert(BaseViewHolder holder, StateLayout stateLayout);
    }
}