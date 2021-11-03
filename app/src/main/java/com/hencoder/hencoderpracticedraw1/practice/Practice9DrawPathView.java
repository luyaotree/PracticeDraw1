package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        Path path = new Path();
        path.addArc(200, 200, 400, 400, 150, 210);  // 左上角圆弧
        // 右上角圆弧,这里必须用arcTo，并且最后一个参数为false，因为不能抬笔，要一笔画完，最后close封闭
        path.arcTo(400, 200, 600, 400, 180, 200, false);
        path.lineTo(400,600);   // 画一条直线到最下面
        path.close();   // 封闭图形
        canvas.drawPath(path, paint);
    }
}
