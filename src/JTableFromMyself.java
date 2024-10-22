import javax.swing.*;

public class JTableFromMyself {
    JFrame f;
    JTable t;

    JTableFromMyself() {
//        Initializing JFrame
        f = new JFrame();
        f.setTitle("Shashi Table Form");

        String[][] data = {
                {"Aditya Bakla Bhai", "3502110501" , "CSE"},
                {"Shashi Bhushan Kumar", "3502110558" , "CSE"},
        };

        String[] columnName = {"Name", "Register No.", "Dept."};

//        Initializing Jtable
        t = new JTable(data, columnName);
        t.setBounds(80, 100, 400, 500);

//        initializing ScrollPanel
        JScrollPane sp = new JScrollPane(t);
        f.add(sp);
        f.setSize(700, 800);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new JTableFromMyself();
    }
}
