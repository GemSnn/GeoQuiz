package com.bignerdranch.android.geoquiz;

import android.speech.tts.TextToSpeech;

public class Question {
    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    private int mTextResId;

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    private boolean mAnswerTrue;
    public Question (int textResId,boolean answerTrue)
    {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }


}
