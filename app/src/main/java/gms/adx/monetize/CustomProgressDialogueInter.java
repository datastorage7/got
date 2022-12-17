package gms.adx.monetize;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class CustomProgressDialogueInter extends Dialog {
    public CustomProgressDialogueInter(Context context, String title, String description, int bg_color, int text_color) {
        super(context, android.R.style.Theme_Translucent_NoTitleBar_Fullscreen);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setTitle(null);
        setCancelable(false);
        setOnCancelListener(null);


        View view = LayoutInflater.from(context).inflate(
                R.layout.loading_ads_full, null);

        setContentView(view);

        TextView title_view, message_view;
        title_view = view.findViewById(R.id.title);
        title_view.setText("" + title);

        message_view = view.findViewById(R.id.message);
        message_view.setText("" + description);


        RelativeLayout mainrl = view.findViewById(R.id.mainrl);


        mainrl.setBackgroundColor(bg_color);
        title_view.setTextColor(text_color);
        message_view.setTextColor(text_color);


    }
}
