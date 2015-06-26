package com.android.n1amr.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by N1amr on 2015/06/26.
 */
public class AudioPlayer {
    public MediaPlayer mMediaPlayer;

    public void stop() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

    public void play(final Context context) {
        stop();

        mMediaPlayer = MediaPlayer.create(context, R.raw.one_small_step);

        mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stop();
            }
        });

        mMediaPlayer.start();
    }

    public void pause() {
        if (mMediaPlayer != null)
            mMediaPlayer.pause();
    }

    public void resume(Context context) {
        if (mMediaPlayer == null) {
            play(context);
        } else {
            mMediaPlayer.start();
        }
    }


}
