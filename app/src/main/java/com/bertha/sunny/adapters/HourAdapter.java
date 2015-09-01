package com.bertha.sunny.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bertha.sunny.R;

/**
 * Created by liliana on 01/09/15.
 */
public class HourAdapter extends RecyclerView.Adapter<HourAdapter.HourViewHolder> {

    @Override
    public HourViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(HourViewHolder hourViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HourViewHolder extends RecyclerView.ViewHolder {

        //we need one variable for each view on frontend
        public TextView mTimeLabel;
        public TextView mSummaryLabel;
        public TextView mTemperatureLabel;
        public ImageView mIconImageView;

        public HourViewHolder(View viewItem) {
            super(viewItem);

            //butterknifer can be used here
            mTimeLabel = (TextView) viewItem.findViewById(R.id.timeLabel);
            mSummaryLabel = (TextView) viewItem.findViewById(R.id.summaryLabel);
            mTemperatureLabel = (TextView) viewItem.findViewById(R.id.temperatureLabel);
            mIconImageView = (ImageView) viewItem.findViewById(R.id.iconImageView);
        }

    }
}