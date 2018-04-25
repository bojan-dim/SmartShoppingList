package elsys.org.smartshoppinglist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private final Button addListButton = findViewById(R.id.button_add_list);
    private final Button showListsButton = findViewById(R.id.button_show_lists);
    private final Button removeListButton = findViewById(R.id.button_remove_list);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        addListButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent addListIntent = new Intent(MenuActivity.this, MenuActivity.class);
                startActivity(addListIntent);
            }
        });

        showListsButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent showListIntent = new Intent(MenuActivity.this, MenuActivity.class);
                startActivity(showListIntent);
            }
        });

        removeListButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent removeListIntent = new Intent(MenuActivity.this, MenuActivity.class);
                startActivity(removeListIntent);
            }
        });
    }
}
