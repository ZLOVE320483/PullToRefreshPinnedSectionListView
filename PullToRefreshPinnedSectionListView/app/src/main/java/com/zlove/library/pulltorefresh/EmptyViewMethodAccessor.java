package com.zlove.library.pulltorefresh;

import android.view.View;

/**
 * Created by ZLOVE on 2016/7/12.
 */
public interface EmptyViewMethodAccessor {

    /**
     * Calls upto AdapterView.setEmptyView()
     *
     * @param emptyView - to set as Empty View
     */
    public void setEmptyViewInternal(View emptyView);

    /**
     * Should call PullToRefreshBase.setEmptyView() which will then
     * automatically call through to setEmptyViewInternal()
     *
     * @param emptyView - to set as Empty View
     */
    public void setEmptyView(View emptyView);


}
