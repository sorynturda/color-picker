import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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
            }
        });
        view.aListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                model.setaVal(view.getA());
                view.setAlbastru(model.getaVal());
                view.setSusColor();
            }
        });
        view.vListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                model.setvVal(view.getV());
                view.setVerde(model.getvVal());
                view.setSusColor();
            }
        });
    }
}
