class Audio extends Media {
    int bitrate;
    String artist;

    Audio(String title, double fileSize, double duration, int bitrate, String artist) {
        super(title, fileSize, duration);
        this.bitrate = bitrate;
        this.artist = artist;
    }

    void display() {
        System.out.println("Audio Title: " + title + ", Artist: " + artist);
    }

    void test(int x) {
        System.out.println("Overloaded test in Audio: " + x);
    }

    public String toString() {
        return "Audio: " + title + " by " + artist;
    }
}