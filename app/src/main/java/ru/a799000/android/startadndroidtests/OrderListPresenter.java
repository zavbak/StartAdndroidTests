package ru.a799000.android.startadndroidtests;

import android.support.annotation.NonNull;

import java.util.List;

import rx.Scheduler;


public class OrderListPresenter extends BasePresenter<OrderListContract.View>
        implements OrderListContract.Presenter {

    private final OrderRepository orderRepository;
    private final Scheduler workScheduler, resultScheduler;

    public OrderListPresenter(OrderRepository orderRepository, Scheduler workScheduler, Scheduler resultScheduler) {
        this.orderRepository = orderRepository;
        this.workScheduler = workScheduler;
        this.resultScheduler = resultScheduler;
    }

    @Override
    public void refresh() {
        if (getView() == null) return;
        getView().showProgress();
        orderRepository.getOrders()
                .subscribeOn(workScheduler)
                .observeOn(resultScheduler)
                .subscribe(orders -> {

                            if (getView() == null) return;

                            getView().hideProgress();
                            getView().showOrders(orders);


                        }, throwable -> {

                            if (getView() == null) return;

                            getView().hideProgress();
                            getView().showError(throwable.getMessage());


                        }
                );


    }
}