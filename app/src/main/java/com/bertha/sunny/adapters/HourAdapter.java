package com.bertha.sunny.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bertha.sunny.R;
import com.bertha.sunny.weather.Hour;

/**
 * Created by liliana on 01/09/15.
 */
public class HourAdapter extends RecyclerView.Adapter<HourAdapter.HourViewHolder> {

    private Hour[] mHours;

    public HourAdapter(Hour[] hours) {
        mHours = hours;
    }

    @Override
    public HourViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        //view is root view or item layout
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.hourly_list_item, viewGroup, false);
        HourViewHolder viewHolder = new HourViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(HourViewHolder hourViewHolder, int i) {
        //bridge between adapter and viewholder
        hourViewHolder.bindHour(mHours[i]);

    }

    @Override
    public int getItemCount() {
        return mHours.length;
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

        public void bindHour(Hour hour) {
            mTimeLabel.setText(hour.getHour());
            mSummaryLabel.setText(hour.getSummary());
            mTemperatureLabel.setText(hour.getTemperature()+"");
            mIconImageView.setImageResource(hour.getIconId());

        }

    }
}
