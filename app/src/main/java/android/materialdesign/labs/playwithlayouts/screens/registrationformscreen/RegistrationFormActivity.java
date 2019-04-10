package android.materialdesign.labs.playwithlayouts.screens.registrationformscreen;

import android.animation.ObjectAnimator;
import android.app.ActivityOptions;
import android.materialdesign.labs.playwithlayouts.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class RegistrationFormActivity extends AppCompatActivity {

    Button registerBtn;
    Animation registerBtnAnimation;
    ObjectAnimator registerBtnobAnimation;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);
        initComponents();
    }

    private void initComponents(){
        registerBtn = findViewById(R.id.buttonRegister);
        setAnimations();
        setListeners();
    }

    private void setAnimations(){
        registerBtnAnimation = AnimationUtils.loadAnimation(this,R.anim.raised_btn);
        bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();

        registerBtnobAnimation = ObjectAnimator.ofFloat(registerBtn,"x",800);
        registerBtnobAnimation.setRepeatCount(1);
        registerBtnobAnimation.setRepeatMode(ObjectAnimator.REVERSE);
        registerBtnobAnimation.setDuration(2000);
    }

    private void setListeners(){

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerBtn.startAnimation(registerBtnAnimation);
            }
        });
    }
}
