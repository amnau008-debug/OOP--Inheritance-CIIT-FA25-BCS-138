public class Demo {
    public static void main(String[] args) {

        Audio a = new Audio("Song", 5.2, 3.5, 320, "Ali");
        Video v = new Video("Movie", 700, 120, 60, 1080);
        Podcast p = new Podcast("Tech Talk", 50, 60, 256, "Host1", "Ahmed", 10);
        LiveStream l = new LiveStream("Gaming", 0, 120, 60, 1080, true, "Zain");

        a.display();
        v.display();
        p.display();
        l.display();

        System.out.println(a);
        System.out.println(p);
    }
}