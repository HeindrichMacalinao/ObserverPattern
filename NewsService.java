public class NewsService {
    public static void main(String[] args) {
        NewsAgency gmaNews = new NewsAgency("GMA Network Breaking News");

        Subscriber subscriber1 = new Subscriber("Himura");
        Subscriber subscriber2 = new Subscriber("Hainrihi", "Sports");
        Subscriber subscriber3 = new Subscriber("Heindrich", "Technology");
        Subscriber subscriber4 = new Subscriber("Moi", "Politics");

        System.out.println("\n" + "=".repeat(70));
        System.out.println("SUBSCRIPTION PHASE");
        System.out.println("=".repeat(70));

        gmaNews.attach(subscriber1);
        gmaNews.attach(subscriber2);
        gmaNews.attach(subscriber3);
        gmaNews.attach(subscriber4);

        gmaNews.publishNews(
                "Typhoon Signal No. 3 Raised Over Metro Manila",
                "Breaking News",
                "PAGASA has raised Signal No. 3 as the typhoon moves closer to Luzon...",
                "2026-10-30 14:30:00"
        );

        gmaNews.publishNews(
                "Gilas Pilipinas Wins Gold at the Asian Games",
                "Sports",
                "Gilas Pilipinas defeated its rival in a thrilling championship game...",
                "2026-10-30 15:45:00"
        );

        System.out.println("\n" + "=".repeat(70));
        System.out.println("DYNAMIC PREFERENCE UPDATE");
        System.out.println("=".repeat(70) + "\n");

        subscriber1.setPreference("Technology");

        gmaNews.publishNews(
                "Filipino Students Launch AI-Powered Study App",
                "Technology",
                "A team of university students has released an app that helps classmates review for exams...",
                "2026-10-30 16:20:00"
        );

        System.out.println("\n" + "=".repeat(70));
        System.out.println("UNSUBSCRIPTION PHASE");
        System.out.println("=".repeat(70) + "\n");

        gmaNews.detach(subscriber2);

        gmaNews.publishNews(
                "Senate Passes Bill on Disaster Preparedness Funding",
                "Politics",
                "The Senate has approved a measure that increases funding for local disaster response...",
                "2026-10-30 17:00:00"
        );

        System.out.println("\n" + "=".repeat(70));
        System.out.println("SYSTEM STATISTICS");
        System.out.println("=".repeat(70));
        System.out.println("Final registered subscribers: " + gmaNews.getSubscriberCount());
        System.out.println("Agency: " + gmaNews.getAgencyName());
        System.out.println("=".repeat(70) + "\n");
    }
}