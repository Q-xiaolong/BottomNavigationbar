package me.sugarkawhi.mreader.element;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextUtils;

import me.sugarkawhi.mreader.config.Config;

/**
 * 页头部分：显示章节的标题；绘制每一页的头部。
 * Created by ZhaoZongyao on 2018/1/11.
 */

public class HeaderElement extends Element {

    private float mHeaderHeight;
    private float mPadding;
    private String mChapterTitle;
    private Paint mPaint;

    public HeaderElement(float headerHeight, float padding, Paint paint) {
        this.mHeaderHeight = headerHeight;
        this.mPadding = padding;
        this.mPaint = paint;
    }

    public void setChapterName(String chapterTitle) {
        mChapterTitle = chapterTitle;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (TextUtils.isEmpty(mChapterTitle)) return;
        mPaint.measureText(mChapterTitle);
        float titleHeight = mPaint.getFontSpacing();
        canvas.drawText(mChapterTitle, mPadding, mHeaderHeight / 2 + (titleHeight / 2), mPaint);
    }

}
