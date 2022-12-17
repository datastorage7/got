package gms.adx.monetize;

import android.content.Context;

import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.MobileAds;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;


public class MyApplicationclass {

    public static void initialize_ads(Context app_context, String vungle_app_id, String start_app_id) {

        MobileAds.initialize(app_context);
        AudienceNetworkAds.initialize(app_context);
        StartAppSDK.init(app_context, start_app_id, false);
        StartAppAd.disableSplash();

    }

}
