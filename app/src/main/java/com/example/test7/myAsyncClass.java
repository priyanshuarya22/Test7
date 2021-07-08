package com.example.test7;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.widget.Toast;

public class myAsyncClass extends AsyncTask<Void, Void, Void> {
    //creating reference variables
    ProgressDialog pd;
    MainActivity ma;

    //constructor of this class
    myAsyncClass(MainActivity ma) {
        //setting global variable ma equals to local variable ma
        this.ma = ma;
        //creating object of progress dialog
        pd = new ProgressDialog(ma);
        //setting message
        pd.setMessage("Please Wait...");
        //showing the progress dialog
        pd.show();
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        //for loop running from 0to 9
        for(int i = 0; i < 10; i++) {
            //exception handling
            try {
                //sleeping for half a second
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void unused) {
        super.onPostExecute(unused);
        //dismissing the progress dialog
        pd.dismiss();
        //toast to tell the user that the process is completed
        Toast.makeText(ma, "Done", Toast.LENGTH_SHORT).show();
    }
}
