package kr.hs.emirim.dbfl0406.touchgraphic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawShape(getApplicationContext()));
    }

    class DrawShape extends View {
        DrawShape(Context context){
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float cx=getWidth()/2.0f;
            float cy=getHeight()/2.0f;
            Paint paint=new Paint();
            paint.setStrokeWidth(7);
            paint.setColor(Color.MAGENTA);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(cx,cy,100,paint);
            paint.setColor(Color.BLUE);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(200,200,500,450,paint); //300*250
        }
    }
}
