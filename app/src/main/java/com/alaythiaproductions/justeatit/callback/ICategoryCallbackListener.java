package com.alaythiaproductions.justeatit.callback;

import com.alaythiaproductions.justeatit.model.BestDealModel;
import com.alaythiaproductions.justeatit.model.CategoryModel;

import java.util.List;

public interface ICategoryCallbackListener {
    void onCategoryLoadSuccess(List<CategoryModel> categoryModelsModel);
    void onCategoryLoadFailed(String message);
}
