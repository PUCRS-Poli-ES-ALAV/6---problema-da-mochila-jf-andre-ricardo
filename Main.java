import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        // Test case 1 for Mochila
//        Mochila mochila = new Mochila();
//        ArrayList<Bloco> blocos1 = new ArrayList<>();
//        blocos1.add(new Bloco(23, 92));
//        blocos1.add(new Bloco(31, 57));
//        blocos1.add(new Bloco(29, 49));
//        blocos1.add(new Bloco(44, 68));
//        blocos1.add(new Bloco(53, 60));
//        blocos1.add(new Bloco(38, 43));
//        blocos1.add(new Bloco(63, 67));
//        blocos1.add(new Bloco(85, 84));
//        blocos1.add(new Bloco(89, 87));
//        blocos1.add(new Bloco(82, 72));
//
//        double result1 = mochila.maxBlocos(blocos1, 165);
//        System.out.println("Mochila Test Case 1 Result: " + result1);
//
//        // Test case 2 for Mochila
//        ArrayList<Bloco> blocos2 = new ArrayList<>();
//        blocos2.add(new Bloco(56, 50));
//        blocos2.add(new Bloco(59, 50));
//        blocos2.add(new Bloco(80, 64));
//        blocos2.add(new Bloco(64, 46));
//        blocos2.add(new Bloco(75, 50));
//        blocos2.add(new Bloco(17, 5));
//
//        double result2 = mochila.maxBlocos(blocos2, 190);
//        System.out.println("Mochila Test Case 2 Result: " + result2);
//
//        // Test case 1 for BackPackPD
//        BackPackPD backPackPD = new BackPackPD();
//        Map<Integer, int[]> itens1 = new HashMap<>();
//        itens1.put(1, new int[]{23, 92});
//        itens1.put(2, new int[]{31, 57});
//        itens1.put(3, new int[]{29, 49});
//        itens1.put(4, new int[]{44, 68});
//        itens1.put(5, new int[]{53, 60});
//        itens1.put(6, new int[]{38, 43});
//        itens1.put(7, new int[]{63, 67});
//        itens1.put(8, new int[]{85, 84});
//        itens1.put(9, new int[]{89, 87});
//        itens1.put(10, new int[]{82, 72});
//
//        int maxValor1 = backPackPD.backPackPD(10, 165, itens1);
//        System.out.println("BackPackPD Test Case 1 Result: " + maxValor1);
//
//        // Test case 2 for BackPackPD
//        Map<Integer, int[]> itens2 = new HashMap<>();
//        itens2.put(1, new int[]{56, 50});
//        itens2.put(2, new int[]{59, 50});
//        itens2.put(3, new int[]{80, 64});
//        itens2.put(4, new int[]{64, 46});
//        itens2.put(5, new int[]{75, 50});
//        itens2.put(6, new int[]{17, 5});
//
//        int maxValor2 = backPackPD.backPackPD(6, 190, itens2);
//        System.out.println("BackPackPD Test Case 2 Result: " + maxValor2);
//
        Distancia distancia = new Distancia();
        String s1 = "Casablan";
        String s2 = "Portento";

        System.out.println(distancia.ed1(s1,s2,s1.length(),s2.length()));

        System.out.println(distancia.ed2(s1,s2));
//
//        String s3 = "Maven, a Yiddish word meaning accumulator of knowledge, began as an attempt to " +
//                "simplify the build processes in the Jakarta Turbine project. There were several" +
//                " projects, each with their own Ant build files, that were all slightly different." +
//                "JARs were checked into CVS. We wanted a standard way to build the projects, a clear "+
//                "definition of what the project consisted of, an easy way to publish project information" +
//                "and a way to share JARs across several projects. The result is a tool that can now be" +
//                "used for building and managing any Java-based project. We hope that we have created " +
//                "something that will make the day-to-day work of Java developers easier and generally help " +
//                "with the comprehension of any Java-based project.";
//        String s4 = "This post is not about deep learning. But it could be might as well. This is the power of " +
//                "kernels. They are universally applicable in any machine learning algorithm. Why you might" +
//                "ask? I am going to try to answer this question in this article." +
//                "Go to the profile of Marin Vlastelica Pogančić" +
//                "Marin Vlastelica Pogančić Jun";
//
////        System.out.println(s1.length());
////        System.out.println(s2.length());
//
//        System.out.println(distancia.ed1(s3,s4,s3.length(),s4.length()));
//
//
//        System.out.println(distancia.ed2(s3,s4));

        String banana = "BANANA";
        String ana = "AAN";

        Trabalho1 t1 = new Trabalho1();
        //System.out.println(t1.tamanho(ana,banana));


        banana = "12345";
        ana = "12354885";

        System.out.println(t1.tamanho(ana,banana));
    }
}