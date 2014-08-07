package pwittchen.com.internetconnectionstatelistener.receiver;

public enum ConnectivityStatus {
    WIFI_CONNECTED("connected to WiFi"),
    WIFI_CONNECTED_HAS_INTERNET("connected to WiFi (Internet available)"),
    WIFI_CONNECTED_HAS_NO_INTERNET("connected to WiFi (Internet not available)"),
    MOBILE_CONNECTED("connected to mobile network"),
    OFFLINE("offline");

    private String status;

    ConnectivityStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
