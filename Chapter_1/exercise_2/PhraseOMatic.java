

public class PhraseOMatic {
    public static void main(String [] args) {
        String [] list1 = {"dynamic", "smart", "critical-path", "30 000 foot"};
        String [] list2 = {"empowered", "sticky", "focused", "shared"};
        String [] list3 = {"process", "core", "vision", "solution"};

        int len1 = list1.length;
        int len2 = list2.length;
        int len3 = list3.length;

        int ranum1 = (int) (Math.random() * len1);
        int ranum2 = (int) (Math.random() * len2);
        int ranum3 = (int) (Math.random() * len3);

        String phrase = list1[ranum1] + " " + list2[ranum2] + " " + list3[ranum3];
        System.out.println("What we need in this organisation is" + " " + phrase); 



    }
}
