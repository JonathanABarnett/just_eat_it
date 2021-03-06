package com.alaythiaproductions.justeatit.adapter;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alaythiaproductions.justeatit.R;
import com.alaythiaproductions.justeatit.model.BestDealModel;
import com.asksira.loopingviewpager.LoopingPagerAdapter;
import com.asksira.loopingviewpager.LoopingViewPager;
import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MyBestDealsAdapter extends LoopingPagerAdapter<BestDealModel> {

    @BindView(R.id.img_best_deal)
    ImageView img_best_deal;
    @BindView(R.id.text_best_deal)
    TextView text_best_deal;

    Unbinder unbinder;

    public MyBestDealsAdapter(Context context, List<BestDealModel> itemList, boolean isInfinite) {
        super(context, itemList, isInfinite);
    }

    @Override
    protected View inflateView(int viewType, ViewGroup container, int listPosition) {
        return LayoutInflater.from(context).inflate(R.layout.layout_best_deal_item, container, false);

    }

    @Override
    protected void bindView(View convertView, int listPosition, int viewType) {
        unbinder = ButterKnife.bind(this, convertView);
        Glide.with(convertView).load(itemList.get(listPosition).getImage()).into(img_best_deal);
        text_best_deal.setText(itemList.get(listPosition).getName());
    }
}
