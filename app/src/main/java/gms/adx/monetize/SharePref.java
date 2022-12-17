package gms.adx.monetize;

import android.content.Context;

public class SharePref {


    private static final String First_ads = "First_ads";


    public static void setFirst_ads(Context Context, int string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putInt(First_ads, string).commit();
    }

    public static int getFirst_ads(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getInt(First_ads, 0);
    }


    private static final String First_ads_splesh = "First_ads_splesh";


    public static void setFirst_ads_splesh(Context Context, int string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putInt(First_ads_splesh, string).commit();
    }

    public static int getFirst_ads_splesh(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getInt(First_ads_splesh, 0);
    }


    private static final String show_ads = "show_ads";


    public static void setShow_Ads(Context Context, int string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putInt(show_ads, string).commit();
    }

    public static int getShow_Ads(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getInt(show_ads, 1);
    }


    private static final String Splesh_AO = "Splesh_AO";


    public static void setSplesh_AO(Context Context, int string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putInt(Splesh_AO, string).commit();
    }

    public static int getSplesh_AO(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getInt(Splesh_AO, 1);
    }


    private static final String b_nooff = "b_nooff";


    public static void setb_nooff(Context Context, int string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putInt(b_nooff, string).commit();
    }

    public static int getb_nooff(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getInt(b_nooff, 1);
    }

    private static final String n_nooff = "n_nooff";

    public static void setn_nooff(Context Context, int string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putInt(n_nooff, string).commit();
    }

    public static int getn_nooff(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getInt(n_nooff, 1);
    }

    private static final String i_nooff = "i_nooff";


    public static void seti_nooff(Context Context, int string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putInt(i_nooff, string).commit();
    }

    public static int geti_nooff(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getInt(i_nooff, 1);
    }

    private static final String i_ao_ex = "i_ao_ex";

    public static void seti_ao_ex(Context Context, int string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putInt(i_ao_ex, string).commit();
    }

    public static int geti_ao_ex(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getInt(i_ao_ex, 0);
    }


    private static final String b_n_ex = "b_n_ex";


    public static void setb_n_ex(Context Context, int string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putInt(b_n_ex, string).commit();
    }

    public static int getb_n_ex(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getInt(b_n_ex, 0);
    }


    private static final String Exit_Pop = "Exit_Pop";

