package gms.adx.monetize;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;


public class CustomProgressDialogue extends Dialog {
    public CustomProgressDialogue(Context context, String title, String description) {
        super(context, android.R.style.Theme_Translucent_NoTitleBar_Fullscreen);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setTitle(null);
        setCancelable(false);
        setOnCancelListener(null);

        View view = LayoutInflater.from(context).inflate(
                R.layout.full_screen_custom_progress, null);

        setContentView(view);

        String bgcolor = SharePref.getBGColor(context);
        String titleColor = SharePref.getTitleTextColor(context);
        String textColor = SharePref.getDescriptionTextColor(context);

        TextView title11 = (TextView) view.findViewById(R.id.title);
        title11.setText("" + title);
        title11.setTextColor(Color.parseColor(titleColor));


        TextView message = (TextView) view.findViewById(R.id.message);
        message.setText("" + description);

        message.setTextColor(Color.parseColor(textColor));

        TextView loadingtext = (TextView) view.findViewById(R.id.message);
        loadingtext.setTextColor(Color.parseColor(textColor));


        CardView card = (CardView) view.findViewById(R.id.card);
        RelativeLayout rr = (RelativeLayout) view.findViewById(R.id.rr);

        card.setCardBackgroundColor(Color.parseColor(bgcolor));
        rr.setBackgroundColor(Color.parseColor(bgcolor));

        ProgressBar progressbar = view.findViewById(R.id.progressbar);

        if (Build.VERSION_CODES.LOLLIPOP <= Build.VERSION.SDK_INT) {
            progressbar.setIndeterminate(true);
            progressbar.getIndeterminateDrawable().setColorFilter(Color.parseColor(titleColor), PorterDuff.Mode.SRC_IN);
        }

    }
}
