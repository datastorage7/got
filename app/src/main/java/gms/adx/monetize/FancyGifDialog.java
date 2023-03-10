package gms.adx.monetize;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import pl.droidsonroids.gif.GifImageView;


public class FancyGifDialog {

    private String title, message, positiveBtnText, negativeBtnText;
    @ColorRes
    private int pBtnColor, nBtnColor;
    @ColorRes
    private int titleTxtColor, desTxtColor;
    private Context context;
    private FancyGifDialogListener pListener, nListener;
    private Dialog.OnCancelListener cancelListener;
    private boolean cancel;
    int gifImageResource;


    private FancyGifDialog(Builder builder) {
        this.title = builder.title;
        this.message = builder.message;
        this.context = builder.context;
        this.pListener = builder.pListener;
        this.nListener = builder.nListener;
        this.titleTxtColor = builder.titleTxtColor;
        this.desTxtColor = builder.desTxtColor;
        this.pBtnColor = builder.pBtnColor;
        this.nBtnColor = builder.nBtnColor;
        this.positiveBtnText = builder.positiveBtnText;
        this.negativeBtnText = builder.negativeBtnText;
        this.gifImageResource = builder.gifImageResource;
        this.cancel = builder.cancel;
        this.cancelListener = builder.cancelListener;
    }


    public static class Builder {
        private String title, message, positiveBtnText, negativeBtnText;
        @ColorRes
        private int pBtnColor, nBtnColor;
        private int titleTxtColor, desTxtColor;
        private Context context;
        private FancyGifDialogListener pListener, nListener;
        private boolean cancel;
        int gifImageResource;
        private Dialog.OnCancelListener cancelListener;


        public Builder(Context context) {
            this.context = context;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@StringRes int title) {
            return setTitle(context.getString(title));
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@StringRes int message) {
            return setMessage(context.getString(message));
        }

        public Builder setTitleTextColor(@ColorRes int titleTxtColor) {
            this.titleTxtColor = titleTxtColor;
            return this;
        }

        public Builder setDescriptionTextColor(@ColorRes int desTxtColor) {
            this.desTxtColor = desTxtColor;
            return this;
        }

        public Builder setPositiveBtnText(String positiveBtnText) {
            this.positiveBtnText = positiveBtnText;
            return this;
        }

        public Builder setPositiveBtnText(@StringRes int positiveBtnText) {
            return setPositiveBtnText(context.getString(positiveBtnText));
        }

        public Builder setPositiveBtnBackground(@ColorRes int pBtnColor) {
            this.pBtnColor = pBtnColor;
            return this;
        }

        public Builder setNegativeBtnText(String negativeBtnText) {
            this.negativeBtnText = negativeBtnText;
            return this;
        }

        public Builder setNegativeBtnText(@StringRes int negativeBtnText) {
            return setNegativeBtnText(context.getString(negativeBtnText));
        }

        public Builder setNegativeBtnBackground(@ColorRes int nBtnColor) {
            this.nBtnColor = nBtnColor;
            return this;
        }


        public Builder OnPositiveClicked(FancyGifDialogListener pListener) {
            this.pListener = pListener;
            return this;
        }


        public Builder OnNegativeClicked(FancyGifDialogListener nListener) {
            this.nListener = nListener;
            return this;
        }

        public Builder isCancellable(boolean cancel) {
            this.cancel = cancel;
            return this;
        }

        public Builder setOnCancelListener(Dialog.OnCancelListener cancelListener) {
            this.cancelListener = cancelListener;
            return this;
        }

        public Builder setGifResource(int gifImageResource) {
            this.gifImageResource = gifImageResource;
            return this;
        }

        public FancyGifDialog build() {
            TextView message1, title1;
            Button nBtn, pBtn;
            GifImageView gifImageView;

            final Dialog dialog;
            dialog = new Dialog(context);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            if (dialog.getWindow() != null)
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.setCancelable(cancel);
            dialog.setContentView(R.layout.fancygifdialog);


            title1 = dialog.findViewById(R.id.title);
            message1 = dialog.findViewById(R.id.message);
            nBtn = dialog.findViewById(R.id.negativeBtn);
            pBtn = dialog.findViewById(R.id.positiveBtn);
            gifImageView = dialog.findViewById(R.id.gifImageView);
            gifImageView.setImageResource(gifImageResource);

            title1.setText(title);
            message1.setText(message);

            title1.setTextColor(ContextCompat.getColor(context, titleTxtColor));
            message1.setTextColor(ContextCompat.getColor(context, desTxtColor));


            CardView card = dialog.findViewById(R.id.card);
            card.setCardBackgroundColor(Color.parseColor(SharePref.getBGColor(context)));

            title1.setTextColor(Color.parseColor(SharePref.getTitleTextColor(context)));
            message1.setTextColor(Color.parseColor(SharePref.getDescriptionTextColor(context)));

            nBtn.setTextColor(Color.parseColor(SharePref.getButtonTextColor(context)));
            pBtn.setTextColor(Color.parseColor(SharePref.getButtonTextColor(context)));


            CardView card1 = dialog.findViewById(R.id.card1);
            card1.setCardBackgroundColor(Color.parseColor(SharePref.getButtonColor(context)));

            CardView card2 = dialog.findViewById(R.id.card2);
            card2.setCardBackgroundColor(Color.parseColor(SharePref.getButtonColor(context)));


            if (positiveBtnText != null)
                pBtn.setText(positiveBtnText);
            if (negativeBtnText != null)
                nBtn.setText(negativeBtnText);


            if (pListener != null) {
                pBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        pListener.OnClick();
                        dialog.dismiss();
                    }
                });
            } else {
                pBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }

                });
            }

            if (nListener != null) {
                nBtn.setVisibility(View.VISIBLE);
                nBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nListener.OnClick();
                        dialog.dismiss();
                    }
                });
            }

            if (cancelListener != null)
                dialog.setOnCancelListener(cancelListener);


            dialog.show();

            return new FancyGifDialog(this);
        }
    }

}
