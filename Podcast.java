class Podcast extends Audio {
    String hostName;
    int episodeNumber;

    Podcast(String title, double fileSize, double duration, int bitrate, String artist,
            String hostName, int episodeNumber) {
        super(title, fileSize, duration, bitrate, artist);
        this.hostName = hostName;
        this.episodeNumber = episodeNumber;
    }

    void display() {
        System.out.println("Podcast: " + title + ", Host: " + hostName);
    }

    public String toString() {
        return "Podcast: " + title + " Episode " + episodeNumber;
    }
}