package com.alaythiaproductions.justeatit.callback;

import com.alaythiaproductions.justeatit.model.BestDealModel;
import com.alaythiaproductions.justeatit.model.PopularCategoryModel;

import java.util.List;

public interface IBestDealCallbackListener {
    void onBestDealLoadSuccess(List<BestDealModel> bestDealModels);
    void onBestDealLoadFailed(String message);
}
