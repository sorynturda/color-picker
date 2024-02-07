import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class View extends JFrame {
    private Model model;
    private JPanel sus;
    private JPanel jos;
    private JPanel josStanga;
    private JPanel josDreapta;
    private JLabel rosu;
    private JLabel verde;
    private JLabel albastru;
    private JSlider sr;
    private JSlider sv;
    private JSlider sa;

    public View(Model model) {
        this.model = model;
        this.setSize(400,400);
        this.setLayout(new BorderLayout());
        jos = new JPanel();
        sus = new JPanel();
        josStanga = new JPanel();
        josDreapta = new JPanel();
        jos.setLayout(new BoxLayout(jos, BoxLayout.X_AXIS));
        josStanga.setLayout(new BoxLayout(josStanga, BoxLayout.Y_AXIS));
        josDreapta.setLayout(new BoxLayout(josDreapta, BoxLayout.Y_AXIS));
        jos.add(josStanga);
        jos.add(josDreapta);
        rosu = new JLabel("ROSU");
        verde = new JLabel("VERDE");
        albastru = new JLabel("ALBASTRU");
        josStanga.add(rosu);
        josStanga.add(verde);
        josStanga.add(albastru);
        sr = new JSlider(0,255,0);
        sv = new JSlider(0,255,0);
        sa = new JSlider(0,255,0);
        josDreapta.add(sr);
        josDreapta.add(sv);
        josDreapta.add(sa);

        setSusColor();
        this.add(jos, BorderLayout.SOUTH);
        this.add(sus,BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void vListener(ChangeListener l){
        sv.addChangeListener(l);
    }
    public void aListener(ChangeListener l){
        sa.addChangeListener(l);
    }
    public void rListener(ChangeListener l){
        sr.addChangeListener(l);
    }
    public int getR(){
        return sr.getValue();
    }
    public int getA(){
        return sa.getValue();
    }
    public int getV(){
        return sv.getValue();
    }
    public void setRosu(int val){
        rosu.setText("ROSU: " + val);
        rosu.setForeground(new Color(model.getrVal(),0,0));
    }
    public void setVerde(int val){
        verde.setText("VERDE: " + val);
        verde.setForeground(new Color(0,model.getvVal(),0));
    }
    public void setAlbastru(int val){
        albastru.setText("ALBASTRU: " + val);
        albastru.setForeground(new Color(0,0,model.getaVal()));
    }
    public void setSusColor(){
        sus.setBackground(new Color(getR(), getV(), getA()));
    }
}
