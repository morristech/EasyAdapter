package ru.surfstudio.easyadapter.recycler.controller;


import android.support.v7.widget.RecyclerView;

import ru.surfstudio.easyadapter.recycler.item.NoDataItem;

public abstract class NoDataItemController<H extends RecyclerView.ViewHolder>
        extends BaseItemController<H, NoDataItem<H>> {

    @Override
    public long getItemId(NoDataItem<H> item) {
        return getClass().getCanonicalName().hashCode();
    }

    @Override
    public void bind(H holder, NoDataItem<H> item) {
        //empty
    }

    @Override
    public long getItemHash(NoDataItem<H> item) {
        return 0;
    }
}