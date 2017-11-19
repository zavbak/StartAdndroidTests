package ru.a799000.android.startadndroidtests;

import java.util.List;

/**
 * Created by user on 28.07.2017.
 */

public interface OrderListContract {

    interface View {
        void showOrders(List<Order> orders);

        void showError(String message);

        void showProgress();
        void hideProgress();
    }

    interface Presenter {
        void refresh();
    }
}
