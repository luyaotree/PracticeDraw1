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
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        canvas.drawLine(100, 100, 100, 500, paint); // 从上往下画第一笔竖线
        canvas.drawLine(100, 500, 1000, 500, paint); // 第二笔横线
        paint.setColor(Color.parseColor("#72B916"));
        canvas.drawRect(120, 496, 220, 500, paint); // 第一个柱子


//        paint.setColor(Color.WHITE);
//        paint.setTextSize(40);
//        canvas.drawText("Froyo", 120, 542, paint);
    }
}