    public static void setExit_Pop(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Exit_Pop, string).commit();
    }

    public static String getExit_Pop(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Exit_Pop, "0");
    }


    private static final String Counter_Ads_Setup = "Counter_Ads_Setup";

    public static void setCounter_Ads_Setup(Context Context, int string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putInt(Counter_Ads_Setup, string).commit();
    }

    public static int getCounter_Ads_Setup(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getInt(Counter_Ads_Setup, 1);
    }


    private static final String AO_Setup = "AO_Setup";

    public static void setAO_Setup(Context Context, int string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putInt(AO_Setup, string).commit();
    }

    public static int getAO_Setup(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getInt(AO_Setup, 1);
    }


    private static final String FB_Setup_Ads = "FB_Setup_Ads";


    public static void setFB_Setup_Ads(Context Context, int string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putInt(FB_Setup_Ads, string).commit();
    }

    public static int getFB_Setup_Ads(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getInt(FB_Setup_Ads, 1);
    }


    private static final String GL_Setup_Ads = "GL_Setup_Ads";


    public static void setGL_Setup_Ads(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(GL_Setup_Ads, string).commit();
    }

    public static String getGL_Setup_Ads(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(GL_Setup_Ads, "L");
    }


    private static final String Increase_Ads = "Increase_Ads";


    public static void setIncrease_Ads(Context Context, int string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putInt(Splesh_Ads, string).commit();
    }

    public static int getIncrease_Ads(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getInt(Splesh_Ads, 0);
    }


    private static final String Splesh_Ads = "Splesh_Ads";


    public static void setSplesh_Ads(Context Context, int string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putInt(Splesh_Ads, string).commit();
    }

    public static int getSplesh_Ads(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getInt(Splesh_Ads, 1);
    }


    private static final String Counter_Ads = "Counter_Ads";


    public static void setCounter_Ads(Context Context, int string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putInt(Counter_Ads, string).commit();
    }

    public static int getCounter_Ads(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getInt(Counter_Ads, 1);
    }


    private static final String Ads_Seq = "Ads_Seq";

    public static void setAds_Seq(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Ads_Seq, string).commit();
    }

    public static String getAds_Seq(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Ads_Seq, "FB");
    }


    private static final String Ads_Seq1 = "Ads_Seq1";

    public static void setAds_Seq1(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Ads_Seq1, string).commit();
    }

    public static String getAds_Seq1(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Ads_Seq1, "GL");
    }


    private static final String Ads_Seq2 = "Ads_Seq2";

    public static void setAds_Seq2(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Ads_Seq2, string).commit();
    }

    public static String getAds_Seq2(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Ads_Seq2, "AC");

    }


    private static final String For_Approval = "For_Approval";

    public static void setFor_Approval(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(For_Approval, string).commit();
    }

    public static String getFor_Approval(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(For_Approval, "0");

    }


    private static final String FB_Banner1 = "FB_Banner1";

    public static void setFB_Banner1(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Banner1, string).commit();
    }

    public static String getFB_Banner1(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Banner1, "");
    }


    private static final String FB_Banner2 = "FB_Banner2";

    public static void setFB_Banner2(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Banner2, string).commit();
    }

    public static String getFB_Banner2(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Banner2, "");
    }


    private static final String FB_Banner3 = "FB_Banner3";

    public static void setFB_Banner3(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Banner3, string).commit();
    }

    public static String getFB_Banner3(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Banner3, "");
    }


    private static final String FB_Banner4 = "FB_Banner4";

    public static void setFB_Banner4(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Banner4, string).commit();
    }

    public static String getFB_Banner4(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Banner4, "");
    }


    private static final String FB_Banner5 = "FB_Banner5";

    public static void setFB_Banner5(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Banner5, string).commit();
    }

    public static String getFB_Banner5(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Banner5, "");
    }


    private static final String FB_MR1 = "FB_MR1";

    public static void setFB_MR1(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_MR1, string).commit();
    }

    public static String getFB_MR1(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_MR1, "");
    }


    private static final String FB_MR2 = "FB_MR2";

    public static void setFB_MR2(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_MR2, string).commit();
    }

    public static String getFB_MR2(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_MR2, "");
    }


    private static final String FB_MR3 = "FB_MR3";

    public static void setFB_MR3(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_MR3, string).commit();
    }

    public static String getFB_MR3(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_MR3, "");
    }


    private static final String FB_MR4 = "FB_MR4";

    public static void setFB_MR4(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_MR4, string).commit();
    }

    public static String getFB_MR4(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_MR4, "");
    }


    private static final String FB_MR5 = "FB_MR5";

    public static void setFB_MR5(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_MR5, string).commit();
    }

    public static String getFB_MR5(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_MR5, "");
    }


    private static final String FB_Inter1 = "FB_Inter1";

    public static void setFB_Inter1(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Inter1, string).commit();
    }

    public static String getFB_Inter1(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Inter1, "");
    }


    private static final String FB_Inter2 = "FB_Inter2";

    public static void setFB_Inter2(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Inter2, string).commit();
    }

    public static String getFB_Inter2(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Inter2, "");
    }


    private static final String FB_Inter3 = "FB_Inter3";

    public static void setFB_Inter3(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Inter3, string).commit();
    }

    public static String getFB_Inter3(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Inter3, "");
    }


    private static final String FB_Inter4 = "FB_Inter4";

    public static void setFB_Inter4(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Inter4, string).commit();
    }

    public static String getFB_Inter4(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Inter4, "");
    }


    private static final String FB_Inter5 = "FB_Inter5";

    public static void setFB_Inter5(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Inter5, string).commit();
    }

    public static String getFB_Inter5(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Inter5, "");
    }


    private static final String FB_Native1 = "FB_Native1";

    public static void setFB_Native1(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Native1, string).commit();
    }

    public static String getFB_Native1(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Native1, "");
    }

    private static final String FB_Native2 = "FB_Native2";

    public static void setFB_Native2(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Native2, string).commit();
    }

    public static String getFB_Native2(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Native2, "");
    }


    private static final String FB_Native3 = "FB_Native3";

    public static void setFB_Native3(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Native3, string).commit();
    }

    public static String getFB_Native3(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Native3, "");
    }


    private static final String FB_Native4 = "FB_Native4";

    public static void setFB_Native4(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Native4, string).commit();
    }

    public static String getFB_Native4(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Native4, "");
    }


    private static final String FB_Native5 = "FB_Native5";

    public static void setFB_Native5(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Native5, string).commit();
    }

    public static String getFB_Native5(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Native5, "");
    }


    private static final String FB_Native_Small1 = "FB_Native_Small1";

    public static void setFB_Native_Small1(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Native_Small1, string).commit();
    }

    public static String getFB_Native_Small1(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Native_Small1, "");
    }


    private static final String FB_Native_Small2 = "FB_Native_Small2";

    public static void setFB_Native_Small2(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Native_Small2, string).commit();
    }

    public static String getFB_Native_Small2(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Native_Small2, "");
    }

    private static final String FB_Native_Small3 = "FB_Native_Small3";

    public static void setFB_Native_Small3(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Native_Small3, string).commit();
    }

    public static String getFB_Native_Small3(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Native_Small3, "");
    }


    private static final String FB_Native_Small4 = "FB_Native_Small4";

    public static void setFB_Native_Small4(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Native_Small4, string).commit();
    }

    public static String getFB_Native_Small4(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Native_Small4, "");
    }


    private static final String FB_Native_Small5 = "FB_Native_Small5";

    public static void setFB_Native_Small5(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(FB_Native_Small5, string).commit();
    }

    public static String getFB_Native_Small5(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(FB_Native_Small5, "");
    }


    private static final String AC_App = "AC_App";

    public static void setAC_App(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(AC_App, string).commit();
    }

    public static String getAC_App(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(AC_App, "");
    }


    private static final String AC_Inter = "AC_Inter";

    public static void setAC_Inter(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(AC_Inter, string).commit();
    }

    public static String getAC_Inter(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(AC_Inter, "");
    }

    private static final String AC_Banner = "AC_Banner";

    public static void setAC_Banner(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(AC_Banner, string).commit();
    }

    public static String getAC_Banner(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(AC_Banner, "");
    }

    private static final String Tappx = "Tappx";

    public static void setTappx(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Tappx, string).commit();
    }

    public static String getTappx(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Tappx, "");
    }


    private static final String Admob_APP = "Admob_APP";

    public static void setAdmob_APP(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_APP, string).commit();
    }

    public static String getAdmob_APP(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_APP, "");
    }


    private static final String Admob_Banner1 = "Admob_Banner1";

    public static void setAdmob_Banner1(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_Banner1, string).commit();
    }

    public static String getAdmob_Banner1(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_Banner1, "");
    }


    private static final String Admob_Banner11 = "Admob_Banner11";

    public static void setAdmob_Banner11(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_Banner11, string).commit();
    }

    public static String getAdmob_Banner11(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_Banner11, "");
    }


    private static final String Admob_Banner2 = "Admob_Banner2";

    public static void setAdmob_Banner2(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_Banner2, string).commit();
    }

    public static String getAdmob_Banner2(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_Banner2, "");
    }


    private static final String Admob_Banner22 = "Admob_Banner22";

    public static void setAdmob_Banner22(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_Banner22, string).commit();
    }

    public static String getAdmob_Banner22(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_Banner22, "");
    }


    private static final String Admob_Banner3 = "Admob_Banner3";

    public static void setAdmob_Banner3(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_Banner3, string).commit();
    }

    public static String getAdmob_Banner3(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_Banner3, "");
    }


    private static final String Admob_Banner33 = "Admob_Banner33";

    public static void setAdmob_Banner33(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_Banner33, string).commit();
    }

    public static String getAdmob_Banner33(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_Banner33, "");
    }


    private static final String Admob_Inter1 = "Admob_Inter1";

    public static void setAdmob_Inter1(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_Inter1, string).commit();
    }

    public static String getAdmob_Inter1(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_Inter1, "");
    }


    private static final String Admob_Inter11 = "Admob_Inter11";

    public static void setAdmob_Inter11(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_Inter11, string).commit();
    }

    public static String getAdmob_Inter11(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_Inter11, "");
    }


    private static final String Admob_Inter2 = "Admob_Inter2";

    public static void setAdmob_Inter2(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_Inter2, string).commit();
    }

    public static String getAdmob_Inter2(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_Inter2, "");
    }


    private static final String Admob_Inter22 = "Admob_Inter22";

    public static void setAdmob_Inter22(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_Inter22, string).commit();
    }

    public static String getAdmob_Inter22(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_Inter22, "");
    }


    private static final String Admob_Inter3 = "Admob_Inter3";

    public static void setAdmob_Inter3(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_Inter3, string).commit();
    }

    public static String getAdmob_Inter3(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_Inter3, "");
    }

    private static final String Admob_Inter33 = "Admob_Inter33";

    public static void setAdmob_Inter33(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_Inter33, string).commit();
    }

    public static String getAdmob_Inter33(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_Inter33, "");
    }


    private static final String Admob_Native1 = "Admob_Native1";

    public static void setAdmob_Native1(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_Native1, string).commit();
    }

    public static String getAdmob_Native1(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_Native1, "");
    }

    private static final String Admob_Native11 = "Admob_Native11";

    public static void setAdmob_Native11(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_Native11, string).commit();
    }

    public static String getAdmob_Native11(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_Native11, "");
    }


    private static final String Admob_Native2 = "Admob_Native2";

    public static void setAdmob_Native2(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_Native2, string).commit();
    }

    public static String getAdmob_Native2(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_Native2, "");
    }


    private static final String Admob_Native22 = "Admob_Native22";

    public static void setAdmob_Native22(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_Native22, string).commit();
    }

    public static String getAdmob_Native22(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_Native22, "");
    }


    private static final String Admob_Native3 = "Admob_Native3";

    public static void setAdmob_Native3(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_Native3, string).commit();
    }

    public static String getAdmob_Native3(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_Native3, "");
    }


    private static final String Admob_Native33 = "Admob_Native3";

    public static void setAdmob_Native33(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_Native33, string).commit();
    }

    public static String getAdmob_Native33(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_Native33, "");
    }


    private static final String Admob_AppOpen1 = "Admob_AppOpen1";

    public static void setAdmob_AppOpen1(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_AppOpen1, string).commit();
    }

    public static String getAdmob_AppOpen1(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_AppOpen1, "");
    }


    private static final String Admob_AppOpen11 = "Admob_AppOpen11";

    public static void setAdmob_AppOpen11(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_AppOpen11, string).commit();
    }

    public static String getAdmob_AppOpen11(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_AppOpen11, "");
    }


    private static final String Admob_AppOpen2 = "Admob_AppOpen2";

    public static void setAdmob_AppOpen2(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_AppOpen2, string).commit();
    }

    public static String getAdmob_AppOpen2(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_AppOpen2, "");
    }


    private static final String Admob_AppOpen22 = "Admob_AppOpen22";

    public static void setAdmob_AppOpen22(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_AppOpen22, string).commit();
    }

    public static String getAdmob_AppOpen22(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_AppOpen22, "");
    }


    private static final String Admob_AppOpen3 = "Admob_AppOpen3";

    public static void setAdmob_AppOpen3(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_AppOpen3, string).commit();
    }

    public static String getAdmob_AppOpen3(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_AppOpen3, "");
    }


    private static final String Admob_AppOpen33 = "Admob_AppOpen33";

    public static void setAdmob_AppOpen33(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_AppOpen33, string).commit();
    }

    public static String getAdmob_AppOpen33(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_AppOpen33, "");
    }


    private static final String only_fb_inter = "only_fb_inter";

    public static void setonly_fb_inter(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(only_fb_inter, string).commit();
    }

    public static String getonly_fb_inter(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(only_fb_inter, "");
    }


    private static final String rv_ri = "rv_ri";

    public static void setrv_ri(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(rv_ri, string).commit();
    }

    public static String getrv_ri(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(rv_ri, "");
    }

    private static final String Admob_rvi_ID1 = "Admob_rvi_ID1";

    public static void setAdmob_rvi_ID1(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_rvi_ID1, string).commit();
    }

    public static String getAdmob_rvi_ID1(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_rvi_ID1, "");
    }

    private static final String Admob_rvi_ID11 = "Admob_rvi_ID11";

    public static void setAdmob_rvi_ID11(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_rvi_ID11, string).commit();
    }

    public static String getAdmob_rvi_ID11(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_rvi_ID11, "");
    }

    private static final String Admob_rvi_ID2 = "Admob_rvi_ID2";

    public static void setAdmob_rvi_ID2(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_rvi_ID2, string).commit();
    }

    public static String getAdmob_rvi_ID2(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_rvi_ID2, "");
    }


    private static final String Admob_rvi_ID22 = "Admob_rvi_ID22";

    public static void setAdmob_rvi_ID22(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_rvi_ID22, string).commit();
    }

    public static String getAdmob_rvi_ID22(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_rvi_ID22, "");
    }

    private static final String Admob_rvi_ID3 = "Admob_rvi_ID3";

    public static void setAdmob_rvi_ID3(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_rvi_ID3, string).commit();
    }

    public static String getAdmob_rvi_ID3(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_rvi_ID3, "");
    }


    private static final String Admob_rvi_ID33 = "Admob_rvi_ID33";

    public static void setAdmob_rvi_ID33(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Admob_rvi_ID33, string).commit();
    }

    public static String getAdmob_rvi_ID33(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Admob_rvi_ID33, "");
    }


    private static final String AC_Reward = "AC_Reward";

    public static void setAC_Reward(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(AC_Reward, string).commit();
    }

    public static String getAC_Reward(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(AC_Reward, "");
    }


    private static final String splash_anim = "splash_anim";

    public static void setsplash_anim(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(splash_anim, string).commit();
    }

    public static String getsplash_anim(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(splash_anim, "0");
    }

    private static final String BGColor = "BGColor";

    public static void setBGColor(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(BGColor, string).commit();
    }

    public static String getBGColor(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(BGColor, "#292929");
    }


    private static final String TitleTextColor = "TitleTextColor";

    public static void setTitleTextColor(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(TitleTextColor, string).commit();
    }

    public static String getTitleTextColor(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(TitleTextColor, "#ffffff");
    }


    private static final String DescriptionTextColor = "DescriptionTextColor";

    public static void setDescriptionTextColor(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(DescriptionTextColor, string).commit();
    }

    public static String getDescriptionTextColor(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(DescriptionTextColor, "#b3b3b3");
    }


    private static final String ButtonColor = "ButtonColor";

    public static void setButtonColor(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(ButtonColor, string).commit();
    }

    public static String getButtonColor(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(ButtonColor, "#474747");
    }


    private static final String ButtonTextColor = "ButtonTextColor";

    public static void setButtonTextColor(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(ButtonTextColor, string).commit();
    }

    public static String getButtonTextColor(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(ButtonTextColor, "#ffffff");
    }


    private static final String ButtonBorderColor = "ButtonBorderColor";

    public static void setButtonBorderColor(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(ButtonBorderColor, string).commit();
    }

    public static String getButtonBorderColor(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(ButtonBorderColor, "#ffffff");
    }


    private static final String Native_custom = "Native_custom";

    public static void setNative_custom(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Native_custom, string).commit();
    }

    public static String getNative_custom(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Native_custom, "0");
    }


    private static final String Extra1 = "Extra1";

    public static void setExtra1(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Extra1, string).commit();
    }

    public static String getExtra1(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Extra1, "0");
    }

    private static final String Extra2 = "Extra2";

    public static void setExtra2(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Extra2, string).commit();
    }

    public static String getExtra2(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Extra2, "0");
    }


    private static final String Extra3 = "Extra3";

    public static void setExtra3(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Extra3, string).commit();
    }

    public static String getExtra3(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Extra3, "0");
    }


    private static final String Extra4 = "Extra4";

    public static void setExtra4(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Extra4, string).commit();
    }

    public static String getExtra4(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Extra4, "0");
    }

    private static final String Extra5 = "Extra5";

    public static void setExtra5(Context Context, String string) {
        Context.getSharedPreferences(Context.getPackageName(), 0).edit()
                .putString(Extra5, string).commit();
    }

    public static String getExtra5(Context Context) {
        return Context.getSharedPreferences(Context.getPackageName(), 0)
                .getString(Extra5, "0");
    }


}
