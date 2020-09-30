package be.pxl.ja.streamingservice.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String email;
    private String password;
    private PaymentInfo paymentInfo;
    private StreamingPlan streamingPlan;
    List<Profile> profiles;

    public Account(String email, String password) {
        this.email = email;
        this.password = password;
        profiles = new ArrayList<Profile>();
        profiles.add(new Profile("profile1",null));
    }

    public void setStreamingPlan(StreamingPlan streamingPlan) {
        this.streamingPlan = streamingPlan;
    }

    public String getEmail() {
        return email;
    }

    public void addProfile(Profile profile) {
        profiles.add(profile);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public boolean verifyPassword(String password) {
        return password.equals(this.password);
    }

    public Profile getFirstProfile() {
        return profiles.get(0);
    }
}
