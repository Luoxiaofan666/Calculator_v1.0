package com.example.jfy.myapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewFlipper;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText inputBox;
    TextView ansBox;
    private Thread historyThred;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initial();
        Calculate();
        showHelp();
        showHistory();
    }
    private void initial(){
        // 初始化 按键与输入框之间的联系
        inputBox=findViewById(R.id.inputBox);
        ansBox=findViewById(R.id.ansBox);
        findViewById(R.id.button_0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"0");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"1");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"2");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"3");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"4");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"5");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"6");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"7");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"8");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"9");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_bra).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"("+")");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"+");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_sub).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"-");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_mul).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"*");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_div).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"/");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_pow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"^");
                inputBox.setSelection(input.length()+1);
            }
        });

        findViewById(R.id.button_bs).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                String input_1;
                if(input.length()>0) {
                    input_1 = input.substring(0, input.length() - 1);
                    inputBox.setText(input_1);
                    // TODO: 2019/6/4  光标位置不对 没法和之前的一样显示
                }
            }
        });
        findViewById(R.id.button_bs).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(null);
                return true;
            }
        });

        findViewById(R.id.button_dot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+".");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_hexA).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"A");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_hexB).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"B");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_hexC).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"C");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_hexD).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"D");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_hexE).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"E");
                inputBox.setSelection(input.length()+1);
            }
        });
        findViewById(R.id.button_hexF).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                inputBox.setText(input+"F");
                inputBox.setSelection(input.length()+1);
            }
        });
    }
    private void Calculate(){
        findViewById(R.id.button_bin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                // TODO: 2019/6/4
            }
        });
        findViewById(R.id.button_hex).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                // TODO: 2019/6/4
            }
        });
        findViewById(R.id.button_oct).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=inputBox.getText().toString();
                // TODO: 2019/6/4
            }
        });

        // 计算结果
        findViewById(R.id.button_eq).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                inputBox. setFocusable(false);
                String input=inputBox.getText().toString();
                Expression expr=new Expression(input);
                Complex ans=expr.value().val;

                ansBox.setText(ans.toString());

            }
        });
    }

    public void showHelp(){
        findViewById(R.id.button_0).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                //创建一个意图对象
                Intent intent = new Intent();
                //创建组件，通过组件来响应
                ComponentName component = new ComponentName(MainActivity.this, HelpActivity.class);
                intent.setComponent(component);
                startActivity(intent);
                return false;
            }
        });
        findViewById(R.id.button_1).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                //创建一个意图对象
                Intent intent = new Intent();
                //创建组件，通过组件来响应
                ComponentName component = new ComponentName(MainActivity.this, HelpActivity.class);
                intent.setComponent(component);
                startActivity(intent);
                return false;
            }
        });
        findViewById(R.id.button_2).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                //创建一个意图对象
                Intent intent = new Intent();
                //创建组件，通过组件来响应
                ComponentName component = new ComponentName(MainActivity.this, HelpActivity.class);
                intent.setComponent(component);
                startActivity(intent);
                return false;
            }
        });
        findViewById(R.id.button_3).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                //创建一个意图对象
                Intent intent = new Intent();
                //创建组件，通过组件来响应
                ComponentName component = new ComponentName(MainActivity.this, HelpActivity.class);
                intent.setComponent(component);
                startActivity(intent);
                return false;
            }
        });
        findViewById(R.id.button_4).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                //创建一个意图对象
                Intent intent = new Intent();
                //创建组件，通过组件来响应
                ComponentName component = new ComponentName(MainActivity.this, HelpActivity.class);
                intent.setComponent(component);
                startActivity(intent);
                return false;
            }
        });
        findViewById(R.id.button_5).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                //创建一个意图对象
                Intent intent = new Intent();
                //创建组件，通过组件来响应
                ComponentName component = new ComponentName(MainActivity.this, HelpActivity.class);
                intent.setComponent(component);
                startActivity(intent);
                return false;
            }
        });
        findViewById(R.id.button_6).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                //创建一个意图对象
                Intent intent = new Intent();
                //创建组件，通过组件来响应
                ComponentName component = new ComponentName(MainActivity.this, HelpActivity.class);
                intent.setComponent(component);
                startActivity(intent);
                return false;
            }
        });
        findViewById(R.id.button_7).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                //创建一个意图对象
                Intent intent = new Intent();
                //创建组件，通过组件来响应
                ComponentName component = new ComponentName(MainActivity.this, HelpActivity.class);
                intent.setComponent(component);
                startActivity(intent);
                return false;
            }
        });
        findViewById(R.id.button_8).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                //创建一个意图对象
                Intent intent = new Intent();
                //创建组件，通过组件来响应
                ComponentName component = new ComponentName(MainActivity.this, HelpActivity.class);
                intent.setComponent(component);
                startActivity(intent);
                return false;
            }
        });
        findViewById(R.id.button_9).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                //创建一个意图对象
                Intent intent = new Intent();
                //创建组件，通过组件来响应
                ComponentName component = new ComponentName(MainActivity.this, HelpActivity.class);
                intent.setComponent(component);
                startActivity(intent);
                return false;
            }
        });

    }

    public void showHistory(){
        findViewById(R.id.ansBox).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                //创建一个意图对象
                Intent intent = new Intent();
                //创建组件，通过组件来响应
                ComponentName component = new ComponentName(MainActivity.this, HistoryActivity.class);
                intent.setComponent(component);
                Bundle bundle = new Bundle();// 创建Bundle对象
                TextView ansbox=(TextView)findViewById(R.id.ansBox);
                String ans=ansbox.getText().toString();
                bundle.putString("ans",ans);
                intent.putExtras(bundle);// 将Bundle对象放入到Intent上
                startActivity(intent);
                return false;
            }
        });


    }
}
