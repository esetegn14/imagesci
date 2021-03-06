/**
 * Java Image Science Toolkit (JIST)
 *
 * Image Analysis and Communications Laboratory &
 * Laboratory for Medical Image Computing &
 * The Johns Hopkins University
 * 
 * http://www.nitrc.org/projects/jist/
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or (at
 * your option) any later version.  The license is available for reading at:
 * http://www.gnu.org/copyleft/lgpl.html
 *
 */
package edu.jhu.ece.iacl.jist.pipeline.view.output;

import java.awt.LayoutManager;

import javax.swing.BoxLayout;

import edu.jhu.ece.iacl.jist.pipeline.parameter.ParamFile;
import edu.jhu.ece.iacl.jist.pipeline.parameter.ParamFileCollection;

// TODO: Auto-generated Javadoc
/**
 * Output view for a collection of file parameters.
 * 
 * @author Blake Lucas <br>
 *         Muqun Li(muqun.li@vanderbilt.edu)
 */
public class ParamFileCollectionOutputView extends ParamOutputView {

	/**
	 * Default constructor.
	 * 
	 * @param param
	 *            parameters
	 */
	public ParamFileCollectionOutputView(ParamFileCollection param) {
		this.param = param;
		for (ParamFile vol : param.getParameters()) {
			LayoutManager layout = new BoxLayout(this, BoxLayout.Y_AXIS);
			this.setLayout(layout);
			add(vol.getOutputView());
		}
	}

	/**
	 * Update child parameter views.
	 */
	@Override
	public void update() {
		for (ParamFile p : ((ParamFileCollection) param).getParameters()) {
			p.getOutputView().update();
		}
	}
}
