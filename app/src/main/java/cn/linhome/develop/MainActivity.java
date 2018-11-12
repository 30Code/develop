package cn.linhome.develop;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;

import cn.linhome.lib.develop.callback.FBSProgressCallback;

public class MainActivity extends AppCompatActivity implements FBSProgressCallback
{
    private ProgressDialog mProgressDialog;

    @Override
    public void onBsShowProgress(String msg)
    {
        if (mProgressDialog == null)
        {
            mProgressDialog = new ProgressDialog(this);
        }
        mProgressDialog.setMessage(msg);
        mProgressDialog.show();
    }

    @Override
    public void onBsHideProgress()
    {
        if (mProgressDialog != null)
        {
            mProgressDialog.dismiss();
        }
    }
}
