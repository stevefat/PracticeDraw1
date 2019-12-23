package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

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
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.WHITE);

        paint.setStrokeWidth(1.5f);
        paint.setTextSize(15);
        canvas.drawText("LOLLIPOP",150,288,paint);
        canvas.drawLine(268,288,360,288,paint);
        canvas.drawLine(360,288,380,360,paint);


        canvas.drawText("Marshmallow",700,380,paint);
        canvas.drawLines(new float[]{
                580,400,620,380,
                620,380,700,380
        },paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(310,320,600,600,-45,45,true,paint);

        paint.setColor(Color.WHITE);
        canvas.drawText("Froyo",700,462,paint);
        canvas.drawLine(580,462,700,462,paint);


        paint.setColor(Color.WHITE);
        canvas.drawText("GingerBread",700,490,paint);
        canvas.drawLine(580,470,660,480,paint);
        canvas.drawLine(660,480,700,500,paint);
        paint.setColor(Color.CYAN);
        canvas.drawArc(310,320,600,600,3,5,true,paint);


        paint.setColor(Color.WHITE);
        canvas.drawText("ICE Cream Sandwich",700,520,paint);
        canvas.drawLine(580,490,660,510,paint);
        canvas.drawLine(660,510,700,510,paint);
        paint.setColor(Color.GRAY);
        canvas.drawArc(310,320,600,600,10,6,true,paint);


        paint.setColor(Color.WHITE);
        canvas.drawText("JElly Bean",700,570,paint);
        canvas.drawLine(540,520,660,570,paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(310,320,600,600,20,30,true,paint);


        paint.setColor(Color.WHITE);
        canvas.drawText("Kikt",150,560,paint);
        canvas.drawLine(180,560,400,560,paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(310,320,600,600,55,120,true,paint);

        paint.setColor(Color.RED);
        canvas.drawArc(300,300,600,600,180,120,true,paint);
    }
}
