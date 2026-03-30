class Media {
    int testAttribute;
    String title;
    double fileSize;
    double duration;

    // Constructor
    Media(String title, double fileSize, double duration) {
        this.title = title;
        this.fileSize = fileSize;
        this.duration = duration;
    }

    void play() {
        System.out.println("Playing media...");
    }

    void pause() {
        System.out.println("Media paused.");
    }

    void stop() {
        System.out.println("Media stopped.");
    }

    void display() {
        System.out.println("Title: " + title);
    }

    void test() {
        System.out.println("Test method in Media");
    }

    void setTestAttribute(int value) {
        testAttribute = value;
    }

    int getTestAttribute() {
        return testAttribute;
    }

    public String toString() {
        return "Media: " + title;
    }
}