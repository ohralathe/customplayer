package piglet.mp3player;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Mp3player extends Activity {

    // private Button buttonPlayStop;
    // private MediaPlayer mediaPlayer;
    // private SeekBar seekBar;
    //
    // private final Handler handler = new Handler();

    // Here i override onCreate method.
    //
    // setContentView() method set the layout that you will see then
    // the application will starts
    //
    // initViews() method i create to init views components.
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.intro);

        Thread thread = new Thread() {

            @Override
            public void run() {

                try {
                    sleep(10);
                    Intent playListIntent = new Intent("piglet.mp3player.controller.MAIN");
                    // Intent playListIntent = new
                    // Intent("piglet.mp3player.controller.PLAYLISTACTIVITY");
                    startActivity(playListIntent);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } finally {
                    finish();
                }
            }

        };
        thread.start();
        // initViews();

    }
    // // This method set the setOnClickListener and method for it
    // (buttonClick())
    // private void initViews() {
    // buttonPlayStop = (Button) findViewById(R.id.stopBtn);
    // buttonPlayStop.setOnClickListener(new OnClickListener() {
    // @Override
    // public void onClick(View v) {
    // buttonClick();
    // }
    // });
    //
    // mediaPlayer = MediaPlayer.create(this, R.raw.testsong_20_sec);
    //
    // seekBar = (SeekBar) findViewById(R.id.SeekBar01);
    // seekBar.setMax(mediaPlayer.getDuration());
    // seekBar.setOnTouchListener(new OnTouchListener() {
    // @Override
    // public boolean onTouch(View v, MotionEvent event) {
    // seekChange(v);
    // return false;
    // }
    // });
    //
    // }
    //
    // public void startPlayProgressUpdater() {
    // seekBar.setProgress(mediaPlayer.getCurrentPosition());
    //
    // if (mediaPlayer.isPlaying()) {
    // Runnable notification = new Runnable() {
    // @Override
    // public void run() {
    // startPlayProgressUpdater();
    // }
    // };
    // handler.postDelayed(notification, 1000);
    // } else {
    // mediaPlayer.pause();
    // buttonPlayStop.setText(getString(R.string.play_str));
    // seekBar.setProgress(0);
    // }
    // }
    //
    // // This is event handler thumb moving event
    // private void seekChange(View v) {
    // if (mediaPlayer.isPlaying()) {
    // SeekBar sb = (SeekBar) v;
    // mediaPlayer.seekTo(sb.getProgress());
    // }
    // }
    //
    // // This is event handler for buttonClick event
    // private void buttonClick() {
    // if (buttonPlayStop.getText() == getString(R.string.play_str)) {
    // buttonPlayStop.setText(getString(R.string.pause_str));
    // try {
    // mediaPlayer.start();
    // startPlayProgressUpdater();
    // } catch (IllegalStateException e) {
    // mediaPlayer.pause();
    // }
    // } else {
    // buttonPlayStop.setText(getString(R.string.play_str));
    // mediaPlayer.pause();
    // }
    // }
}