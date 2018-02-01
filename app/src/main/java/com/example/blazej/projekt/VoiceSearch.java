package com.example.blazej.projekt;

import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class VoiceSearch extends AppCompatActivity {

    private EditText edit,edit2,edit3,edit4,edit5,edit6,edit7,edit8,edit9,edit10,edit11,edit12,edit13;
    FloatingActionButton fab1,fab2,fab3,fab4,fab5,fab6,fab7,fab8,fab9,fab10,fab11,fab12,fab13,
    fabVoice1,fabVoice2,fabVoice3,fabVoice4,fabVoice5,fabVoice6,fabVoice7,fabVoice8,fabVoice9,
            fabVoice10,fabVoice11,fabVoice12;

    Button btn;
    private String result = "";
    List<String> voiceList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voice_search);
        edit = (EditText) findViewById(R.id.editText3);
        edit2 = (EditText) findViewById(R.id.editText4);
        edit3 = (EditText) findViewById(R.id.editText5);
        edit4 = (EditText) findViewById(R.id.editText6);
        edit5 = (EditText) findViewById(R.id.editText7);
        edit6 = (EditText) findViewById(R.id.editText8);
        edit7 = (EditText) findViewById(R.id.editText9);
        edit8 = (EditText) findViewById(R.id.editText10);
        edit9 = (EditText) findViewById(R.id.editText11);
        edit10 = (EditText) findViewById(R.id.editText12);
        edit11 = (EditText) findViewById(R.id.editText13);
        edit12 = (EditText) findViewById(R.id.editText14);
        edit13 = (EditText) findViewById(R.id.editText15);

        fab1 = findViewById(R.id.floatingActionButton20);
        fab2 = findViewById(R.id.floatingActionButton33);
        fab3 = findViewById(R.id.floatingActionButton34);
        fab4 = findViewById(R.id.floatingActionButton35);
        fab5 = findViewById(R.id.floatingActionButton36);
        fab6 = findViewById(R.id.floatingActionButton37);
        fab7 = findViewById(R.id.floatingActionButton38);
        fab8 = findViewById(R.id.floatingActionButton39);
        fab9 = findViewById(R.id.floatingActionButton40);
        fab10 = findViewById(R.id.floatingActionButton41);
        fab11 = findViewById(R.id.floatingActionButton42);
        fab12 = findViewById(R.id.floatingActionButton43);

        btn = findViewById(R.id.button3);

        fabVoice1 = findViewById(R.id.floatingActionButton21);
        fabVoice2 = findViewById(R.id.floatingActionButton22);
        fabVoice3 = findViewById(R.id.floatingActionButton23);
        fabVoice4 = findViewById(R.id.floatingActionButton24);
        fabVoice5 = findViewById(R.id.floatingActionButton25);
        fabVoice6 = findViewById(R.id.floatingActionButton26);
        fabVoice7 = findViewById(R.id.floatingActionButton27);
        fabVoice8 = findViewById(R.id.floatingActionButton28);
        fabVoice9 = findViewById(R.id.floatingActionButton29);
        fabVoice10 = findViewById(R.id.floatingActionButton30);
        fabVoice11 = findViewById(R.id.floatingActionButton31);
        fabVoice12 = findViewById(R.id.floatingActionButton32);

        btn.setOnClickListener(v -> {

            if(!edit.getText().toString().equals("")){
                voiceList.add(edit.getText().toString());
            }
            if(!edit2.getText().toString().equals("")){
                voiceList.add(edit2.getText().toString());
            }
            if(!edit3.getText().toString().equals("")){
                voiceList.add(edit3.getText().toString());
            }
            if(!edit4.getText().toString().equals("")){
                voiceList.add(edit4.getText().toString());
            }
            if(!edit5.getText().toString().equals("")){
                voiceList.add(edit5.getText().toString());
            }
            if(!edit6.getText().toString().equals("")){
                voiceList.add(edit6.getText().toString());
            }
            if(!edit7.getText().toString().equals("")){
                voiceList.add(edit7.getText().toString());
            }
            if(!edit8.getText().toString().equals("")){
                voiceList.add(edit8.getText().toString());
            }
            if(!edit9.getText().toString().equals("")){
                voiceList.add(edit9.getText().toString());
            }
            if(!edit10.getText().toString().equals("")){
                voiceList.add(edit10.getText().toString());
            }
            if(!edit11.getText().toString().equals("")){
                voiceList.add(edit11.getText().toString());
            }
            if(!edit12.getText().toString().equals("")){
                voiceList.add(edit12.getText().toString());
            }
            if(!edit13.getText().toString().equals("")){
                voiceList.add(edit13.getText().toString());
            }


            result = voiceList.stream().map(Object::toString).collect(Collectors.joining(","));
            Intent k = new Intent(getBaseContext(), VoiceResult.class);
            k.putExtra("EXTRA1",result);
            startActivity(k);
        });

        fab1.setOnClickListener(view -> {
            fab2.setVisibility(View.VISIBLE);
            fabVoice1.setVisibility(View.VISIBLE);
            edit2.setVisibility(View.VISIBLE);

        });


        fab2.setOnClickListener(view -> {
            fab3.setVisibility(View.VISIBLE);
            fabVoice2.setVisibility(View.VISIBLE);
            edit3.setVisibility(View.VISIBLE);

        });

        fab3.setOnClickListener(view -> {
            fab4.setVisibility(View.VISIBLE);
            fabVoice3.setVisibility(View.VISIBLE);
            edit4.setVisibility(View.VISIBLE);

        });

        fab4.setOnClickListener(view -> {
            fab5.setVisibility(View.VISIBLE);
            fabVoice4.setVisibility(View.VISIBLE);
            edit5.setVisibility(View.VISIBLE);
        });


        fab5.setOnClickListener(view -> {
            fab6.setVisibility(View.VISIBLE);
            fabVoice5.setVisibility(View.VISIBLE);
            edit6.setVisibility(View.VISIBLE);
        });


        fab6.setOnClickListener(view -> {
            fab7.setVisibility(View.VISIBLE);
            fabVoice6.setVisibility(View.VISIBLE);
            edit7.setVisibility(View.VISIBLE);
        });


        fab7.setOnClickListener(view -> {
            fab8.setVisibility(View.VISIBLE);
            fabVoice7.setVisibility(View.VISIBLE);
            edit8.setVisibility(View.VISIBLE);

        });


        fab8.setOnClickListener(view -> {
            fab9.setVisibility(View.VISIBLE);
            fabVoice8.setVisibility(View.VISIBLE);
            edit9.setVisibility(View.VISIBLE);
        });


        fab9.setOnClickListener(view -> {
            fab10.setVisibility(View.VISIBLE);
            fabVoice9.setVisibility(View.VISIBLE);
            edit10.setVisibility(View.VISIBLE);

        });


        fab10.setOnClickListener(view -> {
            fab11.setVisibility(View.VISIBLE);
            fabVoice10.setVisibility(View.VISIBLE);
            edit11.setVisibility(View.VISIBLE);

        });


        fab11.setOnClickListener(view -> {
            fab12.setVisibility(View.VISIBLE);
            fabVoice11.setVisibility(View.VISIBLE);
            edit12.setVisibility(View.VISIBLE);

        });


        fab12.setOnClickListener(view -> {
            fabVoice12.setVisibility(View.VISIBLE);
            edit13.setVisibility(View.VISIBLE);

        });

    }


    public void getSpeechInput(View view){
        Intent intent1 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent1.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent1.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        if(intent1.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent1,10);
        }else {
            Toast.makeText(this,"Your device don't suppoert speech input",Toast.LENGTH_LONG);
        }
    }

    public void getSpeechInput1(View view){
        Intent intent2 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent2.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent2.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        if(intent2.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent2,11);
        }else {
            Toast.makeText(this,"Your device don't suppoert speech input",Toast.LENGTH_LONG);
        }
    }
    public void getSpeechInput2(View view){
        Intent intent3 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent3.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent3.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        if(intent3.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent3,12);
        }else {
            Toast.makeText(this,"Your device don't suppoert speech input",Toast.LENGTH_LONG);
        }
    }

    public void getSpeechInput3(View view){
        Intent intent4 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent4.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent4.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        if(intent4.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent4,13);
        }else {
            Toast.makeText(this,"Your device don't suppoert speech input",Toast.LENGTH_LONG);
        }
    }

    public void getSpeechInput4(View view){
        Intent intent5 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent5.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent5.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        if(intent5.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent5,14);
        }else {
            Toast.makeText(this,"Your device don't suppoert speech input",Toast.LENGTH_LONG);
        }
    }

    public void getSpeechInput5(View view){
        Intent intent6 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent6.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent6.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        if(intent6.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent6,15);
        }else {
            Toast.makeText(this,"Your device don't suppoert speech input",Toast.LENGTH_LONG);
        }
    }

    public void getSpeechInput6(View view){
        Intent intent7 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent7.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent7.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        if(intent7.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent7,16);
        }else {
            Toast.makeText(this,"Your device don't suppoert speech input",Toast.LENGTH_LONG);
        }
    }

    public void getSpeechInput7(View view){
        Intent intent8 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent8.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent8.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        if(intent8.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent8,17);
        }else {
            Toast.makeText(this,"Your device don't suppoert speech input",Toast.LENGTH_LONG);
        }
    }

    public void getSpeechInput8(View view){
        Intent intent9 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent9.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent9.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        if(intent9.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent9,18);
        }else {
            Toast.makeText(this,"Your device don't suppoert speech input",Toast.LENGTH_LONG);
        }
    }

    public void getSpeechInput9(View view){
        Intent intent10 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent10.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent10.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        if(intent10.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent10,19);
        }else {
            Toast.makeText(this,"Your device don't suppoert speech input",Toast.LENGTH_LONG);
        }
    }
    public void getSpeechInput10(View view){
        Intent intent11 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent11.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent11.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        if(intent11.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent11,20);
        }else {
            Toast.makeText(this,"Your device don't suppoert speech input",Toast.LENGTH_LONG);
        }
    }
    public void getSpeechInput11(View view){
        Intent intent12 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent12.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent12.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        if(intent12.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent12,21);
        }else {
            Toast.makeText(this,"Your device don't suppoert speech input",Toast.LENGTH_LONG);
        }
    }
    public void getSpeechInput12(View view){
        Intent intent13 = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent13.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent13.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        if(intent13.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent13,22);
        }else {
            Toast.makeText(this,"Your device don't suppoert speech input",Toast.LENGTH_LONG);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch(requestCode){
            case 10:
                 if(resultCode == RESULT_OK && data !=null){
                     ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                     edit.setText(result.get(0));
                     if(!edit.getText().toString().equals("")){
                         voiceList.add(edit.getText().toString());
                     }
                 }
                break;

            case 11:
                if(resultCode == RESULT_OK && data !=null){
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    edit2.setText(result.get(0));
                    if(!edit2.getText().toString().equals("")){
                        voiceList.add(edit2.getText().toString());
                    }
                }
                break;

            case 12:
                if(resultCode == RESULT_OK && data !=null){
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    edit3.setText(result.get(0));
                    if(!edit3.getText().toString().equals("")){
                        voiceList.add(edit3.getText().toString());
                    }
                }
                break;
            case 13:
                if(resultCode == RESULT_OK && data !=null){
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    edit4.setText(result.get(0));
                    if(!edit4.getText().toString().equals("")){
                        voiceList.add(edit4.getText().toString());
                    }
                }
                break;
            case 14:
                if(resultCode == RESULT_OK && data !=null){
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    edit5.setText(result.get(0));
                    if(!edit5.getText().toString().equals("")){
                        voiceList.add(edit5.getText().toString());
                    }
                }
                break;
            case 15:
                if(resultCode == RESULT_OK && data !=null){
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    edit6.setText(result.get(0));
                    if(!edit6.getText().toString().equals("")){
                        voiceList.add(edit6.getText().toString());
                    }
                }
                break;
            case 16:
                if(resultCode == RESULT_OK && data !=null){
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    edit7.setText(result.get(0));
                    if(!edit7.getText().toString().equals("")){
                        voiceList.add(edit7.getText().toString());
                    }
                }
                break;
            case 17:
                if(resultCode == RESULT_OK && data !=null){
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    edit8.setText(result.get(0));
                    if(!edit8.getText().toString().equals("")){
                        voiceList.add(edit8.getText().toString());
                    }
                }
                break;
            case 18:
                if(resultCode == RESULT_OK && data !=null){
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    edit9.setText(result.get(0));
                    if(!edit9.getText().toString().equals("")){
                        voiceList.add(edit9.getText().toString());
                    }
                }
                break;
            case 19:
                if(resultCode == RESULT_OK && data !=null){
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    edit10.setText(result.get(0));
                    if(!edit10.getText().toString().equals("")){
                        voiceList.add(edit10.getText().toString());
                    }
                }
                break;
            case 20:
                if(resultCode == RESULT_OK && data !=null){
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    edit11.setText(result.get(0));
                    if(!edit11.getText().toString().equals("")){
                        voiceList.add(edit11.getText().toString());
                    }
                }
                break;
            case 21:
                if(resultCode == RESULT_OK && data !=null){
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    edit12.setText(result.get(0));
                    if(!edit12.getText().toString().equals("")){
                        voiceList.add(edit12.getText().toString());
                    }
                }
                break;
            case 22:
                if(resultCode == RESULT_OK && data !=null){
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    edit13.setText(result.get(0));
                    if(!edit13.getText().toString().equals("")){
                        voiceList.add(edit13.getText().toString());
                    }
                }
                break;
        }
    }
}
