public class Subscriber implements SubscriberObserver {
    private String subscriberName;
    private String preference;

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
        this.preference = "All";
    }

    public Subscriber(String subscriberName, String preference) {
        this.subscriberName = subscriberName;
        this.preference = preference;
    }

    public void update(String headline, String category, String content, String timestamp) {
        if (preference.equals("All") || preference.equalsIgnoreCase(category)) {
            System.out.println("NOTIFICATION → " + subscriberName);
            System.out.println("   Headline: " + headline);
            System.out.println("   Category: " + category);
            System.out.println("   Time: " + timestamp);
            System.out.println("   Content: " + content + "\n");
        } else {
            System.out.println("SKIPPED → " + subscriberName +
                    " (only interested in " + preference + " news)\n");
        }
    }

    public void setPreference(String preference) {
        System.out.println("[~] " + subscriberName +
                " changed preference from '" + this.preference +
                "' to '" + preference + "'");
        this.preference = preference;
    }

    public String toString() {
        return "Subscriber{" + subscriberName + ", prefers=" + preference + "}";
    }
}