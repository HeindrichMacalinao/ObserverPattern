import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsSubject {
    private List<SubscriberObserver> subscriberList = new ArrayList<>();
    private String agencyName;
    private String headline;
    private String category;
    private String content;
    private String timestamp;

    public NewsAgency(String agencyName) {
        this.agencyName = agencyName;
    }

    public void attach(SubscriberObserver s) {
        if (!subscriberList.contains(s)) {
            subscriberList.add(s);
            System.out.println("[+] " + s + " subscribed to " + agencyName);
        }
    }

    public void detach(SubscriberObserver s) {
        if (subscriberList.remove(s)) {
            System.out.println("[-] " + s + " unsubscribed from " + agencyName);
        }
    }

    public void notifySubscribers() {
        System.out.println("\n>>> Notifying " + subscriberList.size() +
                " subscriber(s) from " + agencyName + "...\n");
        for (SubscriberObserver s : new ArrayList<>(subscriberList)) {
            s.update(headline, category, content, timestamp);
        }
    }

    public void publishNews(String headline, String category, String content, String timestamp) {
        System.out.println("\n" + "=".repeat(70));
        System.out.println("BREAKING NEWS PUBLISHED by " + agencyName);
        System.out.println("Headline: " + headline);
        System.out.println("Category: " + category);
        System.out.println("Time: " + timestamp);
        System.out.println("=".repeat(70));

        this.headline = headline;
        this.category = category;
        this.content = content;
        this.timestamp = timestamp;

        notifySubscribers();
    }

    public String getAgencyName() {
        return agencyName;
    }

    public int getSubscriberCount() {
        return subscriberList.size();
    }
}