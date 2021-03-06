package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_security extends SVGRenderer {

    public ic_security(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(12.0f, 1.0f);
        mPath.lineTo(3.0f, 5.0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.rCubicTo(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
        mPath.rCubicTo(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f);
        mPath.lineTo(21.0f, 5.0f);
        mPath.rLineTo(-9.0f, -4.0f);
        mPath.close();
        mPath.moveTo(12.0f, 1.0f);
        mPath.rMoveTo(0.0f, 10.99f);
        mPath.rLineTo(7.0f, 0f);
        mPath.rCubicTo(-0.53f, 4.12f, -3.28f, 7.79f, -7.0f, 8.94f);
        mPath.lineTo(12.0f, 12.0f);
        mPath.lineTo(5.0f, 12.0f);
        mPath.lineTo(5.0f, 6.3f);
        mPath.rLineTo(7.0f, -3.11f);
        mPath.rLineTo(0f, 8.8f);
        mPath.close();
        mPath.moveTo(12.0f, 11.99f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}