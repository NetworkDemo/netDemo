package com.cn.perfect.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.cn.perfect.R;
import com.cn.perfect.base.BaseActivity;
import com.cn.perfect.utils.ToastUtil;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.button_net)
    Button button_net;
    @BindView(R.id.tv_content)
    TextView tv_content;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(@Nullable Bundle savedInstanceState) {
//        setLeftTitle();
//        setTitle("title");
        button_net.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.button_net:
                ToastUtil.showToast("=======");
                break;
            default:
                break;
        }
    }
}
