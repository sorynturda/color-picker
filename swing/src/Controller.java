import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        view.rListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                model.setrVal(view.getR());
                view.setRosu(model.getrVal());
                view.setSusColor();
                view.culoareLabelCoordonate();
            }
        });
        view.aListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                model.setaVal(view.getA());
                view.setAlbastru(model.getaVal());
                view.setSusColor();
                view.culoareLabelCoordonate();
            }
        });
        view.vListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                model.setvVal(view.getV());
                view.setVerde(model.getvVal());
                view.setSusColor();
                view.culoareLabelCoordonate();
            }
        });
        view.mouseLis(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                view.scrieCoordonateMouse(e);
            }
        });
//        view.mouseLis(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                view.scrieCoordonateMouse(e);
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//
//            }
//        });
    }
}

