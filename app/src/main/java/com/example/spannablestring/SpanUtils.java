package com.example.spannablestring;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Toast;

/**
 * Created by libo on 2017/12/12.
 */

public class SpanUtils {

    public static SpannableString getForegroundColorSpan(Context context){
        SpannableString spannableString = new SpannableString("我已同意抖音使用协议");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(context.getResources().getColor(R.color.colorPrimary));
        spannableString.setSpan(foregroundColorSpan,4,spannableString.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        return spannableString;
    }

    public static SpannableString getBackgroundColorSpan(Context context){
        SpannableString spannableString = new SpannableString("你看我头像牛逼不？");
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(context.getResources().getColor(R.color.colorAccent));
        spannableString.setSpan(backgroundColorSpan,3,5,Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        return spannableString;
    }


    public static SpannableString getStrikethroughSpan(){
        SpannableString spannableString = new SpannableString("尤龙的传人");
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        spannableString.setSpan(strikethroughSpan,0,1,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        return spannableString;
    }

    public static SpannableString getUnderlineSpan(){
        SpannableString spannableString = new SpannableString("这里是下划线");
        UnderlineSpan underlineSpan = new UnderlineSpan();
        spannableString.setSpan(underlineSpan,3,6,Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        return spannableString;
    }

    public static SpannableString getSuperscriptSpan(){
        SpannableString spannableString = new SpannableString("刚在北京望京买了套1202m的房子");
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        spannableString.setSpan(superscriptSpan,12,13,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        return spannableString;
    }

    public static SpannableString getSubscriptSpan(){
        SpannableString spannableString = new SpannableString("水分子化学式为H20");
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        spannableString.setSpan(subscriptSpan,8,9,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        return spannableString;
    }

    public static SpannableString getStyleSpan(){
        SpannableString spannableString = new SpannableString("身正不怕影子歪");
        StyleSpan styleSpanBold = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpanitalic = new StyleSpan(Typeface.ITALIC);
        spannableString.setSpan(styleSpanBold,0,4,Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        spannableString.setSpan(styleSpanitalic,4,6,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        return spannableString;
    }

    public static SpannableString getRelativeSizeSpan(){
        SpannableString spannableString = new SpannableString("我心情忐忑不安七上八下");
        RelativeSizeSpan sizeSpan1 = new RelativeSizeSpan(1.2f);
        RelativeSizeSpan sizeSpan2 = new RelativeSizeSpan(1.4f);
        RelativeSizeSpan sizeSpan3 = new RelativeSizeSpan(1.6f);
        RelativeSizeSpan sizeSpan4 = new RelativeSizeSpan(1.8f);

        spannableString.setSpan(sizeSpan1,0,1,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan2,1,2,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan3,2,3,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan4,3,4,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan3,4,5,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan2,5,6,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan1,6,7,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan2,7,8,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan3,8,9,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(sizeSpan4,9,10,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);

        return spannableString;
    }

    public static SpannableString getImageSpan(Context context){
        SpannableString spannableString = new SpannableString("芭芭拉小魔仙 魔法棒");
        Drawable drawable = context.getResources().getDrawable(R.mipmap.fx);
        drawable.setBounds(0,0,70,70);
        ImageSpan imageSpan = new ImageSpan(drawable);
        spannableString.setSpan(imageSpan,6,7,Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        return spannableString;
    }

    public static SpannableString getClickableSpan(final Context context){
        SpannableString spannableString = new SpannableString("哪里不会点哪里，so easy！");
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(context,"你戳中我了",Toast.LENGTH_SHORT).show();
            }
        };
        spannableString.setSpan(clickableSpan,5,7,Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        return spannableString;
    }

    public static SpannableString getURLSpan(){
        SpannableString spannableString = new SpannableString("我的简书首页");
        URLSpan urlSpan = new URLSpan("http://www.jianshu.com/u/347890c1ed1e");
        spannableString.setSpan(urlSpan,0,spannableString.length(),Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        return spannableString;
    }

}
