package com.mistershorr.synthesizer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final int WHOLE_NOTE = 1000;
    private NumberPicker num, numNote;
    private Button aButton, asButton, bButton, cButton, csButton, dButton, dsButton, eButton, fButton, fsButton, gButton, gsButton, challenge1, numnotes, c3, c5;
    private MediaPlayer aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote, gNote, gsNote, highaNote, highbNote, highcNote, highcsNote, highdNote, higheNote, highfsNote;
    private MediaPlayer[] notes, c3a, twinkle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        CreateMediaPlayers();

    }

    private void CreateMediaPlayers() {
        aNote = MediaPlayer.create(this, R.raw.scalea);
        asNote = MediaPlayer.create(this, R.raw.scalebb);
        bNote = MediaPlayer.create(this, R.raw.scaleb);
        cNote = MediaPlayer.create(this, R.raw.scalec);
        csNote = MediaPlayer.create(this, R.raw.scalecs);
        dNote = MediaPlayer.create(this, R.raw.scaled);
        dsNote = MediaPlayer.create(this, R.raw.scaleds);
        eNote = MediaPlayer.create(this, R.raw.scalee);
        fNote = MediaPlayer.create(this, R.raw.scalef);
        fsNote = MediaPlayer.create(this, R.raw.scalefs);
        gNote = MediaPlayer.create(this, R.raw.scaleg);
        gsNote = MediaPlayer.create(this, R.raw.scalegs);
        highaNote = MediaPlayer.create(this, R.raw.scalehigha);
        highbNote = MediaPlayer.create(this, R.raw.scalehighb);
        highcNote = MediaPlayer.create(this, R.raw.scalehighc);
        highcsNote = MediaPlayer.create(this, R.raw.scalehighcs);
        highdNote = MediaPlayer.create(this, R.raw.scalehighd);
        higheNote = MediaPlayer.create(this, R.raw.scalehighe);
        highfsNote = MediaPlayer.create(this, R.raw.scalehighfs);
        notes = new MediaPlayer[]{aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote, gNote, gsNote};
        c3a = new MediaPlayer[]{eNote, fNote, fsNote, gNote, gsNote, highaNote, highbNote, highcsNote, highdNote, higheNote};
        twinkle = new MediaPlayer[]{highaNote, highaNote, higheNote, higheNote, highfsNote, highfsNote, higheNote, highdNote, highdNote, highcsNote, highcsNote, highbNote, highbNote, highaNote};

    }

    private void setListeners() {
        aButton.setOnClickListener(this);
        asButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gsButton.setOnClickListener(this);
        challenge1.setOnClickListener(this);
        numnotes.setOnClickListener(this);
        c3.setOnClickListener(this);
        c5.setOnClickListener(this);
        numNote = (NumberPicker) findViewById(R.id.numNote);
        numNote.setMaxValue(12);
        numNote.setMinValue(1);
        numNote.setDisplayedValues(new String[]{"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"});
        num = (NumberPicker) findViewById(R.id.num);
        num.setMaxValue(5);
        num.setMinValue(1);

    }

    private void wireWidgets() {
        aButton = (Button) findViewById(R.id.button_a);
        asButton = (Button) findViewById(R.id.button_as);
        bButton = (Button) findViewById(R.id.button_b);
        cButton = (Button) findViewById(R.id.button_c);
        csButton = (Button) findViewById(R.id.button_cs);
        dButton = (Button) findViewById(R.id.button_d);
        dsButton = (Button) findViewById(R.id.button_ds);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fsButton = (Button) findViewById(R.id.button_fs);
        gButton = (Button) findViewById(R.id.button_g);
        gsButton = (Button) findViewById(R.id.button_gs);
        challenge1 = (Button) findViewById(R.id.button_challenge1);
        numnotes = (Button) findViewById(R.id.button_notes);
        c3 = (Button) findViewById(R.id.button_c3);
        c5 = (Button) findViewById(R.id.button_c5);

    }

    private void delayPlaying(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_a:
                aNote.seekTo(0);
                aNote.start();
                delayPlaying(1000);
                break;
            case R.id.button_as:
                asNote.seekTo(0);
                asNote.start();
                break;
            case R.id.button_b:
                bNote.seekTo(0);
                bNote.start();
                break;
            case R.id.button_c:
                cNote.seekTo(0);
                cNote.start();
                break;
            case R.id.button_cs:
                csNote.seekTo(0);
                csNote.start();
                break;
            case R.id.button_d:
                dNote.seekTo(0);
                dNote.start();
                break;
            case R.id.button_ds:
                dsNote.seekTo(0);
                dsNote.start();
                break;
            case R.id.button_e:
                eNote.seekTo(0);
                eNote.start();
                break;
            case R.id.button_f:
                fNote.seekTo(0);
                fNote.start();
                break;
            case R.id.button_fs:
                fsNote.seekTo(0);
                fsNote.start();
                break;
            case R.id.button_g:
                gNote.seekTo(0);
                gNote.start();
                break;
            case R.id.button_gs:
                gsNote.seekTo(0);
                gsNote.start();
                break;
            case R.id.button_challenge1:
                eNote.seekTo(0);
                eNote.start();
                delayPlaying(500);
                fsNote.seekTo(0);
                fsNote.start();
                delayPlaying(500);
                gNote.seekTo(0);
                gNote.start();
                delayPlaying(500);
                highaNote.seekTo(0);
                highaNote.start();
                delayPlaying(500);
                highbNote.seekTo(0);
                highbNote.start();
                delayPlaying(500);
                highcsNote.seekTo(0);
                highcsNote.start();
                delayPlaying(500);
                highdNote.seekTo(0);
                highdNote.start();
                delayPlaying(500);
                higheNote.seekTo(0);
                higheNote.start();
                delayPlaying(500);
            case R.id.button_notes:
                for (int i = 0; i < num.getValue(); i++) {
                    MediaPlayer a = notes[numNote.getValue() - 1];
                    a.seekTo(0);
                    a.start();
                    delayPlaying(500);
                }
            case R.id.button_c3:
                for (int i = 0; i < c3a.length; i++) {
                    MediaPlayer a = c3a[i];
                    a.seekTo(0);
                    a.start();
                    delayPlaying(500);
                }
            case R.id.button_c5:
                for (int i = 0; i < twinkle.length; i++) {
                    MediaPlayer a = twinkle[i];
                    a.seekTo(0);
                    a.start();
                    delayPlaying(550);
                }
            default:
                        //the else statement basically


                }
        }
    }

