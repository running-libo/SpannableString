package com.example.spannablestring;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tv_foreground)
    TextView tvForeground;
    @Bind(R.id.tv_background)
    TextView tvBackground;
    @Bind(R.id.tv_relativesize)
    TextView tvRelativesize;
    @Bind(R.id.tv_strikethrough)
    TextView tvStrikethrough;
    @Bind(R.id.tv_underline)
    TextView tvUnderline;
    @Bind(R.id.tv_superscript)
    TextView tvSuperscript;
    @Bind(R.id.tv_subscript)
    TextView tvSubscript;
    @Bind(R.id.tv_style)
    TextView tvStyle;
    @Bind(R.id.tv_image)
    TextView tvImage;
    @Bind(R.id.tv_click)
    TextView tvClick;
    @Bind(R.id.tv_url)
    TextView tvUrl;
    @Bind(R.id.tv_scalex)
    TextView tvScalex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        tvForeground.setText(SpanUtils.getForegroundColorSpan(getApplicationContext()));

        tvBackground.setText(SpanUtils.getBackgroundColorSpan(getApplicationContext()));

        tvStrikethrough.setText(SpanUtils.getStrikethroughSpan());

        tvUnderline.setText(SpanUtils.getUnderlineSpan());

        tvScalex.setText(SpanUtils.getScaleXSpan());

        tvSuperscript.setText(SpanUtils.getSuperscriptSpan());

        tvSubscript.setText(SpanUtils.getSubscriptSpan());

        tvStyle.setText(SpanUtils.getStyleSpan());

        tvRelativesize.setText(SpanUtils.getRelativeSizeSpan());

        tvImage.setText(SpanUtils.getImageSpan(getApplicationContext()));

        tvClick.setMovementMethod(LinkMovementMethod.getInstance());  //否则点击没反应
        tvClick.setText(SpanUtils.getClickableSpan(getApplicationContext()));

        tvUrl.setMovementMethod(LinkMovementMethod.getInstance());
        tvUrl.setText(SpanUtils.getURLSpan());
    }
}
