package com.cpets.sp.serviceexample;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class ServiceClass extends Service {
    private MediaPlayer player;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
    //player=MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
    player=MediaPlayer.create(this, R.raw.song);
    player.setLooping(true);
    player.start();
    return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }
}
