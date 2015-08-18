/************************************************************************************
 * Copyright (c) 2008 William Chen.                                                 *
 *                                                                                  *
 * All rights reserved. This program and the accompanying materials are made        *
 * available under the terms of the Eclipse Public License v1.0 which accompanies   *
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html *
 *                                                                                  *
 * Use is subject to the terms of Eclipse Public License v1.0.                      *
 *                                                                                  *
 * Contributors:                                                                    * 
 *     William Chen - initial API and implementation.                               *
 ************************************************************************************/

package org.dyno.visual.swing.layouts;
/**
 * 
 * Bilateral
 *
 * @version 1.0.0, 2008-7-3
 * @author William Chen
 */
public class Bilateral extends Alignment {
	private static final long serialVersionUID = 1L;
	private int leading;
	private int trailing;

	public Bilateral(int leading, int trailing, Spring spring) {
		super(spring);
		this.leading = leading;
		this.trailing = trailing;
	}
	public Bilateral(int leading, int trailing, int min){
		this(leading, trailing, min, PREFERRED);
	}
	public Bilateral(int leading, int trailing, int min, int pref){
		super(min, pref);
		this.leading = leading;
		this.trailing = trailing;
	}
	public int getLeading() {
		return leading;
	}

	public int getTrailing() {
		return trailing;
	}

	public void setLeading(int leading) {
		this.leading = leading;
	}

	public void setTrailing(int trailing) {
		this.trailing = trailing;
	}
	@Override
	public Object clone() {
		return new Bilateral(leading, trailing, (Spring) getSpring().clone());
	}
	
}

