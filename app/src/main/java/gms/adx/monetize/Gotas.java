package gms.adx.monetize;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.startapp.sdk.ads.banner.Banner;
import com.startapp.sdk.ads.banner.Cover;
import com.startapp.sdk.ads.banner.Mrec;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import pl.droidsonroids.gif.GifImageView;


public class Gotas {

    public static String BGColor1 = "#ffffff";
    public static String TitleTextColor1 = "#000000";
    public static String DescriptionTextColor1 = "#60000000";
    public static String ButtonColor1 = "#1E90FF";
    public static String ButtonTextColor1 = "#ffffff";
    public static String ButtonBorderColor1 = "#000000";

    public static int BGColor = Color.parseColor(BGColor1);
    public static int TitleTextColor = Color.parseColor(TitleTextColor1);
    public static int DescriptionTextColor = Color.parseColor(DescriptionTextColor1);
    public static int ButtonColor = Color.parseColor(ButtonColor1);
    public static int ButtonTextColor = Color.parseColor(ButtonTextColor1);
    public static int ButtonBorderColor = Color.parseColor(ButtonBorderColor1);

    public static Context mContext;

    public static int show_ads = 1;
    public static String FB_Banner1;
    public static String FB_Banner2;
    public static String FB_Banner3;
    public static String FB_Banner4;
    public static String FB_Banner5;

    public static String FB_MR1;
    public static String FB_MR2;
    public static String FB_MR3;
    public static String FB_MR4;
    public static String FB_MR5;

    public static String FB_Inter1;
    public static String FB_Inter2;
    public static String FB_Inter3;
    public static String FB_Inter4;
    public static String FB_Inter5;

    public static String FB_Native1;
    public static String FB_Native2;
    public static String FB_Native3;
    public static String FB_Native4;
    public static String FB_Native5;

    public static String FB_NativeSmall1;
    public static String FB_NativeSmall2;
    public static String FB_NativeSmall3;
    public static String FB_NativeSmall4;
    public static String FB_NativeSmall5;

    public static ArrayList<String> Google_SetUp_List_Custom = new ArrayList<>(Arrays.asList("L"));

    public static String Admob_App_ID;

    public static String Admob_Inter_ID1;
    public static String Admob_Inter_ID2;
    public static String Admob_Inter_ID3;

    public static String Admob_Inter_ID11;
    public static String Admob_Inter_ID22;
    public static String Admob_Inter_ID33;

    public static String Admob_Banner_ID1;
    public static String Admob_Banner_ID2;
    public static String Admob_Banner_ID3;


    public static String Admob_Banner_ID11;
    public static String Admob_Banner_ID22;
    public static String Admob_Banner_ID33;

    public static String Admob_Native_ID1;
    public static String Admob_Native_ID2;
    public static String Admob_Native_ID3;

    public static String Admob_Native_ID11;
    public static String Admob_Native_ID22;
    public static String Admob_Native_ID33;

    public static String Admob_AppOpen_ID1;
    public static String Admob_AppOpen_ID2;
    public static String Admob_AppOpen_ID3;

    public static String Admob_AppOpen_ID11;
    public static String Admob_AppOpen_ID22;
    public static String Admob_AppOpen_ID33;

    public static String only_fb_inter = "0";
    public static String rv_ri = "0";
    public static String Admob_rvi_ID1;
    public static String Admob_rvi_ID2;
    public static String Admob_rvi_ID3;
    public static String Admob_rvi_ID11;
    public static String Admob_rvi_ID22;
    public static String Admob_rvi_ID33;

    public static CustomProgressDialogue Rewarded_progressDialog;

    public static String ac_App;
    public static String ac_Inter;
    public static String ac_Banner;
    public static String Ac_Reward;

    public static int Loading_Data = 999;
    public static String Ads_Link;

    public static int Splesh_AO = 0;

    public static String Ads_Seq = "FB";
    public static String Ads_Seq1 = "GL";
    public static String Ads_Seq2 = "AC";

    public static String For_Approval_Setup = "0";

    public static int Counter_Ads_SetUp = 3;
    public static int AppOpen_Ads_SetUp = 1;

    public static int FB_setup_ads = 1;
    public static String GL_setup_ads = "L";

    public static int splesh_ads = 1;

    public static int increase_ads = 0;

    public static int fb_splesh_inter_id_count = 1;
    public static int fb_inter_id_count = 1;
    public static int fb_banner_id_count = 1;
    public static int fb_native_id_count = 1;
    public static int fb_nativesmalll_id_count = 1;

    public static Boolean Inter_loading_progress = false;

    public static String Tappx_ID;

    public static Boolean Splesh_Timer = false;

    public static String PackageName;

    public static String Exit_Pop_Setup = "0";
    public static Boolean doubleBackToExitPressedOnce = false;

    public static Handler handler_splesh_counter;
    public static Runnable runnable_splesh_counter;

    public static int b_nooff = 1;
    public static int n_nooff = 1;
    public static int i_nooff = 1;
    public static int i_ao_ex = 0;
    public static int b_n_ex = 0;
    public static String Extra1 = "0";
    public static String Extra2 = "0";
    public static String Extra3 = "0";
    public static String Extra4 = "0";
    public static String Extra5 = "0";
    public static String splash_anim;
    public static InterstitialAd FB_Inter_Splesh;
    public static int gogole_splesh_inter_id_count = 0;
    public static int google_id_exchange_H = 1;
    public static int google_id_exchange_M = 1;
    public static int google_id_exchange_L = 1;
    public static AppOpenAd Splash_appOpenAd = null;
    public static int gogole_AppOpen_id_count_splesh = 0;
    public static int splash_google_id_exchange_H = 1;
    public static int splash_google_id_exchange_M = 1;
    public static int splash_google_id_exchange_L = 1;
    public static Boolean only_inter = false;
    public static InterstitialAd FB_Inter;
    public static com.google.android.gms.ads.interstitial.InterstitialAd Google_Inter;
    public static int gogole_inter_id_count = 0;
    public static int Banner_google_id_exchange_H = 1;
    public static int Banner_google_id_exchange_M = 1;
    public static int Banner_google_id_exchange_L = 1;
    public static int Native_google_id_exchange_H = 1;
    public static int Native_google_id_exchange_M = 1;
    public static int Native_google_id_exchange_L = 1;
    public static int fb_banner_id_count_pre = 1;
    public static int fb_native_id_count_Pre = 1;
    public static int fb_nativesmalll_id_count_Pre = 1;
    public static AppOpenAd Pre_appOpenAd = null;
    public static Boolean isLoadingAd = false;
    public static int gogole_AppOpen_id_count_pre = 0;
    public static int AppOpen_google_id_exchange_H = 0;
    public static int AppOpen_google_id_exchange_M = 0;
    public static int AppOpen_google_id_exchange_L = 0;
    public static InterstitialAd FB_Inter_appopen;
    public static int fb_inter_id_count_ao = 1;
    public static Boolean isLoadingAd_ao_fb = false;
    String App_Name;
    AdView FB_Banner = null;
    int gogole_banner_id_count = 0;
    NativeBannerAd mNativeBannerAd;
    NativeAd nativeAd;
    int gogole_native_id_count = 0;
    int Pre_Loaed_Banner_Type = 1;
    String Pre_Loaed_Banner_What_show = "";
    AdView Pre_FB_Banner = null;
    int gogole_banner_id_count_pre = 0;
    com.google.android.gms.ads.AdView AdMob_mAdView_Pre;
    int Pre_Loaed_Native_Type = 1;
    String Pre_Loaed_Native_What_show = "";
    NativeBannerAd mNativeBannerAd_pre;
    NativeAd nativeAd_pre;
    View fb_Native_View = null;
    int gogole_native_id_count_pre = 0;
    TemplateView Native_templateView_pre;
    GifImageView exit_gifImageView = null;
    RewardedInterstitialAd rewardedInterstitialAd = null;
    Boolean isFullAdShowed = false;
    int ri_google_id_exchange_H = 1;
    int ri_google_id_exchange_M = 1;
    int ri_google_id_exchange_L = 1;
    int gogole_rw_id_count = 0;

    public Gotas(Context context, String App_Name1, String Ads_Link1, String Package, int show_ads1, int FB_setup_ads1, String GL_setup_ads1, int splesh_ads1, int increase_ads1, String splash_anim1,
                 String FB_Banner11, String FB_Banner22, String FB_Banner33, String FB_Banner44, String FB_Banner55,
                 String FB_MR11, String FB_MR22, String FB_MR33, String FB_MR44, String FB_MR55,
                 String FB_Inter11, String FB_Inter22, String FB_Inter33, String FB_Inter44, String FB_Inter55,
                 String FB_Native11, String FB_Native22, String FB_Native33, String FB_Native44, String FB_Native55,
                 String FB_NativeSmall11, String FB_NativeSmall22, String FB_NativeSmall33, String FB_NativeSmall44, String FB_NativeSmall55,
                 String AC_App_ID1, String AC_Inter_ID1, String AC_Banner_ID1, String AC_Reward_ID1,
                 String Tappx1,
                 String Admob_App_ID1,
                 String Admob_Inter_ID_1, String Admob_Inter_ID_11,
                 String Admob_Inter_ID_2, String Admob_Inter_ID_22,
                 String Admob_Inter_ID_3, String Admob_Inter_ID_33,
                 String Admob_Banner_ID_1, String Admob_Banner_ID_11,
                 String Admob_Banner_ID_2, String Admob_Banner_ID_22,
                 String Admob_Banner_ID_3, String Admob_Banner_ID_33,
                 String Admob_Native_ID_1, String Admob_Native_ID_11,
                 String Admob_Native_ID_2, String Admob_Native_ID_22,
                 String Admob_Native_ID_3, String Admob_Native_ID_33,
                 String Admob_AppOpen_ID_1, String Admob_AppOpen_ID_11,
                 String Admob_AppOpen_ID_2, String Admob_AppOpen_ID_22,
                 String Admob_AppOpen_ID_3, String Admob_AppOpen_ID_33,
                 String Admob_rvi_id_ID1, String Admob_rvi_id_ID11,
                 String Admob_rvi_id_ID2, String Admob_rvi_id_ID22,
                 String Admob_rvi_id_ID3, String Admob_rvi_id_ID33

    ) {

        try {


            mContext = context;
            App_Name = App_Name1;

            Ads_Link = Ads_Link1;

            PackageName = Package;

            show_ads = show_ads1;

            FB_setup_ads = FB_setup_ads1;
            GL_setup_ads = GL_setup_ads1;


            splesh_ads = splesh_ads1;
            increase_ads = increase_ads1;


            FB_Banner1 = FB_Banner11;
            FB_Banner2 = FB_Banner22;
            FB_Banner3 = FB_Banner33;
            FB_Banner4 = FB_Banner44;
            FB_Banner5 = FB_Banner55;


            FB_MR1 = FB_MR11;
            FB_MR2 = FB_MR22;
            FB_MR3 = FB_MR33;
            FB_MR4 = FB_MR44;
            FB_MR5 = FB_MR55;


            FB_Inter1 = FB_Inter11;
            FB_Inter2 = FB_Inter22;
            FB_Inter3 = FB_Inter33;
            FB_Inter4 = FB_Inter44;
            FB_Inter5 = FB_Inter55;


            FB_Native1 = FB_Native11;
            FB_Native2 = FB_Native22;
            FB_Native3 = FB_Native33;
            FB_Native4 = FB_Native44;
            FB_Native5 = FB_Native55;


            FB_NativeSmall1 = FB_NativeSmall11;
            FB_NativeSmall2 = FB_NativeSmall22;
            FB_NativeSmall3 = FB_NativeSmall33;
            FB_NativeSmall4 = FB_NativeSmall44;
            FB_NativeSmall5 = FB_NativeSmall55;


            Admob_App_ID = Admob_App_ID1;


            Admob_Inter_ID1 = Admob_Inter_ID_1;
            Admob_Inter_ID2 = Admob_Inter_ID_2;
            Admob_Inter_ID3 = Admob_Inter_ID_3;


            Admob_Inter_ID11 = Admob_Inter_ID_11;
            Admob_Inter_ID22 = Admob_Inter_ID_22;
            Admob_Inter_ID33 = Admob_Inter_ID_33;


            Admob_Banner_ID1 = Admob_Banner_ID_1;
            Admob_Banner_ID2 = Admob_Banner_ID_2;
            Admob_Banner_ID3 = Admob_Banner_ID_3;


            Admob_Banner_ID11 = Admob_Banner_ID_11;
            Admob_Banner_ID22 = Admob_Banner_ID_22;
            Admob_Banner_ID33 = Admob_Banner_ID_33;

            Admob_Native_ID1 = Admob_Native_ID_1;
            Admob_Native_ID2 = Admob_Native_ID_2;
            Admob_Native_ID3 = Admob_Native_ID_3;

            Admob_Native_ID11 = Admob_Native_ID_11;
            Admob_Native_ID22 = Admob_Native_ID_22;
            Admob_Native_ID33 = Admob_Native_ID_33;


            Admob_AppOpen_ID1 = Admob_AppOpen_ID_1;
            Admob_AppOpen_ID2 = Admob_AppOpen_ID_2;
            Admob_AppOpen_ID3 = Admob_AppOpen_ID_3;

            Admob_AppOpen_ID11 = Admob_AppOpen_ID_11;
            Admob_AppOpen_ID22 = Admob_AppOpen_ID_22;
            Admob_AppOpen_ID33 = Admob_AppOpen_ID_33;


            only_fb_inter = "0";
            rv_ri = "0";
            Admob_rvi_ID1 = Admob_rvi_id_ID1;
            Admob_rvi_ID2 = Admob_rvi_id_ID2;
            Admob_rvi_ID3 = Admob_rvi_id_ID3;
            Admob_rvi_ID11 = Admob_rvi_id_ID11;
            Admob_rvi_ID22 = Admob_rvi_id_ID22;
            Admob_rvi_ID33 = Admob_rvi_id_ID33;


            ac_App = AC_App_ID1;
            ac_Inter = AC_Inter_ID1;
            ac_Banner = AC_Banner_ID1;
            Ac_Reward = AC_Reward_ID1;
            Tappx_ID = Tappx1;


            Splesh_AO = 0;

            splash_anim = splash_anim1;


            if (SharePref.getFirst_ads(mContext) == 0) {

                SharePref.setShow_Ads(mContext, show_ads);
                SharePref.setExit_Pop(mContext, "0");
                SharePref.setSplesh_AO(mContext, 0);
                SharePref.setsplash_anim(mContext, splash_anim);
                SharePref.setNative_custom(mContext, "0");
                SharePref.setCounter_Ads_Setup(mContext, 3);
                SharePref.setAO_Setup(mContext, 1);
                SharePref.setFor_Approval(mContext, For_Approval_Setup);


                SharePref.setExtra1(mContext, "0");
                SharePref.setExtra2(mContext, "0");
                SharePref.setExtra3(mContext, "0");
                SharePref.setExtra4(mContext, "0");
                SharePref.setExtra5(mContext, "0");


                SharePref.setb_nooff(mContext, 1);
                SharePref.setn_nooff(mContext, 1);
                SharePref.seti_nooff(mContext, 1);
                SharePref.seti_ao_ex(mContext, 0);
                SharePref.setb_n_ex(mContext, 0);

                SharePref.setFB_Setup_Ads(mContext, FB_setup_ads);
                SharePref.setGL_Setup_Ads(mContext, GL_setup_ads);

                SharePref.setSplesh_Ads(mContext, splesh_ads);
                SharePref.setIncrease_Ads(mContext, increase_ads);

                SharePref.setFB_Banner1(mContext, FB_Banner1);
                SharePref.setFB_Banner2(mContext, FB_Banner2);
                SharePref.setFB_Banner3(mContext, FB_Banner3);
                SharePref.setFB_Banner4(mContext, FB_Banner4);
                SharePref.setFB_Banner5(mContext, FB_Banner5);

                SharePref.setFB_MR1(mContext, FB_MR1);
                SharePref.setFB_MR2(mContext, FB_MR2);
                SharePref.setFB_MR3(mContext, FB_MR3);
                SharePref.setFB_MR4(mContext, FB_MR4);
                SharePref.setFB_MR5(mContext, FB_MR5);

                SharePref.setFB_Inter1(mContext, FB_Inter1);
                SharePref.setFB_Inter2(mContext, FB_Inter2);
                SharePref.setFB_Inter3(mContext, FB_Inter3);
                SharePref.setFB_Inter4(mContext, FB_Inter4);
                SharePref.setFB_Inter5(mContext, FB_Inter5);

                SharePref.setFB_Native1(mContext, FB_Native1);
                SharePref.setFB_Native2(mContext, FB_Native2);
                SharePref.setFB_Native3(mContext, FB_Native3);
                SharePref.setFB_Native4(mContext, FB_Native4);
                SharePref.setFB_Native5(mContext, FB_Native5);

                SharePref.setFB_Native_Small1(mContext, FB_NativeSmall1);
                SharePref.setFB_Native_Small2(mContext, FB_NativeSmall2);
                SharePref.setFB_Native_Small3(mContext, FB_NativeSmall3);
                SharePref.setFB_Native_Small4(mContext, FB_NativeSmall4);
                SharePref.setFB_Native_Small5(mContext, FB_NativeSmall5);


                SharePref.setAdmob_APP(mContext, Admob_App_ID);

                SharePref.setAdmob_Inter1(mContext, Admob_Inter_ID1);
                SharePref.setAdmob_Inter2(mContext, Admob_Inter_ID2);
                SharePref.setAdmob_Inter3(mContext, Admob_Inter_ID3);

                SharePref.setAdmob_Inter11(mContext, Admob_Inter_ID11);
                SharePref.setAdmob_Inter22(mContext, Admob_Inter_ID22);
                SharePref.setAdmob_Inter33(mContext, Admob_Inter_ID33);

                SharePref.setAdmob_Banner1(mContext, Admob_Banner_ID1);
                SharePref.setAdmob_Banner2(mContext, Admob_Banner_ID2);
                SharePref.setAdmob_Banner3(mContext, Admob_Banner_ID3);

                SharePref.setAdmob_Banner11(mContext, Admob_Banner_ID11);
                SharePref.setAdmob_Banner22(mContext, Admob_Banner_ID22);
                SharePref.setAdmob_Banner33(mContext, Admob_Banner_ID33);

                SharePref.setAdmob_Native1(mContext, Admob_Native_ID1);
                SharePref.setAdmob_Native2(mContext, Admob_Native_ID2);
                SharePref.setAdmob_Native3(mContext, Admob_Native_ID3);

                SharePref.setAdmob_Native11(mContext, Admob_Native_ID11);
                SharePref.setAdmob_Native22(mContext, Admob_Native_ID22);
                SharePref.setAdmob_Native33(mContext, Admob_Native_ID33);


                SharePref.setAdmob_AppOpen1(mContext, Admob_AppOpen_ID1);
                SharePref.setAdmob_AppOpen2(mContext, Admob_AppOpen_ID2);
                SharePref.setAdmob_AppOpen3(mContext, Admob_AppOpen_ID3);

                SharePref.setAdmob_AppOpen11(mContext, Admob_AppOpen_ID11);
                SharePref.setAdmob_AppOpen22(mContext, Admob_AppOpen_ID22);
                SharePref.setAdmob_AppOpen33(mContext, Admob_AppOpen_ID33);

                SharePref.setonly_fb_inter(mContext, only_fb_inter);
                SharePref.setrv_ri(mContext, rv_ri);

                SharePref.setAdmob_rvi_ID1(mContext, Admob_rvi_ID1);
                SharePref.setAdmob_rvi_ID11(mContext, Admob_rvi_ID11);
                SharePref.setAdmob_rvi_ID2(mContext, Admob_rvi_ID2);
                SharePref.setAdmob_rvi_ID22(mContext, Admob_rvi_ID22);
                SharePref.setAdmob_rvi_ID3(mContext, Admob_rvi_ID3);
                SharePref.setAdmob_rvi_ID33(mContext, Admob_rvi_ID33);

                SharePref.setAC_Reward(mContext, Ac_Reward);

                SharePref.setAC_App(mContext, ac_App);
                SharePref.setAC_Inter(mContext, ac_Inter);
                SharePref.setAC_Banner(mContext, ac_Banner);

                SharePref.setAds_Seq(mContext, "FB");
                SharePref.setAds_Seq1(mContext, "GL");
                SharePref.setAds_Seq2(mContext, "AC");

                SharePref.setTappx(mContext, Tappx_ID);

                SharePref.setBGColor(mContext, BGColor1);
                SharePref.setTitleTextColor(mContext, TitleTextColor1);
                SharePref.setDescriptionTextColor(mContext, DescriptionTextColor1);
                SharePref.setButtonColor(mContext, ButtonColor1);
                SharePref.setButtonTextColor(mContext, ButtonTextColor1);
                SharePref.setButtonBorderColor(mContext, ButtonBorderColor1);

                SharePref.setFirst_ads(mContext, 1);

            }
            if (isNetworkConnected(mContext)) {
                new GetData().execute();
            }

        } catch (Exception e) {

        }

    }

    public static boolean isNetworkConnected(Context aContext) {
        ConnectivityManager cm = (ConnectivityManager) aContext
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null
                && activeNetwork.isConnectedOrConnecting();
        return isConnected;
    }

    public static void Splesh_Screen(Context ads_context, int Text_Color, int icLauncher, String App_Name, String splesh_anim2) {
        try {
            splash_anim = splesh_anim2;

            if (SharePref.getFirst_ads_splesh(mContext) == 0) {

                SharePref.setsplash_anim(mContext, splash_anim);

                SharePref.setFirst_ads_splesh(mContext, 1);
            }


            splash_anim = SharePref.getsplash_anim(mContext);


            if (isNetworkConnected(ads_context)) {


                int width = 480, Height = 800;


                final Dialog builder = new Dialog(ads_context);
                builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
                builder.getWindow().setBackgroundDrawable(
                        new ColorDrawable(Color.BLACK));
                builder.getWindow().setFlags(
                        WindowManager.LayoutParams.FLAG_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FULLSCREEN);

                WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                lp.copyFrom(builder.getWindow().getAttributes());
                lp.width = WindowManager.LayoutParams.MATCH_PARENT;
                lp.height = WindowManager.LayoutParams.MATCH_PARENT;

                builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialogInterface) {

                    }
                });

