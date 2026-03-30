class Video extends Media {
    int frameRate;
    int resolution;

    Video(String title, double fileSize, double duration, int frameRate, int resolution) {
        super(title, fileSize, duration);
        this.frameRate = frameRate;
        this.resolution = resolution;
    }

    void display() {
        System.out.println("Video Title: " + title + ", Resolution: " + resolution);
    }
}