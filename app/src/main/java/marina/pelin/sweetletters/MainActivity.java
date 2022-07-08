package marina.pelin.sweetletters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;
    ImageButton imageButton0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton0=(ImageButton)findViewById(R.id.imageButton0);
        imageButton0.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                imageButton0.setImageResource(R.drawable.letter);
                                            }
                                        }

     );
        imageButton=(ImageButton)findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ///если картинка с инета imageButton.setImageURI();

                imageButton.setImageResource(R.drawable.spots);
            }
        });
        imageButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                imageButton.setImageResource(R.drawable.settings);
                return false;
            }
        });
    }
}
