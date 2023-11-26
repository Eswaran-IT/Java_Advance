package observerpattern;

import java.util.ArrayList;
import java.util.List;

// Subject (Observable): YouTubeChannel
class YouTubeChannel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestVideo;

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void uploadVideo(String video) {
        latestVideo = video;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestVideo);
        }
    }
}

// Observer: Subscriber
interface Subscriber {
    void update(String video);
}

// Concrete Observer: EmailSubscriber
class EmailSubscriber implements Subscriber {
    private String email;

    public EmailSubscriber(String email, YouTubeChannel channel) {
        this.email = email;
        channel.addSubscriber(this);
    }

    @Override
    public void update(String video) {
        System.out.println("Email sent to " + email + ": New Video Uploaded - " + video);
    }
}

// Concrete Observer: WhatsAppSubscriber
class WhatsAppSubscriber implements Subscriber {
    private String phoneNumber;

    public WhatsAppSubscriber(String phoneNumber, YouTubeChannel channel) {
        this.phoneNumber = phoneNumber;
        channel.addSubscriber(this);
    }

    @Override
    public void update(String video) {
        System.out.println("WhatsApp message to " + phoneNumber + ": New Video Uploaded - " + video);
    }
}

// Example Usage
public class Main {
    public static void main(String[] args) {
        // Creating a YouTube channel
        YouTubeChannel channel = new YouTubeChannel();

        // Creating subscribers (observers) for email and WhatsApp
        Subscriber emailSubscriber = new EmailSubscriber("example@email.com", channel);
        Subscriber whatsappSubscriber = new WhatsAppSubscriber("1234567890", channel);
        channel.uploadVideo("Exciting Content! Java Update");
       System.out.println(emailSubscriber.getClass());
       System.out.println(whatsappSubscriber.getClass());

    }
}
