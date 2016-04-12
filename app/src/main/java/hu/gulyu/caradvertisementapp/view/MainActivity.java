package hu.gulyu.caradvertisementapp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.inject.Inject;

import hu.gulyu.caradvertisementapp.CarAdvertisementApplication;
import hu.gulyu.caradvertisementapp.R;
import hu.gulyu.caradvertisementapp.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainView{

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CarAdvertisementApplication.injector.inject(this);

        findViewById(R.id.btnBtn).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.setUserData();
                mainPresenter.getUserData();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mainPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.detachView();
    }

    @Override
    public void showUserData(String name, String password) {
        String msg = String.format("Sikeres bejelentkezés!\nNév: %s;\nJelszó: %s;", name, password);
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public String getUserName(){
        return ((EditText)findViewById(R.id.felh_nev)).getText().toString();
    }

    @Override
    public String getPassword(){
        return ((EditText)findViewById(R.id.password)).getText().toString();
    }
}
