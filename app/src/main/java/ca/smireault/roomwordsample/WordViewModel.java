package ca.smireault.roomwordsample;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import java.util.List;

// Separates the UI from the Repository.
// Responsible for holding and changing the data that is drawn to the UI.
public class WordViewModel extends AndroidViewModel {
    private WordRepository mRepository;
    private LiveData<List<Word>> mAllWords;

    public WordViewModel (Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    LiveData<List<Word>> getmAllWords() { return mAllWords; }

    public void insert(Word word) { mRepository.insert(word); }
}
