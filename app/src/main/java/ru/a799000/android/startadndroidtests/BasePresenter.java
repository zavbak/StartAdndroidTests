package ru.a799000.android.startadndroidtests;

/**
 * Created by user on 28.07.2017.
 */

public class BasePresenter<V> {

    private V view;

    void attachView(V view) {
        this.view = view;
    }

    V getView() {
        return view;
    }

    void detachView() {
        view = null;
    }

}
