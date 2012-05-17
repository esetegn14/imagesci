/**
 *       Java Image Science Toolkit
 *                  --- 
 *     Multi-Object Image Segmentation
 *
 * Center for Computer-Integrated Surgical Systems and Technology &
 * Johns Hopkins Applied Physics Laboratory &
 * The Johns Hopkins University
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or (at
 * your option) any later version.  The license is available for reading at:
 * http://www.gnu.org/copyleft/lgpl.html
 *
 * @author Blake Lucas (blake@cs.jhu.edu)
 */
package edu.jhu.ece.iacl.jist.pipeline.parameter;

import edu.jhu.ece.iacl.jist.io.SurfaceReaderWriter;
import edu.jhu.ece.iacl.jist.pipeline.factory.ParamFileFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class ParamSurfaceLocation.
 */
public class ParamSurfaceLocation extends ParamFile {
	/**
	 * Default constructor.
	 */
	public ParamSurfaceLocation() {
		super(DialogType.FILE);
		setExtensionFilter(SurfaceReaderWriter.getInstance()
				.getExtensionFilter());
		this.factory = new ParamFileFactory(this);
	}

	/**
	 * Instantiates a new param surface location.
	 *
	 * @param name the name
	 */
	public ParamSurfaceLocation(String name) {
		this();
		setName(name);
	}
}
