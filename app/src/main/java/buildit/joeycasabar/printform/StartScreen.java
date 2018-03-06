package buildit.joeycasabar.printform;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Switch;

public class StartScreen extends AppCompatActivity {
    Switch flatsideYes;
    Switch holesYes;
    Switch singlePieceYes;
    Switch detailsYes;
    Switch supportYes;
    RadioGroup sizeSelect;
    RadioGroup specialTypeSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);

        flatsideYes = (Switch) findViewById(R.id.flatSide);
        holesYes = (Switch) findViewById(R.id.tooManyHoles);
        singlePieceYes = (Switch) findViewById(R.id.multiPart);
        detailsYes = (Switch) findViewById(R.id.details);
        supportYes = (Switch) findViewById(R.id.support);
        sizeSelect = (RadioGroup) findViewById(R.id.sizeGroup);
        specialTypeSelect = (RadioGroup) findViewById(R.id.specialTypeGroup);
        sizeSelect.check(R.id.size2);
        specialTypeSelect.check(R.id.shape1);


//        Button resetInput = (Button) findViewById(R.id.reset);
//        resetInput.setOnClickListener(new View.OnClickListener() {
//            public void onClick (View view) {
//
//            }
//        });
    }

    public void resetForm(View view) {
        flatsideYes.setChecked(false);
        holesYes.setChecked(false);
        singlePieceYes.setChecked(false);
        detailsYes.setChecked(false);
        supportYes.setChecked(false);
        sizeSelect.check(R.id.size2);
        specialTypeSelect.check(R.id.shape1);
    }

    public void displayResults(View view) {
        Intent showResults = new Intent(this, Results.class);
        startActivity(showResults);
    }


}
