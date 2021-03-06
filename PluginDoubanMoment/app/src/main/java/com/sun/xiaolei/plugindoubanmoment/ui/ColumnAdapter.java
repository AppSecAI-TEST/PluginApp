package com.sun.xiaolei.plugindoubanmoment.ui;

import android.content.Context;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.sun.xiaolei.plugindoubanmoment.R;
import com.sun.xiaolei.plugindoubanmoment.net.dto.PostsBean;

/**
 * Created by sunxl8 on 2017/8/4.
 */

public class ColumnAdapter extends BaseQuickAdapter<PostsBean, BaseViewHolder> {

    private Context mContext;

    public ColumnAdapter(Context context) {
        super(R.layout.p2_item_column);
        this.mContext = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, final PostsBean item) {
        helper.setText(R.id.tv_item_columnpost, item.getTitle());
        helper.setOnClickListener(R.id.layout_item_columnpost, v ->
                ArticleActivity.startThisActivity(mContext, item));
    }
}
