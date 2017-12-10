package com.be_happy.nasrallah.steam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class bre extends AppCompatActivity {
    Spinner staticSpinner;
    Spinner staticSpinner1;
    Spinner staticSpinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bre);
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

    void go(View v) {
        String s1, s2, s3;
        s1 = staticSpinner.getSelectedItem().toString();
        s3 = staticSpinner1.getSelectedItem().toString();
        s2 = staticSpinner2.getSelectedItem().toString();
        List<String> test = new ArrayList<String>();

        String car = "None";
        if (s1.equals("New Valley")) {
            if (s2.equals("Sandy loam") || s2.equals("Clay loam") || s2.equals("Silt loam") || s2.equals("Clay")) {
                if (s3.equals("Intermittent")) {
                    test.add("Gimeza 168");
                    test.add("Sakha 93");
                    car = "" +
                            "High yield-leaf rust resistant-high temp-drought tolerant\n" +
                            "Salt soil resistance-leaf rust disease resistant\n";
                } else {
                    test.add("Souds 1");
                    test.add("Misr 1");
                    test.add("Giza 168");
                    test.add("Gimeza 164");
                    car = "Salty soil tolerant-high temperature tolerant-not resistant to leaf rust\n" +
                            "Black leg UG 99 disease resistant-high yield-more branching\n" +
                            "High yield-leaf rust resistant-high temp-drought tolerant\n" +
                            "Coeliac disease resistant-high temp resistant\n";
                }
            } else {
                if (s3.equals("Intermittent")) {
                    test.add("Giza 164");
                    car = "Drought tolerance";
                } else {
                    test.add("Souds 1");
                    car = "Salty soil tolerant-high temperature tolerant-not resistant to leaf rust";
                }
            }
        } else if (s1.equals("Beni Suef")) {
            if (s2.equals("Sandy loam") || s2.equals("Clay loam") || s2.equals("Silt loam") || s2.equals("Clay")) {
                if (s3.equals("Intermittent")) {
                    test.add("Sakha 93");

                    car = "Salt soil resistance-leaf rust disease resistant";
                } else {
                    test.add("Sakha 93");
                    test.add("Gimeza 163");

                    car = "Salt soil resistance-leaf rust disease resistant\n" +
                            "High yield";
                }
            } else {
                if (s3.equals("Intermittent")) {
                    test.add("Giza 164");
                    car = "Drought tolerance";
                } else {
                    test.add("Giza 164");
                    car = "Drought tolerance";
                }
            }
        } else if (s1.equals("Minya")) {
            if (s2.equals("Sandy loam") || s2.equals("Clay loam") || s2.equals("Silt loam") || s2.equals("Clay")) {
                if (s3.equals("Intermittent")) {
                    test.add("Gimeza 164");
                    test.add("Giza 164");

                    car = "Coeliac disease resistant-high temp resistant\n" +
                            "Drought tolerance";
                } else {
                    test.add("Souds 1");
                    test.add("Sakha 93");
                    test.add("Souds 12");
                    test.add("Gimeza 165");

                    car = "Salt soil tolerant-high temperature tolerant-not resistant to leaf rust\n" +
                            "Salt soil resistance-leaf rust disease resistant\n" +
                            "High yield\n" +
                            "High temp resistant\n";
                }
            } else {
                if (s3.equals("Intermittent")) {
                    test.add("Souds 1");
                    test.add("Giza 164");
                    car = "Salt soil tolerant-high temperature tolerant-not resistant to leaf rust\n" +
                            "Drought tolerance";
                } else {
                    test.add("Souds 1");
                    car = "Salt soil tolerant-high temperature tolerant-not resistant to leaf rust";
                }
            }
        } else if (s1.equals("Faiyum")) {
            if (s2.equals("Sandy loam") || s2.equals("Clay loam") || s2.equals("Silt loam") || s2.equals("Clay")) {
                if (s3.equals("Intermittent")) {
                    test.add("Gimeza 1");


                    car = "Drought tolerance";
                } else {
                    test.add("Misr 1");
                    test.add("Misr 2");
                    test.add("Gimeza 1");


                    car = "Black leg UG 99 disease resistant-high yield-more branching\n" +
                            "Black leg UG 99 disease resistant-high yield-more branching\n" +
                            "Drought tolerance\n";
                }
            } else {
                if (s3.equals("Intermittent")) {
                    test.add("Gimeza 1");

                    car = "Drought tolerance";
                } else {
                    test.add("Gimeza 1");

                    car = "Drought tolerance";
                }
            }
        } else if (s1.equals("Asyut")) {
            if (s2.equals("Sandy loam") || s2.equals("Clay loam") || s2.equals("Silt loam") || s2.equals("Clay")) {
                if (s3.equals("Intermittent")) {
                    test.add("Giza 164");


                    car = "Drought tolerance";
                } else {
                    test.add("Sakha 93");
                    test.add("Souds 13");
                    test.add("Giza 164");


                    car = "Salt soil resistance-leaf rust disease resistant\n" +
                            "High yield\n" +
                            "Drought tolerance\n";
                }
            } else {
                if (s3.equals("Intermittent")) {
                    test.add("Giza 164");

                    car = "Drought tolerance";
                } else {
                    test.add("Sakha 93");
                    test.add("Giza 164");

                    car = "Salt soil resistance-leaf rust disease resistant\n" +
                            "Drought tolerance\n";
                }
            }
        } else if (s1.equals("Sohag")) {
            if (s2.equals("Sandy loam") || s2.equals("Clay loam") || s2.equals("Silt loam") || s2.equals("Clay")) {
                if (s3.equals("Intermittent")) {
                    test.add("Giza 164");


                    car = "Drought tolerance";
                } else {
                    test.add("Sakha 93");

                    test.add("Giza 164");


                    car = "Salt soil resistance-leaf rust disease resistant\n" +
                            "Drought tolerance\n";
                }
            } else {
                if (s3.equals("Intermittent")) {
                    test.add("Giza 164");


                } else {
                    test.add("Sakha 93");
                    test.add("Giza 164");

                    car = "Salt soil resistance-leaf rust disease resistant";
                }
            }
        } else if (s1.equals("Matruh")) {
            if (s2.equals("Sandy loam") || s2.equals("Clay loam") || s2.equals("Silt loam") || s2.equals("Clay")) {
                if (s3.equals("Intermittent")) {
                    test.add("Sakha 8");
                    test.add("Gimeza 1");


                    car = "Salt soil resistance\n" +
                            "Drought tolerance\n";
                } else {
                    test.add("Sakha 8");

                    test.add("Gimeza 1");
                    test.add("Giza 155");

                    test.add("Sakha 93");


                    car = "Salt soil resistance\n" +
                            "Drought tolerant\n" +
                            "Less fertilizer-drought\n" +
                            "Salt soil resistance-leaf rust disease resistant\n";
                }
            } else {
                if (s3.equals("Intermittent")) {
                    test.add("Sakha 8");
                    test.add("Gimeza 1");
                    test.add("Sakha 93");

                    car = "Salt soil resistance\n" +
                            "Drought tolerant\n" +
                            "Salt soil resistance-leaf rust disease resistant\n";

                } else {
                    test.add("Sakha 8");
                    test.add("Gimeza 1");
                    test.add("Sakha 93");

                    car = "Salt soil resistance\n" +
                            "Drought tolerant\n" +
                            "Salt soil resistance-leaf rust disease resistant\n";
                }
            }
        } else if (s1.equals("Red Sea")) {
            if (s2.equals("Sandy loam") || s2.equals("Clay loam") || s2.equals("Silt loam") || s2.equals("Clay")) {
                if (s3.equals("Intermittent")) {
                    test.add("Giza 164");
                    car = "Drought tolerance";
                } else {
                    test.add("Sakha 93");

                    car = "Salt soil resistance-leaf rust disease resistant\n";
                }
            } else {
                if (s3.equals("Intermittent")) {
                    test.add("Sakha 93");

                    car = "Salt soil resistance-leaf rust disease resistant\n";

                } else {
                    test.add("Sakha 93");

                    car = "Salt soil resistance-leaf rust disease resistant\n";
                }
            }
        } else if (s1.equals("Sharqia")) {
            if (s2.equals("Sandy loam") || s2.equals("Clay loam") || s2.equals("Silt loam") || s2.equals("Clay")) {
                if (s3.equals("Intermittent")) {
                    test.add("Gimeza 1");
                    test.add("Giza 164");
                    car = "Drought tolerant\n" +
                            "Drought tolerance\n";
                } else {
                    test.add("Gemiza 12");
                    test.add("Souds 12");

                    car = "High yield-leaf rust disease resistant\n" +
                            "High yield\n";
                }
            } else {
                if (s3.equals("Intermittent")) {
                    test.add("Gimeza 1");
                    test.add("Giza 164");
                    car = "Drought tolerant\n" +
                            "Drought tolerance\n";

                } else {
                    test.add("Gimeza 1");
                    test.add("Giza 164");
                    car = "Drought tolerant\n" +
                            "Drought tolerance\n";
                }
            }
        } else if (s1.equals("Kafr el-Sheikh")) {
            if (s2.equals("Sandy loam") || s2.equals("Clay loam") || s2.equals("Silt loam") || s2.equals("Clay")) {
                if (s3.equals("Intermittent")) {
                    test.add("Gimeza 1");

                    car = "Drought tolerant";
                } else {
                    test.add("Gemiza 10");
                    test.add("Souds 12");
                    test.add("Misr 1");
                    car = "High yield-leaf rust disease resistant\n" +
                            "High yield\n" +
                            "Black leg UG 99 disease resistant-high yield-more branching\n";
                }
            } else {
                if (s3.equals("Intermittent")) {
                    test.add("Gimeza 1");
                    test.add("Giza 164");
                    car = "Drought tolerant";

                } else {
                    test.add("Gimeza 1");
                    test.add("Giza 164");
                    car = "Drought tolerant";
                }
            }
        } else if (s1.equals("Alexandria")) {
            if (s2.equals("Sandy loam") || s2.equals("Clay loam") || s2.equals("Silt loam") || s2.equals("Clay")) {
                if (s3.equals("Intermittent")) {
                    test.add("Giza 168");
                    test.add("Giza 164");

                    car = "High yield-leaf rust resistant-high temp-drought tolerant";
                } else {
                    test.add("Giza 168");
                    test.add("Sakha 93");
                    test.add("Misr 1");
                    car = "Salt soil resistance-leaf rust disease resistant\n" +
                            "Black leg UG 99 disease resistant-high yield-more branching\n";
                }
            } else {
                if (s3.equals("Intermittent")) {
                    test.add("Giza 168");
                    test.add("Giza 164");
                    car = "High yield-leaf rust resistant-high temp-drought tolerant";

                } else {

                    test.add("Giza 168");
                    car = "High yield-leaf rust resistant-high temp-drought tolerant";
                }
            }
        } else if (s1.equals("Monufia")) {
            if (s2.equals("Sandy loam") || s2.equals("Clay loam") || s2.equals("Silt loam") || s2.equals("Clay")) {
                if (s3.equals("Intermittent")) {
                    test.add("Giza 164");
                    car = "Drought tolerance";
                } else {
                    test.add("Gemiza 11");
                    test.add("Souds 13");
                    test.add("Misr 1");
                    car = "High yield-leaf rust disease resistant\n" +
                            "High yield\n" +
                            "Black leg UG 99 disease resistant-high yield-more branching\n";
                }
            } else {
                if (s3.equals("Intermittent")) {
                    test.add("Giza 164");
                    car = "Drought tolerance";

                } else {

                    test.add("Giza 164");
                    car = "Drought tolerance";
                }
            }
        }

        Intent intent = new Intent(this, go.class);
        intent.putStringArrayListExtra("list", (ArrayList<String>) test);
        intent.putExtra("car", car);
        startActivity(intent);
    }
}
