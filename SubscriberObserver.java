public interface SubscriberObserver {
    void update(String headline, String category, String content, String timestamp);
}