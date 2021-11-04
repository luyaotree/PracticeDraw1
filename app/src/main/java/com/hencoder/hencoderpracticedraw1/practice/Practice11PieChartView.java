package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Practice11PieChartView extends View {
    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private int RADIUS = 200;
    private int[] ANGLES = new int[]{30, 60, 45, 45, 120, 60};
    private int[] COLORS = new int[]{Color.RED, Color.YELLOW, Color.GREEN, Color.BLUE, Color.GRAY, Color.BLACK};
    private float translate = 50; // 饼图沿着半价移出去的距离

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        float startAngle = 0f;
        for (int i = 0; i < 6; i++) {
            paint.setColor(COLORS[i]);
            int angle = ANGLES[i];
            if (i == 0) {
                canvas.save();
                canvas.translate((float) (Math.cos(Math.toRadians(angle / 2f)) * translate), (float) (Math.sin(Math.toRadians(angle / 2f)) * translate));
            }
            canvas.drawArc(getWidth() / 2 - RADIUS, getHeight() / 2 - RADIUS,
                    getWidth() / 2 + RADIUS, getHeight() / 2 + RADIUS,
                    startAngle, angle, true, paint);
            startAngle = startAngle + angle;
            if (i == 0) {
                canvas.restore();
            }
        }

    }
}
