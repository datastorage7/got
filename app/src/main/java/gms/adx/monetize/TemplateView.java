package gms.adx.monetize;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;


public class TemplateView extends FrameLayout {

    private int templateType;
    private NativeStyle styles;
    private NativeAd nativeAd;
    private NativeAdView nativeAdView;

    private TextView primaryView;
    private TextView secondaryView;
    private RatingBar ratingBar;
    private TextView tertiaryView;
    private ImageView iconView;
    private MediaView mediaView;
    private Button callToActionView;
    private ConstraintLayout background;

    private static final String MEDIUM_TEMPLATE = "medium_template";
    private static final String SMALL_TEMPLATE = "small_template";

    int Native_Ad_Size = 0;

    Context mContext;

    public TemplateView(Context context, int Size) {
        super(context);

        Native_Ad_Size = Size;
        mContext = context;

        initView(context, null);
    }

    public TemplateView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context, attrs);
    }

    public TemplateView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public TemplateView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView(context, attrs);
    }

    public void setStyles(NativeStyle styles) {
        this.styles = styles;
        this.applyStyles();
    }

    public NativeAdView getNativeAdView() {
        return nativeAdView;
    }

    private void applyStyles() {

        Drawable mainBackground = styles.getMainBackgroundColor();
        if (mainBackground != null) {
            background.setBackground(mainBackground);
            if (primaryView != null) {
                primaryView.setBackground(mainBackground);
            }
            if (secondaryView != null) {
                secondaryView.setBackground(mainBackground);
            }
            if (tertiaryView != null) {
                tertiaryView.setBackground(mainBackground);
            }
        }

        Typeface primary = styles.getPrimaryTextTypeface();
        if (primary != null && primaryView != null) {
            primaryView.setTypeface(primary);
        }

        Typeface secondary = styles.getSecondaryTextTypeface();
        if (secondary != null && secondaryView != null) {
            secondaryView.setTypeface(secondary);
        }

        Typeface tertiary = styles.getTertiaryTextTypeface();
        if (tertiary != null && tertiaryView != null) {
            tertiaryView.setTypeface(tertiary);
        }

        Typeface ctaTypeface = styles.getCallToActionTextTypeface();
        if (ctaTypeface != null && callToActionView != null) {
            callToActionView.setTypeface(ctaTypeface);
        }

        int primaryTypefaceColor = styles.getPrimaryTextTypefaceColor();
        if (primaryTypefaceColor > 0 && primaryView != null) {
            primaryView.setTextColor(primaryTypefaceColor);
        }

        int secondaryTypefaceColor = styles.getSecondaryTextTypefaceColor();
        if (secondaryTypefaceColor > 0 && secondaryView != null) {
            secondaryView.setTextColor(secondaryTypefaceColor);
        }

        int tertiaryTypefaceColor = styles.getTertiaryTextTypefaceColor();
        if (tertiaryTypefaceColor > 0 && tertiaryView != null) {
            tertiaryView.setTextColor(tertiaryTypefaceColor);
        }

        int ctaTypefaceColor = styles.getCallToActionTypefaceColor();
        if (ctaTypefaceColor > 0 && callToActionView != null) {
            callToActionView.setTextColor(ctaTypefaceColor);
        }

        float ctaTextSize = styles.getCallToActionTextSize();
        if (ctaTextSize > 0 && callToActionView != null) {
            callToActionView.setTextSize(ctaTextSize);
        }

        float primaryTextSize = styles.getPrimaryTextSize();
        if (primaryTextSize > 0 && primaryView != null) {
            primaryView.setTextSize(primaryTextSize);
        }

        float secondaryTextSize = styles.getSecondaryTextSize();
        if (secondaryTextSize > 0 && secondaryView != null) {
            secondaryView.setTextSize(secondaryTextSize);
        }

        float tertiaryTextSize = styles.getTertiaryTextSize();
        if (tertiaryTextSize > 0 && tertiaryView != null) {
            tertiaryView.setTextSize(tertiaryTextSize);
        }

        Drawable ctaBackground = styles.getCallToActionBackgroundColor();
        if (ctaBackground != null && callToActionView != null) {
            callToActionView.setBackground(ctaBackground);
        }

        Drawable primaryBackground = styles.getPrimaryTextBackgroundColor();
        if (primaryBackground != null && primaryView != null) {
            primaryView.setBackground(primaryBackground);
        }

        Drawable secondaryBackground = styles.getSecondaryTextBackgroundColor();
        if (secondaryBackground != null && secondaryView != null) {
            secondaryView.setBackground(secondaryBackground);
        }

        Drawable tertiaryBackground = styles.getTertiaryTextBackgroundColor();
        if (tertiaryBackground != null && tertiaryView != null) {
            tertiaryView.setBackground(tertiaryBackground);
        }


        if (SharePref.getBGColor(mContext).length() >= 9) {
            try {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    card_main_background.setElevation(0.0f);
                }
            } catch (Exception e) {

            }
        }


        try {


            card_main_background.setCardBackgroundColor(Color.parseColor(SharePref.getBGColor(mContext)));

        } catch (Exception E) {

        }


        try {
            primaryView.setBackgroundColor(Color.parseColor(SharePref.getBGColor(mContext)));
            primaryView.setTextColor(Color.parseColor(SharePref.getTitleTextColor(mContext)));


        } catch (Exception e) {

        }


        try {
            tertiaryView.setTextColor(Color.parseColor(SharePref.getDescriptionTextColor(mContext)));

        } catch (Exception e) {

        }


        try {
            secondaryView.setTextColor(Color.parseColor(SharePref.getDescriptionTextColor(mContext)));

            ad_notification_view.setTextColor(Color.parseColor(SharePref.getButtonColor(mContext)));

        } catch (Exception e) {

        }


        try {
            GradientDrawable border = new GradientDrawable();
            border.setColor(Color.TRANSPARENT);
            border.setStroke(3, Color.parseColor(SharePref.getButtonColor(mContext)));
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
                ad_notification_view.setBackgroundDrawable(border);
            } else {
                ad_notification_view.setBackground(border);
            }

            LayerDrawable stars = (LayerDrawable) ratingBar.getProgressDrawable();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                stars.getDrawable(2).setTint(Color.parseColor(SharePref.getButtonColor(mContext)));
            } else {
                stars.getDrawable(2).setColorFilter(Color.parseColor(SharePref.getButtonColor(mContext)), PorterDuff.Mode.SRC_ATOP);
            }
        } catch (Exception e) {

        }


        if (SharePref.getNative_custom(mContext).equals("2")) {


            try {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    cardad.setElevation(0.0f);
                }
            } catch (Exception e) {

            }


            ObjectAnimator scaleX = ObjectAnimator.ofFloat(callToActionView, "scaleX", 0.9f, 1.1f);
            ObjectAnimator scaleY = ObjectAnimator.ofFloat(callToActionView, "scaleY", 0.9f, 1.1f);

            scaleX.setRepeatCount(ObjectAnimator.INFINITE);
            scaleX.setRepeatMode(ObjectAnimator.REVERSE);

            scaleY.setRepeatCount(ObjectAnimator.INFINITE);
            scaleY.setRepeatMode(ObjectAnimator.REVERSE);

            AnimatorSet scaleAnim = new AnimatorSet();
            scaleAnim.setDuration(1000);
            scaleAnim.play(scaleX).with(scaleY);

            scaleAnim.start();
        }

        try {
            callToActionView.setBackgroundColor(Color.parseColor(SharePref.getButtonColor(mContext)));
            callToActionView.setTextColor(Color.parseColor(SharePref.getButtonTextColor(mContext)));

        } catch (Exception e) {

        }


        invalidate();
        requestLayout();
    }

    private boolean adHasOnlyStore(NativeAd nativeAd) {
        String store = nativeAd.getStore();
        String advertiser = nativeAd.getAdvertiser();
        return !TextUtils.isEmpty(store) && TextUtils.isEmpty(advertiser);
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.nativeAd = nativeAd;

        String store = nativeAd.getStore();
        String advertiser = nativeAd.getAdvertiser();
        String headline = nativeAd.getHeadline();
        String body = nativeAd.getBody();
        String cta = nativeAd.getCallToAction();
        Double starRating = nativeAd.getStarRating();
        NativeAd.Image icon = nativeAd.getIcon();


        String secondaryText;

        nativeAdView.setCallToActionView(callToActionView);
        nativeAdView.setHeadlineView(primaryView);
        nativeAdView.setMediaView(mediaView);
        secondaryView.setVisibility(VISIBLE);
        if (adHasOnlyStore(nativeAd)) {
            nativeAdView.setStoreView(secondaryView);
            secondaryText = store;
        } else if (!TextUtils.isEmpty(advertiser)) {
            nativeAdView.setAdvertiserView(secondaryView);
            secondaryText = advertiser;
        } else {
            secondaryText = "";
        }

        primaryView.setText(headline);
        callToActionView.setText(cta);


        if (starRating != null && starRating > 0) {
            secondaryView.setVisibility(GONE);
            ratingBar.setVisibility(VISIBLE);
            ratingBar.setRating(starRating.floatValue());

            nativeAdView.setStarRatingView(ratingBar);
        } else {
            secondaryView.setText(secondaryText);
            secondaryView.setVisibility(VISIBLE);
            ratingBar.setVisibility(GONE);
        }

        if (icon != null) {
            iconView.setVisibility(VISIBLE);
            iconView.setImageDrawable(icon.getDrawable());
        } else {
            iconView.setVisibility(GONE);
        }

        try {
            if (tertiaryView != null) {
                tertiaryView.setText(body);
                nativeAdView.setBodyView(tertiaryView);
            }
        } catch (Exception e) {

        }

        nativeAdView.setNativeAd(nativeAd);
    }


    public void destroyNativeAd() {
        nativeAd.destroy();
    }

    public String getTemplateTypeName() {
        if (templateType == R.layout.gnt_medium_template_view) {
            return MEDIUM_TEMPLATE;
        } else if (templateType == R.layout.gnt_small_template_view) {
            return SMALL_TEMPLATE;
        }
        return "";
    }

    private void initView(Context context, AttributeSet attributeSet) {

        TypedArray attributes =
                context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TemplateView, 0, 0);


        try {

            if (SharePref.getNative_custom(mContext).equals("1") || SharePref.getNative_custom(mContext).equals("2")) {

                Log.e("Native_Ad_Size11", "" + Native_Ad_Size);


                if (Native_Ad_Size == 2) {

                    templateType =
                            attributes.getResourceId(
                                    R.styleable.TemplateView_gnt_template_type, R.layout.gnt_medium_template_view_custom);


                } else if (Native_Ad_Size == 0) {

                    templateType =
                            attributes.getResourceId(
                                    R.styleable.TemplateView_gnt_template_type, R.layout.gnt_start_template_view_custom);

                } else {


                    templateType =
                            attributes.getResourceId(
                                    R.styleable.TemplateView_gnt_template_type, R.layout.gnt_small_template_view_custom);

                }

            } else {

                if (Native_Ad_Size == 2) {

                    templateType =
                            attributes.getResourceId(
                                    R.styleable.TemplateView_gnt_template_type, R.layout.gnt_medium_template_view);


                } else if (Native_Ad_Size == 0) {

                    templateType =
                            attributes.getResourceId(
                                    R.styleable.TemplateView_gnt_template_type, R.layout.gnt_start_template_view);

                } else {


                    templateType =
                            attributes.getResourceId(
                                    R.styleable.TemplateView_gnt_template_type, R.layout.gnt_small_template_view);

                }


            }


        } finally {
            attributes.recycle();
        }
        LayoutInflater inflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(templateType, this);

        onFinishInflate();

    }


    TextView ad_notification_view;
    CardView card_main_background;
    CardView cardad;

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();
        nativeAdView = (NativeAdView) findViewById(R.id.native_ad_view);
        primaryView = (TextView) findViewById(R.id.primary);
        secondaryView = (TextView) findViewById(R.id.secondary);

        try {
            tertiaryView = (TextView) findViewById(R.id.body);
        } catch (Exception e) {

        }
        try {
            card_main_background = (CardView) findViewById(R.id.card_main_background);
        } catch (Exception e) {

        }

        try {
            cardad = (CardView) findViewById(R.id.cardad);
        } catch (Exception e) {

        }


        ad_notification_view = (TextView) findViewById(R.id.ad_notification_view);

        ratingBar = (RatingBar) findViewById(R.id.rating_bar);
        ratingBar.setEnabled(false);

        callToActionView = (Button) findViewById(R.id.cta);
        iconView = (ImageView) findViewById(R.id.icon);
        mediaView = (MediaView) findViewById(R.id.media_view);
        background = (ConstraintLayout) findViewById(R.id.background);
    }
}
