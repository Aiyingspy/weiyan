package com.example.weiyanapp.widget;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

import com.example.weiyanapp.App;

public class FixedHeightRecyclerView extends RecyclerView {
	public FixedHeightRecyclerView(Context context) {
		super(context);
	}

	public FixedHeightRecyclerView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public FixedHeightRecyclerView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	protected void onMeasure(int widthSpec, int heightSpec) {
		heightSpec = View.MeasureSpec.makeMeasureSpec(App.DEVICE_HEIGHT / 2, View.MeasureSpec.EXACTLY);
		super.onMeasure(widthSpec, heightSpec);
	}
}
