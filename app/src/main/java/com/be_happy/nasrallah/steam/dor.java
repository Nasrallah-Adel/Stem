package com.be_happy.nasrallah.steam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class dor extends AppCompatActivity {
    Spinner staticSpinner;
    Spinner staticSpinner1;
    Spinner staticSpinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dor);
        staticSpinner = (Spinner) findViewById(R.id.static_spinner);
        staticSpinner1 = (Spinner) findViewById(R.id.static_spinner1);
        staticSpinner2 = (Spinner) findViewById(R.id.static_spinner2);
        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter
                .createFromResource(this, R.array.array,
                        android.R.layout.simple_spinner_item);
        staticAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        staticSpinner.setAdapter(staticAdapter);
        ArrayAdapter<CharSequence> staticAdapter1 = ArrayAdapter
                .createFromResource(this, R.array.array2,
                        android.R.layout.simple_spinner_item);
        staticAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        staticSpinner1.setAdapter(staticAdapter1);
        ArrayAdapter<CharSequence> staticAdapter2 = ArrayAdapter
                .createFromResource(this, R.array.array1,
                        android.R.layout.simple_spinner_item);
        staticAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        staticSpinner2.setAdapter(staticAdapter2);
    }

    void goo(View v) {
        String s1, s2, s3;
        s1 = staticSpinner.getSelectedItem().toString();
        s3 = staticSpinner1.getSelectedItem().toString();
        s2 = staticSpinner2.getSelectedItem().toString();
        List<String> test = new ArrayList<String>();

        String car = "None";
        if (s1.equals("New Valley")) {
            if (s2.equals("Sandy loam") || s2.equals("Clay loam") || s2.equals("Silt loam") || s2.equals("Clay")) {
                if (s3.equals("Intermittent")) {
                    test.add("Beni Suef 1");
                } else {
                    test.add("Beni Suef 1");
                }
            } else {
                if (s3.equals("Intermittent")) {
                    test.add("None is available - Try Bread Wheat Instead)");
                } else {
                    test.add("None is available - Try Bread Wheat Instead)");
                }
            }
        } else if (s1.equals("Beni Suef")) {
            if (s2.equals("Sandy loam") || s2.equals("Clay loam") || s2.equals("Silt loam") || s2.equals("Clay")) {
                if (s3.equals("Intermittent")) {
                    test.add("Beni Suef 1");
                } else {
                    test.add("Beni Suef 1");
                    test.add("Beni Suef 4");
                    test.add("Beni Suef 5");
                }
            } else {
                if (s3.equals("Intermittent")) {
                    test.add("None is available - Try Bread Wheat Instead)");
                } else {
                    test.add("None is available - Try Bread Wheat Instead)");
                }
            }
        } else if (s1.equals("Minya")) {
            if (s2.equals("Sandy loam") || s2.equals("Clay loam") || s2.equals("Silt loam") || s2.equals("Clay")) {
                if (s3.equals("Intermittent")) {
                    test.add("(None is available - Try Bread Wheat Instead)");
                } else {
                    test.add("Souhag 3");
                    test.add("Beni Suef 4");
                    test.add("Beni Suef 5");
                }
            } else {
                if (s3.equals("Intermittent")) {
                    test.add("None is available - Try Bread Wheat Instead)");
                } else {
                    test.add("None is available - Try Bread Wheat Instead)");
                }
            }
        } else if (s1.equals("Faiyum")) {
            if (s2.equals("Sandy loam") || s2.equals("Clay loam") || s2.equals("Silt loam") || s2.equals("Clay")) {
                if (s3.equals("Intermittent")) {
                    test.add("(None is available - Try Bread Wheat Instead)");
                } else {
                    test.add("Souhag 1");

                }
            } else {
                if (s3.equals("Intermittent")) {
                    test.add("None is available - Try Bread Wheat Instead)");
                } else {
                    test.add("None is available - Try Bread Wheat Instead)");
                }
            }
        } else if (s1.equals("Asyut")) {
            if (s2.equals("Sandy loam") || s2.equals("Clay loam") || s2.equals("Silt loam") || s2.equals("Clay")) {
                if (s3.equals("Intermittent")) {
                    test.add("(None is available - Try Bread Wheat Instead)");
                } else {
                    test.add("Souhag 2");
                    test.add("Souhag 3");

                }
            } else {
                if (s3.equals("Intermittent")) {
                    test.add("None is available - Try Bread Wheat Instead)");
                } else {
                    test.add("None is available - Try Bread Wheat Instead)");
                }
            }
        } else if (s1.equals("Sohag")) {
            if (s2.equals("Sandy loam") || s2.equals("Clay loam") || s2.equals("Silt loam") || s2.equals("Clay")) {
                if (s3.equals("Intermittent")) {
                    test.add("(None is available - Try Bread Wheat Instead)");
                } else {
                    test.add("Souhag 2");
                    test.add("Souhag 3");

                }
            } else {
                if (s3.equals("Intermittent")) {
                    test.add("None is available - Try Bread Wheat Instead)");
                } else {
                    test.add("None is available - Try Bread Wheat Instead)");
                }
            }
        }

        Intent intent=new Intent(this, go.class);
        intent.putStringArrayListExtra("list", (ArrayList<String>)test);
        intent.putExtra("car",car);
        intent.putExtra("list", (Serializable) test);
        startActivity(intent);
    }
}
