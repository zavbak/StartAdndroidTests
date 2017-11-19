package ru.a799000.android.startadndroidtests;

import java.util.List;

import rx.Observable;

/**
 * Created by user on 28.07.2017.
 */

public interface OrderRepository {
    Observable<List<Order>> getOrders();
}
