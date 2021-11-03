package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.parseColor("#506E7A"));
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        /**画一横一竖**/
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.WHITE);
        canvas.drawLine(100, 100, 100, 500, paint); // 从上往下画第一笔竖线
        canvas.drawLine(100, 500, 1000, 500, paint); // 第二笔横线

        /**画柱子*/
        paint.setColor(Color.parseColor("#72B916"));
        int left = 120;
        int width = 100;
        int bottom = 500;
        canvas.drawRect(left, 496, left+width, bottom, paint); // 第一个柱子
        left += 130;
        canvas.drawRect(left, 480, left+width, bottom, paint); // 第二个柱子
        left += 130;
        canvas.drawRect(left, 480, left+width, bottom, paint); // 第三个柱子
        left += 130;
        canvas.drawRect(left, 280, left+width, bottom, paint); // 第四个柱子
        left += 130;
        canvas.drawRect(left, 150, left+width, bottom, paint); // 第五个柱子
        left += 130;
        canvas.drawRect(left, 100, left+width, bottom, paint); // 第六个柱子
        left += 130;
        canvas.drawRect(left, 290, left+width, bottom, paint); // 第七个柱子

        /**画文字*/
        paint.setColor(Color.WHITE);
        paint.setTextSize(25);
        int textLeft = 142;
        int textMargin = 133;
        canvas.drawText("Froyo", textLeft, 535, paint);
        textLeft = textLeft + textMargin;
        canvas.drawText("GB", textLeft, 535, paint);
        textLeft = textLeft + textMargin;
        canvas.drawText("ICS", textLeft, 535, paint);
        textLeft = textLeft + textMargin;
        canvas.drawText("JB", textLeft, 535, paint);
        textLeft = textLeft + textMargin;
        canvas.drawText("Kitkat", textLeft, 535, paint);
        textLeft = textLeft + textMargin;
        canvas.drawText("L", textLeft, 535, paint);
        textLeft = textLeft + textMargin;
        canvas.drawText("M", textLeft, 535, paint);
    }
}
