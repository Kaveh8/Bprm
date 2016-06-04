/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bprm;

import java.util.EventListener;

/**
 *
 * @author kaveh
 */
public interface TableButtonListener extends EventListener {
  public void tableButtonClicked( int row, int col );
}
