import javax.swing.*;

import java.util.List;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        initHospital();
        initPanel();
        initInfected();
    }

    
    private static void initPanel() {
        MyPanel p = new MyPanel();
        Thread panelThread = new Thread(p);
        JFrame frame = new JFrame();
        frame.add(p);
        frame.setSize(Constants.CITY_WIDTH + hospitalWidth + 300, Constants.CITY_HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("瘟疫传播模拟");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelThread.start();//MyPanel.java
    }

    private static int hospitalWidth;

    
    private static void initHospital() {
        hospitalWidth = Hospital.getInstance().getWidth();
    }

    
    private static void initInfected() {
        List<Person> people = PersonPool.getInstance().getPersonList();
        for (int i = 0; i < Constants.ORIGINAL_COUNT; i++) {
            Person person;
            do {
                person = people.get(new Random().nextInt(people.size() - 1));
            } while (person.isInfected());
            person.beInfected();
        }
    }

}
