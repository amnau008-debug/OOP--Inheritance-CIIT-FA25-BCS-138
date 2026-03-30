class LiveStream extends Video {
    boolean isLive;
    String streamerName;

    LiveStream(String title, double fileSize, double duration, int frameRate, int resolution,
               boolean isLive, String streamerName) {
        super(title, fileSize, duration, frameRate, resolution);
        this.isLive = isLive;
        this.streamerName = streamerName;
    }

    void display() {
        System.out.println("LiveStream by: " + streamerName + " (Live: " + isLive + ")");
    }
}