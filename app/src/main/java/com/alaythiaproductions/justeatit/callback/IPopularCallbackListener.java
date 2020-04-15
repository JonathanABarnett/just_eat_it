package com.alaythiaproductions.justeatit.callback;

import com.alaythiaproductions.justeatit.model.PopularCategoryModel;

import java.util.List;

public interface IPopularCallbackListener {
    void onPopularLoadSuccess(List<PopularCategoryModel> popularCategoryModels);
    void onPopularLoadFailed(String message);
}
