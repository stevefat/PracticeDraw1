package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

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

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint =  new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        paint.setColor(Color.parseColor("#FFFFFF"));
        float[] lines= {
                200,200,200,600,
                200,600,1200,600
        };
        canvas.drawLines(lines,paint);

        int size = 7;
        int left= 200;
        int top =600;
        int right =  0;
        int btm = 600;

        int space= 10; //柱形之间的间隔
        int textSize= 15;
        int width= 30;


        for (int i = 1; i <= 7; i++) {

            left= left+space;

            RectF rectF = new RectF();

            rectF.set(left,top-(i*space),left+width,btm);



            paint.setColor(Color.GREEN);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(rectF,paint);

            paint.setColor(Color.WHITE);
            paint.setTextSize(textSize);
            canvas.drawText("jbk",rectF.left+10,(btm+20),paint);

            left = left+width;

        }


//        paint.setColor(Color.GREEN);
//        paint.setStyle(Paint.Style.FILL);
//        canvas.drawRect(240,590,300,600,paint);
//
//        canvas.drawRect(360,580,420,600,paint);
//
//        canvas.drawRect(480,560,540,600,paint);
//
//        canvas.drawRect(600,400,660,600,paint);
//
//        canvas.drawRect(720,300,780,600,paint);
//
//        canvas.drawRect(840,200,900,600,paint);
//
//        canvas.drawRect(960,450,1020,600,paint);
//
//
//        paint.setColor(Color.WHITE);
//        paint.setTextSize(15);
//        canvas.drawText("Fryoyo",250,620,paint);
//        canvas.drawText("GB",370,620,paint);
//        canvas.drawText("ICS",490,620,paint);
//        canvas.drawText("JB",610,620,paint);
//        canvas.drawText("KITKAT",730,620,paint);
//        canvas.drawText("L",850,620,paint);
//        canvas.drawText("A",970,620,paint);


    }
}
