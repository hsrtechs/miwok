package com.example.android.miwok;


class Word {

    private String _englishWord;
    private String _miwokWord;

    Word(String englishWord, String miwokWord){
        _englishWord = englishWord;
        _miwokWord = miwokWord;
    }

    String getEnglish()
    {
        return _englishWord;
    }

    String getMiwok()
    {
        return _miwokWord;
    }
}
