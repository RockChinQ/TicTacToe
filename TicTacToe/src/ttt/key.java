package ttt;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class key
  implements MouseListener
{
  public void mouseClicked(MouseEvent arg0)
  {
    if (main.ga.state == 1) {
      if ((arg0.getX() > 56) && (arg0.getX() < 94) && (arg0.getY() > 87) && (arg0.getY() < 120)) {
        main.ga.putchess(0, 0);
      } else if ((arg0.getX() > 104) && (arg0.getX() < 141) && (arg0.getY() > 87) && (arg0.getY() < 120)) {
        main.ga.putchess(1, 0);
      } else if ((arg0.getX() > 153) && (arg0.getX() < 190) && (arg0.getY() > 87) && (arg0.getY() < 120)) {
        main.ga.putchess(2, 0);
      } else if ((arg0.getX() > 56) && (arg0.getX() < 94) && (arg0.getY() > 132) && (arg0.getY() < 168)) {
        main.ga.putchess(0, 1);
      } else if ((arg0.getX() > 104) && (arg0.getX() < 141) && (arg0.getY() > 132) && (arg0.getY() < 168)) {
        main.ga.putchess(1, 1);
      } else if ((arg0.getX() > 153) && (arg0.getX() < 190) && (arg0.getY() > 132) && (arg0.getY() < 168)) {
        main.ga.putchess(2, 1);
      } else if ((arg0.getX() > 56) && (arg0.getX() < 94) && (arg0.getY() > 175) && (arg0.getY() < 215)) {
        main.ga.putchess(0, 2);
      } else if ((arg0.getX() > 104) && (arg0.getX() < 141) && (arg0.getY() > 175) && (arg0.getY() < 215)) {
        main.ga.putchess(1, 2);
      } else if ((arg0.getX() > 153) && (arg0.getX() < 190) && (arg0.getY() > 175) && (arg0.getY() < 215)) {
        main.ga.putchess(2, 2);
      }
    }
    main.w.d.repaint();
  }
  
  public void mouseEntered(MouseEvent arg0) {}
  
  public void mouseExited(MouseEvent arg0) {}
  
  public void mousePressed(MouseEvent arg0) {}
  
  public void mouseReleased(MouseEvent arg0) {}
}
