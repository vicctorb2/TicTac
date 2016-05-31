package Statistic;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * The class with the table of statistics of the games that were played
 */
public class StatisticTable {

    JDialog dialog = null;
    JTable table = null;
    private int buttonCounts = 9;

    public StatisticTable(String name, int[] answer, int max){
        dialog = new JDialog();
        dialog.setTitle(name);
        DefaultTableModel model = new DefaultTableModel
                (new Object[] {"Button", "Count"}, 0);
        table = new JTable(model);

        for(int i = 0; i < buttonCounts; i++){
            model.addRow(new Object[] {i, answer[i]});
        }

        model.addRow(new Object[] {"Most common: " + max, answer[max]});

        dialog.add(new JScrollPane(table));
        dialog.setSize(new Dimension(300, 200));
        dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }

}
