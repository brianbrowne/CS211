import javax.microedition.midlet.*;

import com.sun.lwuit.*;
import com.sun.lwuit.animations.*;
import com.sun.lwuit.events.*;
import com.sun.lwuit.layouts.BoxLayout;
import com.sun.lwuit.plaf.*;
import java.util.Hashtable;

public class SwooshMIDlet extends MIDlet implements ActionListener {
    Form mHomeForm;
    Form mAwayForm;

    Command mExitCommand;

    Button mSlideButton;
    Button mFadeButton;
    Button mCubeButton;
    Button mRotateButton;

    Command mBackCommand;

    public void startApp() {
      Display.init(this);

      installTheme();

      createUI();

      mHomeForm.show();
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == mSlideButton) {
            mAwayForm.setTransitionInAnimator(
                CommonTransitions.createSlide(
                    CommonTransitions.SLIDE_HORIZONTAL, false, 200));
            mAwayForm.setTransitionOutAnimator(
                CommonTransitions.createSlide(
                    CommonTransitions.SLIDE_HORIZONTAL, true, 200));
            mAwayForm.show();
        }
        else if (ae.getSource() == mFadeButton) {
            mAwayForm.setTransitionInAnimator(
                CommonTransitions.createFade(1000));
            mAwayForm.setTransitionOutAnimator(
                CommonTransitions.createFade(200));
            mAwayForm.show();
        }
        else if (ae.getSource() == mCubeButton) {
            mAwayForm.setTransitionInAnimator(
                Transition3D.createCube(400, false));

            mAwayForm.setTransitionOutAnimator(
                Transition3D.createCube(400, true));

            mAwayForm.show();
        }
        else if (ae.getSource() == mRotateButton) {
            mAwayForm.setTransitionInAnimator(
                Transition3D.createRotation(400, true));

            mAwayForm.setTransitionOutAnimator(
                Transition3D.createRotation(400, false));

            mAwayForm.show();
        }
        else if (ae.getSource() == mBackCommand) {
            mHomeForm.show();
        }
        else if (ae.getCommand() == mExitCommand)
          notifyDestroyed();
    }

    private void installTheme() {
        // This is not the normal way to do this.
        // Usually you load a theme from a file.
        UIManager uim = UIManager.getInstance();
        Hashtable ht = new Hashtable();
        ht.put("sel#" + Style.BG_COLOR, "660099");
        ht.put(Style.BG_COLOR, "330066");
        ht.put(Style.FG_COLOR, "cccccc");
        uim.setThemeProps(ht);
    }

    private void createUI() {
      // Set up screen for transitions.
      mAwayForm = new Form("Away");
      mAwayForm.addComponent(new Label("Choose Back to return to the home screen."));

      mBackCommand = new Command("Back");
      mAwayForm.addCommand(mBackCommand);
      mAwayForm.addCommandListener(this); // Use setCommandListener() with LWUIT 1.3 or earlier.

      // Set up main screen.
      mHomeForm = new Form("Swoosh!");
      mHomeForm.setLayout(new BoxLayout(BoxLayout.Y_AXIS));

      mSlideButton = new Button("Slide");
      mSlideButton.addActionListener(this);
      mHomeForm.addComponent(mSlideButton);

      mFadeButton = new Button("Fade");
      mFadeButton.addActionListener(this);
      mHomeForm.addComponent(mFadeButton);

      mCubeButton = new Button("Cube");
      mCubeButton.addActionListener(this);
      mHomeForm.addComponent(mCubeButton);

      mRotateButton = new Button("Rotate");
      mRotateButton.addActionListener(this);
      mHomeForm.addComponent(mRotateButton);

      mExitCommand = new Command("Exit");
      mHomeForm.addCommand(mExitCommand);
      mHomeForm.addCommandListener(this); // Use setCommandListener() with LWUIT 1.3 or earlier.
    }
}