                DisplayMetrics displayMetrics = new DisplayMetrics();
                builder.getWindow().getWindowManager().getDefaultDisplay()
                        .getMetrics(displayMetrics);

                width = displayMetrics.widthPixels;
                Height = displayMetrics.heightPixels;

                float[] hsv = new float[3];
                int color = Text_Color;
                Color.colorToHSV(color, hsv);
                hsv[2] *= 0.175f;
                color = Color.HSVToColor(hsv);


                final RelativeLayout RL = new RelativeLayout(ads_context);

                int colorFrom = ads_context.getResources().getColor(R.color.black);
                int colorTo = color;
                @SuppressLint("RestrictedApi") ValueAnimator colorAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), colorFrom, colorTo);
                colorAnimation.setDuration(2000);
                colorAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    @Override
                    public void onAnimationUpdate(ValueAnimator animator) {
                        RL.setBackgroundColor((int) animator.getAnimatedValue());
                    }

                });
                colorAnimation.start();

                RL.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM);
                builder.addContentView(RL, new RelativeLayout.LayoutParams(
                        WindowManager.LayoutParams.MATCH_PARENT,
                        WindowManager.LayoutParams.MATCH_PARENT));

                // Graphics Specifications // Splash // if {if{ animation }else{ animation }}

                ImageView imageView = new ImageView(ads_context);
                imageView.setImageResource(icLauncher);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                int image_paadding = ((int) (width / 5));
                imageView.setPadding(image_paadding, image_paadding,
                        image_paadding, image_paadding);
                imageView.setTranslationY(-(int) (Height / 7));
                builder.addContentView(imageView, new RelativeLayout.LayoutParams(
                        WindowManager.LayoutParams.MATCH_PARENT,
                        WindowManager.LayoutParams.MATCH_PARENT));


                TextView theText = new TextView(ads_context);
                theText.setText("" + App_Name);
                theText.setTextColor(Text_Color);
                theText.setTypeface(Typeface.DEFAULT_BOLD);
                theText.setTextSize((int) (Height / (width / 9)));
                theText.setTranslationY(-(int) (Height / 5.5));

                theText.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM);
                builder.addContentView(theText, new RelativeLayout.LayoutParams(
                        WindowManager.LayoutParams.MATCH_PARENT,
                        WindowManager.LayoutParams.MATCH_PARENT));

                ProgressBar progressBar = new ProgressBar(ads_context);

                progressBar.getIndeterminateDrawable().setColorFilter(Text_Color,
                        android.graphics.PorterDuff.Mode.MULTIPLY);

                int progressBar_padding = ((int) (width / 2.5));
                progressBar.setPadding(progressBar_padding, progressBar_padding,
                        progressBar_padding, progressBar_padding);
                progressBar.setTranslationY((float) ((Height) / 2.5));
                builder.addContentView(progressBar,
                        new RelativeLayout.LayoutParams(
                                WindowManager.LayoutParams.MATCH_PARENT,
                                WindowManager.LayoutParams.MATCH_PARENT));

                try {
                    builder.show();

                } catch (Exception e) {

                }

                builder.getWindow().setAttributes(lp);
                builder.setCancelable(false);

                Splesh_Timer = false;

                handler_splesh_counter = new Handler();
                runnable_splesh_counter = new Runnable() {
                    public void run() {
                        Splesh_Timer = true;


                        try {
                            if (builder.isShowing()) {
                                builder.dismiss();
                            }
                        } catch (final IllegalArgumentException e) {

                        } catch (final Exception e) {
                        } finally {

                        }

                        Interstial_Load(ads_context);
                        Pre_Load_App_Open(ads_context);
                    }
                };
                handler_splesh_counter.postDelayed(runnable_splesh_counter, 15000);

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            if (Loading_Data == 1 || Loading_Data == 0) {

                                if (show_ads == 0) {
                                    try {
                                        if (builder.isShowing()) {
                                            builder.dismiss();
                                        }
                                    } catch (final IllegalArgumentException e) {

                                    } catch (final Exception e) {
                                    } finally {

                                    }
                                } else {
                                    Splash_Interstial(builder, ads_context);
                                }
                            } else {
                                handler.postDelayed(this, 1000);
                            }
                        } catch (Exception e) {

                        }
                    }
                }, 1000);
            } else {

            }


        } catch (Exception e) {

        }

    }

    public static void Splash_Interstial(Dialog builder, Context cont_ads) {


        try {

            if (isNetworkConnected(cont_ads)) {
                if (show_ads == 1) {
                    if (splesh_ads == 1) {

                        if (i_nooff == 0) {
                            try {
                                handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                            } catch (Exception e) {

                            }


                            try {
                                if (builder != null) {
                                    if (builder.isShowing()) {
                                        builder.dismiss();
                                    }
                                }
                            } catch (final IllegalArgumentException e) {

                            } catch (final Exception e) {
                            } finally {

                            }
                            return;
                        }

                        if (Ads_Seq.equals("FB")) {
                            Splash_Interstial_FB(builder, cont_ads);
                        } else if (Ads_Seq.equals("GL")) {
                            Splash_Interstial_Google(builder, cont_ads);
                        } else if (Ads_Seq.equals("AC")) {
                            Splash_Interstial_AC(builder, cont_ads);
                        } else if (Ads_Seq.equals("TX")) {
                            Splash_Interstial_Tappx(builder, cont_ads);
                        } else {
                            Splash_Interstial_Google(builder, cont_ads);
                        }
                    } else {
                        try {
                            handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                        } catch (Exception e) {

                        }
                        Pre_Load_App_Open(cont_ads);
                        Interstial_Load(cont_ads);

                        try {
                            if (builder != null) {
                                if (builder.isShowing()) {
                                    builder.dismiss();
                                }
                            }
                        } catch (final IllegalArgumentException e) {

                        } catch (final Exception e) {
                        } finally {

                        }
                    }
                } else {

                    try {
                        if (builder != null) {
                            if (builder.isShowing()) {
                                builder.dismiss();
                            }
                        }
                    } catch (final IllegalArgumentException e) {

                    } catch (final Exception e) {
                    } finally {

                    }
                }

            } else {
                try {
                    if (builder != null) {
                        if (builder.isShowing()) {
                            builder.dismiss();
                        }
                    }
                } catch (final IllegalArgumentException e) {

                } catch (final Exception e) {
                } finally {

                }
            }

        } catch (Exception e) {

        }

    }

    public static void Splash_Interstial_FB(Dialog builder, Context cont_ads) {


        try {

            if (show_ads == 1) {
                if (splesh_ads == 1) {
                    if (fb_splesh_inter_id_count == 1) {
                        fb_splesh_inter_id_count = 2;
                        FB_Inter_Splesh = new InterstitialAd(cont_ads, "" + FB_Inter1);
                    } else if (fb_splesh_inter_id_count == 2) {
                        fb_splesh_inter_id_count = 3;
                        FB_Inter_Splesh = new InterstitialAd(cont_ads, "" + FB_Inter2);
                    } else if (fb_splesh_inter_id_count == 3) {
                        fb_splesh_inter_id_count = 4;
                        FB_Inter_Splesh = new InterstitialAd(cont_ads, "" + FB_Inter3);
                    } else if (fb_splesh_inter_id_count == 4) {
                        fb_splesh_inter_id_count = 5;
                        FB_Inter_Splesh = new InterstitialAd(cont_ads, "" + FB_Inter4);
                    } else {
                        fb_splesh_inter_id_count = 6;
                        FB_Inter_Splesh = new InterstitialAd(cont_ads, "" + FB_Inter5);
                    }
                    InterstitialAdListener adListener = new InterstitialAdListener() {
                        @Override
                        public void onInterstitialDisplayed(Ad ad) {
                        }

                        @Override
                        public void onInterstitialDismissed(Ad ad) {

                            if (!only_inter) {
                                Interstial_Load(cont_ads);
                                Pre_Load_App_Open(cont_ads);
                            }

                        }

                        @Override
                        public void onError(Ad ad, AdError adError) {
                            FB_Inter_Splesh = null;
                            int aa = fb_splesh_inter_id_count - 1;
                            MyLog.e("splesh Load FB", "fail" + aa);
                            if (fb_splesh_inter_id_count == 6) {
                                if (Ads_Seq1.equals("FB")) {
                                    if (Ads_Seq2.equals("OFF")) {

                                        try {
                                            handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                                        } catch (Exception e) {

                                        }
                                        try {
                                            if (builder != null) {
                                                if (builder.isShowing()) {
                                                    builder.dismiss();
                                                }
                                            }
                                        } catch (final IllegalArgumentException e) {

                                        } catch (final Exception e) {
                                        } finally {

                                        }
                                    } else if (Ads_Seq2.equals("AC")) {
                                        Splash_Interstial_AC(builder, cont_ads);
                                    } else {
                                        Splash_Interstial_Tappx(builder, cont_ads);
                                    }
                                } else if (Ads_Seq1.equals("GL")) {
                                    Splash_Interstial_Google(builder, cont_ads);
                                } else if (Ads_Seq1.equals("AC")) {
                                    Splash_Interstial_AC(builder, cont_ads);
                                } else if (Ads_Seq1.equals("TX")) {
                                    Splash_Interstial_Tappx(builder, cont_ads);
                                } else if (Ads_Seq1.equals("OFF")) {
                                    try {
                                        handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                                    } catch (Exception e) {

                                    }
                                    try {
                                        if (builder != null) {
                                            if (builder.isShowing()) {
                                                builder.dismiss();
                                            }
                                        }
                                    } catch (final IllegalArgumentException e) {

                                    } catch (final Exception e) {
                                    } finally {

                                    }


                                } else {
                                    Splash_Interstial_Google(builder, cont_ads);
                                }
                            } else {
                                Splash_Interstial_FB(builder, cont_ads);
                            }
                        }


                        @Override
                        public void onAdLoaded(Ad ad) {
                            int aa = fb_splesh_inter_id_count - 1;
                            MyLog.e("splesh Load FB", "yes" + aa);
                            fb_splesh_inter_id_count = FB_setup_ads;
                            try {
                                handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                                if (Splesh_Timer) {

                                } else {
                                    FB_Inter_Splesh.show();
                                    final Handler handler = new Handler(Looper.getMainLooper());
                                    handler.postDelayed(new Runnable() {
                                        @Override
                                        public void run() {
                                            try {
                                                if (builder != null) {
                                                    if (builder.isShowing()) {
                                                        builder.dismiss();
                                                    }
                                                }
                                            } catch (final IllegalArgumentException e) {

                                            } catch (final Exception e) {
                                            } finally {

                                            }
                                        }
                                    }, 500);
                                }
                            } catch (Exception e) {

                            }


                        }

                        @Override
                        public void onAdClicked(Ad ad) {
                        }

                        @Override
                        public void onLoggingImpression(Ad ad) {
                        }
                    };
                    FB_Inter_Splesh.loadAd(
                            FB_Inter_Splesh.buildLoadAdConfig()
                                    .withAdListener(adListener)
                                    .build());
                } else {

                    try {
                        if (builder != null) {
                            if (builder.isShowing()) {
                                builder.dismiss();
                            }
                        }
                    } catch (final IllegalArgumentException e) {

                    } catch (final Exception e) {
                    } finally {

                    }
                }
            }


        } catch (Exception e) {

        }

    }

    public static void Splash_Interstial_Google(Dialog builder, Context cont_ads) {


        try {

            if (show_ads == 1) {

                if (only_inter) {
                    String Ad_inter_request_Id = Admob_Inter_ID3;
                    AdRequest adRequest = new AdRequest.Builder().build();
                    String google_id_floor = Google_SetUp_List_Custom.get(gogole_splesh_inter_id_count);
                    if (google_id_floor.equals("H")) {
                        if (google_id_exchange_H == 1) {
                            Ad_inter_request_Id = Admob_Inter_ID1;
                            google_id_exchange_H = 11;

                        } else {
                            Ad_inter_request_Id = Admob_Inter_ID11;
                            google_id_exchange_H = 1;
                        }
                    } else if (google_id_floor.equals("M")) {
                        if (google_id_exchange_M == 1) {
                            Ad_inter_request_Id = Admob_Inter_ID2;
                            google_id_exchange_M = 11;
                        } else {
                            Ad_inter_request_Id = Admob_Inter_ID22;
                            google_id_exchange_M = 1;
                        }
                    } else {
                        if (google_id_exchange_L == 1) {
                            Ad_inter_request_Id = Admob_Inter_ID3;
                            google_id_exchange_L = 11;
                        } else {
                            Ad_inter_request_Id = Admob_Inter_ID33;
                            google_id_exchange_L = 1;
                        }
                    }


                    com.google.android.gms.ads.interstitial.InterstitialAd.load(cont_ads, Ad_inter_request_Id, adRequest,
                            new InterstitialAdLoadCallback() {
                                @Override
                                public void onAdLoaded(@NonNull com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {
                                    try {
                                        MyLog.e("splesh Load GL", "yes");

                                        gogole_splesh_inter_id_count = 0;
                                        handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                                        if (Splesh_Timer) {

                                        } else {

                                            interstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                                @Override
                                                public void onAdClicked() {
                                                    super.onAdClicked();
                                                }

                                                @Override
                                                public void onAdDismissedFullScreenContent() {
                                                    super.onAdDismissedFullScreenContent();
                                                    Interstial_Load(cont_ads);
                                                    Pre_Load_App_Open(cont_ads);
                                                }

                                                @Override
                                                public void onAdFailedToShowFullScreenContent(@NonNull com.google.android.gms.ads.AdError adError) {
                                                    super.onAdFailedToShowFullScreenContent(adError);

                                                    gogole_splesh_inter_id_count = 0;
                                                    if (Ads_Seq1.equals("FB")) {
                                                        Splash_Interstial_FB(builder, cont_ads);
                                                    } else if (Ads_Seq1.equals("GL")) {
                                                        if (Ads_Seq2.equals("OFF")) {
                                                            try {
                                                                handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                                                            } catch (Exception e) {

                                                            }
                                                            try {
                                                                if (builder != null) {
                                                                    if (builder.isShowing()) {
                                                                        builder.dismiss();
                                                                    }
                                                                }
                                                            } catch (final IllegalArgumentException e) {

                                                            } catch (final Exception e) {
                                                            } finally {

                                                            }

                                                        } else if (Ads_Seq2.equals("AC")) {
                                                            Splash_Interstial_AC(builder, cont_ads);
                                                        } else {
                                                            Splash_Interstial_Tappx(builder, cont_ads);
                                                        }
                                                    } else if (Ads_Seq1.equals("AC")) {
                                                        Splash_Interstial_AC(builder, cont_ads);
                                                    } else if (Ads_Seq1.equals("OFF")) {
                                                        try {
                                                            handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                                                        } catch (Exception e) {

                                                        }
                                                        try {
                                                            if (builder != null) {
                                                                if (builder.isShowing()) {
                                                                    builder.dismiss();
                                                                }
                                                            }
                                                        } catch (final IllegalArgumentException e) {

                                                        } catch (final Exception e) {
                                                        } finally {

                                                        }


                                                    } else {
                                                        Splash_Interstial_Tappx(builder, cont_ads);
                                                    }


                                                }

                                                @Override
                                                public void onAdShowedFullScreenContent() {
                                                    super.onAdShowedFullScreenContent();
                                                }

                                                @Override
                                                public void onAdImpression() {
                                                    super.onAdImpression();
                                                }
                                            });


                                            interstitialAd.show((Activity) cont_ads);
                                            Handler handler = new Handler(Looper.getMainLooper());
                                            handler.postDelayed(new Runnable() {
                                                @Override
                                                public void run() {
                                                    try {
                                                        if (builder != null) {
                                                            if (builder.isShowing()) {
                                                                builder.dismiss();
                                                            }
                                                        }
                                                    } catch (final IllegalArgumentException e) {

                                                    } catch (final Exception e) {
                                                    } finally {

                                                    }
                                                }
                                            }, 500);
                                        }


                                    } catch (Exception e) {
                                        try {
                                            if (builder != null) {
                                                if (builder.isShowing()) {
                                                    builder.dismiss();
                                                }
                                            }
                                        } catch (final IllegalArgumentException e1) {

                                        } catch (final Exception e1) {
                                        } finally {

                                        }
                                    }

                                }

                                @Override
                                public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                                    MyLog.e("splesh GL FailedToLoad", "" + loadAdError.getMessage());

                                    int aa = gogole_splesh_inter_id_count + 1;
                                    if (aa == Google_SetUp_List_Custom.size()) {
                                        gogole_splesh_inter_id_count = 0;
                                        if (Ads_Seq1.equals("FB")) {
                                            Splash_Interstial_FB(builder, cont_ads);
                                        } else if (Ads_Seq1.equals("GL")) {
                                            if (Ads_Seq2.equals("OFF")) {
                                                try {
                                                    handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                                                } catch (Exception e) {

                                                }
                                                try {
                                                    if (builder != null) {
                                                        if (builder.isShowing()) {
                                                            builder.dismiss();
                                                        }
                                                    }
                                                } catch (final IllegalArgumentException e) {

                                                } catch (final Exception e) {
                                                } finally {

                                                }

                                            } else if (Ads_Seq2.equals("AC")) {
                                                Splash_Interstial_AC(builder, cont_ads);
                                            } else {
                                                Splash_Interstial_Tappx(builder, cont_ads);
                                            }
                                        } else if (Ads_Seq1.equals("AC")) {
                                            Splash_Interstial_AC(builder, cont_ads);
                                        } else if (Ads_Seq1.equals("OFF")) {
                                            try {
                                                handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                                            } catch (Exception e) {

                                            }
                                            try {
                                                if (builder != null) {
                                                    if (builder.isShowing()) {
                                                        builder.dismiss();
                                                    }
                                                }
                                            } catch (final IllegalArgumentException e) {

                                            } catch (final Exception e) {
                                            } finally {

                                            }


                                        } else {
                                            Splash_Interstial_Tappx(builder, cont_ads);
                                        }
                                    } else {
                                        gogole_splesh_inter_id_count = gogole_splesh_inter_id_count + 1;
                                        Splash_Interstial_Google(builder, cont_ads);
                                    }
                                }
                            });
                } else if (Splesh_AO == 1) {
                    String Ad_AppOpen_request_Id;
                    String google_id_floor = Google_SetUp_List_Custom.get(gogole_AppOpen_id_count_splesh);

                    if (google_id_floor.equals("H")) {
                        if (splash_google_id_exchange_H == 1) {
                            Ad_AppOpen_request_Id = Admob_AppOpen_ID1;
                            splash_google_id_exchange_H = 11;
                        } else {
                            Ad_AppOpen_request_Id = Admob_AppOpen_ID11;
                            splash_google_id_exchange_H = 1;
                        }
                    } else if (google_id_floor.equals("M")) {
                        if (splash_google_id_exchange_M == 1) {
                            Ad_AppOpen_request_Id = Admob_AppOpen_ID2;
                            splash_google_id_exchange_M = 11;
                        } else {
                            Ad_AppOpen_request_Id = Admob_AppOpen_ID22;
                            splash_google_id_exchange_M = 1;
                        }
                    } else {
                        if (splash_google_id_exchange_L == 1) {
                            Ad_AppOpen_request_Id = Admob_AppOpen_ID3;
                            splash_google_id_exchange_L = 11;
                        } else {
                            Ad_AppOpen_request_Id = Admob_AppOpen_ID33;
                            splash_google_id_exchange_L = 1;
                        }
                    }

                    AdRequest request = new AdRequest.Builder().build();
                    AppOpenAd.load(
                            cont_ads,
                            Ad_AppOpen_request_Id,
                            request,
                            AppOpenAd.APP_OPEN_AD_ORIENTATION_PORTRAIT,
                            new AppOpenAd.AppOpenAdLoadCallback() {

                                @Override
                                public void onAdLoaded(AppOpenAd ad) {
                                    Splash_appOpenAd = ad;
                                    MyLog.e("splesh Load ao GL", "yes");
                                    try {
                                        handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                                        if (Splesh_Timer) {

                                        } else {

                                            ad.setFullScreenContentCallback(new FullScreenContentCallback() {
                                                @Override
                                                public void onAdDismissedFullScreenContent() {
                                                    super.onAdDismissedFullScreenContent();
                                                    if (!only_inter) {
                                                        Interstial_Load(cont_ads);
                                                        Pre_Load_App_Open(cont_ads);
                                                    }
                                                }

                                                @Override
                                                public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                                                    super.onAdFailedToShowFullScreenContent(adError);
                                                    if (!only_inter) {
                                                        Interstial_Load(cont_ads);
                                                        Pre_Load_App_Open(cont_ads);
                                                    }
                                                }

                                            });

                                            ad.show((Activity) cont_ads);

                                            Handler handler = new Handler(Looper.getMainLooper());
                                            handler.postDelayed(new Runnable() {
                                                @Override
                                                public void run() {
                                                    try {
                                                        if (builder != null) {
                                                            if (builder.isShowing()) {
                                                                builder.dismiss();
                                                            }
                                                        }
                                                    } catch (final IllegalArgumentException e) {

                                                    } catch (final Exception e) {
                                                    } finally {

                                                    }
                                                }
                                            }, 500);
                                        }

                                    } catch (Exception e) {
                                        try {
                                            if (builder != null) {
                                                if (builder.isShowing()) {
                                                    builder.dismiss();
                                                }
                                            }
                                        } catch (final IllegalArgumentException ee) {

                                        } catch (final Exception ee) {
                                        } finally {

                                        }
                                    }


                                }

                                @Override
                                public void onAdFailedToLoad(LoadAdError loadAdError) {
                                    Splash_appOpenAd = null;

                                    MyLog.e("splesh Load ao GL", "error" + loadAdError.getMessage());

                                    int aa = gogole_AppOpen_id_count_splesh + 1;
                                    if (aa == Google_SetUp_List_Custom.size()) {
                                        gogole_AppOpen_id_count_splesh = 0;

                                        if (Ads_Seq1.equals("FB")) {
                                            Splash_Interstial_FB(builder, cont_ads);
                                        } else if (Ads_Seq1.equals("GL")) {
                                            if (Ads_Seq2.equals("OFF")) {
                                                try {
                                                    handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                                                } catch (Exception e) {

                                                }
                                                try {
                                                    if (builder != null) {
                                                        if (builder.isShowing()) {
                                                            builder.dismiss();
                                                        }
                                                    }
                                                } catch (final IllegalArgumentException e) {

                                                } catch (final Exception e) {
                                                } finally {

                                                }

                                            } else if (Ads_Seq2.equals("AC")) {
                                                Splash_Interstial_AC(builder, cont_ads);
                                            } else {
                                                Splash_Interstial_Tappx(builder, cont_ads);
                                            }
                                        } else if (Ads_Seq1.equals("AC")) {
                                            Splash_Interstial_AC(builder, cont_ads);
                                        } else if (Ads_Seq1.equals("OFF")) {
                                            try {
                                                handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                                            } catch (Exception e) {

                                            }
                                            try {
                                                if (builder != null) {
                                                    if (builder.isShowing()) {
                                                        builder.dismiss();
                                                    }
                                                }
                                            } catch (final IllegalArgumentException e) {

                                            } catch (final Exception e) {
                                            } finally {

                                            }

                                        } else {
                                            Splash_Interstial_Tappx(builder, cont_ads);
                                        }
                                    } else {
                                        gogole_AppOpen_id_count_splesh = gogole_AppOpen_id_count_splesh + 1;
                                        Splash_Interstial_Google(builder, cont_ads);
                                    }

                                }
                            });


                } else {
                    String Ad_inter_request_Id = Admob_Inter_ID3;
                    AdRequest adRequest = new AdRequest.Builder().build();
                    String google_id_floor = Google_SetUp_List_Custom.get(gogole_splesh_inter_id_count);
                    if (google_id_floor.equals("H")) {
                        if (google_id_exchange_H == 1) {
                            Ad_inter_request_Id = Admob_Inter_ID1;
                            google_id_exchange_H = 11;

                        } else {
                            Ad_inter_request_Id = Admob_Inter_ID11;
                            google_id_exchange_H = 1;
                        }
                    } else if (google_id_floor.equals("M")) {
                        if (google_id_exchange_M == 1) {
                            Ad_inter_request_Id = Admob_Inter_ID2;
                            google_id_exchange_M = 11;
                        } else {
                            Ad_inter_request_Id = Admob_Inter_ID22;
                            google_id_exchange_M = 1;
                        }
                    } else {
                        if (google_id_exchange_L == 1) {
                            Ad_inter_request_Id = Admob_Inter_ID3;
                            google_id_exchange_L = 11;
                        } else {
                            Ad_inter_request_Id = Admob_Inter_ID33;
                            google_id_exchange_L = 1;
                        }
                    }


                    com.google.android.gms.ads.interstitial.InterstitialAd.load(cont_ads, Ad_inter_request_Id, adRequest,
                            new InterstitialAdLoadCallback() {
                                @Override
                                public void onAdLoaded(@NonNull com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {
                                    try {
                                        MyLog.e("splesh Load GL", "yes");

                                        gogole_splesh_inter_id_count = 0;
                                        handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                                        if (Splesh_Timer) {

                                        } else {

                                            interstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                                @Override
                                                public void onAdClicked() {
                                                    super.onAdClicked();
                                                }

                                                @Override
                                                public void onAdDismissedFullScreenContent() {
                                                    super.onAdDismissedFullScreenContent();
                                                    Interstial_Load(cont_ads);
                                                    Pre_Load_App_Open(cont_ads);
                                                }

                                                @Override
                                                public void onAdFailedToShowFullScreenContent(@NonNull com.google.android.gms.ads.AdError adError) {
                                                    super.onAdFailedToShowFullScreenContent(adError);

                                                    gogole_splesh_inter_id_count = 0;
                                                    if (Ads_Seq1.equals("FB")) {
                                                        Splash_Interstial_FB(builder, cont_ads);
                                                    } else if (Ads_Seq1.equals("GL")) {
                                                        if (Ads_Seq2.equals("OFF")) {
                                                            try {
                                                                handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                                                            } catch (Exception e) {

                                                            }
                                                            try {
                                                                if (builder != null) {
                                                                    if (builder.isShowing()) {
                                                                        builder.dismiss();
                                                                    }
                                                                }
                                                            } catch (final IllegalArgumentException e) {

                                                            } catch (final Exception e) {
                                                            } finally {

                                                            }

                                                        } else if (Ads_Seq2.equals("AC")) {
                                                            Splash_Interstial_AC(builder, cont_ads);
                                                        } else {
                                                            Splash_Interstial_Tappx(builder, cont_ads);
                                                        }
                                                    } else if (Ads_Seq1.equals("AC")) {
                                                        Splash_Interstial_AC(builder, cont_ads);
                                                    } else if (Ads_Seq1.equals("OFF")) {
                                                        try {
                                                            handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                                                        } catch (Exception e) {

                                                        }
                                                        try {
                                                            if (builder != null) {
                                                                if (builder.isShowing()) {
                                                                    builder.dismiss();
                                                                }
                                                            }
                                                        } catch (final IllegalArgumentException e) {

                                                        } catch (final Exception e) {
                                                        } finally {

                                                        }


                                                    } else {
                                                        Splash_Interstial_Tappx(builder, cont_ads);
                                                    }


                                                }

                                                @Override
                                                public void onAdShowedFullScreenContent() {
                                                    super.onAdShowedFullScreenContent();
                                                }

                                                @Override
                                                public void onAdImpression() {
                                                    super.onAdImpression();
                                                }
                                            });


                                            interstitialAd.show((Activity) cont_ads);
                                            Handler handler = new Handler(Looper.getMainLooper());
                                            handler.postDelayed(new Runnable() {
                                                @Override
                                                public void run() {
                                                    try {
                                                        if (builder != null) {
                                                            if (builder.isShowing()) {
                                                                builder.dismiss();
                                                            }
                                                        }
                                                    } catch (final IllegalArgumentException e) {

                                                    } catch (final Exception e) {
                                                    } finally {

                                                    }
                                                }
                                            }, 500);
                                        }


                                    } catch (Exception e) {
                                        try {
                                            if (builder != null) {
                                                if (builder.isShowing()) {
                                                    builder.dismiss();
                                                }
                                            }
                                        } catch (final IllegalArgumentException e1) {

                                        } catch (final Exception e1) {
                                        } finally {

                                        }
                                    }

                                }

                                @Override
                                public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                                    MyLog.e("splesh GL FailedToLoad", "" + loadAdError.getMessage());

                                    int aa = gogole_splesh_inter_id_count + 1;
                                    if (aa == Google_SetUp_List_Custom.size()) {
                                        gogole_splesh_inter_id_count = 0;
                                        if (Ads_Seq1.equals("FB")) {
                                            Splash_Interstial_FB(builder, cont_ads);
                                        } else if (Ads_Seq1.equals("GL")) {
                                            if (Ads_Seq2.equals("OFF")) {
                                                try {
                                                    handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                                                } catch (Exception e) {

                                                }
                                                try {
                                                    if (builder != null) {
                                                        if (builder.isShowing()) {
                                                            builder.dismiss();
                                                        }
                                                    }
                                                } catch (final IllegalArgumentException e) {

                                                } catch (final Exception e) {
                                                } finally {

                                                }

                                            } else if (Ads_Seq2.equals("AC")) {
                                                Splash_Interstial_AC(builder, cont_ads);
                                            } else {
                                                Splash_Interstial_Tappx(builder, cont_ads);
                                            }
                                        } else if (Ads_Seq1.equals("AC")) {
                                            Splash_Interstial_AC(builder, cont_ads);
                                        } else if (Ads_Seq1.equals("OFF")) {
                                            try {
                                                handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                                            } catch (Exception e) {

                                            }
                                            try {
                                                if (builder != null) {
                                                    if (builder.isShowing()) {
                                                        builder.dismiss();
                                                    }
                                                }
                                            } catch (final IllegalArgumentException e) {

                                            } catch (final Exception e) {
                                            } finally {

                                            }


                                        } else {
                                            Splash_Interstial_Tappx(builder, cont_ads);
                                        }
                                    } else {
                                        gogole_splesh_inter_id_count = gogole_splesh_inter_id_count + 1;
                                        Splash_Interstial_Google(builder, cont_ads);
                                    }
                                }
                            });

                }


            }


        } catch (Exception e) {

        }
    }

    public static void Splash_Interstial_AC(Dialog builder, Context cont_ads) {

        Splash_Interstial_Tappx(builder, cont_ads);

    }

    public static void Splash_Interstial_Tappx(final Dialog builder, final Context cont_ads) {


        if (Ads_Seq.equals("TX")) {


            final Handler handler = new Handler(Looper.getMainLooper());
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    try {
                        handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                        if (Splesh_Timer) {

                        } else {
                            StartAppAd.showAd(cont_ads);
                        }
                    } catch (Exception e) {

                    }

                    try {
                        Handler handler = new Handler(Looper.getMainLooper());
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    if (builder != null) {
                                        if (builder.isShowing()) {
                                            builder.dismiss();
                                        }
                                    }
                                } catch (final IllegalArgumentException e) {

                                } catch (final Exception e) {
                                } finally {

                                }
                            }
                        }, 500);
                    } catch (Exception e) {

                    }
                    if (!only_inter) {
                        Interstial_Load(cont_ads);
                        Pre_Load_App_Open(cont_ads);
                    }


                }
            }, 2000);

            return;
        }


        try {
            handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
            if (Splesh_Timer) {

            } else {
                StartAppAd.showAd(cont_ads);
            }
        } catch (Exception e) {

        }

        try {
            Handler handler = new Handler(Looper.getMainLooper());
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    try {
                        if (builder != null) {
                            if (builder.isShowing()) {
                                builder.dismiss();
                            }
                        }
                    } catch (final IllegalArgumentException e) {

                    } catch (final Exception e) {
                    } finally {

                    }
                }
            }, 500);
        } catch (Exception e) {

        }
        if (!only_inter) {
            Interstial_Load(cont_ads);
            Pre_Load_App_Open(cont_ads);
        }


    }

    public static void Interstial(Context cont_ads) {


        try {

            only_inter = true;

            CustomProgressDialogueInter builder = new CustomProgressDialogueInter(cont_ads, "Loading Ads . . .", "Wait While Loading Ads, Sorry for Inconvenience and Thank You for Support and Waiting.", BGColor, TitleTextColor);
            builder.show();

            if (isNetworkConnected(cont_ads)) {
                if (show_ads == 1) {
                    if (i_nooff == 0) {
                        try {
                            handler_splesh_counter.removeCallbacks(runnable_splesh_counter);
                        } catch (Exception e) {

                        }

                        try {
                            if (builder != null) {
                                if (builder.isShowing()) {
                                    builder.dismiss();
                                }
                            }
                        } catch (final IllegalArgumentException e) {

                        } catch (final Exception e) {
                        } finally {

                        }

                        return;
                    }
                    if (Ads_Seq.equals("FB")) {
                        Splash_Interstial_FB(builder, cont_ads);
                    } else if (Ads_Seq.equals("GL")) {
                        Splash_Interstial_Google(builder, cont_ads);
                    } else if (Ads_Seq.equals("AC")) {
                        Splash_Interstial_AC(builder, cont_ads);
                    } else if (Ads_Seq.equals("TX")) {
                        Splash_Interstial_Tappx(builder, cont_ads);
                    } else {
                        Splash_Interstial_Google(builder, cont_ads);
                    }
                } else {

                    try {
                        if (builder != null) {
                            if (builder.isShowing()) {
                                builder.dismiss();
                            }
                        }
                    } catch (final IllegalArgumentException e) {

                    } catch (final Exception e) {
                    } finally {

                    }
                }

            } else {


                try {
                    if (builder != null) {
                        if (builder.isShowing()) {
                            builder.dismiss();
                        }
                    }
                } catch (final IllegalArgumentException e) {

                } catch (final Exception e) {
                } finally {

                }
            }


        } catch (Exception e) {

        }

    }

    public static void Interstial_Load(Context cont_ads) {


        Log.e("Interstial_Load", "call");
        Log.e("Ads_Seq", "" + Ads_Seq);
        Log.e("Ads_Seq", "" + Ads_Seq1);
        Log.e("Ads_Seq", "" + Ads_Seq2);


        try {
            if (show_ads == 1) {
                if (i_nooff == 0) {
                    return;
                }

                if (Extra5.equals("1")) {

                    return;
                }

                if (Ads_Seq.equals("FB")) {
                    Interstial_Load_FB(cont_ads);
                } else if (Ads_Seq.equals("GL")) {
                    Interstial_Load_Google(cont_ads);
                } else if (Ads_Seq.equals("AC")) {

                } else if (Ads_Seq.equals("TX")) {

                } else {
                    Interstial_Load_Google(cont_ads);
                }
            }

        } catch (Exception e) {

        }

    }

    public static void Pre_Interstial_Show(Context cont_ads) {
        try {

            if (For_Approval_Setup.equals("1")) {
                Interstial_Counted(cont_ads);
                return;
            }


            if (Extra5.equals("1")) {
                Interstial(cont_ads);
                return;
            }

            if (show_ads == 1) {

                if (i_nooff == 0) {
                    return;
                }

                if (Ads_Seq.equals("AC")) {
                    Interstial_Show_AC(cont_ads);
                    return;
                } else if (Ads_Seq.equals("TX")) {
                    Interstial_Show_Tappx(cont_ads);
                    return;
                }


                if (FB_Inter != null) {
                    if (FB_Inter.isAdLoaded()) {
                        try {
                            FB_Inter.show();
                            return;
                        } catch (Exception e) {

                        }
                    }
                }

                if (i_ao_ex == 2) {
                    if (Pre_appOpenAd != null) {
                        if (!isLoadingAd) {
                            try {
                                Pre_appOpenAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {
                                        super.onAdDismissedFullScreenContent();
                                        Pre_appOpenAd = null;
                                        isLoadingAd = false;
                                        Pre_Load_App_Open(cont_ads);
                                    }

                                    @Override
                                    public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                                        super.onAdFailedToShowFullScreenContent(adError);
                                        Pre_appOpenAd = null;
                                        isLoadingAd = false;
                                        Pre_Load_App_Open(cont_ads);
                                        Pre_Interstial_Show_FailToAppOpen(cont_ads);

                                        if (!Inter_loading_progress) {
                                            Interstial_Load(cont_ads);
                                        }

                                    }

                                });

                                try {
                                    Pre_appOpenAd.show((Activity) cont_ads);
                                } catch (Exception e) {

                                }
                                return;
                            } catch (Exception e) {

                            }
                        }
                    }
                } else {
                    if (Google_Inter != null) {

                        try {
                            Google_Inter.show((Activity) cont_ads);
                            return;
                        } catch (Exception e) {

                        }

                    }
                }

                if (i_ao_ex == 2) {
                    if (FB_Inter_appopen != null) {
                        if (FB_Inter_appopen.isAdLoaded()) {
                            try {
                                FB_Inter_appopen.show();
                                return;
                            } catch (Exception e) {

                            }
                        }
                    }
                }

                if (!Inter_loading_progress) {
                    Interstial_Load(cont_ads);
                }

                if (Ads_Seq1.equals("AC")) {
                    Interstial_Show_AC(cont_ads);
                    return;
                } else if (Ads_Seq1.equals("TX")) {
                    Interstial_Show_Tappx(cont_ads);
                    return;
                }

                if (Ads_Seq2.equals("AC")) {
                    Interstial_Show_AC(cont_ads);
                    return;
                } else if (Ads_Seq2.equals("TX")) {
                    Interstial_Show_Tappx(cont_ads);
                    return;
                }

            }

        } catch (Exception e) {

        }
    }

    public static void Pre_Interstial_Show_FailToAppOpen(Context cont_ads) {
        try {

            if (For_Approval_Setup.equals("1")) {
                Interstial_Counted(cont_ads);
                return;
            }


            if (Extra5.equals("1")) {
                Interstial(cont_ads);
                return;
            }

            if (show_ads == 1) {

                if (i_nooff == 0) {
                    return;
                }

                if (Ads_Seq.equals("AC")) {
                    Interstial_Show_AC(cont_ads);
                    return;
                } else if (Ads_Seq.equals("TX")) {
                    Interstial_Show_Tappx(cont_ads);
                    return;
                }

                if (FB_Inter != null) {
                    if (FB_Inter.isAdLoaded()) {
                        try {
                            FB_Inter.show();
                            return;
                        } catch (Exception e) {

                        }
                    }
                }


                if (Google_Inter != null) {

                    try {
                        Google_Inter.show((Activity) cont_ads);
                        return;
                    } catch (Exception e) {

                    }
                }


                if (i_ao_ex == 2) {
                    if (FB_Inter_appopen != null) {
                        if (FB_Inter_appopen.isAdLoaded()) {
                            try {
                                FB_Inter_appopen.show();
                                return;
                            } catch (Exception e) {

                            }
                        }
                    }
                }

                if (!Inter_loading_progress) {
                    Interstial_Load(cont_ads);
                }


            }

        } catch (Exception e) {

        }
    }

    public static void Increase_Ads(Context cont_ads) {

        try {

            if (show_ads == 1) {

                if (increase_ads == 1) {
                    try {
                        Pre_Interstial_Show(cont_ads);

                    } catch (Exception e) {

                    }
                }
            }

        } catch (Exception e) {

        }
    }

    public static void Interstial_Counted(Context cont_ads) {


        try {

            if (show_ads == 1) {

                if (Counter_Ads_SetUp == 0) {
                    return;
                }

                int counter_ads = SharePref.getCounter_Ads(cont_ads);

                if (counter_ads >= Counter_Ads_SetUp) {

                    SharePref.setCounter_Ads(cont_ads, 1);

                    try {
                        Pre_Interstial_Show(cont_ads);

                    } catch (Exception e) {

                    }

                } else {
                    counter_ads = counter_ads + 1;
                    SharePref.setCounter_Ads(cont_ads, counter_ads);

                }
            }

        } catch (Exception e) {

        }
    }

    public static void Interstial_Load_FB(Context cont_ads) {

        try {
            if (show_ads == 1) {
                Inter_loading_progress = true;

                if (fb_inter_id_count == 1) {
                    fb_inter_id_count = 2;
                    FB_Inter = new InterstitialAd(cont_ads, "" + FB_Inter1);
                } else if (fb_inter_id_count == 2) {
                    fb_inter_id_count = 3;
                    FB_Inter = new InterstitialAd(cont_ads, "" + FB_Inter2);
                } else if (fb_inter_id_count == 3) {
                    fb_inter_id_count = 4;
                    FB_Inter = new InterstitialAd(cont_ads, "" + FB_Inter3);
                } else if (fb_inter_id_count == 4) {
                    fb_inter_id_count = 5;
                    FB_Inter = new InterstitialAd(cont_ads, "" + FB_Inter4);
                } else {
                    fb_inter_id_count = 6;
                    FB_Inter = new InterstitialAd(cont_ads, "" + FB_Inter5);
                }
                InterstitialAdListener adListener = new InterstitialAdListener() {
                    @Override
                    public void onInterstitialDisplayed(Ad ad) {
                    }

                    @Override
                    public void onInterstitialDismissed(Ad ad) {
                        Interstial_Load(cont_ads);
                    }

                    @Override
                    public void onError(Ad ad, AdError adError) {
                        FB_Inter = null;
                        int aa = fb_inter_id_count - 1;
                        MyLog.e("Load inter FB", "fail" + aa);
                        if (fb_inter_id_count == 6) {

                            fb_inter_id_count = FB_setup_ads;

                            if (Ads_Seq1.equals("FB")) {

                            } else if (Ads_Seq1.equals("GL")) {
                                Interstial_Load_Google(cont_ads);
                            } else if (Ads_Seq1.equals("AC")) {

                            } else if (Ads_Seq1.equals("TX")) {

                            } else {
                                Interstial_Load_Google(cont_ads);
                            }
                        } else {
                            Interstial_Load_FB(cont_ads);
                        }
                    }

                    @Override
                    public void onAdLoaded(Ad ad) {
                        MyLog.e("Load inter FB", "yes");

                        Inter_loading_progress = false;
                        fb_inter_id_count = FB_setup_ads;
                    }

                    @Override
                    public void onAdClicked(Ad ad) {
                    }

                    @Override
                    public void onLoggingImpression(Ad ad) {
                    }
                };
                FB_Inter.loadAd(
                        FB_Inter.buildLoadAdConfig()
                                .withAdListener(adListener)
                                .build());

            }

        } catch (Exception e) {

        }


    }

    public static void Interstial_Load_Google(Context cont_ads) {

        try {
            if (show_ads == 1) {

                Inter_loading_progress = true;
                String Ad_inter_request_Id = Admob_Inter_ID3;
                AdRequest adRequest = new AdRequest.Builder().build();
                String google_id_floor = Google_SetUp_List_Custom.get(gogole_inter_id_count);
                if (google_id_floor.equals("H")) {
                    if (google_id_exchange_H == 1) {
                        Ad_inter_request_Id = Admob_Inter_ID1;
                        google_id_exchange_H = 11;
                    } else {
                        Ad_inter_request_Id = Admob_Inter_ID11;
                        google_id_exchange_H = 1;
                    }
                } else if (google_id_floor.equals("M")) {
                    if (google_id_exchange_M == 1) {
                        Ad_inter_request_Id = Admob_Inter_ID2;
                        google_id_exchange_M = 11;
                    } else {
                        Ad_inter_request_Id = Admob_Inter_ID22;
                        google_id_exchange_M = 1;
                    }
                } else {
                    if (google_id_exchange_L == 1) {
                        Ad_inter_request_Id = Admob_Inter_ID3;
                        google_id_exchange_L = 11;
                    } else {
                        Ad_inter_request_Id = Admob_Inter_ID33;
                        google_id_exchange_L = 1;
                    }
                }

                com.google.android.gms.ads.interstitial.InterstitialAd.load(cont_ads, Ad_inter_request_Id, adRequest,
                        new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {


                                MyLog.e("Load inter GL", "yes");
                                Inter_loading_progress = false;
                                gogole_inter_id_count = 0;

                                Google_Inter = interstitialAd;

                                Google_Inter.setFullScreenContentCallback(new FullScreenContentCallback() {
                                    @Override
                                    public void onAdClicked() {
                                        super.onAdClicked();
                                    }

                                    @Override
                                    public void onAdDismissedFullScreenContent() {
                                        super.onAdDismissedFullScreenContent();

                                        Interstial_Load(cont_ads);
                                    }

                                    @Override
                                    public void onAdFailedToShowFullScreenContent(@NonNull com.google.android.gms.ads.AdError adError) {
                                        super.onAdFailedToShowFullScreenContent(adError);
                                        Interstial_Load(cont_ads);
                                    }

                                    @Override
                                    public void onAdImpression() {
                                        super.onAdImpression();
                                    }

                                    @Override
                                    public void onAdShowedFullScreenContent() {
                                        super.onAdShowedFullScreenContent();
                                    }
                                });


                            }

                            @Override
                            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {

                                MyLog.e("Load inter GL", " fail eC=" + loadAdError.getMessage());

                                Google_Inter = null;
                                int aa = gogole_inter_id_count + 1;
                                if (aa == Google_SetUp_List_Custom.size()) {
                                    gogole_inter_id_count = 0;
                                    if (Ads_Seq1.equals("FB")) {
                                        Interstial_Load_FB(cont_ads);
                                    } else if (Ads_Seq1.equals("GL")) {

                                    } else if (Ads_Seq1.equals("AC")) {

                                    } else if (Ads_Seq1.equals("TX")) {

                                    } else {

                                    }
                                } else {
                                    gogole_inter_id_count = gogole_inter_id_count + 1;
                                    Interstial_Load_Google(cont_ads);
                                }
                            }
                        });


            }

        } catch (Exception e) {

        }
    }

    public static void Interstial_Show_AC(Context cont_ads) {
        Interstial_Show_Tappx(cont_ads);
    }

    public static void Interstial_Show_Tappx(Context cont_ads) {
        StartAppAd.showAd(cont_ads);
    }

    public static void onDobuleBackPressed(Context cont_ads) {

        try {

            if (doubleBackToExitPressedOnce) {


                System.exit(0);


            } else {

                Toast.makeText(cont_ads, "Press Back Again to Exit",
                        Toast.LENGTH_SHORT).show();

                doubleBackToExitPressedOnce = true;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        doubleBackToExitPressedOnce = false;
                    }
                }, 2000);

            }
        } catch (Exception e) {

        }
    }

    public static void Pre_Load_App_Open(Context cont_ads) {
        try {


            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    try {
                        if (Loading_Data == 1 || Loading_Data == 0) {

                            if (show_ads == 0) {

                            } else {
                                String Ad_AppOpen_request_Id;
                                String google_id_floor = Google_SetUp_List_Custom.get(gogole_AppOpen_id_count_pre);

                                if (google_id_floor.equals("H")) {
                                    if (AppOpen_google_id_exchange_H == 1) {
                                        Ad_AppOpen_request_Id = Admob_AppOpen_ID1;
                                        AppOpen_google_id_exchange_H = 11;
                                    } else {
                                        Ad_AppOpen_request_Id = Admob_AppOpen_ID11;
                                        AppOpen_google_id_exchange_H = 1;
                                    }
                                } else if (google_id_floor.equals("M")) {
                                    if (AppOpen_google_id_exchange_M == 1) {
                                        Ad_AppOpen_request_Id = Admob_AppOpen_ID2;
                                        AppOpen_google_id_exchange_M = 11;
                                    } else {
                                        Ad_AppOpen_request_Id = Admob_AppOpen_ID22;
                                        AppOpen_google_id_exchange_M = 1;
                                    }
                                } else {
                                    if (AppOpen_google_id_exchange_L == 1) {
                                        Ad_AppOpen_request_Id = Admob_AppOpen_ID3;
                                        AppOpen_google_id_exchange_L = 11;
                                    } else {
                                        Ad_AppOpen_request_Id = Admob_AppOpen_ID33;
                                        AppOpen_google_id_exchange_L = 1;
                                    }
                                }


                                isLoadingAd = true;
                                AdRequest request = new AdRequest.Builder().build();
                                AppOpenAd.load(
                                        cont_ads,
                                        Ad_AppOpen_request_Id,
                                        request,
                                        AppOpenAd.APP_OPEN_AD_ORIENTATION_PORTRAIT,
                                        new AppOpenAd.AppOpenAdLoadCallback() {

                                            @Override
                                            public void onAdLoaded(AppOpenAd ad) {

                                                Log.e("onAdLoaded", "onAdLoaded");
                                                Pre_appOpenAd = ad;
                                                isLoadingAd = false;
                                            }

                                            @Override
                                            public void onAdFailedToLoad(LoadAdError loadAdError) {


                                                Log.e("onAdFailedToLoad", "onAdFailedToLoad");
                                                Pre_appOpenAd = null;


                                                int aa = gogole_AppOpen_id_count_pre + 1;
                                                if (aa == Google_SetUp_List_Custom.size()) {
                                                    gogole_AppOpen_id_count_pre = 0;
                                                    isLoadingAd = false;

                                                    Interstial_Load_FB_appopen(cont_ads);

                                                } else {
                                                    gogole_AppOpen_id_count_pre = gogole_AppOpen_id_count_pre + 1;
                                                    Pre_Load_App_Open(cont_ads);
                                                }

                                            }
                                        });
                            }
                        } else {
                            handler.postDelayed(this, 1000);
                        }
                    } catch (Exception e) {
                    }
                }
            }, 500);
        } catch (Exception e) {

        }

    }

    public static void AppOpen_Show(Activity cont_ads) {


        try {

            if (For_Approval_Setup.equals("1")) {
                return;
            }

            if (show_ads == 1) {


                if (AppOpen_Ads_SetUp == 0) {

                    return;
                }

                if (Ads_Seq.equals("AC")) {
                    Interstial_Show_AC(cont_ads);
                    return;
                } else if (Ads_Seq.equals("TX")) {
                    Interstial_Show_Tappx(cont_ads);
                    return;
                }
                if (Ads_Seq.equals("FB")) {
                    if (FB_Inter != null) {
                        if (FB_Inter.isAdLoaded()) {
                            try {
                                FB_Inter.show();
                                return;
                            } catch (Exception e) {

                            }

                        }
                    }
                }


                if (AppOpen_Ads_SetUp == 1) {
                    if (Ads_Seq.equals("GL") || Ads_Seq1.equals("GL")) {
                        if (Pre_appOpenAd != null) {
                            if (!isLoadingAd) {
                                try {
                                    Pre_appOpenAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                        @Override
                                        public void onAdDismissedFullScreenContent() {
                                            super.onAdDismissedFullScreenContent();

                                            Log.e("onAdDismissed", "onAdDismissedFullScreenContent: ");
                                            Pre_appOpenAd = null;
                                            isLoadingAd = false;
                                            Pre_Load_App_Open(cont_ads);

                                        }

                                        @Override
                                        public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                                            super.onAdFailedToShowFullScreenContent(adError);

                                            Log.e("onAdFailedToShow", "onAdFailedToShowFullScreenContent: " + adError.getMessage());
                                            Pre_appOpenAd = null;
                                            isLoadingAd = false;
                                            Pre_Load_App_Open(cont_ads);
                                            Pre_Interstial_Show_FailToAppOpen(cont_ads);

                                        }

                                    });
                                    Pre_appOpenAd.show(cont_ads);
                                    return;
                                } catch (Exception e) {

                                }

                            }
                        }
                    }

                }

                if (AppOpen_Ads_SetUp == 2) {

                    Pre_Interstial_Show(cont_ads);
                    return;
                }


                if (Ads_Seq1.equals("FB")) {
                    if (FB_Inter_appopen != null) {
                        if (FB_Inter_appopen.isAdLoaded()) {
                            try {
                                FB_Inter_appopen.show();
                                return;
                            } catch (Exception e) {

                            }
                        }
                    }
                }


                if (!isLoadingAd) {
                    if (!isLoadingAd_ao_fb) {
                        Pre_Load_App_Open(cont_ads);
                    }
                }


                if (Google_Inter == null) {
                    if (!Inter_loading_progress) {
                        Interstial_Load(cont_ads);
                    }
                }


            }

        } catch (Exception e) {

        }
    }

    public static void Interstial_Load_FB_appopen(Context cont_ads) {

        try {

            isLoadingAd_ao_fb = true;
            if (show_ads == 1) {
                if (fb_inter_id_count_ao == 1) {
                    fb_inter_id_count_ao = 2;
                    FB_Inter_appopen = new InterstitialAd(cont_ads, "" + FB_Inter1);
                } else if (fb_inter_id_count_ao == 2) {
                    fb_inter_id_count_ao = 3;
                    FB_Inter_appopen = new InterstitialAd(cont_ads, "" + FB_Inter2);
                } else if (fb_inter_id_count_ao == 3) {
                    fb_inter_id_count_ao = 4;
                    FB_Inter_appopen = new InterstitialAd(cont_ads, "" + FB_Inter3);
                } else if (fb_inter_id_count_ao == 4) {
                    fb_inter_id_count_ao = 5;
                    FB_Inter_appopen = new InterstitialAd(cont_ads, "" + FB_Inter4);
                } else {
                    fb_inter_id_count_ao = 6;
                    FB_Inter_appopen = new InterstitialAd(cont_ads, "" + FB_Inter5);
                }
                InterstitialAdListener adListener = new InterstitialAdListener() {
                    @Override
                    public void onInterstitialDisplayed(Ad ad) {
                    }

                    @Override
                    public void onInterstitialDismissed(Ad ad) {
                        isLoadingAd_ao_fb = false;
                        Pre_Load_App_Open(cont_ads);
                    }

                    @Override
                    public void onError(Ad ad, AdError adError) {
                        FB_Inter_appopen = null;
                        int aa = fb_inter_id_count_ao - 1;
                        MyLog.e("AO Load FB", "fail" + aa);
                        if (fb_inter_id_count_ao == 6) {
                            fb_inter_id_count_ao = FB_setup_ads;
                            isLoadingAd_ao_fb = false;

                        } else {
                            Interstial_Load_FB_appopen(cont_ads);
                        }
                    }

                    @Override
                    public void onAdLoaded(Ad ad) {
                        MyLog.e("AO Load FB", "yes");
                        fb_inter_id_count_ao = FB_setup_ads;
                        isLoadingAd_ao_fb = true;
                    }

                    @Override
                    public void onAdClicked(Ad ad) {
                    }

                    @Override
                    public void onLoggingImpression(Ad ad) {
                    }
                };
                FB_Inter_appopen.loadAd(
                        FB_Inter_appopen.buildLoadAdConfig()
                                .withAdListener(adListener)
                                .build());
            }

        } catch (Exception e) {

        }


    }

    public void Banner(Context cont_ads, RelativeLayout adView, int bannerType) {


        try {
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    if (Loading_Data == 1 || Loading_Data == 0) {
                        if (isNetworkConnected(cont_ads)) {
                            if (show_ads == 1) {
                                if (b_nooff == 0) {
                                    adView.removeAllViews();
                                    adView.setVisibility(View.GONE);
                                    return;
                                }
                                if (b_n_ex == 2) {
                                    int Ntype = 1;
                                    if (bannerType == 1 || bannerType == 2) {
                                        Ntype = 1;
                                    } else if (bannerType == 3) {
                                        Ntype = 2;
                                    }
                                    Native(cont_ads, adView, Ntype);
                                    return;
                                }

                                if (only_fb_inter.equals("1")) {
                                    if (Ads_Seq1.equals("GL")) {
                                        Banner_Google(cont_ads, adView, bannerType);
                                    } else if (Ads_Seq1.equals("AC")) {
                                        Banner_AC(cont_ads, adView, bannerType);
                                    } else {
                                        Banner_Tappx(cont_ads, adView, bannerType);
                                    }
                                    return;
                                }

                                if (Ads_Seq.equals("FB")) {
                                    Banner_FB(cont_ads, adView, bannerType);
                                } else if (Ads_Seq.equals("GL")) {
                                    Banner_Google(cont_ads, adView, bannerType);
                                } else if (Ads_Seq.equals("AC")) {
                                    Banner_AC(cont_ads, adView, bannerType);
                                } else if (Ads_Seq.equals("TX")) {
                                    Banner_Tappx(cont_ads, adView, bannerType);
                                } else {
                                    Banner_Google(cont_ads, adView, bannerType);
                                }
                            }
                        }
                    } else {
                        handler.postDelayed(this, 500);
                    }
                }

            }, 500);

        } catch (Exception e) {

        }
    }

    public void Banner_FB(Context cont_ads, RelativeLayout adView, int bannerType) {

        try {

            com.facebook.ads.AdSize adsize;
            if (bannerType == 2) {
                adsize = com.facebook.ads.AdSize.BANNER_HEIGHT_90;
            } else if (bannerType == 3) {
                adsize = com.facebook.ads.AdSize.RECTANGLE_HEIGHT_250;
            } else {
                adsize = com.facebook.ads.AdSize.BANNER_HEIGHT_50;
            }

            if (bannerType == 3) {
                if (fb_banner_id_count == 1) {
                    fb_banner_id_count = 2;
                    FB_Banner = new AdView(cont_ads, "" + FB_MR1, adsize);

                } else if (fb_banner_id_count == 2) {
                    fb_banner_id_count = 3;
                    FB_Banner = new AdView(cont_ads, "" + FB_MR2, adsize);

                } else if (fb_banner_id_count == 3) {
                    fb_banner_id_count = 4;
                    FB_Banner = new AdView(cont_ads, "" + FB_MR3, adsize);

                } else if (fb_banner_id_count == 4) {
                    fb_banner_id_count = 5;
                    FB_Banner = new AdView(cont_ads, "" + FB_MR4, adsize);

                } else {
                    fb_banner_id_count = 6;
                    FB_Banner = new AdView(cont_ads, "" + FB_MR5, adsize);
                }

            } else {
                if (fb_banner_id_count == 1) {
                    fb_banner_id_count = 2;
                    FB_Banner = new AdView(cont_ads, "" + FB_Banner1, adsize);

                } else if (fb_banner_id_count == 2) {
                    fb_banner_id_count = 3;
                    FB_Banner = new AdView(cont_ads, "" + FB_Banner2, adsize);

                } else if (fb_banner_id_count == 3) {
                    fb_banner_id_count = 4;
                    FB_Banner = new AdView(cont_ads, "" + FB_Banner3, adsize);

                } else if (fb_banner_id_count == 4) {
                    fb_banner_id_count = 5;
                    FB_Banner = new AdView(cont_ads, "" + FB_Banner4, adsize);

                } else {
                    fb_banner_id_count = 6;
                    FB_Banner = new AdView(cont_ads, "" + FB_Banner5, adsize);

                }
            }


            com.facebook.ads.AdListener adListener = new com.facebook.ads.AdListener() {
                @Override
                public void onError(Ad ad, AdError adError) {
                    int aa = fb_banner_id_count - 1;
                    MyLog.e("fb banner  ", "fail" + aa);
                    if (fb_banner_id_count == 6) {
                        FB_Banner = null;
                        fb_banner_id_count = FB_setup_ads;
                        adView.setVisibility(View.GONE);
                        if (Ads_Seq1.equals("FB")) {
                            if (Ads_Seq2.equals("OFF")) {

                            } else if (Ads_Seq2.equals("AC")) {
                                Banner_AC(cont_ads, adView, bannerType);
                            } else {
                                Banner_Tappx(cont_ads, adView, bannerType);
                            }
                        } else if (Ads_Seq1.equals("GL")) {
                            Banner_Google(cont_ads, adView, bannerType);
                        } else if (Ads_Seq1.equals("AC")) {
                            Banner_AC(cont_ads, adView, bannerType);
                        } else if (Ads_Seq1.equals("TX")) {
                            Banner_Tappx(cont_ads, adView, bannerType);
                        } else if (Ads_Seq1.equals("OFF")) {

                        } else {
                            Banner_Tappx(cont_ads, adView, bannerType);
                        }
                    } else {
                        FB_Banner = null;
                        Banner_FB(cont_ads, adView, bannerType);
                    }
                }

                @Override
                public void onAdLoaded(Ad ad) {

                    try {
                        int aa = fb_banner_id_count - 1;
                        MyLog.e("fb banner Load ", "yes" + aa);
                        adView.setVisibility(View.VISIBLE);
                        adView.removeAllViews();
                        adView.addView(FB_Banner);
                        fb_banner_id_count = FB_setup_ads;
                    } catch (Exception E) {

                    }


                    try {
                        if (exit_gifImageView != null) {
                            exit_gifImageView.setVisibility(View.GONE);
                        }
                    } catch (Exception e) {

                    }
                }

                @Override
                public void onAdClicked(Ad ad) {

                }

                @Override
                public void onLoggingImpression(Ad ad) {

                }
            };

            FB_Banner.loadAd(FB_Banner.buildLoadAdConfig().withAdListener(adListener).build());
        } catch (Exception e) {

        }
    }

    public void Banner_Google(Context cont_ads, RelativeLayout adView, int bannerType) {

        try {


            String Ad_banner_request_Id;
            AdRequest adRequest = new AdRequest.Builder().build();
            String google_id_floor = Google_SetUp_List_Custom.get(gogole_banner_id_count);
            com.google.android.gms.ads.AdView AdMob_mAdView;
            AdMob_mAdView = new com.google.android.gms.ads.AdView(cont_ads);

            if (bannerType == 2) {
                AdMob_mAdView.setAdSize(AdSize.LARGE_BANNER);
            } else if (bannerType == 3) {
                AdMob_mAdView.setAdSize(AdSize.MEDIUM_RECTANGLE);
            } else {
                AdMob_mAdView.setAdSize(AdSize.BANNER);
            }

            if (google_id_floor.equals("H")) {
                if (Banner_google_id_exchange_H == 1) {
                    Ad_banner_request_Id = Admob_Banner_ID1;
                    Banner_google_id_exchange_H = 11;
                } else {
                    Ad_banner_request_Id = Admob_Banner_ID11;
                    Banner_google_id_exchange_H = 1;
                }
            } else if (google_id_floor.equals("M")) {
                if (Banner_google_id_exchange_M == 1) {
                    Ad_banner_request_Id = Admob_Banner_ID2;
                    Banner_google_id_exchange_M = 11;
                } else {
                    Ad_banner_request_Id = Admob_Banner_ID22;
                    Banner_google_id_exchange_M = 1;
                }
            } else {
                if (Banner_google_id_exchange_L == 1) {
                    Ad_banner_request_Id = Admob_Banner_ID3;
                    Banner_google_id_exchange_L = 11;
                } else {
                    Ad_banner_request_Id = Admob_Banner_ID33;
                    Banner_google_id_exchange_L = 1;
                }
            }

            AdMob_mAdView.setAdUnitId(Ad_banner_request_Id);
            AdMob_mAdView.loadAd(adRequest);
            AdMob_mAdView.setAdListener(new AdListener() {

                @Override
                public void onAdLoaded() {
                    super.onAdLoaded();

                    MyLog.e("GL Banner Load", "yes");

                    try {
                        adView.removeAllViews();
                        adView.addView(AdMob_mAdView);
                        adView.setVisibility(View.VISIBLE);

                        gogole_banner_id_count = 0;
                    } catch (Exception E) {

                    }


                    try {
                        if (exit_gifImageView != null) {
                            exit_gifImageView.setVisibility(View.GONE);
                        }
                    } catch (Exception e) {

                    }
                }

                @Override
                public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                    super.onAdFailedToLoad(loadAdError);

                    MyLog.e("GL Failed banner", "" + loadAdError.getMessage());
                    int aa = gogole_banner_id_count + 1;
                    if (aa == Google_SetUp_List_Custom.size()) {
                        gogole_banner_id_count = 0;
                        if (Ads_Seq1.equals("FB")) {
                            Banner_FB(cont_ads, adView, bannerType);
                        } else if (Ads_Seq1.equals("GL")) {
                            if (Ads_Seq2.equals("OFF")) {

                            } else if (Ads_Seq2.equals("AC")) {
                                Banner_AC(cont_ads, adView, bannerType);
                            } else {
                                Banner_Tappx(cont_ads, adView, bannerType);
                            }
                        } else if (Ads_Seq1.equals("AC")) {
                            Banner_AC(cont_ads, adView, bannerType);
                        } else if (Ads_Seq1.equals("TX")) {
                            Banner_Tappx(cont_ads, adView, bannerType);
                        } else if (Ads_Seq1.equals("OFF")) {

                        } else {
                            Banner_Tappx(cont_ads, adView, bannerType);
                        }
                    } else {
                        gogole_banner_id_count = gogole_banner_id_count + 1;
                        Banner_Google(cont_ads, adView, bannerType);
                    }
                }


            });

        } catch (Exception e) {

        }
    }

    public void Banner_AC(Context cont_ads, RelativeLayout adView, int bannerType) {
        try {

            Banner_Tappx(cont_ads, adView, bannerType);
        } catch (Exception e) {

        }

    }

    void Banner_Tappx(Context cont_ads, RelativeLayout adView, int bannerType) {

        if (bannerType == 3) {
            try {
                Mrec startAppMrec = new Mrec(cont_ads);
                adView.setVisibility(View.VISIBLE);
                adView.removeAllViews();
                adView.addView(startAppMrec);
            } catch (Exception e) {

            }
        } else {
            try {
                Banner startAppBanner = new Banner(cont_ads);
                adView.setVisibility(View.VISIBLE);
                adView.removeAllViews();
                adView.addView(startAppBanner);
            } catch (Exception e) {
            }
        }

    }

    public void Native(Context cont_ads, RelativeLayout adView, int nativeType) {

        try {

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    if (Loading_Data == 1 || Loading_Data == 0) {
                        if (isNetworkConnected(cont_ads)) {
                            if (show_ads == 1) {
                                if (n_nooff == 0) {
                                    adView.removeAllViews();
                                    adView.setVisibility(View.GONE);
                                    return;
                                }
                                if (b_n_ex == 1) {
                                    Banner(cont_ads, adView, 3);
                                    return;
                                }

                                if (only_fb_inter.equals("1")) {

                                    if (Ads_Seq1.equals("GL")) {
                                        Native_Google(cont_ads, adView, nativeType);
                                    } else if (Ads_Seq1.equals("AC")) {
                                        if (nativeType == 1) {
                                            Banner_AC(cont_ads, adView, 1);
                                        } else {
                                            Banner_AC(cont_ads, adView, 3);
                                        }
                                    } else {
                                        if (nativeType == 1) {
                                            Banner_Tappx(cont_ads, adView, 1);
                                        } else {
                                            Banner_Tappx(cont_ads, adView, 3);
                                        }
                                    }
                                    return;
                                }

                                if (Ads_Seq.equals("FB")) {
                                    Native_FB(cont_ads, adView, nativeType);
                                } else if (Ads_Seq.equals("GL")) {
                                    Native_Google(cont_ads, adView, nativeType);
                                } else if (Ads_Seq.equals("AC")) {
                                    if (nativeType == 1) {
                                        Banner_AC(cont_ads, adView, 1);
                                    } else {
                                        Banner_AC(cont_ads, adView, 3);
                                    }

                                } else if (Ads_Seq.equals("TX")) {
                                    if (nativeType == 1) {
                                        Banner_Tappx(cont_ads, adView, 1);
                                    } else {
                                        Banner_Tappx(cont_ads, adView, 3);
                                    }
                                } else {
                                    Native_Google(cont_ads, adView, nativeType);
                                }
                            }
                        } else {
                            handler.postDelayed(this, 500);
                        }
                    } else {
                        handler.postDelayed(this, 500);
                    }
                }

            }, 500);
        } catch (Exception e) {

        }

    }

    public void Native_FB(Context cont_ads, RelativeLayout adView, int nativeType) {


        try {

            if (nativeType == 2 || nativeType == 0) {

                if (fb_native_id_count == 1) {
                    fb_native_id_count = 2;
                    nativeAd = new NativeAd(cont_ads, FB_Native1);
                } else if (fb_native_id_count == 2) {
                    fb_native_id_count = 3;
                    nativeAd = new NativeAd(cont_ads, FB_Native2);
                } else if (fb_native_id_count == 3) {
                    fb_native_id_count = 4;
                    nativeAd = new NativeAd(cont_ads, FB_Native3);
                } else if (fb_native_id_count == 4) {
                    fb_native_id_count = 5;
                    nativeAd = new NativeAd(cont_ads, FB_Native4);
                } else {
                    fb_native_id_count = 6;
                    nativeAd = new NativeAd(cont_ads, FB_Native5);
                }

                NativeAdListener nativeAdListener = new NativeAdListener() {

                    @Override
                    public void onError(Ad ad, AdError adError) {

                        int ddd = fb_native_id_count - 1;

                        MyLog.e("FB Native Load", "fai adErrorl" + adError);

                        if (fb_native_id_count == 6) {
                            fb_native_id_count = FB_setup_ads;
                            adView.setVisibility(View.GONE);
                            if (Ads_Seq1.equals("FB")) {
                                if (Ads_Seq2.equals("OFF")) {

                                } else if (Ads_Seq2.equals("AC")) {
                                    Native_SA(cont_ads, adView, nativeType);
                                } else {
                                    Native_SA(cont_ads, adView, nativeType);
                                }
                            } else if (Ads_Seq1.equals("GL")) {
                                Native_Google(cont_ads, adView, nativeType);
                            } else if (Ads_Seq1.equals("AC")) {
                                Native_SA(cont_ads, adView, nativeType);
                            } else if (Ads_Seq1.equals("TX")) {
                                Native_SA(cont_ads, adView, nativeType);
                            } else if (Ads_Seq1.equals("OFF")) {

                            } else {
                                Native_Google(cont_ads, adView, nativeType);
                            }

                        } else {
                            Native_FB(cont_ads, adView, nativeType);

                        }

                    }

                    @Override
                    public void onAdLoaded(Ad ad) {
                        int ddd = fb_native_id_count - 1;

                        MyLog.e("FB Native Load", "yes");
                        NativeAdViewAttributes viewAttributes = new NativeAdViewAttributes()
                                .setBackgroundColor(BGColor)
                                .setTitleTextColor(TitleTextColor)
                                .setDescriptionTextColor(DescriptionTextColor)
                                .setButtonColor(ButtonColor)
                                .setButtonTextColor(ButtonTextColor)
                                .setButtonBorderColor(ButtonBorderColor);

                        try {
                            View adView1 = NativeAdView.render(cont_ads, nativeAd, viewAttributes);
                            adView.setVisibility(View.VISIBLE);
                            adView.removeAllViews();


                            if (nativeType == 0) {
                                DisplayMetrics metrics = cont_ads.getResources()
                                        .getDisplayMetrics();
                                try {
                                    if (exit_gifImageView != null) {
                                        exit_gifImageView.setVisibility(View.GONE);
                                    }
                                } catch (Exception e) {

                                }
                                adView.addView(adView1, new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, (int) (metrics.heightPixels / 1.5)));

                            } else {
                                adView.addView(adView1, new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 800));
                            }

                            fb_native_id_count = FB_setup_ads;
                        } catch (Exception E) {

                        }


                    }

                    @Override
                    public void onAdClicked(Ad ad) {

                    }

                    @Override
                    public void onLoggingImpression(Ad ad) {

                    }

                    @Override
                    public void onMediaDownloaded(Ad ad) {

                    }
                };


                nativeAd.loadAd(
                        nativeAd.buildLoadAdConfig()
                                .withAdListener(nativeAdListener)
                                .withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL)
                                .build());


            } else {


                if (fb_nativesmalll_id_count == 1) {
                    fb_nativesmalll_id_count = 2;
                    mNativeBannerAd = new NativeBannerAd(cont_ads, FB_NativeSmall1);
                } else if (fb_nativesmalll_id_count == 2) {
                    fb_nativesmalll_id_count = 3;
                    mNativeBannerAd = new NativeBannerAd(cont_ads, FB_NativeSmall2);
                } else if (fb_nativesmalll_id_count == 3) {
                    fb_nativesmalll_id_count = 4;
                    mNativeBannerAd = new NativeBannerAd(cont_ads, FB_NativeSmall3);
                } else if (fb_nativesmalll_id_count == 4) {
                    fb_nativesmalll_id_count = 5;
                    mNativeBannerAd = new NativeBannerAd(cont_ads, FB_NativeSmall4);
                } else {
                    fb_nativesmalll_id_count = 6;
                    mNativeBannerAd = new NativeBannerAd(cont_ads, FB_NativeSmall5);
                }
                NativeAdListener nativeAdListener = new NativeAdListener() {
                    @Override
                    public void onError(Ad ad, AdError adError) {


                        MyLog.e("FB NB Load", "fail =" + adError);

                        int ddd = fb_nativesmalll_id_count - 1;

                        if (fb_nativesmalll_id_count == 6) {
                            fb_nativesmalll_id_count = FB_setup_ads;
                            adView.removeAllViews();
                            adView.setVisibility(View.GONE);
                            if (Ads_Seq1.equals("FB")) {
                                if (Ads_Seq2.equals("OFF")) {

                                } else if (Ads_Seq2.equals("AC")) {
                                    Native_SA(cont_ads, adView, nativeType);
                                } else {
                                    Native_SA(cont_ads, adView, nativeType);
                                }
                            } else if (Ads_Seq1.equals("GL")) {
                                Native_Google(cont_ads, adView, nativeType);
                            } else if (Ads_Seq1.equals("AC")) {
                                Native_SA(cont_ads, adView, nativeType);
                            } else if (Ads_Seq1.equals("TX")) {
                                Native_SA(cont_ads, adView, nativeType);

                            } else if (Ads_Seq1.equals("OFF")) {

                            } else {
                                Native_Google(cont_ads, adView, nativeType);
                            }

                        } else {
                            Native_FB(cont_ads, adView, nativeType);

                        }

                    }

                    @Override
                    public void onAdLoaded(Ad ad) {

                        MyLog.e("FB NB Load", "yes");
                        NativeAdViewAttributes viewAttributes = new NativeAdViewAttributes()
                                .setBackgroundColor(BGColor)
                                .setTitleTextColor(TitleTextColor)
                                .setDescriptionTextColor(DescriptionTextColor)
                                .setButtonColor(ButtonColor)
                                .setButtonTextColor(ButtonTextColor)
                                .setButtonBorderColor(ButtonBorderColor);

                        try {
                            View adView1 = NativeBannerAdView.render(cont_ads, mNativeBannerAd, NativeBannerAdView.Type.HEIGHT_120, viewAttributes);
                            adView.setVisibility(View.VISIBLE);
                            adView.removeAllViews();
                            adView.addView(adView1);
                            fb_nativesmalll_id_count = FB_setup_ads;
                        } catch (Exception E) {

                        }


                        try {
                            if (exit_gifImageView != null) {
                                exit_gifImageView.setVisibility(View.GONE);
                            }
                        } catch (Exception e) {

                        }


                    }

                    @Override
                    public void onAdClicked(Ad ad) {

                    }

                    @Override
                    public void onLoggingImpression(Ad ad) {

                    }

                    @Override
                    public void onMediaDownloaded(Ad ad) {

                    }
                };


                mNativeBannerAd.loadAd(
                        mNativeBannerAd.buildLoadAdConfig()
                                .withAdListener(nativeAdListener)
                                .build());


            }

        } catch (Exception e) {

        }

    }

    public void Native_Google(Context cont_ads, RelativeLayout adView, int nativeType) {

        try {
            String iddd = "";

            String google_id_floor = Google_SetUp_List_Custom.get(gogole_native_id_count);


            if (google_id_floor.equals("H")) {
                if (Native_google_id_exchange_H == 1) {
                    iddd = Admob_Native_ID1;
                    Native_google_id_exchange_H = 11;
                } else {
                    iddd = Admob_Native_ID11;
                    Native_google_id_exchange_H = 1;
                }
            } else if (google_id_floor.equals("M")) {
                if (Native_google_id_exchange_M == 1) {
                    iddd = Admob_Native_ID2;
                    Native_google_id_exchange_M = 11;
                } else {
                    iddd = Admob_Native_ID22;
                    Native_google_id_exchange_M = 1;
                }
            } else {
                if (Native_google_id_exchange_L == 1) {
                    iddd = Admob_Native_ID3;
                    Native_google_id_exchange_L = 11;
                } else {
                    iddd = Admob_Native_ID33;
                    Native_google_id_exchange_L = 1;
                }
            }

            AdLoader adLoader = new AdLoader.Builder(cont_ads, iddd)
                    .forNativeAd(new com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener() {
                        private ColorDrawable background;

                        @Override
                        public void onNativeAdLoaded(com.google.android.gms.ads.nativead.NativeAd nativeAd) {

                            MyLog.e("GL Native Load", "yes");

                            NativeStyle styles = new
                                    NativeStyle.Builder().withMainBackgroundColor(background).build();

                            TemplateView Native_templateView;

                            if (nativeType == 0) {
                                Native_templateView = new TemplateView(cont_ads, 0);
                                try {
                                    if (exit_gifImageView != null) {
                                        exit_gifImageView.setVisibility(View.GONE);
                                    }
                                } catch (Exception e) {

                                }

                            } else {
                                Native_templateView = new TemplateView(cont_ads, nativeType);
                            }

                            Native_templateView.setStyles(styles);
                            Native_templateView.setNativeAd(nativeAd);
                            Native_templateView.setVisibility(View.VISIBLE);


                            try {
                                adView.removeAllViews();
                                adView.setVisibility(View.VISIBLE);
                                adView.addView(Native_templateView);

                                gogole_native_id_count = 0;
                            } catch (Exception E) {

                            }


                        }

                    })
                    .withAdListener(new AdListener() {
                        @Override
                        public void onAdFailedToLoad(LoadAdError adError) {


                            MyLog.e("GL Native Load", "fail =" + adError);

                            adView.removeAllViews();
                            adView.setVisibility(View.GONE);
                            int aa = gogole_native_id_count + 1;
                            if (aa == Google_SetUp_List_Custom.size()) {
                                gogole_native_id_count = 0;


                                if (Ads_Seq1.equals("FB")) {
                                    Native_FB(cont_ads, adView, nativeType);
                                } else if (Ads_Seq1.equals("GL")) {

                                    if (Ads_Seq2.equals("OFF")) {

                                    } else if (Ads_Seq2.equals("AC")) {
                                        if (nativeType == 1) {
                                            Banner_AC(cont_ads, adView, 1);
                                        } else {
                                            Banner_AC(cont_ads, adView, 3);
                                        }
                                    } else {
                                        if (nativeType == 1) {
                                            Banner_Tappx(cont_ads, adView, 1);
                                        } else {
                                            Banner_Tappx(cont_ads, adView, 3);
                                        }
                                    }


                                } else if (Ads_Seq1.equals("AC")) {
                                    if (nativeType == 1) {
                                        Banner_AC(cont_ads, adView, 1);
                                    } else {
                                        Banner_AC(cont_ads, adView, 3);
                                    }
                                } else if (Ads_Seq1.equals("TX")) {
                                    if (nativeType == 1) {
                                        Banner_Tappx(cont_ads, adView, 1);
                                    } else {
                                        Banner_Tappx(cont_ads, adView, 3);
                                    }
                                } else if (Ads_Seq1.equals("OFF")) {

                                } else {
                                    if (nativeType == 1) {
                                        Banner_AC(cont_ads, adView, 1);
                                    } else {
                                        Banner_AC(cont_ads, adView, 3);
                                    }
                                }
                            } else {
                                gogole_native_id_count = gogole_native_id_count + 1;
                                Native_Google(cont_ads, adView, nativeType);
                            }


                        }
                    })
                    .withNativeAdOptions(new NativeAdOptions.Builder()

                            .build())
                    .build();

            adLoader.loadAd(new AdRequest.Builder().build());

        } catch (Exception e) {

        }


    }

    public void Native_SA(Context cont_ads, RelativeLayout adView, int nativeType) {

        if (nativeType == 2) {
            try {
                Cover converrr = new Cover(cont_ads);
                adView.setVisibility(View.VISIBLE);
                adView.removeAllViews();
                adView.addView(converrr);
            } catch (Exception e) {

            }
        } else {
            try {
                Banner startAppBanner = new Banner(cont_ads);
                adView.setVisibility(View.VISIBLE);
                adView.removeAllViews();
                adView.addView(startAppBanner);
            } catch (Exception e) {
            }
        }

    }

    public void Banner_Pre_Load(Context cont_ads, int bannerType) {

        try {

            Pre_Loaed_Banner_Type = bannerType;
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    if (Loading_Data == 1 || Loading_Data == 0) {
                        if (isNetworkConnected(cont_ads)) {
                            if (show_ads == 1) {


                                if (only_fb_inter.equals("1")) {
                                    if (Ads_Seq1.equals("GL")) {
                                        Pre_Banner_Google(cont_ads, bannerType);
                                    } else if (Ads_Seq1.equals("AC")) {
                                        Pre_Banner_AC(cont_ads, bannerType);
                                    } else {
                                        Pre_Banner_Tappx(cont_ads, bannerType);
                                    }
                                    return;
                                }


                                if (Ads_Seq.equals("FB")) {
                                    Pre_Banner_FB(cont_ads, bannerType);
                                } else if (Ads_Seq.equals("GL")) {
                                    Pre_Banner_Google(cont_ads, bannerType);
                                } else if (Ads_Seq.equals("AC")) {
                                    Pre_Banner_AC(cont_ads, bannerType);
                                } else if (Ads_Seq.equals("TX")) {
                                    Pre_Banner_Tappx(cont_ads, bannerType);
                                } else {
                                    Pre_Banner_Google(cont_ads, bannerType);
                                }
                            }
                        } else {
                            handler.postDelayed(this, 500);
                        }
                    } else {
                        handler.postDelayed(this, 500);
                    }
                }
            }, 500);

        } catch (Exception e) {

        }

    }

    public void Banner_Show(Context cont_ads, RelativeLayout adView) {


        try {

            if (Pre_Loaed_Banner_What_show.equals("FB_Banner")) {

                if (Pre_FB_Banner != null) {

                    try {
                        adView.setVisibility(View.VISIBLE);
                        adView.removeAllViews();
                        adView.addView(Pre_FB_Banner);
                        Pre_Loaed_Banner_What_show = "";
                        Banner_Pre_Load(cont_ads, Pre_Loaed_Banner_Type);
                        return;
                    } catch (Exception E) {

                    }

                }
            }

            if (Pre_Loaed_Banner_What_show.equals("GL_Banner")) {

                if (AdMob_mAdView_Pre != null) {

                    try {
                        adView.setVisibility(View.VISIBLE);
                        adView.removeAllViews();
                        adView.addView(AdMob_mAdView_Pre);
                        Pre_Loaed_Banner_What_show = "";
                        Banner_Pre_Load(cont_ads, Pre_Loaed_Banner_Type);
                        return;

                    } catch (Exception E) {

                    }

                }
            }

            if (Pre_Loaed_Banner_Type == 3) {
                try {
                    Mrec startAppMrec = new Mrec(cont_ads);
                    adView.setVisibility(View.VISIBLE);
                    adView.removeAllViews();
                    adView.addView(startAppMrec);
                } catch (Exception e) {

                }
            } else {
                try {
                    Banner startAppBanner = new Banner(cont_ads);
                    adView.setVisibility(View.VISIBLE);
                    adView.removeAllViews();
                    adView.addView(startAppBanner);
                } catch (Exception e) {
                }
            }

            if (Pre_Loaed_Banner_Type == 2) {
                try {
                    Cover converrr = new Cover(cont_ads);
                    adView.setVisibility(View.VISIBLE);
                    adView.removeAllViews();
                    adView.addView(converrr);
                } catch (Exception e) {

                }
            } else {
                try {
                    Banner startAppBanner = new Banner(cont_ads);
                    adView.setVisibility(View.VISIBLE);
                    adView.removeAllViews();
                    adView.addView(startAppBanner);
                } catch (Exception e) {
                }
            }


            Pre_Loaed_Banner_What_show = "";


        } catch (Exception e) {

        }
    }

    public void Pre_Banner_FB(Context cont_ads, int bannerType) {

        try {

            com.facebook.ads.AdSize adsize;
            if (bannerType == 2) {

                adsize = com.facebook.ads.AdSize.BANNER_HEIGHT_90;

            } else if (bannerType == 3) {
                adsize = com.facebook.ads.AdSize.RECTANGLE_HEIGHT_250;

            } else {
                adsize = com.facebook.ads.AdSize.BANNER_HEIGHT_50;

            }


            if (bannerType == 3) {


                if (fb_banner_id_count_pre == 1) {
                    fb_banner_id_count_pre = 2;
                    Pre_FB_Banner = new AdView(cont_ads, "" + FB_MR1, adsize);
                } else if (fb_banner_id_count_pre == 2) {
                    fb_banner_id_count_pre = 3;
                    Pre_FB_Banner = new AdView(cont_ads, "" + FB_MR2, adsize);
                } else if (fb_banner_id_count_pre == 3) {
                    fb_banner_id_count_pre = 4;
                    Pre_FB_Banner = new AdView(cont_ads, "" + FB_MR3, adsize);
                } else if (fb_banner_id_count_pre == 4) {
                    fb_banner_id_count_pre = 5;
                    Pre_FB_Banner = new AdView(cont_ads, "" + FB_MR4, adsize);
                } else {
                    fb_banner_id_count_pre = 6;
                    Pre_FB_Banner = new AdView(cont_ads, "" + FB_MR5, adsize);
                }

            } else {
                if (fb_banner_id_count_pre == 1) {
                    fb_banner_id_count_pre = 2;
                    Pre_FB_Banner = new AdView(cont_ads, "" + FB_Banner1, adsize);
                } else if (fb_banner_id_count_pre == 2) {
                    fb_banner_id_count_pre = 3;
                    Pre_FB_Banner = new AdView(cont_ads, "" + FB_Banner2, adsize);
                } else if (fb_banner_id_count_pre == 3) {
                    fb_banner_id_count_pre = 4;
                    Pre_FB_Banner = new AdView(cont_ads, "" + FB_Banner3, adsize);
                } else if (fb_banner_id_count_pre == 4) {
                    fb_banner_id_count_pre = 5;
                    Pre_FB_Banner = new AdView(cont_ads, "" + FB_Banner4, adsize);
                } else {
                    fb_banner_id_count_pre = 6;
                    Pre_FB_Banner = new AdView(cont_ads, "" + FB_Banner5, adsize);
                }
            }


            com.facebook.ads.AdListener adListener = new com.facebook.ads.AdListener() {
                @Override
                public void onError(Ad ad, AdError adError) {
                    int aa = fb_banner_id_count_pre - 1;
                    MyLog.e("pre banner  ", "fail" + aa + adError.getErrorMessage());
                    Pre_Loaed_Banner_What_show = "";
                    if (fb_banner_id_count_pre == 6) {
                        Pre_FB_Banner = null;
                        fb_banner_id_count_pre = FB_setup_ads;
                        if (Ads_Seq1.equals("FB")) {
                            MyLog.e("Ads_Seq2", "" + Ads_Seq2);
                            if (Ads_Seq2.equals("OFF")) {

                            } else if (Ads_Seq2.equals("AC")) {
                                Pre_Banner_AC(cont_ads, bannerType);
                            } else {
                                Pre_Banner_Tappx(cont_ads, bannerType);
                            }
                        } else if (Ads_Seq1.equals("GL")) {
                            Pre_Banner_Google(cont_ads, bannerType);
                        } else if (Ads_Seq1.equals("AC")) {
                            Pre_Banner_AC(cont_ads, bannerType);
                        } else if (Ads_Seq1.equals("TX")) {
                            Pre_Banner_Tappx(cont_ads, bannerType);
                        } else if (Ads_Seq1.equals("OFF")) {

                        } else {
                            Pre_Banner_Google(cont_ads, bannerType);
                        }
                    } else {
                        Pre_FB_Banner = null;
                        Pre_Banner_FB(cont_ads, bannerType);
                    }
                }

                @Override
                public void onAdLoaded(Ad ad) {
                    int aa = fb_banner_id_count_pre - 1;
                    MyLog.e("pre fb banner Load ", "yes" + aa);

                    Pre_Loaed_Banner_What_show = "FB_Banner";
                    fb_banner_id_count_pre = FB_setup_ads;

                }

                @Override
                public void onAdClicked(Ad ad) {

                }

                @Override
                public void onLoggingImpression(Ad ad) {

                }
            };
            Pre_FB_Banner.loadAd(Pre_FB_Banner.buildLoadAdConfig().withAdListener(adListener).build());

        } catch (Exception e) {

        }
    }

    public void Pre_Banner_Google(Context cont_ads, int bannerType) {

        try {
            String Ad_banner_request_Id;
            AdRequest adRequest = new AdRequest.Builder().build();
            String google_id_floor = Google_SetUp_List_Custom.get(gogole_banner_id_count_pre);

            AdMob_mAdView_Pre = new com.google.android.gms.ads.AdView(cont_ads);

            if (bannerType == 2) {
                AdMob_mAdView_Pre.setAdSize(AdSize.LARGE_BANNER);
            } else if (bannerType == 3) {
                AdMob_mAdView_Pre.setAdSize(AdSize.MEDIUM_RECTANGLE);
            } else {
                AdMob_mAdView_Pre.setAdSize(AdSize.BANNER);
            }


            if (google_id_floor.equals("H")) {
                if (Banner_google_id_exchange_H == 1) {
                    Ad_banner_request_Id = Admob_Banner_ID1;
                    Banner_google_id_exchange_H = 11;
                } else {
                    Ad_banner_request_Id = Admob_Banner_ID11;
                    Banner_google_id_exchange_H = 1;
                }
            } else if (google_id_floor.equals("M")) {
                if (Banner_google_id_exchange_M == 1) {
                    Ad_banner_request_Id = Admob_Banner_ID2;
                    Banner_google_id_exchange_M = 11;
                } else {
                    Ad_banner_request_Id = Admob_Banner_ID22;
                    Banner_google_id_exchange_M = 1;
                }
            } else {
                if (Banner_google_id_exchange_L == 1) {
                    Ad_banner_request_Id = Admob_Banner_ID3;
                    Banner_google_id_exchange_L = 11;
                } else {
                    Ad_banner_request_Id = Admob_Banner_ID33;
                    Banner_google_id_exchange_L = 1;
                }
            }

            AdMob_mAdView_Pre.setAdUnitId(Ad_banner_request_Id);
            AdMob_mAdView_Pre.loadAd(adRequest);
            AdMob_mAdView_Pre.setAdListener(new AdListener() {

                @Override
                public void onAdLoaded() {
                    super.onAdLoaded();

                    Pre_Loaed_Banner_What_show = "GL_Banner";
                    gogole_banner_id_count_pre = 0;
                }


                @Override
                public void onAdFailedToLoad(LoadAdError errorCode) {
                    super.onAdFailedToLoad(errorCode);

                    MyLog.e("GL Failed banner", "" + errorCode.getMessage());
                    Pre_Loaed_Banner_What_show = "";


                    int aa = gogole_banner_id_count_pre + 1;
                    if (aa == Google_SetUp_List_Custom.size()) {
                        gogole_banner_id_count_pre = 0;
                        if (Ads_Seq1.equals("FB")) {
                            Pre_Banner_FB(cont_ads, bannerType);
                        } else if (Ads_Seq1.equals("GL")) {
                            if (Ads_Seq2.equals("OFF")) {

                            } else if (Ads_Seq2.equals("AC")) {
                                Pre_Banner_AC(cont_ads, bannerType);
                            } else {
                                Pre_Banner_Tappx(cont_ads, bannerType);
                            }
                        } else if (Ads_Seq1.equals("AC")) {
                            Pre_Banner_AC(cont_ads, bannerType);
                        } else if (Ads_Seq1.equals("TX")) {
                            Pre_Banner_Tappx(cont_ads, bannerType);
                        } else if (Ads_Seq1.equals("OFF")) {

                        } else {
                            Pre_Banner_AC(cont_ads, bannerType);
                        }
                    } else {
                        gogole_banner_id_count_pre = gogole_banner_id_count_pre + 1;
                        Pre_Banner_Google(cont_ads, bannerType);
                    }
                }
            });

        } catch (Exception e) {

        }
    }

    public void Pre_Banner_AC(Context cont_ads, int bannerType) {

        try {
            Pre_Banner_Tappx(cont_ads, bannerType);
        } catch (Exception e) {

        }
    }

    public void Pre_Banner_Tappx(Context cont_ads, int bannerType) {

    }

    public void Native_Pre_Load(Context cont_ads, int nativeType) {
        try {

            Pre_Loaed_Native_Type = nativeType;

            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    if (Loading_Data == 1 || Loading_Data == 0) {
                        if (isNetworkConnected(cont_ads)) {
                            if (show_ads == 1) {

                                if (only_fb_inter.equals("1")) {
                                    if (Ads_Seq1.equals("GL")) {
                                        Pre_Native_Google(cont_ads, nativeType);
                                    } else if (Ads_Seq1.equals("AC")) {
                                        if (nativeType == 1) {
                                            Pre_Banner_AC(cont_ads, 1);
                                        } else {
                                            Pre_Banner_AC(cont_ads, 3);
                                        }
                                    } else {
                                        if (nativeType == 1) {
                                            Pre_Banner_Tappx(cont_ads, 1);
                                        } else {
                                            Pre_Banner_Tappx(cont_ads, 3);
                                        }
                                    }
                                    return;
                                }


                                if (Ads_Seq.equals("FB")) {
                                    Pre_Native_FB(cont_ads, nativeType);
                                } else if (Ads_Seq.equals("GL")) {
                                    Pre_Native_Google(cont_ads, nativeType);
                                } else if (Ads_Seq.equals("AC")) {

                                    if (nativeType == 1) {
                                        Pre_Banner_AC(cont_ads, 1);
                                    } else {
                                        Pre_Banner_AC(cont_ads, 3);
                                    }

                                } else if (Ads_Seq.equals("TX")) {
                                    if (nativeType == 1) {
                                        Pre_Banner_Tappx(cont_ads, 1);
                                    } else {
                                        Pre_Banner_Tappx(cont_ads, 3);
                                    }
                                } else {
                                    Pre_Native_Google(cont_ads, nativeType);
                                }
                            }
                        } else {
                            handler.postDelayed(this, 500);
                        }
                    } else {
                        handler.postDelayed(this, 500);
                    }
                }

            }, 500);

        } catch (Exception e) {

        }

    }

    public void Native_Show(Context cont_ads, RelativeLayout adView) {

        try {

            if (Pre_Loaed_Native_What_show.equals("FB_Native")) {

                if (fb_Native_View != null) {

                    try {
                        adView.setVisibility(View.VISIBLE);
                        adView.removeAllViews();
                        if (Pre_Loaed_Native_Type == 2) {
                            adView.addView(fb_Native_View, new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 800));

                        } else {
                            adView.addView(fb_Native_View);
                        }
                        Pre_Loaed_Native_What_show = "";
                        Native_Pre_Load(cont_ads, Pre_Loaed_Native_Type);

                    } catch (Exception E) {

                    }
                    return;

                }
            }

            if (Pre_Loaed_Native_What_show.equals("GL_Native")) {
                if (Native_templateView_pre != null) {


                    try {
                        adView.setVisibility(View.VISIBLE);
                        adView.removeAllViews();
                        adView.addView(Native_templateView_pre);
                        Pre_Loaed_Native_What_show = "";
                        Native_Pre_Load(cont_ads, Pre_Loaed_Native_Type);
                        return;

                    } catch (Exception E) {

                    }


                }
            }


            Pre_Loaed_Banner_What_show = "";


        } catch (Exception e) {

        }
    }

    public void Pre_Native_FB(Context cont_ads, int nativeType) {

        try {

            if (nativeType == 2) {

                if (fb_native_id_count_Pre == 1) {
                    fb_native_id_count_Pre = 2;
                    nativeAd_pre = new NativeAd(cont_ads, FB_Native1);
                } else if (fb_native_id_count_Pre == 2) {
                    fb_native_id_count_Pre = 3;
                    nativeAd_pre = new NativeAd(cont_ads, FB_Native2);
                } else if (fb_native_id_count_Pre == 3) {
                    fb_native_id_count_Pre = 4;
                    nativeAd_pre = new NativeAd(cont_ads, FB_Native3);
                } else if (fb_native_id_count_Pre == 4) {
                    fb_native_id_count_Pre = 5;
                    nativeAd_pre = new NativeAd(cont_ads, FB_Native4);
                } else {
                    fb_native_id_count_Pre = 6;
                    nativeAd_pre = new NativeAd(cont_ads, FB_Native5);
                }


                NativeAdListener nativeAdListener = new NativeAdListener() {

                    @Override
                    public void onError(Ad ad, AdError adError) {

                        MyLog.e("Native PRE", "fail");
                        Pre_Loaed_Native_What_show = "";

                        int ddd = fb_native_id_count_Pre - 1;
                        fb_Native_View = null;
                        if (fb_native_id_count_Pre == 6) {
                            fb_native_id_count_Pre = FB_setup_ads;


                            if (Ads_Seq1.equals("FB")) {

                                if (Ads_Seq2.equals("OFF")) {

                                } else if (Ads_Seq2.equals("AC")) {
                                    Pre_Banner_AC(cont_ads, 3);
                                } else {
                                    Pre_Banner_Tappx(cont_ads, 3);
                                }

                            } else if (Ads_Seq1.equals("GL")) {
                                Pre_Native_Google(cont_ads, nativeType);
                            } else if (Ads_Seq1.equals("AC")) {
                                Pre_Banner_AC(cont_ads, 3);
                            } else if (Ads_Seq1.equals("TX")) {
                                Pre_Banner_Tappx(cont_ads, 3);
                            } else if (Ads_Seq1.equals("OFF")) {

                            } else {
                                Pre_Native_Google(cont_ads, nativeType);
                            }

                        } else {
                            Pre_Native_FB(cont_ads, nativeType);

                        }

                    }

                    @Override
                    public void onAdLoaded(Ad ad) {
                        int ddd = fb_native_id_count_Pre - 1;
                        Pre_Loaed_Native_What_show = "FB_Native";
                        NativeAdViewAttributes viewAttributes = new NativeAdViewAttributes()
                                .setBackgroundColor(BGColor)
                                .setTitleTextColor(TitleTextColor)
                                .setDescriptionTextColor(DescriptionTextColor)
                                .setButtonColor(ButtonColor)
                                .setButtonTextColor(ButtonTextColor)
                                .setButtonBorderColor(ButtonBorderColor);

                        View adView1 = NativeAdView.render(cont_ads, nativeAd_pre, viewAttributes);

                        fb_Native_View = adView1;

                        fb_native_id_count_Pre = FB_setup_ads;

                    }

                    @Override
                    public void onAdClicked(Ad ad) {

                    }

                    @Override
                    public void onLoggingImpression(Ad ad) {

                    }

                    @Override
                    public void onMediaDownloaded(Ad ad) {

                    }
                };


                nativeAd_pre.loadAd(
                        nativeAd_pre.buildLoadAdConfig()
                                .withAdListener(nativeAdListener)
                                .withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL)
                                .build());


            } else {


                if (fb_nativesmalll_id_count_Pre == 1) {
                    fb_nativesmalll_id_count_Pre = 2;
                    mNativeBannerAd_pre = new NativeBannerAd(cont_ads, FB_NativeSmall1);
                } else if (fb_nativesmalll_id_count_Pre == 2) {
                    fb_nativesmalll_id_count_Pre = 3;
                    mNativeBannerAd_pre = new NativeBannerAd(cont_ads, FB_NativeSmall2);
                } else if (fb_nativesmalll_id_count_Pre == 3) {
                    fb_nativesmalll_id_count_Pre = 4;
                    mNativeBannerAd_pre = new NativeBannerAd(cont_ads, FB_NativeSmall3);
                } else if (fb_nativesmalll_id_count_Pre == 4) {
                    fb_nativesmalll_id_count_Pre = 5;
                    mNativeBannerAd_pre = new NativeBannerAd(cont_ads, FB_NativeSmall4);
                } else {
                    fb_nativesmalll_id_count_Pre = 6;
                    mNativeBannerAd_pre = new NativeBannerAd(cont_ads, FB_NativeSmall5);
                }
                NativeAdListener nativeAdListener = new NativeAdListener() {
                    @Override
                    public void onError(Ad ad, AdError adError) {

                        MyLog.e("Native PRE", "fail");

                        int ddd = fb_nativesmalll_id_count_Pre - 1;
                        Pre_Loaed_Native_What_show = "";

                        if (fb_nativesmalll_id_count_Pre == 6) {
                            fb_nativesmalll_id_count_Pre = FB_setup_ads;

                            if (Ads_Seq1.equals("FB")) {
                                if (Ads_Seq2.equals("OFF")) {

                                } else if (Ads_Seq2.equals("AC")) {
                                    Pre_Banner_AC(cont_ads, 1);
                                } else {
                                    Pre_Banner_Tappx(cont_ads, 1);
                                }
                            } else if (Ads_Seq1.equals("GL")) {
                                Pre_Native_Google(cont_ads, nativeType);
                            } else if (Ads_Seq1.equals("AC")) {
                                Pre_Banner_AC(cont_ads, 1);
                            } else if (Ads_Seq1.equals("TX")) {
                                Pre_Banner_Tappx(cont_ads, 1);

                            } else if (Ads_Seq1.equals("OFF")) {

                            } else {
                                Pre_Native_Google(cont_ads, nativeType);
                            }

                        } else {
                            Pre_Native_FB(cont_ads, nativeType);

                        }

                    }

                    @Override
                    public void onAdLoaded(Ad ad) {

                        Pre_Loaed_Native_What_show = "FB_Native";
                        NativeAdViewAttributes viewAttributes = new NativeAdViewAttributes()
                                .setBackgroundColor(BGColor)
                                .setTitleTextColor(TitleTextColor)
                                .setDescriptionTextColor(DescriptionTextColor)
                                .setButtonColor(ButtonColor)
                                .setButtonTextColor(ButtonTextColor)
                                .setButtonBorderColor(ButtonBorderColor);

                        View adView1 = NativeBannerAdView.render(cont_ads, mNativeBannerAd_pre, NativeBannerAdView.Type.HEIGHT_120, viewAttributes);
                        fb_Native_View = adView1;
                        fb_nativesmalll_id_count = FB_setup_ads;
                    }

                    @Override
                    public void onAdClicked(Ad ad) {

                    }

                    @Override
                    public void onLoggingImpression(Ad ad) {

                    }

                    @Override
                    public void onMediaDownloaded(Ad ad) {

                    }
                };


                mNativeBannerAd_pre.loadAd(
                        mNativeBannerAd_pre.buildLoadAdConfig()
                                .withAdListener(nativeAdListener)
                                .build());


            }
        } catch (Exception e) {

        }

    }

    public void Pre_Native_Google(Context cont_ads, int nativeType) {


        try {


            String iddd = "";

            String google_id_floor = Google_SetUp_List_Custom.get(gogole_native_id_count_pre);


            if (google_id_floor.equals("H")) {
                if (Native_google_id_exchange_H == 1) {
                    iddd = Admob_Native_ID1;
                    Native_google_id_exchange_H = 11;
                } else {
                    iddd = Admob_Native_ID11;
                    Native_google_id_exchange_H = 1;
                }
            } else if (google_id_floor.equals("M")) {
                if (Native_google_id_exchange_M == 1) {
                    iddd = Admob_Native_ID2;
                    Native_google_id_exchange_M = 11;
                } else {
                    iddd = Admob_Native_ID22;
                    Native_google_id_exchange_M = 1;
                }
            } else {
                if (Native_google_id_exchange_L == 1) {
                    iddd = Admob_Native_ID3;
                    Native_google_id_exchange_L = 11;
                } else {
                    iddd = Admob_Native_ID33;
                    Native_google_id_exchange_L = 1;
                }
            }

            AdLoader adLoader = new AdLoader.Builder(cont_ads, iddd)
                    .forNativeAd(new com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener() {
                        private ColorDrawable background;

                        @Override
                        public void onNativeAdLoaded(com.google.android.gms.ads.nativead.NativeAd nativeAd) {
                            NativeStyle styles = new
                                    NativeStyle.Builder().withMainBackgroundColor(background).build();
                            Pre_Loaed_Native_What_show = "GL_Native";

                            Native_templateView_pre = new TemplateView(cont_ads, nativeType);
                            Native_templateView_pre.setStyles(styles);
                            Native_templateView_pre.setNativeAd(nativeAd);
                            Native_templateView_pre.setVisibility(View.VISIBLE);
                            gogole_native_id_count_pre = 0;

                        }

                    })
                    .withAdListener(new AdListener() {
                        @Override
                        public void onAdFailedToLoad(LoadAdError adError) {

                            Pre_Loaed_Native_What_show = "";
                            Native_templateView_pre = null;
                            int aa = gogole_native_id_count_pre + 1;
                            if (aa == Google_SetUp_List_Custom.size()) {
                                gogole_native_id_count_pre = 0;
                                if (Ads_Seq1.equals("FB")) {
                                    Pre_Native_FB(cont_ads, nativeType);
                                } else if (Ads_Seq1.equals("GL")) {

                                    if (Ads_Seq2.equals("OFF")) {

                                    } else if (Ads_Seq2.equals("AC")) {
                                        if (nativeType == 1) {
                                            Pre_Banner_AC(cont_ads, 1);
                                        } else {
                                            Pre_Banner_AC(cont_ads, 3);
                                        }
                                    } else {
                                        if (nativeType == 1) {
                                            Pre_Banner_Tappx(cont_ads, 1);
                                        } else {
                                            Pre_Banner_Tappx(cont_ads, 3);
                                        }
                                    }

                                } else if (Ads_Seq1.equals("AC")) {
                                    if (nativeType == 1) {
                                        Pre_Banner_AC(cont_ads, 1);
                                    } else {
                                        Pre_Banner_AC(cont_ads, 3);
                                    }
                                } else if (Ads_Seq1.equals("TX")) {
                                    if (nativeType == 1) {
                                        Pre_Banner_Tappx(cont_ads, 1);
                                    } else {
                                        Pre_Banner_Tappx(cont_ads, 3);
                                    }
                                } else if (Ads_Seq1.equals("OFF")) {

                                } else {
                                    if (nativeType == 1) {
                                        Pre_Banner_AC(cont_ads, 1);
                                    } else {
                                        Pre_Banner_AC(cont_ads, 3);
                                    }
                                }
                            } else {
                                gogole_native_id_count_pre = gogole_native_id_count_pre + 1;
                                Pre_Native_Google(cont_ads, nativeType);
                            }


                        }
                    })
                    .withNativeAdOptions(new NativeAdOptions.Builder()

                            .build())
                    .build();
            adLoader.loadAd(new AdRequest.Builder().build());
        } catch (Exception e) {

        }

    }

    public void Exit_With_Ads_Native(Context cont_ads) {


        try {


            if (show_ads == 0) {
                Exit_Popup_Without_Ads(cont_ads);
                return;
            }


            if (Exit_Pop_Setup.equals("0")) {

                onDobuleBackPressed(cont_ads);

            } else if (Exit_Pop_Setup.equals("1")) {

                Exit_Popup_Without_Ads(cont_ads);
                Log.e("Native_Ad_Size0", "1");

            } else {

                Exit_Popup_With_Ads_Native(cont_ads);
                Log.e("Native_Ad_Size0", "2");


            }

        } catch (Exception e) {

        }
    }

    @SuppressLint("SetTextI18n")
    public void Exit_Popup_Without_Ads(final Context cont_ads) {
        try {

            String Description = "Do You Want To Exit ?";

            final Dialog dialog = new Dialog(cont_ads, android.R.style.Theme_Black_NoTitleBar_Fullscreen);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            if (dialog.getWindow() != null)
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            dialog.setCancelable(true);
            dialog.setContentView(R.layout.without_ads_exit_layout);

            TextView text = (TextView) dialog.findViewById(R.id.title);
            text.setText(Description);


            Button Btn_Yes = (Button) dialog.findViewById(R.id.Btn_Yes);
            Button Btn_Rate = (Button) dialog.findViewById(R.id.Btn_Rate);
            Button Btn_No = (Button) dialog.findViewById(R.id.Btn_No);


            RelativeLayout Exit_Ads = (RelativeLayout) dialog.findViewById(R.id.banner);

            Native(cont_ads, Exit_Ads, 1);


            Btn_Yes.setText("Yes");
            Btn_Rate.setText("Rate Us");
            Btn_No.setText("No");

            Btn_Yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    try {
                        dialog.dismiss();
                    } catch (final IllegalArgumentException e) {

                    } catch (final Exception e) {
                    } finally {

                    }


                    System.exit(0);

                }
            });
            Btn_Rate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uri = Uri.parse("market://details?id="
                            + mContext.getPackageName());
                    Intent goToMarket = new Intent(
                            Intent.ACTION_VIEW, uri);

                    goToMarket
                            .addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY
                                    | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    try {
                        cont_ads.startActivity(goToMarket);
                    } catch (ActivityNotFoundException e) {
                        cont_ads.startActivity(new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://play.google.com/OneForAll/apps/details?id="
                                        + mContext.getPackageName())));
                    }
                }
            });
            Btn_No.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    try {
                        dialog.dismiss();
                    } catch (final IllegalArgumentException e) {

                    } catch (final Exception e) {
                    } finally {

                    }


                }
            });

            dialog.show();

        } catch (Exception e) {

        }


    }

    @SuppressLint("SetTextI18n")
    public void Exit_Popup_With_Ads_Native(final Context cont_ads) {

        try {

            String Description = "Do You Want To Exit ?";

            final Dialog dialog = new Dialog(cont_ads, android.R.style.Theme_Black_NoTitleBar_Fullscreen);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            if (dialog.getWindow() != null)
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            dialog.setCancelable(true);
            dialog.setContentView(R.layout.without_ads_exit_layout);

            TextView text = (TextView) dialog.findViewById(R.id.title);
            text.setText(Description);


            Button Btn_Yes = (Button) dialog.findViewById(R.id.Btn_Yes);
            Button Btn_Rate = (Button) dialog.findViewById(R.id.Btn_Rate);
            Button Btn_No = (Button) dialog.findViewById(R.id.Btn_No);


            RelativeLayout Exit_Ads = (RelativeLayout) dialog.findViewById(R.id.banner);

            Native(cont_ads, Exit_Ads, 2);


            Btn_Yes.setText("Yes");
            Btn_Rate.setText("Rate Us");
            Btn_No.setText("No");

            Btn_Yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    try {
                        dialog.dismiss();
                    } catch (final IllegalArgumentException e) {

                    } catch (final Exception e) {
                    } finally {

                    }


                    System.exit(0);

                }
            });
            Btn_Rate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Uri uri = Uri.parse("market://details?id="
                            + PackageName);
                    Intent goToMarket = new Intent(
                            Intent.ACTION_VIEW, uri);

                    goToMarket
                            .addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY
                                    | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    try {
                        cont_ads.startActivity(goToMarket);
                    } catch (ActivityNotFoundException e) {
                        cont_ads.startActivity(new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://play.google.com/OneForAll/apps/details?id="
                                        + PackageName)));
                    }
                }
            });
            Btn_No.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    try {
                        dialog.dismiss();
                    } catch (final IllegalArgumentException e) {

                    } catch (final Exception e) {
                    } finally {

                    }


                }
            });

            dialog.show();

        } catch (Exception e) {

        }


    }

    public String removeChar(String str, Integer n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());
        return front + back;
    }

    public void Reward_Dailog(Activity cont_ads, String title, String description, OnRewardgetListner onRewardgetListner) {


        try {
            Rewarded_progressDialog = new CustomProgressDialogue(cont_ads, title, description);

            gogole_splesh_inter_id_count = 0;
            fb_splesh_inter_id_count = FB_setup_ads;
            if (show_ads == 0) {
                onRewardgetListner.OnReward(true);
                return;
            }


            FancyGifDialog.Builder builder = new FancyGifDialog.Builder(cont_ads);
            builder.setTitle(title);
            builder.setMessage(description);
            builder.setTitleTextColor(R.color.titleText);
            builder.setDescriptionTextColor(R.color.descriptionText);
            builder.setNegativeBtnText("Close");
            builder.setPositiveBtnBackground(R.color.positiveButton);
            builder.setPositiveBtnText("Watch Now (Ad)");
            builder.setNegativeBtnBackground(R.color.positiveButton);
            builder.setGifResource(R.drawable.ad1);
            builder.isCancellable(true);
            builder.OnPositiveClicked(new FancyGifDialogListener() {
                @Override
                public void OnClick() {

                    Rewarded_progressDialog.show();


                    if (Ads_Seq.equals("AC")) {
                        Reward_AC(cont_ads, onRewardgetListner);
                        return;
                    }

                    if (Ads_Seq.equals("TX")) {
                        Reward_Tappx(cont_ads, onRewardgetListner);
                        return;
                    }


                    if (rv_ri.equals("1")) {
                        Rewarded_Inter(cont_ads, onRewardgetListner);
                    } else if (rv_ri.equals("2")) {
                        Rewarded_Video(cont_ads, onRewardgetListner);
                    } else if (rv_ri.equals("3")) {
                        Rewarded_Only_Inter(cont_ads, onRewardgetListner);
                    }
                }
            });
            builder.OnNegativeClicked(new FancyGifDialogListener() {
                @Override
                public void OnClick() {


                }
            });
            builder.build();
        } catch (Exception e) {

        }

    }

    public void Rewarded_Inter(Activity cont_ads, OnRewardgetListner onRewardgetListner) {

        try {

            MyLog.e("Rewarded_Inter", "Rewarded_Inter");
            String iddd = "";
            String google_id_floor = Google_SetUp_List_Custom.get(gogole_rw_id_count);
            if (google_id_floor.equals("H")) {
                if (ri_google_id_exchange_H == 1) {
                    iddd = Admob_rvi_ID1;
                    ri_google_id_exchange_H = 11;
                } else {
                    iddd = Admob_rvi_ID11;
                    ri_google_id_exchange_H = 1;
                }
            } else if (google_id_floor.equals("M")) {
                if (ri_google_id_exchange_M == 1) {
                    iddd = Admob_rvi_ID2;
                    ri_google_id_exchange_M = 11;
                } else {
                    iddd = Admob_rvi_ID22;
                    ri_google_id_exchange_M = 1;
                }
            } else {
                if (ri_google_id_exchange_L == 1) {
                    iddd = Admob_rvi_ID3;
                    ri_google_id_exchange_L = 11;
                } else {
                    iddd = Admob_rvi_ID33;
                    ri_google_id_exchange_L = 1;
                }
            }

            RewardedInterstitialAd.load(cont_ads, iddd,
                    new AdRequest.Builder().build(), new RewardedInterstitialAdLoadCallback() {
                        @Override
                        public void onAdLoaded(RewardedInterstitialAd ad) {

                            gogole_rw_id_count = 0;

                            rewardedInterstitialAd = ad;

                            rewardedInterstitialAd.show(cont_ads, new OnUserEarnedRewardListener() {
                                @Override
                                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                                    isFullAdShowed = true;
                                    onRewardgetListner.OnReward(true);
                                }

                            });


                            rewardedInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {

                                @Override
                                public void onAdDismissedFullScreenContent() {

                                    if (!isFullAdShowed) {
                                        onRewardgetListner.OnReward(false);
                                    }

                                    isFullAdShowed = false;

                                    rewardedInterstitialAd = null;
                                }

                                @Override
                                public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                                    super.onAdFailedToShowFullScreenContent(adError);
                                    if (gogole_rw_id_count == 6) {
                                        Reward_FB(cont_ads, onRewardgetListner);
                                    } else {
                                        gogole_rw_id_count = gogole_rw_id_count + 1;
                                        Rewarded_Inter(cont_ads, onRewardgetListner);
                                    }
                                }
                            });

                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    if (Rewarded_progressDialog.isShowing()) {

                                        try {
                                            Rewarded_progressDialog.dismiss();
                                        } catch (final IllegalArgumentException e) {

                                        } catch (final Exception e) {
                                        } finally {

                                        }

                                    }
                                }

                            }, 1000);


                        }

                        @Override
                        public void onAdFailedToLoad(LoadAdError loadAdError) {
                            rewardedInterstitialAd = null;
                            MyLog.e("RI onAdFailedToLoad", "" + gogole_rw_id_count);
                            int aa = gogole_rw_id_count + 1;
                            if (aa == Google_SetUp_List_Custom.size()) {
                                gogole_rw_id_count = 0;
                                Reward_FB(cont_ads, onRewardgetListner);
                            } else {
                                gogole_rw_id_count = gogole_rw_id_count + 1;
                                Rewarded_Inter(cont_ads, onRewardgetListner);
                            }

                        }

                    });
        } catch (Exception e) {

        }
    }

    public void Rewarded_Video(Activity cont_ads, OnRewardgetListner onRewardgetListner) {
        try {
            MyLog.e("Rewarded_Video", "Rewarded_Video");
            String iddd = "";
            String google_id_floor = Google_SetUp_List_Custom.get(gogole_rw_id_count);
            if (google_id_floor.equals("H")) {
                if (ri_google_id_exchange_H == 1) {
                    iddd = Admob_rvi_ID1;
                    ri_google_id_exchange_H = 11;
                } else {
                    iddd = Admob_rvi_ID11;
                    ri_google_id_exchange_H = 1;
                }
            } else if (google_id_floor.equals("M")) {
                if (ri_google_id_exchange_M == 1) {
                    iddd = Admob_rvi_ID2;
                    ri_google_id_exchange_M = 11;
                } else {
                    iddd = Admob_rvi_ID22;
                    ri_google_id_exchange_M = 1;
                }
            } else {
                if (ri_google_id_exchange_L == 1) {
                    iddd = Admob_rvi_ID3;
                    ri_google_id_exchange_L = 11;
                } else {
                    iddd = Admob_rvi_ID33;
                    ri_google_id_exchange_L = 1;
                }
            }


            AdRequest adRequest = new AdRequest.Builder().build();
            RewardedAd.load(cont_ads, iddd,
                    adRequest, new RewardedAdLoadCallback() {

                        @Override
                        public void onAdLoaded(@NonNull RewardedAd rewardedAd) {


                            gogole_rw_id_count = 0;


                            rewardedAd.show(cont_ads, new OnUserEarnedRewardListener() {
                                @Override
                                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {

                                    isFullAdShowed = true;
                                    onRewardgetListner.OnReward(true);


                                }
                            });


                            rewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {


                                @Override
                                public void onAdDismissedFullScreenContent() {

                                    if (!isFullAdShowed) {
                                        onRewardgetListner.OnReward(false);
                                    }

                                    isFullAdShowed = false;
                                }


                                @Override
                                public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                                    super.onAdFailedToShowFullScreenContent(adError);

                                    if (gogole_rw_id_count == 6) {
                                        Reward_FB(cont_ads, onRewardgetListner);
                                    } else {
                                        gogole_rw_id_count = gogole_rw_id_count + 1;
                                        Rewarded_Video(cont_ads, onRewardgetListner);
                                    }

                                }
                            });

                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {

                                    try {
                                        Rewarded_progressDialog.dismiss();
                                    } catch (final IllegalArgumentException e) {

                                    } catch (final Exception e) {
                                    } finally {

                                    }


                                }

                            }, 500);


                        }

                        @Override
                        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {


                            MyLog.e("RV onAdFailedToLoad", "" + gogole_rw_id_count);
                            int aa = gogole_rw_id_count + 1;
                            if (aa == Google_SetUp_List_Custom.size()) {
                                gogole_rw_id_count = 0;
                                Reward_FB(cont_ads, onRewardgetListner);
                            } else {
                                gogole_rw_id_count = gogole_rw_id_count + 1;
                                Rewarded_Video(cont_ads, onRewardgetListner);
                            }
                        }

                    });
        } catch (Exception e) {

        }

    }

    public void Rewarded_Only_Inter(Activity cont_ads, OnRewardgetListner onRewardgetListner) {


        try {
            MyLog.e("Rewarded_Only_Inter", "Rewarded_Only_Inter");

            String Ad_inter_request_Id = Admob_Inter_ID3;
            AdRequest adRequest = new AdRequest.Builder().build();
            String google_id_floor = Google_SetUp_List_Custom.get(gogole_splesh_inter_id_count);
            if (google_id_floor.equals("H")) {
                if (google_id_exchange_H == 1) {
                    Ad_inter_request_Id = Admob_Inter_ID1;
                    google_id_exchange_H = 11;

                } else {
                    Ad_inter_request_Id = Admob_Inter_ID11;
                    google_id_exchange_H = 1;
                }
            } else if (google_id_floor.equals("M")) {
                if (google_id_exchange_M == 1) {
                    Ad_inter_request_Id = Admob_Inter_ID2;
                    google_id_exchange_M = 11;
                } else {
                    Ad_inter_request_Id = Admob_Inter_ID22;
                    google_id_exchange_M = 1;
                }
            } else {
                if (google_id_exchange_L == 1) {
                    Ad_inter_request_Id = Admob_Inter_ID3;
                    google_id_exchange_L = 11;
                } else {
                    Ad_inter_request_Id = Admob_Inter_ID33;
                    google_id_exchange_L = 1;
                }
            }

            com.google.android.gms.ads.interstitial.InterstitialAd.load(cont_ads, Ad_inter_request_Id, adRequest,
                    new InterstitialAdLoadCallback() {
                        @Override
                        public void onAdLoaded(@NonNull com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {


                            try {

                                gogole_splesh_inter_id_count = 0;
                                onRewardgetListner.OnReward(true);
                                interstitialAd.show(cont_ads);
                                Handler handler = new Handler(Looper.getMainLooper());
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {


                                        try {
                                            if (Rewarded_progressDialog != null) {
                                                if (Rewarded_progressDialog.isShowing()) {
                                                    Rewarded_progressDialog.dismiss();
                                                }
                                            }
                                        } catch (final IllegalArgumentException e) {

                                        } catch (final Exception e) {
                                        } finally {

                                        }


                                    }
                                }, 500);

                            } catch (Exception e) {

                                try {
                                    if (Rewarded_progressDialog != null) {
                                        if (Rewarded_progressDialog.isShowing()) {
                                            Rewarded_progressDialog.dismiss();
                                        }
                                    }
                                } catch (final IllegalArgumentException ee) {

                                } catch (final Exception ee) {
                                } finally {

                                }

                            }
                        }

                        @Override
                        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {

                            MyLog.e("GLR onAdFailedToLoad", "" + loadAdError.getMessage());
                            int aa = gogole_splesh_inter_id_count + 1;
                            if (aa == Google_SetUp_List_Custom.size()) {
                                gogole_splesh_inter_id_count = 0;
                                Reward_FB(cont_ads, onRewardgetListner);
                            } else {
                                gogole_splesh_inter_id_count = gogole_splesh_inter_id_count + 1;
                                Rewarded_Only_Inter(cont_ads, onRewardgetListner);
                            }
                        }
                    });
        } catch (Exception e) {

        }

    }

    public void Reward_FB(Activity cont_ads, OnRewardgetListner onRewardgetListner) {


        try {
            MyLog.e("Reward_FB", "Reward_FB");
            if (Ads_Seq.equals("FB") || Ads_Seq1.equals("FB")) {
                if (fb_splesh_inter_id_count == 1) {
                    fb_splesh_inter_id_count = 2;
                    FB_Inter_Splesh = new InterstitialAd(cont_ads, "" + FB_Inter1);
                } else if (fb_splesh_inter_id_count == 2) {
                    fb_splesh_inter_id_count = 3;
                    FB_Inter_Splesh = new InterstitialAd(cont_ads, "" + FB_Inter2);
                } else if (fb_splesh_inter_id_count == 3) {
                    fb_splesh_inter_id_count = 4;
                    FB_Inter_Splesh = new InterstitialAd(cont_ads, "" + FB_Inter3);
                } else if (fb_splesh_inter_id_count == 4) {
                    fb_splesh_inter_id_count = 5;
                    FB_Inter_Splesh = new InterstitialAd(cont_ads, "" + FB_Inter4);
                } else {
                    fb_splesh_inter_id_count = 6;
                    FB_Inter_Splesh = new InterstitialAd(cont_ads, "" + FB_Inter5);
                }
                InterstitialAdListener adListener = new InterstitialAdListener() {
                    @Override
                    public void onInterstitialDisplayed(Ad ad) {
                    }

                    @Override
                    public void onInterstitialDismissed(Ad ad) {


                    }

                    @Override
                    public void onError(Ad ad, AdError adError) {
                        FB_Inter_Splesh = null;
                        int aa = fb_splesh_inter_id_count - 1;
                        MyLog.e("splesh Load FB", "fail" + aa);
                        if (fb_splesh_inter_id_count == 6) {

                            Reward_AC(cont_ads, onRewardgetListner);

                        } else {
                            Reward_FB(cont_ads, onRewardgetListner);
                        }
                    }


                    @Override
                    public void onAdLoaded(Ad ad) {
                        int aa = fb_splesh_inter_id_count - 1;
                        fb_splesh_inter_id_count = FB_setup_ads;
                        try {
                            onRewardgetListner.OnReward(true);
                            FB_Inter_Splesh.show();
                            final Handler handler = new Handler(Looper.getMainLooper());
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        if (Rewarded_progressDialog != null) {
                                            if (Rewarded_progressDialog.isShowing()) {
                                                Rewarded_progressDialog.dismiss();
                                            }
                                        }
                                    } catch (final IllegalArgumentException e) {

                                    } catch (final Exception e) {
                                    } finally {

                                    }


                                }
                            }, 500);

                        } catch (Exception e) {

                        }


                    }

                    @Override
                    public void onAdClicked(Ad ad) {
                    }

                    @Override
                    public void onLoggingImpression(Ad ad) {
                    }
                };
                FB_Inter_Splesh.loadAd(
                        FB_Inter_Splesh.buildLoadAdConfig()
                                .withAdListener(adListener)
                                .build());

            } else {
                Reward_AC(cont_ads, onRewardgetListner);
            }

        } catch (Exception e) {

        }
    }

    public void Reward_AC(Activity cont_ads, OnRewardgetListner onRewardgetListner) {

        Reward_Tappx(cont_ads, onRewardgetListner);


    }

    public void Reward_Tappx(Activity cont_ads, OnRewardgetListner onRewardgetListner) {

        StartAppAd rewardedVideo = new StartAppAd(cont_ads);

        rewardedVideo.setVideoListener(new VideoListener() {
            @Override
            public void onVideoCompleted() {
                onRewardgetListner.OnReward(true);
                Toast.makeText(cont_ads.getApplicationContext(), "Grant the reward to user", Toast.LENGTH_SHORT).show();
            }
        });

        rewardedVideo.loadAd(StartAppAd.AdMode.REWARDED_VIDEO, new AdEventListener() {
            @Override
            public void onReceiveAd(@NonNull com.startapp.sdk.adsbase.Ad ad) {
                rewardedVideo.showAd();

                try {

                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            try {
                                if (Rewarded_progressDialog.isShowing()) {
                                    Rewarded_progressDialog.dismiss();

                                }
                            } catch (final IllegalArgumentException e) {

                            } catch (final Exception e) {
                            } finally {

                            }
                        }
                    }, 1000);

                } catch (Exception e) {

                }
            }

            @Override
            public void onFailedToReceiveAd(@Nullable com.startapp.sdk.adsbase.Ad ad) {
                onRewardgetListner.OnReward(true);
                try {

                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            try {
                                if (Rewarded_progressDialog.isShowing()) {
                                    Rewarded_progressDialog.dismiss();

                                }
                            } catch (final IllegalArgumentException e) {

                            } catch (final Exception e) {
                            } finally {

                            }
                        }
                    }, 1000);

                } catch (Exception e) {

                }
            }
        });
    }

    public static class GetData extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

        }

        @Override
        protected Void doInBackground(Void... arg0) {

            try {
                HttpHandler sh = new HttpHandler();


                MyLog.e("Loading id Data ", "Enter Do in background");

                String jsonStr = sh.makeServiceCall("" + Ads_Link);

                if (jsonStr != null) {
                    try {
                        JSONObject jsonObj = new JSONObject(jsonStr);

                        JSONArray contacts = jsonObj.getJSONArray("" + mContext.getPackageName());
                        for (int i = 0; i < contacts.length(); i++) {
                            JSONObject c = contacts.getJSONObject(i);

                            String show1 = c.getString("show_ads");
                            String exit111 = c.getString("exit_pop");

                            splash_anim = c.getString("splash_anim");
                            SharePref.setsplash_anim(mContext, splash_anim);

                            String inc1 = c.getString("increase_ads");
                            String splesh1 = c.getString("splesh_ads");

                            show_ads = Integer.parseInt(show1);
                            Exit_Pop_Setup = exit111;

                            SharePref.setExit_Pop(mContext, Exit_Pop_Setup);


                            String sssssaop = c.getString("splesh_ao");
                            Splesh_AO = Integer.parseInt(sssssaop);
                            SharePref.setSplesh_AO(mContext, Splesh_AO);

                            String ADS1 = c.getString("ads_seq");
                            String ADS2 = c.getString("ads_seq1");
                            String ADS3 = c.getString("ads_seq2");

                            String dddd = c.getString("for_Approval");
                            For_Approval_Setup = dddd;
                            SharePref.setFor_Approval(mContext, For_Approval_Setup);

                            Ads_Seq = ADS1;
                            Ads_Seq1 = ADS2;
                            Ads_Seq2 = ADS3;


                            SharePref.setAds_Seq(mContext, Ads_Seq);
                            SharePref.setAds_Seq1(mContext, Ads_Seq1);
                            SharePref.setAds_Seq2(mContext, Ads_Seq2);


                            String setup1 = c.getString("FB_setup_ads");
                            String setup2 = c.getString("GL_setup_ads");

                            String setup3 = c.getString("counter_ads");
                            String setup4 = c.getString("ao_ads");
                            int counter_ads1 = Integer.parseInt(setup3);
                            int ao_ads1 = Integer.parseInt(setup4);
                            Counter_Ads_SetUp = counter_ads1;
                            AppOpen_Ads_SetUp = ao_ads1;

                            String aa = c.getString("b_nooff");
                            String bb = c.getString("n_nooff");
                            String cc = c.getString("i_nooff");
                            String dd = c.getString("i_ao_ex");
                            String ee = c.getString("b_n_ex");

                            int aaa = Integer.parseInt(aa);
                            int bbb = Integer.parseInt(bb);
                            int ccc = Integer.parseInt(cc);
                            int ddd = Integer.parseInt(dd);
                            int eee = Integer.parseInt(ee);

                            b_nooff = aaa;
                            n_nooff = bbb;
                            i_nooff = ccc;
                            i_ao_ex = ddd;
                            b_n_ex = eee;


                            SharePref.setb_nooff(mContext, b_nooff);
                            SharePref.setn_nooff(mContext, n_nooff);
                            SharePref.seti_nooff(mContext, i_nooff);
                            SharePref.seti_ao_ex(mContext, i_ao_ex);
                            SharePref.setb_n_ex(mContext, b_n_ex);


                            FB_setup_ads = Integer.parseInt(setup1);
                            GL_setup_ads = setup2;
                            GL_setup_ads = GL_setup_ads.replace(" ", "");

                            Google_SetUp_List_Custom = new ArrayList<>();

                            for (int p = 0; p < GL_setup_ads.length(); p++) {
                                Google_SetUp_List_Custom.add("" + GL_setup_ads.charAt(p));
                            }


                            fb_inter_id_count = FB_setup_ads;
                            splesh_ads = Integer.parseInt(splesh1);
                            increase_ads = Integer.parseInt(inc1);

                            SharePref.setShow_Ads(mContext, show_ads);
                            SharePref.setFB_Setup_Ads(mContext, FB_setup_ads);
                            SharePref.setGL_Setup_Ads(mContext, GL_setup_ads);
                            SharePref.setSplesh_Ads(mContext, splesh_ads);
                            SharePref.setIncrease_Ads(mContext, increase_ads);

                            FB_Banner1 = c.getString("fb_b1");
                            SharePref.setFB_Banner1(mContext, FB_Banner1);
                            FB_Banner2 = c.getString("fb_b2");
                            SharePref.setFB_Banner2(mContext, FB_Banner2);
                            FB_Banner3 = c.getString("fb_b3");
                            SharePref.setFB_Banner3(mContext, FB_Banner3);
                            FB_Banner4 = c.getString("fb_b4");
                            SharePref.setFB_Banner4(mContext, FB_Banner4);
                            FB_Banner5 = c.getString("fb_b5");
                            SharePref.setFB_Banner5(mContext, FB_Banner5);

                            FB_MR1 = c.getString("fb_mr1");
                            SharePref.setFB_MR1(mContext, FB_MR1);
                            FB_MR2 = c.getString("fb_mr2");
                            SharePref.setFB_MR2(mContext, FB_MR2);
                            FB_MR3 = c.getString("fb_mr3");
                            SharePref.setFB_MR3(mContext, FB_MR3);
                            FB_MR4 = c.getString("fb_mr4");
                            SharePref.setFB_MR4(mContext, FB_MR4);
                            FB_MR5 = c.getString("fb_mr5");
                            SharePref.setFB_MR5(mContext, FB_MR5);

                            FB_Inter1 = c.getString("fb_i1");
                            SharePref.setFB_Inter1(mContext, FB_Inter1);
                            FB_Inter2 = c.getString("fb_i2");
                            SharePref.setFB_Inter2(mContext, FB_Inter2);
                            FB_Inter3 = c.getString("fb_i3");
                            SharePref.setFB_Inter3(mContext, FB_Inter3);
                            FB_Inter4 = c.getString("fb_i4");
                            SharePref.setFB_Inter4(mContext, FB_Inter4);
                            FB_Inter5 = c.getString("fb_i5");
                            SharePref.setFB_Inter5(mContext, FB_Inter5);

                            FB_Native1 = c.getString("fb_n1");
                            SharePref.setFB_Native1(mContext, FB_Native1);
                            FB_Native2 = c.getString("fb_n2");
                            SharePref.setFB_Native2(mContext, FB_Native2);
                            FB_Native3 = c.getString("fb_n3");
                            SharePref.setFB_Native3(mContext, FB_Native3);
                            FB_Native4 = c.getString("fb_n4");
                            SharePref.setFB_Native4(mContext, FB_Native4);
                            FB_Native5 = c.getString("fb_n5");
                            SharePref.setFB_Native5(mContext, FB_Native5);

                            FB_NativeSmall1 = c.getString("fb_ns1");
                            SharePref.setFB_Native_Small1(mContext, FB_NativeSmall1);
                            FB_NativeSmall2 = c.getString("fb_ns2");
                            SharePref.setFB_Native_Small2(mContext, FB_NativeSmall2);
                            FB_NativeSmall3 = c.getString("fb_ns3");
                            SharePref.setFB_Native_Small3(mContext, FB_NativeSmall3);
                            FB_NativeSmall4 = c.getString("fb_ns4");
                            SharePref.setFB_Native_Small4(mContext, FB_NativeSmall4);
                            FB_NativeSmall5 = c.getString("fb_ns5");
                            SharePref.setFB_Native_Small5(mContext, FB_NativeSmall5);

                            Admob_App_ID = c.getString("admob_app");
                            SharePref.setAdmob_APP(mContext, Admob_App_ID);

                            Admob_Inter_ID1 = c.getString("admob_i1");
                            SharePref.setAdmob_Inter1(mContext, Admob_Inter_ID1);
                            Admob_Inter_ID2 = c.getString("admob_i2");
                            SharePref.setAdmob_Inter2(mContext, Admob_Inter_ID2);
                            Admob_Inter_ID3 = c.getString("admob_i3");
                            SharePref.setAdmob_Inter3(mContext, Admob_Inter_ID3);

                            Admob_Inter_ID11 = c.getString("admob_i11");
                            SharePref.setAdmob_Inter11(mContext, Admob_Inter_ID11);
                            Admob_Inter_ID22 = c.getString("admob_i22");
                            SharePref.setAdmob_Inter22(mContext, Admob_Inter_ID22);
                            Admob_Inter_ID33 = c.getString("admob_i33");
                            SharePref.setAdmob_Inter33(mContext, Admob_Inter_ID33);

                            Admob_Banner_ID1 = c.getString("admob_b1");
                            SharePref.setAdmob_Banner1(mContext, Admob_Banner_ID1);
                            Admob_Banner_ID2 = c.getString("admob_b2");
                            SharePref.setAdmob_Banner2(mContext, Admob_Banner_ID2);
                            Admob_Banner_ID3 = c.getString("admob_b3");
                            SharePref.setAdmob_Banner3(mContext, Admob_Banner_ID3);

                            Admob_Banner_ID11 = c.getString("admob_b11");
                            SharePref.setAdmob_Banner11(mContext, Admob_Banner_ID11);
                            Admob_Banner_ID22 = c.getString("admob_b22");
                            SharePref.setAdmob_Banner22(mContext, Admob_Banner_ID22);
                            Admob_Banner_ID33 = c.getString("admob_b33");
                            SharePref.setAdmob_Banner33(mContext, Admob_Banner_ID33);

                            Admob_Native_ID1 = c.getString("admob_n1");
                            SharePref.setAdmob_Native1(mContext, Admob_Native_ID1);
                            Admob_Native_ID2 = c.getString("admob_n2");
                            SharePref.setAdmob_Native2(mContext, Admob_Native_ID2);
                            Admob_Native_ID3 = c.getString("admob_n3");
                            SharePref.setAdmob_Native3(mContext, Admob_Native_ID3);

                            Admob_Native_ID11 = c.getString("admob_n11");
                            SharePref.setAdmob_Native11(mContext, Admob_Native_ID11);
                            Admob_Native_ID22 = c.getString("admob_n22");
                            SharePref.setAdmob_Native22(mContext, Admob_Native_ID22);
                            Admob_Native_ID33 = c.getString("admob_n33");
                            SharePref.setAdmob_Native33(mContext, Admob_Native_ID33);

                            Admob_AppOpen_ID1 = c.getString("admob_ao1");
                            SharePref.setAdmob_AppOpen1(mContext, Admob_AppOpen_ID1);
                            Admob_AppOpen_ID2 = c.getString("admob_ao2");
                            SharePref.setAdmob_AppOpen2(mContext, Admob_AppOpen_ID2);
                            Admob_AppOpen_ID3 = c.getString("admob_ao3");
                            SharePref.setAdmob_AppOpen3(mContext, Admob_AppOpen_ID3);

                            Admob_AppOpen_ID11 = c.getString("admob_ao11");
                            SharePref.setAdmob_AppOpen11(mContext, Admob_AppOpen_ID11);
                            Admob_AppOpen_ID22 = c.getString("admob_ao22");
                            SharePref.setAdmob_AppOpen22(mContext, Admob_AppOpen_ID22);
                            Admob_AppOpen_ID33 = c.getString("admob_ao33");
                            SharePref.setAdmob_AppOpen33(mContext, Admob_AppOpen_ID33);

                            SharePref.setNative_custom(mContext, c.getString("Native_custom"));

                            only_fb_inter = c.getString("only_fb_inter");
                            rv_ri = c.getString("rv_ri");
                            Admob_rvi_ID1 = c.getString("admob_rvi1");
                            Admob_rvi_ID11 = c.getString("admob_rvi11");
                            Admob_rvi_ID2 = c.getString("admob_rvi2");
                            Admob_rvi_ID22 = c.getString("admob_rvi22");
                            Admob_rvi_ID3 = c.getString("admob_rvi3");
                            Admob_rvi_ID33 = c.getString("admob_rvi33");
                            Ac_Reward = c.getString("ac_r");

                            SharePref.setonly_fb_inter(mContext, only_fb_inter);
                            SharePref.setrv_ri(mContext, rv_ri);
                            SharePref.setAdmob_rvi_ID1(mContext, Admob_rvi_ID1);
                            SharePref.setAdmob_rvi_ID11(mContext, Admob_rvi_ID11);
                            SharePref.setAdmob_rvi_ID2(mContext, Admob_rvi_ID2);
                            SharePref.setAdmob_rvi_ID22(mContext, Admob_rvi_ID22);
                            SharePref.setAdmob_rvi_ID3(mContext, Admob_rvi_ID3);
                            SharePref.setAdmob_rvi_ID33(mContext, Admob_rvi_ID33);
                            SharePref.setAC_Reward(mContext, Ac_Reward);

                            ac_App = c.getString("ac_app");
                            SharePref.setAC_App(mContext, ac_App);
                            ac_Banner = c.getString("ac_b");
                            SharePref.setAC_Banner(mContext, ac_Banner);
                            ac_Inter = c.getString("ac_i");
                            SharePref.setAC_Inter(mContext, ac_Inter);

                            Tappx_ID = c.getString("tappx");
                            SharePref.setTappx(mContext, Tappx_ID);

                            BGColor1 = c.getString("BGColor");
                            TitleTextColor1 = c.getString("TitleTextColor");
                            DescriptionTextColor1 = c.getString("DescriptionTextColor");
                            ButtonColor1 = c.getString("ButtonColor");
                            ButtonTextColor1 = c.getString("ButtonTextColor");
                            ButtonBorderColor1 = c.getString("ButtonBorderColor");


                            try {
                                BGColor = Color.parseColor(BGColor1);
                                TitleTextColor = Color.parseColor(TitleTextColor1);
                                DescriptionTextColor = Color.parseColor(DescriptionTextColor1);
                                ButtonColor = Color.parseColor(ButtonColor1);
                                ButtonTextColor = Color.parseColor(ButtonTextColor1);
                                ButtonBorderColor = Color.parseColor(ButtonBorderColor1);
                            } catch (Exception E) {

                                BGColor = Color.parseColor("#ffffff");
                                TitleTextColor = Color.parseColor("#000000");
                                DescriptionTextColor = Color.parseColor("#60000000");
                                ButtonColor = Color.parseColor("#1E90FF");
                                ButtonTextColor = Color.parseColor("#ffffff");
                                ButtonBorderColor = Color.parseColor("#000000");

                            }

                            SharePref.setBGColor(mContext, BGColor1);
                            SharePref.setTitleTextColor(mContext, TitleTextColor1);
                            SharePref.setDescriptionTextColor(mContext, DescriptionTextColor1);
                            SharePref.setButtonColor(mContext, ButtonColor1);
                            SharePref.setButtonTextColor(mContext, ButtonTextColor1);
                            SharePref.setButtonBorderColor(mContext, ButtonBorderColor1);


                            SharePref.setExtra1(mContext, c.getString("ex1"));
                            SharePref.setExtra2(mContext, c.getString("ex2"));
                            SharePref.setExtra3(mContext, c.getString("ex3"));
                            SharePref.setExtra4(mContext, c.getString("ex4"));
                            SharePref.setExtra5(mContext, c.getString("ex5"));


                            Extra1 = SharePref.getExtra1(mContext);
                            Extra2 = SharePref.getExtra2(mContext);
                            Extra3 = SharePref.getExtra3(mContext);
                            Extra4 = SharePref.getExtra4(mContext);
                            Extra5 = SharePref.getExtra5(mContext);


                            MyLog.e("json sucesss", "= yes");

                        }

                        fb_inter_id_count = FB_setup_ads;
                        fb_splesh_inter_id_count = FB_setup_ads;
                        fb_banner_id_count = FB_setup_ads;
                        fb_native_id_count = FB_setup_ads;
                        fb_nativesmalll_id_count = FB_setup_ads;

                        fb_banner_id_count_pre = FB_setup_ads;


                        fb_native_id_count_Pre = FB_setup_ads;
                        fb_nativesmalll_id_count_Pre = FB_setup_ads;

                        boolean App_Live_Or_Not = isAppLiveOnPlayStore(PackageName);

                        MyLog.e(PackageName, "" + App_Live_Or_Not);
                        if (!App_Live_Or_Not) {
                            Ads_Seq = Ads_Seq2;
                        }

                        Loading_Data = 1;

                    } catch (final JSONException e) {


                        error(e.getMessage());

                        boolean App_Live_Or_Not = isAppLiveOnPlayStore(PackageName);
                        if (!App_Live_Or_Not) {
                            Ads_Seq = SharePref.getAds_Seq2(mContext);
                        }

                    }
                } else {

                    boolean App_Live_Or_Not = isAppLiveOnPlayStore(PackageName);
                    MyLog.e(PackageName, "" + App_Live_Or_Not);
                    if (!App_Live_Or_Not) {
                        Ads_Seq = SharePref.getAds_Seq2(mContext);
                    }
                    error("null json");
                }

                return null;


            } catch (Exception e) {

            }
            return null;

        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);

        }


        public boolean isAppLiveOnPlayStore(String appid) {

            try {
                HttpURLConnection conn = (HttpURLConnection) (new URL("https://play.google.com/store/apps/details?id=" + appid))
                        .openConnection();
                conn.setUseCaches(false);
                conn.connect();
                int status = conn.getResponseCode();
                conn.disconnect();
                return status == 200;
            } catch (Exception e) {
                MyLog.e("isAppLiveOnPlayStore", e.toString());
            }
            return false;
        }


        void error(String error) {

            try {

                MyLog.e("json error ", "=" + error);

                show_ads = SharePref.getShow_Ads(mContext);
                Exit_Pop_Setup = SharePref.getExit_Pop(mContext);

                Ads_Seq = SharePref.getAds_Seq(mContext);
                Ads_Seq1 = SharePref.getAds_Seq1(mContext);
                Ads_Seq2 = SharePref.getAds_Seq2(mContext);
                Splesh_AO = SharePref.getSplesh_AO(mContext);

                For_Approval_Setup = SharePref.getFor_Approval(mContext);

                FB_setup_ads = SharePref.getFB_Setup_Ads(mContext);
                GL_setup_ads = SharePref.getGL_Setup_Ads(mContext);
                GL_setup_ads = GL_setup_ads.replace(" ", "");
                Google_SetUp_List_Custom = new ArrayList<>();
                for (int p = 0; p < GL_setup_ads.length(); p++) {
                    Google_SetUp_List_Custom.add("" + GL_setup_ads.charAt(p));
                }

                Counter_Ads_SetUp = SharePref.getCounter_Ads_Setup(mContext);
                AppOpen_Ads_SetUp = SharePref.getAO_Setup(mContext);

                fb_inter_id_count = FB_setup_ads;
                fb_splesh_inter_id_count = FB_setup_ads;

                splesh_ads = SharePref.getSplesh_Ads(mContext);
                increase_ads = SharePref.getIncrease_Ads(mContext);

                FB_Banner1 = SharePref.getFB_Banner1(mContext);
                FB_Banner2 = SharePref.getFB_Banner2(mContext);
                FB_Banner3 = SharePref.getFB_Banner3(mContext);
                FB_Banner4 = SharePref.getFB_Banner4(mContext);
                FB_Banner5 = SharePref.getFB_Banner5(mContext);

                b_nooff = SharePref.getb_nooff(mContext);
                n_nooff = SharePref.getn_nooff(mContext);
                i_nooff = SharePref.geti_nooff(mContext);
                i_ao_ex = SharePref.geti_ao_ex(mContext);
                b_n_ex = SharePref.getb_n_ex(mContext);

                FB_MR1 = SharePref.getFB_MR1(mContext);
                FB_MR2 = SharePref.getFB_MR2(mContext);
                FB_MR3 = SharePref.getFB_MR3(mContext);
                FB_MR4 = SharePref.getFB_MR4(mContext);
                FB_MR5 = SharePref.getFB_MR5(mContext);

                FB_Inter1 = SharePref.getFB_Inter1(mContext);
                FB_Inter2 = SharePref.getFB_Inter2(mContext);
                FB_Inter3 = SharePref.getFB_Inter3(mContext);
                FB_Inter4 = SharePref.getFB_Inter4(mContext);
                FB_Inter5 = SharePref.getFB_Inter5(mContext);

                FB_Native1 = SharePref.getFB_Native1(mContext);
                FB_Native2 = SharePref.getFB_Native2(mContext);
                FB_Native3 = SharePref.getFB_Native3(mContext);
                FB_Native4 = SharePref.getFB_Native4(mContext);
                FB_Native5 = SharePref.getFB_Native5(mContext);

                FB_NativeSmall1 = SharePref.getFB_Native_Small1(mContext);
                FB_NativeSmall2 = SharePref.getFB_Native_Small2(mContext);
                FB_NativeSmall3 = SharePref.getFB_Native_Small3(mContext);
                FB_NativeSmall4 = SharePref.getFB_Native_Small4(mContext);
                FB_NativeSmall5 = SharePref.getFB_Native_Small5(mContext);

                Admob_App_ID = SharePref.getAdmob_APP(mContext);

                Admob_Inter_ID1 = SharePref.getAdmob_Inter1(mContext);
                Admob_Inter_ID2 = SharePref.getAdmob_Inter2(mContext);
                Admob_Inter_ID3 = SharePref.getAdmob_Inter3(mContext);

                Admob_Inter_ID11 = SharePref.getAdmob_Inter11(mContext);
                Admob_Inter_ID22 = SharePref.getAdmob_Inter22(mContext);
                Admob_Inter_ID33 = SharePref.getAdmob_Inter33(mContext);

                Admob_Banner_ID1 = SharePref.getAdmob_Banner1(mContext);
                Admob_Banner_ID2 = SharePref.getAdmob_Banner2(mContext);
                Admob_Banner_ID3 = SharePref.getAdmob_Banner3(mContext);

                Admob_Banner_ID11 = SharePref.getAdmob_Banner11(mContext);
                Admob_Banner_ID22 = SharePref.getAdmob_Banner22(mContext);
                Admob_Banner_ID33 = SharePref.getAdmob_Banner33(mContext);

                Admob_Native_ID1 = SharePref.getAdmob_Native1(mContext);
                Admob_Native_ID2 = SharePref.getAdmob_Native2(mContext);
                Admob_Native_ID3 = SharePref.getAdmob_Native3(mContext);

                Admob_Native_ID11 = SharePref.getAdmob_Native11(mContext);
                Admob_Native_ID22 = SharePref.getAdmob_Native22(mContext);
                Admob_Native_ID33 = SharePref.getAdmob_Native33(mContext);

                Admob_AppOpen_ID1 = SharePref.getAdmob_AppOpen1(mContext);
                Admob_AppOpen_ID2 = SharePref.getAdmob_AppOpen2(mContext);
                Admob_AppOpen_ID3 = SharePref.getAdmob_AppOpen3(mContext);

                Admob_AppOpen_ID11 = SharePref.getAdmob_AppOpen11(mContext);
                Admob_AppOpen_ID22 = SharePref.getAdmob_AppOpen22(mContext);
                Admob_AppOpen_ID33 = SharePref.getAdmob_AppOpen33(mContext);

                only_fb_inter = SharePref.getonly_fb_inter(mContext);
                rv_ri = SharePref.getrv_ri(mContext);
                Admob_rvi_ID1 = SharePref.getAdmob_rvi_ID1(mContext);
                Admob_rvi_ID11 = SharePref.getAdmob_rvi_ID11(mContext);
                Admob_rvi_ID2 = SharePref.getAdmob_rvi_ID2(mContext);
                Admob_rvi_ID22 = SharePref.getAdmob_rvi_ID22(mContext);
                Admob_rvi_ID3 = SharePref.getAdmob_rvi_ID3(mContext);
                Admob_rvi_ID33 = SharePref.getAdmob_rvi_ID33(mContext);
                Ac_Reward = SharePref.getAC_Reward(mContext);

                ac_App = SharePref.getAC_App(mContext);
                ac_Banner = SharePref.getAC_Banner(mContext);
                ac_Inter = SharePref.getAC_Inter(mContext);
                Tappx_ID = SharePref.getTappx(mContext);

                fb_splesh_inter_id_count = FB_setup_ads;
                fb_inter_id_count = FB_setup_ads;
                fb_banner_id_count = FB_setup_ads;
                fb_native_id_count = FB_setup_ads;
                fb_nativesmalll_id_count = FB_setup_ads;

                fb_banner_id_count_pre = FB_setup_ads;

                fb_native_id_count_Pre = FB_setup_ads;
                fb_nativesmalll_id_count_Pre = FB_setup_ads;


                BGColor1 = SharePref.getBGColor(mContext);
                TitleTextColor1 = SharePref.getTitleTextColor(mContext);
                DescriptionTextColor1 = SharePref.getDescriptionTextColor(mContext);
                ButtonColor1 = SharePref.getButtonColor(mContext);
                ButtonTextColor1 = SharePref.getButtonTextColor(mContext);
                ButtonBorderColor1 = SharePref.getButtonBorderColor(mContext);

                try {
                    BGColor = Color.parseColor(BGColor1);
                    TitleTextColor = Color.parseColor(TitleTextColor1);
                    DescriptionTextColor = Color.parseColor(DescriptionTextColor1);
                    ButtonColor = Color.parseColor(ButtonColor1);
                    ButtonTextColor = Color.parseColor(ButtonTextColor1);
                    ButtonBorderColor = Color.parseColor(ButtonBorderColor1);
                } catch (Exception E) {
                    BGColor = Color.parseColor("#ffffff");
                    TitleTextColor = Color.parseColor("#000000");
                    DescriptionTextColor = Color.parseColor("#60000000");
                    ButtonColor = Color.parseColor("#1E90FF");
                    ButtonTextColor = Color.parseColor("#ffffff");
                    ButtonBorderColor = Color.parseColor("#000000");
                }

                SharePref.setBGColor(mContext, BGColor1);
                SharePref.setTitleTextColor(mContext, TitleTextColor1);
                SharePref.setDescriptionTextColor(mContext, DescriptionTextColor1);
                SharePref.setButtonColor(mContext, ButtonColor1);
                SharePref.setButtonTextColor(mContext, ButtonTextColor1);
                SharePref.setButtonBorderColor(mContext, ButtonBorderColor1);


                Extra1 = SharePref.getExtra1(mContext);
                Extra2 = SharePref.getExtra2(mContext);
                Extra3 = SharePref.getExtra3(mContext);
                Extra4 = SharePref.getExtra4(mContext);
                Extra5 = SharePref.getExtra5(mContext);

                Loading_Data = 0;

            } catch (
                    Exception e) {

            }

        }


    }

    public static class HttpHandler {

        public HttpHandler() {
        }

        public String makeServiceCall(String reqUrl) {
            String response = null;
            try {
                URL url = new URL(reqUrl);
                HttpURLConnection conn = (HttpURLConnection) url
                        .openConnection();
                conn.setRequestMethod("GET");
                InputStream in = new BufferedInputStream(conn.getInputStream());
                response = convertStreamToString(in);
            } catch (MalformedURLException e) {
            } catch (ProtocolException e) {
            } catch (IOException e) {
            } catch (Exception e) {
            }
            return response;
        }

        private String convertStreamToString(InputStream is) {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(is));
            StringBuilder sb = new StringBuilder();

            String line;
            try {
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append('\n');
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return sb.toString();
        }
    }
}
