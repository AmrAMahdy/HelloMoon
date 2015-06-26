package com.android.n1amr.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by N1amr on 2015/06/26.
 */
public class AudioPlayer {
    private MediaPlayer mMediaPlayer;

    public void stop() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

    public void play(Context context) {
        mMediaPlayer = MediaPlayer.create(context, R.raw.one_small_step);
        mMediaPlayer.start();
    }
}
