/*
 * Copyright Billy Zheng. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 * - Redistributions of source code must retain the above copyright notice, this list
 *   of conditions and the following disclaimer.
 * 
 * - Redistributions in binary form must reproduce the above copyright notice, this
 *   list of conditions and the following disclaimer listed in this license in the
 *   documentation and/or other materials provided with the distribution.
 *
 * - Neither the name of the copyright holders nor the names of its contributors may
 *   be used to endorse or promote products derived from this software without specific
 *   prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF
 * THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package us.fibernet.fiberj;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;

/**
 * A JPanel subclass for displaying pattern images
 *
 */
@SuppressWarnings("serial")
public class UIPattern extends ScrollablePanel {

    //private int width, height;
    private JFrame parentFrame;
    private PatternDisplay patternDisplay;
    
    /**
     * Create a JPanel with given dimensions on a parent JFrame 
     */
    public UIPattern(JFrame parent, int width, int height) {
        parentFrame = parent;
        setPreferredSize(new Dimension(width, height)); 
        setMinimumSize(new Dimension(width, height)); 
        setBounds(0, 0, width, height);
        setLayout(null);
    }
    
    /**
     * Place a PatternDisplay object on this panel
     */
    public void setPattern(PatternDisplay patternDisplay) {
        this.patternDisplay = patternDisplay;
    }
    
    /**
     * Create a Colormap control associated with current patternDisplay
     */
    public void openColormap() {
        patternDisplay.openColorControl();
    }
    
    public JFrame getParentFrame() {
        return parentFrame;
    }
    
} // class UIPattern
