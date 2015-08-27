package com.bertha.sunny.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import com.bertha.sunny.R;

/**
 * Created by liliana on 07/08/15.
 */
public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity(); //get context of current activity. The context of this class is not relevant here

        //Alert dialog has three buttons: positive/negative/neutral
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(context.getString(R.string.dialog_error_title))
                .setMessage(context.getString(R.string.dialog_error_message))
                .setPositiveButton(context.getString(R.string.dialog_error_ok_button), null); //OnClickListener is null

        //create alertDialog
        AlertDialog dialog = builder.create();
        return dialog;

    }
}
