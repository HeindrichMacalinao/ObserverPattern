public interface NewsSubject {
    void attach(SubscriberObserver s);
    void detach(SubscriberObserver s);
    void notifySubscribers();
}